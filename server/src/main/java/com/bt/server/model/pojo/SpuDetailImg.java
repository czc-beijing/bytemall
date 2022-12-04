package com.bt.server.model.pojo;

import java.util.Date;
import javax.persistence.*;

@Table(name = "spu_detail_img")
public class SpuDetailImg {
    @Id
    private Integer id;

    private String img;

    @Column(name = "spu_id")
    private Integer spuId;

    private Integer index;

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
     * @return spu_id
     */
    public Integer getSpuId() {
        return spuId;
    }

    /**
     * @param spuId
     */
    public void setSpuId(Integer spuId) {
        this.spuId = spuId;
    }

    /**
     * @return index
     */
    public Integer getIndex() {
        return index;
    }

    /**
     * @param index
     */
    public void setIndex(Integer index) {
        this.index = index;
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