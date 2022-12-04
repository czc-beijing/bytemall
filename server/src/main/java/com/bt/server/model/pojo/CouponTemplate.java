package com.bt.server.model.pojo;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "coupon_template")
public class CouponTemplate {
    @Id
    private Integer id;

    private String title;

    private String description;

    @Column(name = "full_money")
    private BigDecimal fullMoney;

    private BigDecimal minus;

    /**
     * 国内多是打折，国外多是百分比 off
     */
    private BigDecimal discount;

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
     * 获取国内多是打折，国外多是百分比 off
     *
     * @return discount - 国内多是打折，国外多是百分比 off
     */
    public BigDecimal getDiscount() {
        return discount;
    }

    /**
     * 设置国内多是打折，国外多是百分比 off
     *
     * @param discount 国内多是打折，国外多是百分比 off
     */
    public void setDiscount(BigDecimal discount) {
        this.discount = discount;
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
}