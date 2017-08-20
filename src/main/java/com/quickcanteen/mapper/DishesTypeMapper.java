package com.quickcanteen.mapper;

import com.quickcanteen.model.DishesTypeKey;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;

public interface DishesTypeMapper {
    @Delete({
        "delete from dishes_type",
        "where dishes_id = #{dishesId,jdbcType=INTEGER}",
          "and type_id = #{typeId,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(DishesTypeKey key);

    @Insert({
        "insert into dishes_type (dishes_id, type_id)",
        "values (#{dishesId,jdbcType=INTEGER}, #{typeId,jdbcType=INTEGER})"
    })
    int insert(DishesTypeKey record);

    int insertSelective(DishesTypeKey record);
}