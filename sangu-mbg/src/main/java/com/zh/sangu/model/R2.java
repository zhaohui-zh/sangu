package com.zh.sangu.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class R2 implements Serializable {
    @ApiModelProperty(value = "id")
    private Integer id;

    @ApiModelProperty(value = "DNN")
    private String dnn;

    @ApiModelProperty(value = "SVR")
    private String svr;

    @ApiModelProperty(value = "LR")
    private String lr;

    @ApiModelProperty(value = "RR")
    private String rr;

    @ApiModelProperty(value = "BRR")
    private String brr;

    @ApiModelProperty(value = "DTR")
    private String dtr;

    @ApiModelProperty(value = "MONTH")
    private String month;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDnn() {
        return dnn;
    }

    public void setDnn(String dnn) {
        this.dnn = dnn;
    }

    public String getSvr() {
        return svr;
    }

    public void setSvr(String svr) {
        this.svr = svr;
    }

    public String getLr() {
        return lr;
    }

    public void setLr(String lr) {
        this.lr = lr;
    }

    public String getRr() {
        return rr;
    }

    public void setRr(String rr) {
        this.rr = rr;
    }

    public String getBrr() {
        return brr;
    }

    public void setBrr(String brr) {
        this.brr = brr;
    }

    public String getDtr() {
        return dtr;
    }

    public void setDtr(String dtr) {
        this.dtr = dtr;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", dnn=").append(dnn);
        sb.append(", svr=").append(svr);
        sb.append(", lr=").append(lr);
        sb.append(", rr=").append(rr);
        sb.append(", brr=").append(brr);
        sb.append(", dtr=").append(dtr);
        sb.append(", month=").append(month);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}