package com.quickcanteen.mapper;

import com.quickcanteen.model.Orders;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface OrdersMapper {
    @Delete({
        "delete from orders",
        "where orders_id = #{ordersId,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer ordersId);

    @Insert({
        "insert into orders (orders_id, user_id, ",
        "company_id, orders_state, ",
        "publish_time, complete_time, ",
        "total_price, timeslot_id, ",
        "update_time)",
        "values (#{ordersId,jdbcType=INTEGER}, #{userId,jdbcType=INTEGER}, ",
        "#{companyId,jdbcType=INTEGER}, #{ordersState,jdbcType=INTEGER}, ",
        "#{publishTime,jdbcType=TIMESTAMP}, #{completeTime,jdbcType=TIMESTAMP}, ",
        "#{totalPrice,jdbcType=DOUBLE}, #{timeslotId,jdbcType=INTEGER}, ",
        "#{updateTime,jdbcType=TIMESTAMP})"
    })
    int insert(Orders record);

    int insertSelective(Orders record);

    @Select({
        "select",
        "orders_id, user_id, company_id, orders_state, publish_time, complete_time, total_price, ",
        "timeslot_id, update_time",
        "from orders",
        "where orders_id = #{ordersId,jdbcType=INTEGER}"
    })
    @ResultMap("BaseResultMap")
    Orders selectByPrimaryKey(Integer ordersId);

    int updateByPrimaryKeySelective(Orders record);

    @Update({
        "update orders",
        "set user_id = #{userId,jdbcType=INTEGER},",
          "company_id = #{companyId,jdbcType=INTEGER},",
          "orders_state = #{ordersState,jdbcType=INTEGER},",
          "publish_time = #{publishTime,jdbcType=TIMESTAMP},",
          "complete_time = #{completeTime,jdbcType=TIMESTAMP},",
          "total_price = #{totalPrice,jdbcType=DOUBLE},",
          "timeslot_id = #{timeslotId,jdbcType=INTEGER},",
          "update_time = #{updateTime,jdbcType=TIMESTAMP}",
        "where orders_id = #{ordersId,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Orders record);
}