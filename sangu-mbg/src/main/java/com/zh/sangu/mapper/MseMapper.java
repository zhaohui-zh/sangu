package com.zh.sangu.mapper;

import com.zh.sangu.model.Mse;
import com.zh.sangu.model.MseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MseMapper {
    long countByExample(MseExample example);

    int deleteByExample(MseExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Mse record);

    int insertSelective(Mse record);

    List<Mse> selectByExample(MseExample example);

    Mse selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Mse record, @Param("example") MseExample example);

    int updateByExample(@Param("record") Mse record, @Param("example") MseExample example);

    int updateByPrimaryKeySelective(Mse record);

    int updateByPrimaryKey(Mse record);
}