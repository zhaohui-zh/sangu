package com.zh.sangu.service;

import com.zh.sangu.dto.SmsPositionParam;
import com.zh.sangu.model.SmsPosition;

import java.util.List;

/**
 * Created by zhaohui on 2020/3/4
 */
public interface SmsPositionService {

    /**
     * 通过id更新岗位信息
     * @param id
     * @param position
     * @return
     */
    int update(Integer id, SmsPosition position);

    /**
     * 添加岗位
     * @param param
     * @return
     */
    SmsPosition add(SmsPositionParam param);

    /**
     * 查询指定公司id下的公司列表
     * @param companyId
     * @param pageSize
     * @param pageNum
     * @return
     */
    List<SmsPosition> list(Integer companyId, Integer pageSize, Integer pageNum);
}
