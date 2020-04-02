package com.zh.sangu.mapper;

import com.zh.sangu.model.R2;
import com.zh.sangu.model.R2Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface R2Mapper {
    long countByExample(R2Example example);

    int deleteByExample(R2Example example);

    int deleteByPrimaryKey(Integer id);

    int insert(R2 record);

    int insertSelective(R2 record);

    List<R2> selectByExample(R2Example example);

    R2 selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") R2 record, @Param("example") R2Example example);

    int updateByExample(@Param("record") R2 record, @Param("example") R2Example example);

    int updateByPrimaryKeySelective(R2 record);

    int updateByPrimaryKey(R2 record);
}