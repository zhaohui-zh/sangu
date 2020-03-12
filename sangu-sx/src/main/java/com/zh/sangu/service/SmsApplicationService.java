package com.zh.sangu.service;

import com.zh.sangu.dto.SmsApplicationParam;
import com.zh.sangu.model.SmsApplication;

import java.util.List;

/**
 * 双选会报名Service
 * Created by zhaohui on 2020/3/4
 */
public interface SmsApplicationService {

    /**
     * 双选会报名
     * @param param
     * @return
     */
    SmsApplication apply(SmsApplicationParam param);

    /**
     * 根据用户id获取已报名双选会
     * @param userId
     * @param pageNum
     * @param pageSize
     * @return
     */
    List<SmsApplication> list(Long userId, Integer pageNum, Integer pageSize);

}
