package com.quickcanteen.mapper;

import com.quickcanteen.model.DishesType;
import com.quickcanteen.model.DishesTypeKey;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface DishesTypeMapper {
    @Delete({
        "delete from dishes_type",
        "where dishes_id = #{dishesId,jdbcType=INTEGER}",
          "and type_id = #{typeId,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(DishesTypeKey key);

    @Insert({
        "insert into dishes_type (dishes_id, type_id, ",
        "update_time)",
        "values (#{dishesId,jdbcType=INTEGER}, #{typeId,jdbcType=INTEGER}, ",
        "#{updateTime,jdbcType=TIMESTAMP})"
    })
    int insert(DishesType record);

    int insertSelective(DishesType record);

    @Select({
        "select",
        "dishes_id, type_id, update_time",
        "from dishes_type",
        "where dishes_id = #{dishesId,jdbcType=INTEGER}",
          "and type_id = #{typeId,jdbcType=INTEGER}"
    })
    @ResultMap("BaseResultMap")
    DishesType selectByPrimaryKey(DishesTypeKey key);

    int updateByPrimaryKeySelective(DishesType record);

    @Update({
        "update dishes_type",
        "set update_time = #{updateTime,jdbcType=TIMESTAMP}",
        "where dishes_id = #{dishesId,jdbcType=INTEGER}",
          "and type_id = #{typeId,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(DishesType record);
}