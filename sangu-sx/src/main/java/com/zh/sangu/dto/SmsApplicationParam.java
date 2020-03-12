package com.zh.sangu.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * 双选会报名dto
 * Created by zhaohui on 2020/3/4
 */
@Getter
@Setter
public class SmsApplicationParam {

    @ApiModelProperty(value = "用户id")
    private Long userId;

    @ApiModelProperty(value = "双选会id")
    private Integer sxhId;

}
