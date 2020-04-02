package com.zh.sangu.service.impl;

import com.github.pagehelper.PageHelper;
import com.zh.sangu.mapper.MseMapper;
import com.zh.sangu.mapper.R2Mapper;
import com.zh.sangu.mapper.TimeMapper;
import com.zh.sangu.model.*;
import com.zh.sangu.service.RailwayBureauService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * RailwayBureau实现类
 *
 * @author Zhaohui
 * @date 2020/4/2
 */
@Service
public class RailwayBureauServiceImpl implements RailwayBureauService {

    @Autowired
    private MseMapper mseMapper;
    @Autowired
    private R2Mapper r2Mapper;
    @Autowired
    private TimeMapper timeMapper;

    @Override
    public List<Mse> listMse(String keyword, Integer pageSize, Integer pageNum) {
        PageHelper.startPage(pageNum, pageSize);
        MseExample example = new MseExample();
        example.createCriteria();
        return mseMapper.selectByExample(example);
    }

    @Override
    public List<R2> listR2(String keyword, Integer pageSize, Integer pageNum) {
        PageHelper.startPage(pageNum, pageSize);
        R2Example example = new R2Example();
        example.createCriteria();
        return r2Mapper.selectByExample(example);
    }

    @Override
    public List<Time> listTime(String keyword, Integer pageSize, Integer pageNum) {
        PageHelper.startPage(pageNum, pageSize);
        TimeExample example = new TimeExample();
        example.createCriteria();
        return timeMapper.selectByExample(example);
    }
}
