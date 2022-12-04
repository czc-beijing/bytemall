package com.bt.server.model.pojo;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

public class Coupon {
    @Id
    private Integer id;

    private String title;

    @Column(name = "start_time")
    private Date startTime;

    @Column(name = "end_time")
    private Date endTime;

    private String description;

    @Column(name = "full_money")
    private BigDecimal fullMoney;

    private BigDecimal minus;

    private BigDecimal rate;

    /**
     * 1. 满减券 2.折扣券 3.无门槛券 4.满金额折扣券
     */
    private Short type;

    @Column(name = "create_time")
    private Date createTime;

    @Column(name = "update_time")
    private Date updateTime;

    @Column(name = "delete_time")
    private Date deleteTime;

    @Column(name = "activity_id")
    private Integer activityId;

    private String remark;

    @Column(name = "whole_store")
    private Byte wholeStore;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return start_time
     */
    public Date getStartTime() {
        return startTime;
    }

    /**
     * @param startTime
     */
    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    /**
     * @return end_time
     */
    public Date getEndTime() {
        return endTime;
    }

    /**
     * @param endTime
     */
    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return full_money
     */
    public BigDecimal getFullMoney() {
        return fullMoney;
    }

    /**
     * @param fullMoney
     */
    public void setFullMoney(BigDecimal fullMoney) {
        this.fullMoney = fullMoney;
    }

    /**
     * @return minus
     */
    public BigDecimal getMinus() {
        return minus;
    }

    /**
     * @param minus
     */
    public void setMinus(BigDecimal minus) {
        this.minus = minus;
    }

    /**
     * @return rate
     */
    public BigDecimal getRate() {
        return rate;
    }

    /**
     * @param rate
     */
    public void setRate(BigDecimal rate) {
        this.rate = rate;
    }

    /**
     * 获取1. 满减券 2.折扣券 3.无门槛券 4.满金额折扣券
     *
     * @return type - 1. 满减券 2.折扣券 3.无门槛券 4.满金额折扣券
     */
    public Short getType() {
        return type;
    }

    /**
     * 设置1. 满减券 2.折扣券 3.无门槛券 4.满金额折扣券
     *
     * @param type 1. 满减券 2.折扣券 3.无门槛券 4.满金额折扣券
     */
    public void setType(Short type) {
        this.type = type;
    }

    /**
     * @return create_time
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * @param createTime
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * @return update_time
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * @param updateTime
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * @return delete_time
     */
    public Date getDeleteTime() {
        return deleteTime;
    }

    /**
     * @param deleteTime
     */
    public void setDeleteTime(Date deleteTime) {
        this.deleteTime = deleteTime;
    }

    /**
     * @return activity_id
     */
    public Integer getActivityId() {
        return activityId;
    }

    /**
     * @param activityId
     */
    public void setActivityId(Integer activityId) {
        this.activityId = activityId;
    }

    /**
     * @return remark
     */
    public String getRemark() {
        return remark;
    }

    /**
     * @param remark
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }

    /**
     * @return whole_store
     */
    public Byte getWholeStore() {
        return wholeStore;
    }

    /**
     * @param wholeStore
     */
    public void setWholeStore(Byte wholeStore) {
        this.wholeStore = wholeStore;
    }
}