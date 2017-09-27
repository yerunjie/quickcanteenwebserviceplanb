package com.quickcanteen.model;

import lombok.NoArgsConstructor;

import java.util.Date;

@NoArgsConstructor
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

    private String dishesIntroduce;

    public Dishes(String name,Double price,String introduction,Integer dishesId){
        this.dishesId = dishesId;
        this.dishesName = name;
        this.price = price;
        this.dishesIntroduce = introduction;
    }



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

    public String getDishesIntroduce() {
        return dishesIntroduce;
    }

    public void setDishesIntroduce(String dishesIntroduce) {
        this.dishesIntroduce = dishesIntroduce == null ? null : dishesIntroduce.trim();
    }
}