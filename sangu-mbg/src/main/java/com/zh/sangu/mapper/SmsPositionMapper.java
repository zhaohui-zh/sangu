package com.zh.sangu.mapper;

import com.zh.sangu.model.SmsPosition;
import com.zh.sangu.model.SmsPositionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SmsPositionMapper {
    long countByExample(SmsPositionExample example);

    int deleteByExample(SmsPositionExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SmsPosition record);

    int insertSelective(SmsPosition record);

    List<SmsPosition> selectByExample(SmsPositionExample example);

    SmsPosition selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SmsPosition record, @Param("example") SmsPositionExample example);

    int updateByExample(@Param("record") SmsPosition record, @Param("example") SmsPositionExample example);

    int updateByPrimaryKeySelective(SmsPosition record);

    int updateByPrimaryKey(SmsPosition record);
}