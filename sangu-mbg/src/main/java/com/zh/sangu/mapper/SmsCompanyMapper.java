package com.zh.sangu.mapper;

import com.zh.sangu.model.SmsCompany;
import com.zh.sangu.model.SmsCompanyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SmsCompanyMapper {
    long countByExample(SmsCompanyExample example);

    int deleteByExample(SmsCompanyExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SmsCompany record);

    int insertSelective(SmsCompany record);

    List<SmsCompany> selectByExample(SmsCompanyExample example);

    SmsCompany selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SmsCompany record, @Param("example") SmsCompanyExample example);

    int updateByExample(@Param("record") SmsCompany record, @Param("example") SmsCompanyExample example);

    int updateByPrimaryKeySelective(SmsCompany record);

    int updateByPrimaryKey(SmsCompany record);
}