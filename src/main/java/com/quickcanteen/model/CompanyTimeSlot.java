package com.quickcanteen.model;

import java.util.Date;

public class CompanyTimeSlot extends CompanyTimeSlotKey {
    private Integer peopleNumber;

    private Integer maxPeopleNumber;

    private Integer busyState;

    private Date updateTime;

    public Integer getPeopleNumber() {
        return peopleNumber;
    }

    public void setPeopleNumber(Integer peopleNumber) {
        this.peopleNumber = peopleNumber;
    }

    public Integer getMaxPeopleNumber() {
        return maxPeopleNumber;
    }

    public void setMaxPeopleNumber(Integer maxPeopleNumber) {
        this.maxPeopleNumber = maxPeopleNumber;
    }

    public Integer getBusyState() {
        return busyState;
    }

    public void setBusyState(Integer busyState) {
        this.busyState = busyState;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}