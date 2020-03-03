package com.zh.sangu.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class SmsShuangxuanhui implements Serializable {
    @ApiModelProperty(value = "双选会场次id")
    private Integer id;

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

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    public Integer getApplyNumber() {
        return applyNumber;
    }

    public void setApplyNumber(Integer applyNumber) {
        this.applyNumber = applyNumber;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", startTime=").append(startTime);
        sb.append(", endTime=").append(endTime);
        sb.append(", capacity=").append(capacity);
        sb.append(", applyNumber=").append(applyNumber);
        sb.append(", status=").append(status);
        sb.append(", note=").append(note);
        sb.append(", city=").append(city);
        sb.append(", address=").append(address);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}