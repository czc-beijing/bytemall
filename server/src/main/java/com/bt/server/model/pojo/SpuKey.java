package com.bt.server.model.pojo;

import javax.persistence.*;

@Table(name = "spu_key")
public class SpuKey {
    @Id
    private Integer id;

    @Column(name = "spu_id")
    private Integer spuId;

    @Column(name = "spec_key_id")
    private Integer specKeyId;

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
     * @return spec_key_id
     */
    public Integer getSpecKeyId() {
        return specKeyId;
    }

    /**
     * @param specKeyId
     */
    public void setSpecKeyId(Integer specKeyId) {
        this.specKeyId = specKeyId;
    }
}