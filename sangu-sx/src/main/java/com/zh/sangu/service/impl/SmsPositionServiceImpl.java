package com.zh.sangu.service.impl;

import com.github.pagehelper.PageHelper;
import com.zh.sangu.dto.SmsPositionParam;
import com.zh.sangu.mapper.SmsPositionMapper;
import com.zh.sangu.model.SmsPosition;
import com.zh.sangu.model.SmsPositionExample;
import com.zh.sangu.service.SmsPositionService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 双选会岗位Service实现类
 * Created by zhaohui on 2020/3/4
 */
@Service
public class SmsPositionServiceImpl implements SmsPositionService {

    @Autowired
    private SmsPositionMapper mapper;

    @Override
    public int update(Integer id, SmsPosition position) {
        position.setId(id);
        return mapper.updateByPrimaryKey(position);
    }

    @Override
    public SmsPosition add(SmsPositionParam param) {
        SmsPosition position = new SmsPosition();
        BeanUtils.copyProperties(param, position);
        mapper.insert(position);
        return position;
    }

    @Override
    public List<SmsPosition> list(Integer companyId, Integer pageSize, Integer pageNum) {
        PageHelper.startPage(pageNum, pageSize);
        SmsPositionExample example = new SmsPositionExample();
        example.createCriteria().andCompanyIdEqualTo(companyId);
        return mapper.selectByExample(example);
    }
}
