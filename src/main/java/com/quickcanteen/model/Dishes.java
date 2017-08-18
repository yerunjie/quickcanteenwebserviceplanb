package com.quickcanteen.model;

import java.util.Date;

public class Dishes {
    private Integer dishesId;

    private Integer companyId;

    private Double price;

    private String diagrammaticSketchAddress;

    private String dishesName;

    private Integer praiseNum;

    private Integer commentNum;

    private Integer collectNum;

    private Date publishTime;

    private Double rating;

    private Date updateTime;

    private String dishesIntroduce;

    public Integer getDishesId() {
        return dishesId;
    }

    public void setDishesId(Integer dishesId) {
        this.dishesId = dishesId;
    }

    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getDiagrammaticSketchAddress() {
        return diagrammaticSketchAddress;
    }

    public void setDiagrammaticSketchAddress(String diagrammaticSketchAddress) {
        this.diagrammaticSketchAddress = diagrammaticSketchAddress == null ? null : diagrammaticSketchAddress.trim();
    }

    public String getDishesName() {
        return dishesName;
    }

    public void setDishesName(String dishesName) {
        this.dishesName = dishesName == null ? null : dishesName.trim();
    }

    public Integer getPraiseNum() {
        return praiseNum;
    }

    public void setPraiseNum(Integer praiseNum) {
        this.praiseNum = praiseNum;
    }

    public Integer getCommentNum() {
        return commentNum;
    }

    public void setCommentNum(Integer commentNum) {
        this.commentNum = commentNum;
    }

    public Integer getCollectNum() {
        return collectNum;
    }

    public void setCollectNum(Integer collectNum) {
        this.collectNum = collectNum;
    }

    public Date getPublishTime() {
        return publishTime;
    }

    public void setPublishTime(Date publishTime) {
        this.publishTime = publishTime;
    }

    public Double getRating() {
        return rating;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getDishesIntroduce() {
        return dishesIntroduce;
    }

    public void setDishesIntroduce(String dishesIntroduce) {
        this.dishesIntroduce = dishesIntroduce == null ? null : dishesIntroduce.trim();
    }
}