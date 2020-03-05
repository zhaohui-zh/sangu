package com.zh.sangu.controller;

import com.zh.sangu.common.api.CommonPage;
import com.zh.sangu.common.api.CommonResult;
import com.zh.sangu.dto.SmsShuangxuanhuiParam;
import com.zh.sangu.model.SmsShuangxuanhui;
import com.zh.sangu.service.SmsShuangxuanhuiService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 双选会Controller
 * Created by zhaohui on 2020/3/3
 */
@Controller
@CrossOrigin
@Api(tags = "SmsShuangxuanhuiController", description = "双选会管理")
@RequestMapping("/smsShuangxuanhui")
public class SmsShuangxuanhuiController {

    @Autowired
    SmsShuangxuanhuiService sxhService;

    @ApiOperation("根据双选会名称获取双选会列表")
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<CommonPage<SmsShuangxuanhui>> list(@RequestParam(value = "keyword", required = false) String keyword,
                                                           @RequestParam(value = "pageSize", defaultValue = "5") Integer pageSize,
                                                           @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum) {
        List<SmsShuangxuanhui> sxhList = sxhService.list(keyword, pageSize, pageNum);
        return CommonResult.success(CommonPage.restPage(sxhList));
    }

    @ApiOperation("添加双选会")
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult<SmsShuangxuanhui> add(@RequestBody SmsShuangxuanhuiParam param) {
        SmsShuangxuanhui sxk = sxhService.add(param);
        if (sxk == null) {
            return CommonResult.failed();
        }
        return CommonResult.success(sxk);
    }

    @ApiOperation("修改双选会")
    @RequestMapping(value = "/update", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult update(@RequestBody SmsShuangxuanhui sxh) {
        int count = sxhService.update(sxh.getId(), sxh);
        if (count > 0) {
            return CommonResult.success(count);
        }
        return CommonResult.failed();
    }

}
