package com.quickcanteen.mapper;

import com.quickcanteen.model.PraiseDishes;
import com.quickcanteen.model.PraiseDishesKey;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface PraiseDishesMapper {
    @Delete({
        "delete from praise_dishes",
        "where praise_from_user_id = #{praiseFromUserId,jdbcType=INTEGER}",
          "and praise_dishes_id = #{praiseDishesId,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(PraiseDishesKey key);

    @Insert({
        "insert into praise_dishes (praise_from_user_id, praise_dishes_id, ",
        "update_time)",
        "values (#{praiseFromUserId,jdbcType=INTEGER}, #{praiseDishesId,jdbcType=INTEGER}, ",
        "#{updateTime,jdbcType=TIMESTAMP})"
    })
    int insert(PraiseDishes record);

    int insertSelective(PraiseDishes record);

    @Select({
        "select",
        "praise_from_user_id, praise_dishes_id, update_time",
        "from praise_dishes",
        "where praise_from_user_id = #{praiseFromUserId,jdbcType=INTEGER}",
          "and praise_dishes_id = #{praiseDishesId,jdbcType=INTEGER}"
    })
    @ResultMap("BaseResultMap")
    PraiseDishes selectByPrimaryKey(PraiseDishesKey key);

    int updateByPrimaryKeySelective(PraiseDishes record);

    @Update({
        "update praise_dishes",
        "set update_time = #{updateTime,jdbcType=TIMESTAMP}",
        "where praise_from_user_id = #{praiseFromUserId,jdbcType=INTEGER}",
          "and praise_dishes_id = #{praiseDishesId,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(PraiseDishes record);
}