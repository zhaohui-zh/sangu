package com.zh.sangu.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.math.BigDecimal;

public class SmsPosition implements Serializable {
    @ApiModelProperty(value = "职位id")
    private Integer id;

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

    public String getRequirement() {
        return requirement;
    }

    public void setRequirement(String requirement) {
        this.requirement = requirement;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getIntroduce() {
        return introduce;
    }

    public void setIntroduce(String introduce) {
        this.introduce = introduce;
    }

    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", requirement=").append(requirement);
        sb.append(", salary=").append(salary);
        sb.append(", city=").append(city);
        sb.append(", number=").append(number);
        sb.append(", introduce=").append(introduce);
        sb.append(", companyId=").append(companyId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}