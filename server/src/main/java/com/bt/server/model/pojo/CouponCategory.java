package com.bt.server.model.pojo;

import javax.persistence.*;

@Table(name = "coupon_category")
public class CouponCategory {
    @Id
    private Integer id;

    @Column(name = "category_id")
    private Integer categoryId;

    @Column(name = "coupon_id")
    private Integer couponId;

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
     * @return category_id
     */
    public Integer getCategoryId() {
        return categoryId;
    }

    /**
     * @param categoryId
     */
    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
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
}