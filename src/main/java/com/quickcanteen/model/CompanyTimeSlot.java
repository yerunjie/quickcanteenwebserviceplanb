package com.quickcanteen.model;

public class CompanyTimeSlot extends CompanyTimeSlotKey {
    private Integer peopleNumber;

    private Integer maxPeopleNumber;

    private Integer busyState;

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
}