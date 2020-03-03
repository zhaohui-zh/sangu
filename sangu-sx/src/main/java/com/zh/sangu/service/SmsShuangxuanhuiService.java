package com.zh.sangu.service;

import com.zh.sangu.dto.SmsShuangxuanhuiParam;
import com.zh.sangu.model.SmsShuangxuanhui;

import java.util.List;

/**
 * 双选会Service
 * Created by zhaohui on 2020/3/3
 */
public interface SmsShuangxuanhuiService {

    /**
     * 通过id修改双选会信息
     * @param id
     * @param sxh
     * @return
     */
    int update(Integer id, SmsShuangxuanhui sxh);

    /**
     * 添加双选会信息
     * @param param
     * @return
     */
    SmsShuangxuanhui add(SmsShuangxuanhuiParam param);

    /**
     * 根据双选会名称分页查询双选会
     * @param keyword
     * @param pageSize
     * @param pageNum
     * @return
     */
    List<SmsShuangxuanhui> list(String keyword, Integer pageSize, Integer pageNum);

}
