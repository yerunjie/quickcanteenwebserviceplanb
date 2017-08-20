package com.quickcanteen.util;


import com.quickcanteen.dto.DishesBean;
import com.quickcanteen.model.Dishes;
import org.apache.commons.beanutils.BeanUtils;

public final class ObjectParser {

    private ObjectParser() {
    }

    public static DishesBean parse(Dishes dishes){
        DishesBean dishesBean=new DishesBean();
        try{
            BeanUtils.copyProperties(dishesBean,dishes);
        }catch (Exception e){

        }
        return dishesBean;
    }
}
