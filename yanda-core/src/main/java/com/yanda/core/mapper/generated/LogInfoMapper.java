package com.yanda.core.mapper.generated;

import com.yanda.core.entity.generated.LogInfo;
import com.yanda.core.entity.generated.LogInfoExample;
import com.yanda.core.util.MyMapper;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LogInfoMapper extends MyMapper<LogInfo> {
    long countByExample(LogInfoExample example);

    int deleteByExample(LogInfoExample example);

    List<LogInfo> selectByExampleWithBLOBs(LogInfoExample example);

    List<LogInfo> selectByExample(LogInfoExample example);

    List<LogInfo> selectByExampleSelective(@Param("example") LogInfoExample example, @Param("selective") LogInfo.Col ... selective);

    int updateByExampleSelective(@Param("record") LogInfo record, @Param("example") LogInfoExample example);

    int updateByExampleWithBLOBs(@Param("record") LogInfo record, @Param("example") LogInfoExample example);

    int updateByExample(@Param("record") LogInfo record, @Param("example") LogInfoExample example);

    LogInfo selectByPrimaryKeySelective(@Param("logId") Integer logId, @Param("selective") LogInfo.Col ... selective);

    int upsert(LogInfo record);

    int upsertWithBLOBs(LogInfo record);

    int upsertSelective(LogInfo record);
}