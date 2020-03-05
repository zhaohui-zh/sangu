package com.zh.sangu.controller;

import com.zh.sangu.common.api.CommonPage;
import com.zh.sangu.common.api.CommonResult;
import com.zh.sangu.dto.SmsPositionParam;
import com.zh.sangu.model.SmsPosition;
import com.zh.sangu.service.SmsPositionService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 双选会置为Controller
 * Created by zhaohui on 2020/3/4
 */
@Controller
@CrossOrigin
@Api(tags = "SmsPositionController", description = "双选会岗位管理")
@RequestMapping("/smsPosition")
public class SmsPositionController {

    @Autowired
    private SmsPositionService positionService;

    @ApiOperation("根据公司id获取下属岗位")
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<CommonPage<SmsPosition>> list(@RequestParam(value = "companyId", required = true) Integer id,
                                                     @RequestParam(value = "pageSize", defaultValue = "5") Integer pageSize,
                                                     @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum) {
        List<SmsPosition> positionList = positionService.list(id, pageSize, pageNum);
        return CommonResult.success(CommonPage.restPage(positionList));
    }

    @ApiOperation("添加岗位")
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult<SmsPosition> add(@RequestBody SmsPositionParam param) {
        SmsPosition position = positionService.add(param);
        if (position == null) {
            return CommonResult.failed();
        }
        return CommonResult.success(position);
    }

    @ApiOperation("修改岗位")
    @RequestMapping(value = "/update", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult update(@RequestBody SmsPosition position) {
        int count = positionService.update(position.getId(), position);
        if (count > 0) {
            return CommonResult.success(count);
        }
        return CommonResult.failed();
    }

}
