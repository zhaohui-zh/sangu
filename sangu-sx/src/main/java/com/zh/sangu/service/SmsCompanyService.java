package com.zh.sangu.service;

import com.zh.sangu.dto.SmsCompanyParam;
import com.zh.sangu.model.SmsCompany;

import java.util.List;

/**
 * 双选会公司Service
 * Created by zhaohui on 2020/3/4
 */
public interface SmsCompanyService {

    /**
     * 通过id更新公司信息
     * @param id
     * @param company
     * @return
     */
    int update(Integer id, SmsCompany company);

    /**
     * 添加公司
     * @param param
     * @return
     */
    SmsCompany add(SmsCompanyParam param);

    /**
     * 查询指定双选会id下的公司列表
     * @param sxhId
     * @param pageSize
     * @param pageNum
     * @return
     */
    List<SmsCompany> list(Integer sxhId, Integer pageSize, Integer pageNum);


}
