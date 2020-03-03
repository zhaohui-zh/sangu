package com.zh.sangu.service.impl;

import com.github.pagehelper.PageHelper;
import com.zh.sangu.dto.SmsCompanyParam;
import com.zh.sangu.mapper.SmsCompanyMapper;
import com.zh.sangu.model.SmsCompany;
import com.zh.sangu.model.SmsCompanyExample;
import com.zh.sangu.service.SmsCompanyService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 双选会公司Service实现类
 * Created by zhaohui on 2020/3/4
 */
@Service
public class SmsCompanyServiceImpl implements SmsCompanyService {

    @Autowired
    private SmsCompanyMapper mapper;

    @Override
    public int update(Integer id, SmsCompany company) {
        company.setId(id);
        return mapper.updateByPrimaryKey(company);
    }

    @Override
    public SmsCompany add(SmsCompanyParam param) {
        SmsCompany company = new SmsCompany();
        BeanUtils.copyProperties(param, company);
        mapper.insert(company);
        return company;
    }

    @Override
    public List<SmsCompany> list(Integer sxhId, Integer pageSize, Integer pageNum) {
        PageHelper.startPage(pageNum, pageSize);
        SmsCompanyExample example = new SmsCompanyExample();
        example.createCriteria().andSxhIdEqualTo(sxhId);
        return mapper.selectByExample(example);
    }
}
