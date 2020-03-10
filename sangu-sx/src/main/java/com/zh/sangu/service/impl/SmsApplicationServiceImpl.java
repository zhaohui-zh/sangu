package com.zh.sangu.service.impl;

import com.github.pagehelper.PageHelper;
import com.zh.sangu.dto.SmsApplicationParam;
import com.zh.sangu.mapper.SmsApplicationMapper;
import com.zh.sangu.mapper.SmsShuangxuanhuiMapper;
import com.zh.sangu.model.SmsApplication;
import com.zh.sangu.model.SmsApplicationExample;
import com.zh.sangu.model.SmsShuangxuanhui;
import com.zh.sangu.model.SmsShuangxuanhuiExample;
import com.zh.sangu.service.SmsApplicationService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

/**
 * 双选会报名Service实现类
 * Created by zhaohui on 2020/3/4
 */
@Service
public class SmsApplicationServiceImpl implements SmsApplicationService {

    @Autowired
    private SmsApplicationMapper applicationMapper;

    @Autowired
    private SmsShuangxuanhuiMapper sxhMapper;

    @Override
    @Transactional(rollbackFor = Exception.class)
    public SmsApplication apply(SmsApplicationParam param) {
        SmsShuangxuanhui sxh = sxhMapper.selectByPrimaryKey(param.getSxhId());
        int capacity = sxh.getCapacity();
        int applyNumber = sxh.getApplyNumber();
        //如果容量已满
        if (applyNumber >= capacity) {
            return null;
        }
        //容量未满 申请人数加一
        applyNumber++;
        sxh.setApplyNumber(applyNumber);
        sxhMapper.updateByPrimaryKey(sxh);
        //将申请记录写入数据库
        SmsApplication application = new SmsApplication();
        BeanUtils.copyProperties(param, application);
        Date createDate = new Date();
        application.setCreateTime(createDate);
        applicationMapper.insert(application);
        return application;
    }

    @Override
    public List<SmsApplication> list(Integer userId, Integer pageSize, Integer pageNum) {
        PageHelper.startPage(pageNum, pageSize);
        SmsApplicationExample example = new SmsApplicationExample();
        example.createCriteria().andUserIdEqualTo(userId);
        return applicationMapper.selectByExample(example);
    }
}
