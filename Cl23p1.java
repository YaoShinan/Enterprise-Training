package com.ruoyi.common.core.domain.classes224;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.ruoyi.common.core.domain.BaseEntity;

import java.util.Date;

// 路面芯样马歇尔试验检测记录表 表头部分
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class Cl23p1 extends BaseEntity {

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
    private String sytj;// 试验条件
    private String jcyj;// 检测依据
    private String pdyj;// 判定依据
    private String zyyqsbmcjbh;// 主要仪器设备名称及编号
    private String lqhhlzl;// 沥青混合料种类
    private String hhlyyc;// 混合料应用层
    private float syzj;// 试样直径
    private float ysb;// 油石比
    private float sldsdxdmd;// 石蜡对水的相对密度



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

    public Date getJcrq() {
        return jcrq;
    }

    public void setJcrq(Date jcrq) {
        this.jcrq = jcrq;
    }

    public String getSytj() {return sytj;}

    public void setSytj(String sytj) {this.sytj = sytj;}

    public String getJcyj() {return jcyj;}

    public void setJcyj(String jcyj) {this.jcyj = jcyj;}

    public String getPdyj() {return pdyj;}

    public void setPdyj(String pdyj) {this.pdyj = pdyj;}

    public String getZyyqsbmcjbh() {return zyyqsbmcjbh;}

    public void setZyyqsbmcjbh(String zyyqsbmcjbh) {this.zyyqsbmcjbh = zyyqsbmcjbh;}

    public String getLqhhlzl() {return lqhhlzl;}

    public void setLqhhlzl(String lqhhlzl) {this.lqhhlzl = lqhhlzl;}

    public String getHhlyyc() {return hhlyyc;}

    public void setHhlyyc(String hhlyyc) {this.hhlyyc = hhlyyc;}

    public float getSyzj() {return syzj;}

    public void setSyzj(float syzj) {this.syzj = syzj;}

    public float getYsb() {return ysb;}

    public void setYsb(float ysb) {this.ysb = ysb;}

    public float getSldsdxdmd() {return sldsdxdmd;}

    public void setSldsdxdmd(float sldsdxdmd) {this.sldsdxdmd = sldsdxdmd;}
}
