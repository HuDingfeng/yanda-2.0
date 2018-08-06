/**
 * 
 */
package com.yanda.wx.controller;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yanda.core.component.FileConfig;
import com.yanda.core.entity.FileType;
import com.yanda.core.entity.generated.AttachmentInfo;
import com.yanda.core.exception.DOPException;
import com.yanda.core.exception.NullParamException;
import com.yanda.core.service.AttachmentService;
import com.yanda.core.service.impl.AttachmentServiceImpl;
import com.yanda.core.util.StringUtil;
import com.yanda.core.web.BaseController;

/**
 * 附件控制类 AttachmentController.java
 * 
 * @author chenli
 * @time 2018年2月28日 下午9:02:42
 */
@Controller
@RequestMapping(value = "/attach")
public class AttachmentController extends BaseController {

	@Autowired
	private FileConfig fileConfig;
	@Autowired
	private AttachmentService attachmentService;


	/**
	 * 读取附件
	 * 
	 * @param request
	 *            请求体
	 * @param response
	 *            响应体
	 */
	@RequestMapping(value = "/readFile", method = RequestMethod.GET)
	public void readFile(HttpServletRequest request, HttpServletResponse response) {

		String id = getNotEmptyValue(request, "id");
		String size = getNotEmptyValue(request, "size");

		if (StringUtil.isEmpty(id)) {
			return;
		}

		AttachmentInfo attach = null;
		try {
			attach = attachmentService.selectById(Long.valueOf(id));
			initResponseType(response, attach);
		} catch (NumberFormatException e) {
			LOG.error("数据类型转换失败：传入的附件ID=[" + id + "]不是number类型", e);
		} catch (DOPException e) {
			LOG.error(e.getMessage());
		}
		if (null == attach) {
			return;
		}

		String fileName = attach.getNewFilename();
		if (FileType.IMG.getValue() == attach.getFileType()
				&& AttachmentServiceImpl.iconSize.contains(Integer.valueOf(size))) {
			fileName += "_" + size + "." + attach.getFileExt();
		} else {
			fileName += "." + attach.getFileExt();
		}

		byte[] buff = new byte[1024];
		BufferedInputStream bis = null;
		OutputStream os = null;
		try {
			os = response.getOutputStream();
			bis = new BufferedInputStream(new FileInputStream(new File(attach.getFilePath() + "/" + fileName)));
			int length = bis.read(buff);
			while (length != -1) {
				os.write(buff, 0, buff.length);
				os.flush();
				length = bis.read(buff);
			}
		} catch (IOException e) {
			LOG.error("下载附件异常:" + e.getMessage());
		} finally {
			if (bis != null) {
				try {
					bis.close();
				} catch (IOException e) {
					LOG.error("关闭输入流异常", e);
				}
			}
		}
	}
	
	@ResponseBody
	@GetMapping("/getUrl")
	public Object getAttachUrl(HttpServletRequest request) throws Exception {
		String id = request.getParameter("id");
		if (StringUtil.isEmpty("id"))
			throw new NullParamException("附件编号");
		AttachmentInfo attach = attachmentService.selectById(Long.valueOf(id));
		if (null == attach)
			throw new DOPException("附件不存在");
		return result(200, "", fileConfig.getDomain() + getAttachRelativePath(attach));
	}

	/**
	 * 根据附件的类型初始化响应体，若是图片则显示图片，若是其他文件则下载
	 * 
	 * @param response
	 * @param attach
	 */
	private void initResponseType(HttpServletResponse response, AttachmentInfo attach) {
		String fileExt = attach.getFileExt();
		String fileShowName = attach.getOldFilename() + "." + fileExt;
		if ("jpg".equalsIgnoreCase(fileExt) || "jpeg".equalsIgnoreCase(fileExt)) {
			response.setContentType("image/jpeg");
		} else if ("png".equalsIgnoreCase(fileExt)) {
			response.setContentType("image/png");
		} else if ("gif".equalsIgnoreCase(fileExt)) {
			response.setContentType("image/gif");
		} else {
			response.setHeader("content-type", "application/octet-stream");
			response.setContentType("application/octet-stream");
			response.setHeader("Content-Disposition", "attachment;filename=" + fileShowName);
		}

	}
	
}
