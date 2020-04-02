package com.zh.sangu.controller;

import com.zh.sangu.common.api.CommonPage;
import com.zh.sangu.common.api.CommonResult;
import com.zh.sangu.model.Mse;
import com.zh.sangu.model.R2;
import com.zh.sangu.model.Time;
import com.zh.sangu.service.RailwayBureauService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 铁路局机器学习可视化Controller
 *
 * @author Zhaohui
 * @date 2020/4/2
 */
@Controller
@CrossOrigin
@Api(tags = "RailwayBureauController", description = "铁路局机器学习数据可视化接口")
@RequestMapping("/RailwayBureau")
public class RailwayBureauController {

    @Autowired
    private RailwayBureauService service;

    @ApiOperation("获取MSE列表")
    @RequestMapping(value = "/listMse", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<CommonPage<Mse>> listMse(@RequestParam(value = "keyword", required = false) String keyword,
                                                 @RequestParam(value = "pageSize", defaultValue = "15") Integer pageSize,
                                                 @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum) {
        List<Mse> mseList = service.listMse(keyword, pageSize, pageNum);
        return CommonResult.success(CommonPage.restPage(mseList));
    }

    @ApiOperation("获取R2列表")
    @RequestMapping(value = "/listR2", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<CommonPage<R2>> listR2(@RequestParam(value = "keyword", required = false) String keyword,
                                                 @RequestParam(value = "pageSize", defaultValue = "15") Integer pageSize,
                                                 @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum) {
        List<R2> r2List = service.listR2(keyword, pageSize, pageNum);
        return CommonResult.success(CommonPage.restPage(r2List));
    }

    @ApiOperation("获取TIME列表")
    @RequestMapping(value = "/listTime", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<CommonPage<Time>> listTime(@RequestParam(value = "keyword", required = false) String keyword,
                                                  @RequestParam(value = "pageSize", defaultValue = "15") Integer pageSize,
                                                  @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum) {
        List<Time> timeList = service.listTime(keyword, pageSize, pageNum);
        return CommonResult.success(CommonPage.restPage(timeList));
    }


}
