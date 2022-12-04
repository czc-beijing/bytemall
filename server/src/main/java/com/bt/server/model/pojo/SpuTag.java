package com.bt.server.model.pojo;

import javax.persistence.*;

@Table(name = "spu_tag")
public class SpuTag {
    @Id
    private Integer id;

    @Column(name = "spu_id")
    private Integer spuId;

    @Column(name = "tag_id")
    private Integer tagId;

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
     * @return tag_id
     */
    public Integer getTagId() {
        return tagId;
    }

    /**
     * @param tagId
     */
    public void setTagId(Integer tagId) {
        this.tagId = tagId;
    }
}