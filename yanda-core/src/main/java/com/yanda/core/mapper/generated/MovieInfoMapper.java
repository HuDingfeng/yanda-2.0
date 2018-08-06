package com.yanda.core.mapper.generated;

import com.yanda.core.entity.generated.MovieInfo;
import com.yanda.core.entity.generated.MovieInfoExample;
import com.yanda.core.util.MyMapper;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MovieInfoMapper extends MyMapper<MovieInfo> {
    long countByExample(MovieInfoExample example);

    int deleteByExample(MovieInfoExample example);

    List<MovieInfo> selectByExample(MovieInfoExample example);

    List<MovieInfo> selectByExampleSelective(@Param("example") MovieInfoExample example, @Param("selective") MovieInfo.Col ... selective);

    int updateByExampleSelective(@Param("record") MovieInfo record, @Param("example") MovieInfoExample example);

    int updateByExample(@Param("record") MovieInfo record, @Param("example") MovieInfoExample example);

    MovieInfo selectByPrimaryKeySelective(@Param("mvId") Long mvId, @Param("selective") MovieInfo.Col ... selective);

    int upsert(MovieInfo record);

    int upsertSelective(MovieInfo record);
}