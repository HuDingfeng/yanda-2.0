package com.yanda.core.mapper.generated;

import com.yanda.core.entity.generated.VipCardInfo;
import com.yanda.core.entity.generated.VipCardInfoExample;
import com.yanda.core.util.MyMapper;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface VipCardInfoMapper extends MyMapper<VipCardInfo> {
    long countByExample(VipCardInfoExample example);

    int deleteByExample(VipCardInfoExample example);

    List<VipCardInfo> selectByExample(VipCardInfoExample example);

    List<VipCardInfo> selectByExampleSelective(@Param("example") VipCardInfoExample example, @Param("selective") VipCardInfo.Col ... selective);

    int updateByExampleSelective(@Param("record") VipCardInfo record, @Param("example") VipCardInfoExample example);

    int updateByExample(@Param("record") VipCardInfo record, @Param("example") VipCardInfoExample example);

    VipCardInfo selectByPrimaryKeySelective(@Param("cardId") Integer cardId, @Param("selective") VipCardInfo.Col ... selective);

    int upsert(VipCardInfo record);

    int upsertSelective(VipCardInfo record);
}