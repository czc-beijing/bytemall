package com.bt.server.model.pojo;

import java.util.Date;
import javax.persistence.*;

@Table(name = "sale_explain")
public class SaleExplain {
    @Id
    private Integer id;

    private Byte fixed;

    private String text;

    @Column(name = "spu_id")
    private Integer spuId;

    private Integer index;

    @Column(name = "replace_id")
    private Integer replaceId;

    @Column(name = "create_time")
    private Date createTime;

    @Column(name = "delete_time")
    private Date deleteTime;

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
     * @return fixed
     */
    public Byte getFixed() {
        return fixed;
    }

    /**
     * @param fixed
     */
    public void setFixed(Byte fixed) {
        this.fixed = fixed;
    }

    /**
     * @return text
     */
    public String getText() {
        return text;
    }

    /**
     * @param text
     */
    public void setText(String text) {
        this.text = text;
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
     * @return replace_id
     */
    public Integer getReplaceId() {
        return replaceId;
    }

    /**
     * @param replaceId
     */
    public void setReplaceId(Integer replaceId) {
        this.replaceId = replaceId;
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
}