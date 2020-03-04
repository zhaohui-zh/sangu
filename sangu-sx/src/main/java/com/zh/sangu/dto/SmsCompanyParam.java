package com.zh.sangu.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * 双选会公司dto
 * Created by zhaohui on 2020/3/4
 */
@Getter
@Setter
public class SmsCompanyParam {

    @ApiModelProperty(value = "公司名称")
    private String name;

    @ApiModelProperty(value = "公司简介")
    private String profile;

    @ApiModelProperty(value = "所属双选会id")
    private Integer sxhId;

    @ApiModelProperty(value = "公司规模")
    private Integer size;

    @ApiModelProperty(value = "公司性质：0 国企 1 私企 2 外企 3 其他")
    private Integer property;

}
