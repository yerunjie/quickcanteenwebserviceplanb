package com.quickcanteen.model;

import java.util.Date;

public class CollectDishes extends CollectDishesKey {
    private Date updateTime;

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}