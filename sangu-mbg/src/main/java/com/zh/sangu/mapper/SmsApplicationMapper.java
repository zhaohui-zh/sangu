package com.zh.sangu.mapper;

import com.zh.sangu.model.SmsApplication;
import com.zh.sangu.model.SmsApplicationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SmsApplicationMapper {
    long countByExample(SmsApplicationExample example);

    int deleteByExample(SmsApplicationExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SmsApplication record);

    int insertSelective(SmsApplication record);

    List<SmsApplication> selectByExample(SmsApplicationExample example);

    SmsApplication selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SmsApplication record, @Param("example") SmsApplicationExample example);

    int updateByExample(@Param("record") SmsApplication record, @Param("example") SmsApplicationExample example);

    int updateByPrimaryKeySelective(SmsApplication record);

    int updateByPrimaryKey(SmsApplication record);
}