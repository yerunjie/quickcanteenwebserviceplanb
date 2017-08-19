package com.quickcanteen.model;

import java.util.Date;

public class OrderDishes extends OrderDishesKey {
    private Integer count;

    private Date updateTime;

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}