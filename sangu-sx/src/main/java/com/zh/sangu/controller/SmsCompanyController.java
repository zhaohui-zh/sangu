package com.zh.sangu.controller;

import com.zh.sangu.common.api.CommonPage;
import com.zh.sangu.common.api.CommonResult;
import com.zh.sangu.dto.SmsCompanyParam;
import com.zh.sangu.model.SmsCompany;
import com.zh.sangu.service.SmsCompanyService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 双选会公司Controller
 * Created by zhaohui on 2020/3/4
 */
@Controller
@Api(tags = "SmsCompanyController", description = "双选会公司管理")
@RequestMapping("/smsCompany")
public class SmsCompanyController {

    @Autowired
    private SmsCompanyService companyService;

    @ApiOperation("根据双选会id获取下属公司")
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<CommonPage<SmsCompany>> list(@RequestParam(value = "sxhId", required = true) Integer id,
                                                     @RequestParam(value = "pageSize", defaultValue = "5") Integer pageSize,
                                                     @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum) {
        List<SmsCompany> companyList = companyService.list(id, pageSize, pageNum);
        return CommonResult.success(CommonPage.restPage(companyList));
    }

    @ApiOperation("添加公司")
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult<SmsCompany> add(@RequestBody SmsCompanyParam param) {
        SmsCompany company = companyService.add(param);
        if (company == null) {
            return CommonResult.failed();
        }
        return CommonResult.success(company);
    }

    @ApiOperation("修改公司")
    @RequestMapping(value = "/update", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult update(@RequestBody SmsCompany company) {
        int count = companyService.update(company.getId(), company);
        if (count > 0) {
            return CommonResult.success(count);
        }
        return CommonResult.failed();
    }

}
