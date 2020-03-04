package com.zh.sangu.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

/**
 * 双选会dto
 * Created by zhaohui on 2020/3/3
 */
@Getter
@Setter
public class SmsShuangxuanhuiParam {

    @ApiModelProperty(value = "双选会场次名称")
    private String name;

    @ApiModelProperty(value = "双选会开始时间")
    private Date startTime;

    @ApiModelProperty(value = "双选会结束时间")
    private Date endTime;

    @ApiModelProperty(value = "双选会容量")
    private Integer capacity;

    @ApiModelProperty(value = "双选会报名人数")
    private Integer applyNumber;

    @ApiModelProperty(value = "状态：0 未开始，1 正在进行，2已结束，3 其他")
    private Integer status;

    @ApiModelProperty(value = "备注信息")
    private String note;

    @ApiModelProperty(value = "双选会城市")
    private String city;

    @ApiModelProperty(value = "双选会地点")
    private String address;

}
