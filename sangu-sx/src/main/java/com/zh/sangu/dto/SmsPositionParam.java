package com.zh.sangu.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

/**
 * Created by zhaohui on 2020/3/4
 */
@Getter
@Setter
public class SmsPositionParam {

    @ApiModelProperty(value = "职位名称")
    private String name;

    @ApiModelProperty(value = "岗位要求")
    private String requirement;

    @ApiModelProperty(value = "岗位工资")
    private BigDecimal salary;

    @ApiModelProperty(value = "工作城市")
    private String city;

    @ApiModelProperty(value = "招聘人数")
    private Integer number;

    @ApiModelProperty(value = "岗位介绍")
    private String introduce;

    @ApiModelProperty(value = "岗位所属公司id")
    private Integer companyId;

}
