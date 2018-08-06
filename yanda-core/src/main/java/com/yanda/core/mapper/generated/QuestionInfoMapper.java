package com.yanda.core.mapper.generated;

import com.yanda.core.entity.generated.QuestionInfo;
import com.yanda.core.entity.generated.QuestionInfoExample;
import com.yanda.core.util.MyMapper;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface QuestionInfoMapper extends MyMapper<QuestionInfo> {
    long countByExample(QuestionInfoExample example);

    int deleteByExample(QuestionInfoExample example);

    List<QuestionInfo> selectByExample(QuestionInfoExample example);

    List<QuestionInfo> selectByExampleSelective(@Param("example") QuestionInfoExample example, @Param("selective") QuestionInfo.Col ... selective);

    int updateByExampleSelective(@Param("record") QuestionInfo record, @Param("example") QuestionInfoExample example);

    int updateByExample(@Param("record") QuestionInfo record, @Param("example") QuestionInfoExample example);

    QuestionInfo selectByPrimaryKeySelective(@Param("questionId") Long questionId, @Param("selective") QuestionInfo.Col ... selective);

    int upsert(QuestionInfo record);

    int upsertSelective(QuestionInfo record);
}