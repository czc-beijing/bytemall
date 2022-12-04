package com.bt.server.model.pojo;

import java.util.Date;
import javax.persistence.*;

@Table(name = "user_coupon")
public class UserCoupon {
    @Id
    private Integer id;

    @Column(name = "user_id")
    private Integer userId;

    @Column(name = "coupon_id")
    private Integer couponId;

    /**
     * 1:未使用，2：已使用， 3：已过期
     */
    private Byte status;

    @Column(name = "create_time")
    private Date createTime;

    @Column(name = "order_id")
    private Integer orderId;

    @Column(name = "update_time")
    private Date updateTime;

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
     * @return user_id
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * @param userId
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * @return coupon_id
     */
    public Integer getCouponId() {
        return couponId;
    }

    /**
     * @param couponId
     */
    public void setCouponId(Integer couponId) {
        this.couponId = couponId;
    }

    /**
     * 获取1:未使用，2：已使用， 3：已过期
     *
     * @return status - 1:未使用，2：已使用， 3：已过期
     */
    public Byte getStatus() {
        return status;
    }

    /**
     * 设置1:未使用，2：已使用， 3：已过期
     *
     * @param status 1:未使用，2：已使用， 3：已过期
     */
    public void setStatus(Byte status) {
        this.status = status;
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
     * @return order_id
     */
    public Integer getOrderId() {
        return orderId;
    }

    /**
     * @param orderId
     */
    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
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
}