package com.bt.server.model.pojo;

import java.util.Date;
import javax.persistence.*;

public class Tag {
    @Id
    private Integer id;

    /**
     * 中文限制6个，英文限制12个，由逻辑层控制
     */
    private String title;

    private String description;

    @Column(name = "update_time")
    private Date updateTime;

    @Column(name = "delete_time")
    private Date deleteTime;

    @Column(name = "create_time")
    private Date createTime;

    private Byte highlight;

    private Byte type;

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
     * 获取中文限制6个，英文限制12个，由逻辑层控制
     *
     * @return title - 中文限制6个，英文限制12个，由逻辑层控制
     */
    public String getTitle() {
        return title;
    }

    /**
     * 设置中文限制6个，英文限制12个，由逻辑层控制
     *
     * @param title 中文限制6个，英文限制12个，由逻辑层控制
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
     * @return highlight
     */
    public Byte getHighlight() {
        return highlight;
    }

    /**
     * @param highlight
     */
    public void setHighlight(Byte highlight) {
        this.highlight = highlight;
    }

    /**
     * @return type
     */
    public Byte getType() {
        return type;
    }

    /**
     * @param type
     */
    public void setType(Byte type) {
        this.type = type;
    }
}