package com.quickcanteen.mapper;

import com.quickcanteen.model.Order;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface OrderMapper {
    @Delete({
        "delete from `order`",
        "where order_id = #{orderId,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer orderId);

    @Insert({
        "insert into `order` (order_id, user_id, ",
        "company_id, order_state, ",
        "publish_time, complete_time, ",
        "total_price, timeslot_id)",
        "values (#{orderId,jdbcType=INTEGER}, #{userId,jdbcType=INTEGER}, ",
        "#{companyId,jdbcType=INTEGER}, #{orderState,jdbcType=INTEGER}, ",
        "#{publishTime,jdbcType=TIMESTAMP}, #{completeTime,jdbcType=TIMESTAMP}, ",
        "#{totalPrice,jdbcType=DOUBLE}, #{timeslotId,jdbcType=INTEGER})"
    })
    int insert(Order record);

    int insertSelective(Order record);

    @Select({
        "select",
        "order_id, user_id, company_id, order_state, publish_time, complete_time, total_price, ",
        "timeslot_id",
        "from `order`",
        "where order_id = #{orderId,jdbcType=INTEGER}"
    })
    @ResultMap("BaseResultMap")
    Order selectByPrimaryKey(Integer orderId);

    int updateByPrimaryKeySelective(Order record);

    @Update({
        "update `order`",
        "set user_id = #{userId,jdbcType=INTEGER},",
          "company_id = #{companyId,jdbcType=INTEGER},",
          "order_state = #{orderState,jdbcType=INTEGER},",
          "publish_time = #{publishTime,jdbcType=TIMESTAMP},",
          "complete_time = #{completeTime,jdbcType=TIMESTAMP},",
          "total_price = #{totalPrice,jdbcType=DOUBLE},",
          "timeslot_id = #{timeslotId,jdbcType=INTEGER}",
        "where order_id = #{orderId,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Order record);
}