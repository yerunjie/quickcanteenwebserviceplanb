package com.quickcanteen.mapper;

import com.quickcanteen.model.OrdersDishes;
import com.quickcanteen.model.OrdersDishesKey;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface OrdersDishesMapper {
    @Delete({
        "delete from orders_dishes",
        "where orders_id = #{ordersId,jdbcType=INTEGER}",
          "and dishes_id = #{dishesId,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(OrdersDishesKey key);

    @Insert({
        "insert into orders_dishes (orders_id, dishes_id, ",
        "count, update_time)",
        "values (#{ordersId,jdbcType=INTEGER}, #{dishesId,jdbcType=INTEGER}, ",
        "#{count,jdbcType=INTEGER}, #{updateTime,jdbcType=TIMESTAMP})"
    })
    int insert(OrdersDishes record);

    int insertSelective(OrdersDishes record);

    @Select({
        "select",
        "orders_id, dishes_id, count, update_time",
        "from orders_dishes",
        "where orders_id = #{ordersId,jdbcType=INTEGER}",
          "and dishes_id = #{dishesId,jdbcType=INTEGER}"
    })
    @ResultMap("BaseResultMap")
    OrdersDishes selectByPrimaryKey(OrdersDishesKey key);

    int updateByPrimaryKeySelective(OrdersDishes record);

    @Update({
        "update orders_dishes",
        "set count = #{count,jdbcType=INTEGER},",
          "update_time = #{updateTime,jdbcType=TIMESTAMP}",
        "where orders_id = #{ordersId,jdbcType=INTEGER}",
          "and dishes_id = #{dishesId,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(OrdersDishes record);
}