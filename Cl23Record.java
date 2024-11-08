package com.ruoyi.common.core.domain.classes224;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.ruoyi.common.core.domain.BaseEntity;

import java.util.Date;

// 路面芯样马歇尔试验检测记录表
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class Cl23Record extends BaseEntity {

    private int id;
    private String jcdw;// 检测单位
    private String jlbh;// 记录编号
    private String gcmc;// 工程名称
    private String htd;// 合同段
    private String sgdw;// 施工单位
    private String jldw;// 监理单位
    private String gcbw;// 工程部位
    private String ypxx;// 样品信息

    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date jcrq;// 检测日期

    public Date getJcrq() {
        return jcrq;
    }

    public void setJcrq(Date jcrq) {
        this.jcrq = jcrq;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getJcdw() {
        return jcdw;
    }

    public void setJcdw(String jcdw) {
        this.jcdw = jcdw;
    }

    public String getJlbh() {
        return jlbh;
    }

    public void setJlbh(String jlbh) {
        this.jlbh = jlbh;
    }

    public String getGcmc() {
        return gcmc;
    }

    public void setGcmc(String gcmc) {
        this.gcmc = gcmc;
    }

    public String getHtd() {
        return htd;
    }

    public void setHtd(String htd) {
        this.htd = htd;
    }

    public String getSgdw() {
        return sgdw;
    }

    public void setSgdw(String sgdw) {
        this.sgdw = sgdw;
    }

    public String getJldw() {
        return jldw;
    }

    public void setJldw(String jldw) {
        this.jldw = jldw;
    }

    public String getGcbw() {
        return gcbw;
    }

    public void setGcbw(String gcbw) {
        this.gcbw = gcbw;
    }

    public String getYpxx() {
        return ypxx;
    }

    public void setYpxx(String ypxx) {
        this.ypxx = ypxx;
    }
}
