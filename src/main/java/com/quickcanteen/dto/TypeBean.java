package com.quickcanteen.dto;

import java.util.List;

/**
 * Created by 11022 on 2017/6/30.
 */
public class TypeBean {
    private Integer typeId;
    private String typeName;
    private List<DishesBean> dishesBeans;

    public List<DishesBean> getDishesBeans() {
        return dishesBeans;
    }

    public void setDishesBeans(List<DishesBean> dishesBeans) {
        this.dishesBeans = dishesBeans;
    }

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }
}
