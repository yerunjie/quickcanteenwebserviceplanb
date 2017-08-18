package com.quickcanteen.model;

import java.util.Date;

public class DishesType extends DishesTypeKey {
    private Date updateTime;

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}