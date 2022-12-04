package com.bt.server.model.pojo;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

public class Order {
    @Id
    private Integer id;

    @Column(name = "order_no")
    private String orderNo;

    /**
     * user表外键
     */
    @Column(name = "user_id")
    private Integer userId;

    @Column(name = "total_price")
    private BigDecimal totalPrice;

    @Column(name = "total_count")
    private Integer totalCount;

    @Column(name = "create_time")
    private Date createTime;

    @Column(name = "delete_time")
    private Date deleteTime;

    @Column(name = "update_time")
    private Date updateTime;

    @Column(name = "expired_time")
    private Date expiredTime;

    @Column(name = "placed_time")
    private Date placedTime;

    @Column(name = "snap_img")
    private String snapImg;

    @Column(name = "snap_title")
    private String snapTitle;

    @Column(name = "snap_items")
    private String snapItems;

    @Column(name = "snap_address")
    private String snapAddress;

    @Column(name = "prepay_id")
    private String prepayId;

    @Column(name = "final_total_price")
    private BigDecimal finalTotalPrice;

    private Byte status;

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
     * @return order_no
     */
    public String getOrderNo() {
        return orderNo;
    }

    /**
     * @param orderNo
     */
    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    /**
     * 获取user表外键
     *
     * @return user_id - user表外键
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * 设置user表外键
     *
     * @param userId user表外键
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * @return total_price
     */
    public BigDecimal getTotalPrice() {
        return totalPrice;
    }

    /**
     * @param totalPrice
     */
    public void setTotalPrice(BigDecimal totalPrice) {
        this.totalPrice = totalPrice;
    }

    /**
     * @return total_count
     */
    public Integer getTotalCount() {
        return totalCount;
    }

    /**
     * @param totalCount
     */
    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
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
     * @return expired_time
     */
    public Date getExpiredTime() {
        return expiredTime;
    }

    /**
     * @param expiredTime
     */
    public void setExpiredTime(Date expiredTime) {
        this.expiredTime = expiredTime;
    }

    /**
     * @return placed_time
     */
    public Date getPlacedTime() {
        return placedTime;
    }

    /**
     * @param placedTime
     */
    public void setPlacedTime(Date placedTime) {
        this.placedTime = placedTime;
    }

    /**
     * @return snap_img
     */
    public String getSnapImg() {
        return snapImg;
    }

    /**
     * @param snapImg
     */
    public void setSnapImg(String snapImg) {
        this.snapImg = snapImg;
    }

    /**
     * @return snap_title
     */
    public String getSnapTitle() {
        return snapTitle;
    }

    /**
     * @param snapTitle
     */
    public void setSnapTitle(String snapTitle) {
        this.snapTitle = snapTitle;
    }

    /**
     * @return snap_items
     */
    public String getSnapItems() {
        return snapItems;
    }

    /**
     * @param snapItems
     */
    public void setSnapItems(String snapItems) {
        this.snapItems = snapItems;
    }

    /**
     * @return snap_address
     */
    public String getSnapAddress() {
        return snapAddress;
    }

    /**
     * @param snapAddress
     */
    public void setSnapAddress(String snapAddress) {
        this.snapAddress = snapAddress;
    }

    /**
     * @return prepay_id
     */
    public String getPrepayId() {
        return prepayId;
    }

    /**
     * @param prepayId
     */
    public void setPrepayId(String prepayId) {
        this.prepayId = prepayId;
    }

    /**
     * @return final_total_price
     */
    public BigDecimal getFinalTotalPrice() {
        return finalTotalPrice;
    }

    /**
     * @param finalTotalPrice
     */
    public void setFinalTotalPrice(BigDecimal finalTotalPrice) {
        this.finalTotalPrice = finalTotalPrice;
    }

    /**
     * @return status
     */
    public Byte getStatus() {
        return status;
    }

    /**
     * @param status
     */
    public void setStatus(Byte status) {
        this.status = status;
    }
}