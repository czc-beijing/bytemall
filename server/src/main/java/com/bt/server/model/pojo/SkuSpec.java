package com.bt.server.model.pojo;

import javax.persistence.*;

@Table(name = "sku_spec")
public class SkuSpec {
    @Id
    private Integer id;

    @Column(name = "spu_id")
    private Integer spuId;

    @Column(name = "sku_id")
    private Integer skuId;

    @Column(name = "key_id")
    private Integer keyId;

    @Column(name = "value_id")
    private Integer valueId;

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
     * @return sku_id
     */
    public Integer getSkuId() {
        return skuId;
    }

    /**
     * @param skuId
     */
    public void setSkuId(Integer skuId) {
        this.skuId = skuId;
    }

    /**
     * @return key_id
     */
    public Integer getKeyId() {
        return keyId;
    }

    /**
     * @param keyId
     */
    public void setKeyId(Integer keyId) {
        this.keyId = keyId;
    }

    /**
     * @return value_id
     */
    public Integer getValueId() {
        return valueId;
    }

    /**
     * @param valueId
     */
    public void setValueId(Integer valueId) {
        this.valueId = valueId;
    }
}