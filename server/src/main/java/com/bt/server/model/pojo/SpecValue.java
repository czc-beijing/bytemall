package com.bt.server.model.pojo;

import java.util.Date;
import javax.persistence.*;

@Table(name = "spec_value")
public class SpecValue {
    @Id
    private Integer id;

    private String value;

    @Column(name = "spec_id")
    private Integer specId;

    @Column(name = "create_time")
    private Date createTime;

    @Column(name = "update_time")
    private Date updateTime;

    @Column(name = "delete_time")
    private Date deleteTime;

    private String extend;

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
     * @return value
     */
    public String getValue() {
        return value;
    }

    /**
     * @param value
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * @return spec_id
     */
    public Integer getSpecId() {
        return specId;
    }

    /**
     * @param specId
     */
    public void setSpecId(Integer specId) {
        this.specId = specId;
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
     * @return extend
     */
    public String getExtend() {
        return extend;
    }

    /**
     * @param extend
     */
    public void setExtend(String extend) {
        this.extend = extend;
    }
}