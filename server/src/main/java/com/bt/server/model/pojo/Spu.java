package com.bt.server.model.pojo;

import java.util.Date;
import javax.persistence.*;

public class Spu {
    @Id
    private Integer id;

    private String title;

    private String subtitle;

    @Column(name = "category_id")
    private Integer categoryId;

    @Column(name = "root_category_id")
    private Integer rootCategoryId;

    private Byte online;

    @Column(name = "create_time")
    private Date createTime;

    @Column(name = "update_time")
    private Date updateTime;

    @Column(name = "delete_time")
    private Date deleteTime;

    /**
     * 文本型价格，有时候SPU需要展示的是一个范围，或者自定义平均价格
     */
    private String price;

    /**
     * 某种规格可以直接附加单品图片
     */
    @Column(name = "sketch_spec_id")
    private Integer sketchSpecId;

    /**
     * 默认选中的sku
     */
    @Column(name = "default_sku_id")
    private Integer defaultSkuId;

    private String img;

    @Column(name = "discount_price")
    private String discountPrice;

    private String description;

    private String tags;

    @Column(name = "is_test")
    private Byte isTest;

    @Column(name = "spu_theme_img")
    private String spuThemeImg;

    @Column(name = "for_theme_img")
    private String forThemeImg;

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
     * @return subtitle
     */
    public String getSubtitle() {
        return subtitle;
    }

    /**
     * @param subtitle
     */
    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
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
     * @return root_category_id
     */
    public Integer getRootCategoryId() {
        return rootCategoryId;
    }

    /**
     * @param rootCategoryId
     */
    public void setRootCategoryId(Integer rootCategoryId) {
        this.rootCategoryId = rootCategoryId;
    }

    /**
     * @return online
     */
    public Byte getOnline() {
        return online;
    }

    /**
     * @param online
     */
    public void setOnline(Byte online) {
        this.online = online;
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
     * 获取文本型价格，有时候SPU需要展示的是一个范围，或者自定义平均价格
     *
     * @return price - 文本型价格，有时候SPU需要展示的是一个范围，或者自定义平均价格
     */
    public String getPrice() {
        return price;
    }

    /**
     * 设置文本型价格，有时候SPU需要展示的是一个范围，或者自定义平均价格
     *
     * @param price 文本型价格，有时候SPU需要展示的是一个范围，或者自定义平均价格
     */
    public void setPrice(String price) {
        this.price = price;
    }

    /**
     * 获取某种规格可以直接附加单品图片
     *
     * @return sketch_spec_id - 某种规格可以直接附加单品图片
     */
    public Integer getSketchSpecId() {
        return sketchSpecId;
    }

    /**
     * 设置某种规格可以直接附加单品图片
     *
     * @param sketchSpecId 某种规格可以直接附加单品图片
     */
    public void setSketchSpecId(Integer sketchSpecId) {
        this.sketchSpecId = sketchSpecId;
    }

    /**
     * 获取默认选中的sku
     *
     * @return default_sku_id - 默认选中的sku
     */
    public Integer getDefaultSkuId() {
        return defaultSkuId;
    }

    /**
     * 设置默认选中的sku
     *
     * @param defaultSkuId 默认选中的sku
     */
    public void setDefaultSkuId(Integer defaultSkuId) {
        this.defaultSkuId = defaultSkuId;
    }

    /**
     * @return img
     */
    public String getImg() {
        return img;
    }

    /**
     * @param img
     */
    public void setImg(String img) {
        this.img = img;
    }

    /**
     * @return discount_price
     */
    public String getDiscountPrice() {
        return discountPrice;
    }

    /**
     * @param discountPrice
     */
    public void setDiscountPrice(String discountPrice) {
        this.discountPrice = discountPrice;
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
     * @return tags
     */
    public String getTags() {
        return tags;
    }

    /**
     * @param tags
     */
    public void setTags(String tags) {
        this.tags = tags;
    }

    /**
     * @return is_test
     */
    public Byte getIsTest() {
        return isTest;
    }

    /**
     * @param isTest
     */
    public void setIsTest(Byte isTest) {
        this.isTest = isTest;
    }

    /**
     * @return spu_theme_img
     */
    public String getSpuThemeImg() {
        return spuThemeImg;
    }

    /**
     * @param spuThemeImg
     */
    public void setSpuThemeImg(String spuThemeImg) {
        this.spuThemeImg = spuThemeImg;
    }

    /**
     * @return for_theme_img
     */
    public String getForThemeImg() {
        return forThemeImg;
    }

    /**
     * @param forThemeImg
     */
    public void setForThemeImg(String forThemeImg) {
        this.forThemeImg = forThemeImg;
    }
}