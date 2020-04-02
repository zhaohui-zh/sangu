package com.zh.sangu.service;

import com.zh.sangu.model.Mse;
import com.zh.sangu.model.R2;
import com.zh.sangu.model.Time;

import java.util.List;

/**
 * 铁路局机器学习可视化
 *
 * @author Zhaohui
 * @date 2020/4/2
 */
public interface RailwayBureauService {

    /**
     * 获取MSE
     *
     * @param keyword 关键字(不使用)
     * @param pageSize  分页大小
     * @param pageNum 当前页数
     * @return MSE
     */
    List<Mse> listMse(String keyword, Integer pageSize, Integer pageNum);

    /**
     * 获取R2
     *
     * @param keyword 关键字(不使用)
     * @param pageSize  分页大小
     * @param pageNum 当前页数
     * @return R2
     */
    List<R2> listR2(String keyword, Integer pageSize, Integer pageNum);

    /**
     * 获取TIME
     *
     * @param keyword 关键字(不使用)
     * @param pageSize  分页大小
     * @param pageNum 当前页数
     * @return TIME
     */
    List<Time> listTime(String keyword, Integer pageSize, Integer pageNum);
}
