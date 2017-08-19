package com.quickcanteen.mapper;

import com.quickcanteen.model.CollectDishes;
import com.quickcanteen.model.CollectDishesKey;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface CollectDishesMapper {
    @Delete({
        "delete from collect_dishes",
        "where dishes_id = #{dishesId,jdbcType=INTEGER}",
          "and collector_id = #{collectorId,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(CollectDishesKey key);

    @Insert({
        "insert into collect_dishes (dishes_id, collector_id, ",
        "update_time)",
        "values (#{dishesId,jdbcType=INTEGER}, #{collectorId,jdbcType=INTEGER}, ",
        "#{updateTime,jdbcType=TIMESTAMP})"
    })
    int insert(CollectDishes record);

    int insertSelective(CollectDishes record);

    @Select({
        "select",
        "dishes_id, collector_id, update_time",
        "from collect_dishes",
        "where dishes_id = #{dishesId,jdbcType=INTEGER}",
          "and collector_id = #{collectorId,jdbcType=INTEGER}"
    })
    @ResultMap("BaseResultMap")
    CollectDishes selectByPrimaryKey(CollectDishesKey key);

    int updateByPrimaryKeySelective(CollectDishes record);

    @Update({
        "update collect_dishes",
        "set update_time = #{updateTime,jdbcType=TIMESTAMP}",
        "where dishes_id = #{dishesId,jdbcType=INTEGER}",
          "and collector_id = #{collectorId,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(CollectDishes record);
}