package com.zh.sangu.service.impl;

import com.github.pagehelper.PageHelper;
import com.zh.sangu.dto.SmsShuangxuanhuiParam;
import com.zh.sangu.mapper.SmsShuangxuanhuiMapper;
import com.zh.sangu.model.SmsShuangxuanhui;
import com.zh.sangu.model.SmsShuangxuanhuiExample;
import com.zh.sangu.service.SmsShuangxuanhuiService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;

/**
 * 双选会Service实现类
 * Created by zhaohui on 2020/3/3
 */
@Service
public class SmsShuangxuanhuiServiceImpl implements SmsShuangxuanhuiService {

    @Autowired
    private SmsShuangxuanhuiMapper mapper;

    @Override
    public int update(Integer id, SmsShuangxuanhui sxh) {
        sxh.setId(id);
        return mapper.updateByPrimaryKey(sxh);
    }

    @Override
    public SmsShuangxuanhui add(SmsShuangxuanhuiParam param) {
        SmsShuangxuanhui sxh = new SmsShuangxuanhui();
        BeanUtils.copyProperties(param, sxh);
        //查询是否有相同名称的双选会
        SmsShuangxuanhuiExample example = new SmsShuangxuanhuiExample();
        example.createCriteria().andNameEqualTo(sxh.getName());
        List<SmsShuangxuanhui> sxhList = mapper.selectByExample(example);
        if (sxhList.size() > 0) {
            return null;
        }
        mapper.insert(sxh);
        return sxh;
    }

    @Override
    public List<SmsShuangxuanhui> list(String keyword, Integer pageSize, Integer pageNum) {
        PageHelper.startPage(pageNum, pageSize);
        SmsShuangxuanhuiExample example = new SmsShuangxuanhuiExample();
        SmsShuangxuanhuiExample.Criteria criteria = example.createCriteria();
        if (!StringUtils.isEmpty(keyword)) {
            criteria.andNameLike("%" + keyword + "%");
        }
        return mapper.selectByExample(example);
    }


}
