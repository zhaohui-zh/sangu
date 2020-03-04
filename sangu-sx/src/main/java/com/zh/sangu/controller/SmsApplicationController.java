package com.zh.sangu.controller;

import com.zh.sangu.common.api.CommonPage;
import com.zh.sangu.common.api.CommonResult;
import com.zh.sangu.dto.SmsApplicationParam;
import com.zh.sangu.model.SmsApplication;
import com.zh.sangu.service.SmsApplicationService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 双选会报名Controller
 * Created by zhaohui on 2020/3/4
 */
@Controller
@Api(tags = "SmsApplicationController", description = "双选会报名管理")
@RequestMapping("/smsApplication")
public class SmsApplicationController {

    @Autowired
    private SmsApplicationService applicationService;

    @ApiOperation("双选会报名申请")
    @RequestMapping(value = "/apply", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult<SmsApplication> apply(@RequestBody SmsApplicationParam param) {
        SmsApplication application = applicationService.apply(param);
        if (application == null) {
            return CommonResult.failed();
        }
        return CommonResult.success(application);
    }

    @ApiOperation("根据用户id获取报名的")
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<CommonPage<SmsApplication>> list(@RequestParam(value = "userId", required = true) Integer id,
                                                         @RequestParam(value = "pageSize", defaultValue = "5") Integer pageSize,
                                                         @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum) {
        List<SmsApplication> applicationList = applicationService.list(id, pageSize, pageNum);
        return CommonResult.success(CommonPage.restPage(applicationList));
    }

}
