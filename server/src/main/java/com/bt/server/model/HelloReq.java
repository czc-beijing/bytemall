package com.bt.server.model;

import javax.validation.constraints.NotNull;

public class HelloReq {

    @NotNull(message = "名字不能为空")
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    @NotNull(message = "商品图片不能为null")
    private String image;
}
