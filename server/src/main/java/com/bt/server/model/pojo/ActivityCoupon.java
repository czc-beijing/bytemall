package com.bt.server.model.pojo;

import javax.persistence.*;

@Table(name = "activity_coupon")
public class ActivityCoupon {
    @Id
    private Integer id;

    @Column(name = "coupon_id")
    private Integer couponId;

    @Column(name = "activity_id")
    private Integer activityId;

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
}