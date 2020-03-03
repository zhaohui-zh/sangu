package com.zh.sangu.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class SmsCompany implements Serializable {
    @ApiModelProperty(value = "公司id")
    private Integer id;

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

    public String getProfile() {
        return profile;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }

    public Integer getSxhId() {
        return sxhId;
    }

    public void setSxhId(Integer sxhId) {
        this.sxhId = sxhId;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public Integer getProperty() {
        return property;
    }

    public void setProperty(Integer property) {
        this.property = property;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", profile=").append(profile);
        sb.append(", sxhId=").append(sxhId);
        sb.append(", size=").append(size);
        sb.append(", property=").append(property);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}