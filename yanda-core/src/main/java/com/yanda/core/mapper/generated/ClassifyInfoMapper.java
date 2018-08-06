package com.yanda.core.mapper.generated;

import com.yanda.core.entity.generated.ClassifyInfo;
import com.yanda.core.entity.generated.ClassifyInfoExample;
import com.yanda.core.util.MyMapper;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ClassifyInfoMapper extends MyMapper<ClassifyInfo> {
    long countByExample(ClassifyInfoExample example);

    int deleteByExample(ClassifyInfoExample example);

    List<ClassifyInfo> selectByExample(ClassifyInfoExample example);

    List<ClassifyInfo> selectByExampleSelective(@Param("example") ClassifyInfoExample example, @Param("selective") ClassifyInfo.Col ... selective);

    int updateByExampleSelective(@Param("record") ClassifyInfo record, @Param("example") ClassifyInfoExample example);

    int updateByExample(@Param("record") ClassifyInfo record, @Param("example") ClassifyInfoExample example);

    ClassifyInfo selectByPrimaryKeySelective(@Param("classifyId") Integer classifyId, @Param("selective") ClassifyInfo.Col ... selective);

    int upsert(ClassifyInfo record);

    int upsertSelective(ClassifyInfo record);
}