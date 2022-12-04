package com.bt.server.model.pojo;

import javax.persistence.*;

@Table(name = "theme_spu")
public class ThemeSpu {
    @Id
    private Integer id;

    @Column(name = "theme_id")
    private Integer themeId;

    @Column(name = "spu_id")
    private Integer spuId;

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
     * @return theme_id
     */
    public Integer getThemeId() {
        return themeId;
    }

    /**
     * @param themeId
     */
    public void setThemeId(Integer themeId) {
        this.themeId = themeId;
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
}