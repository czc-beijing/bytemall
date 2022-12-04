package com.bt.server.model.vo;

import javax.persistence.Column;
import javax.persistence.Id;
import java.util.Date;

public class BannerVO {

    private Integer id;

    private String name;

    private String description;

    private String title;

    /**
     * 部分banner可能有标题图片
     */
    private String img;

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
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name
     */
    public void setName(String name) {
        this.name = name;
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
     * 获取部分banner可能有标题图片
     *
     * @return img - 部分banner可能有标题图片
     */
    public String getImg() {
        return img;
    }

    /**
     * 设置部分banner可能有标题图片
     *
     * @param img 部分banner可能有标题图片
     */
    public void setImg(String img) {
        this.img = img;
    }
}