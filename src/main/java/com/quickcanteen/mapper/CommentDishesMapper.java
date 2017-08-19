package com.quickcanteen.mapper;

import com.quickcanteen.model.CommentDishes;
import com.quickcanteen.model.CommentDishesKey;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface CommentDishesMapper {
    @Delete({
        "delete from comment_dishes",
        "where dishes_id = #{dishesId,jdbcType=INTEGER}",
          "and comment_id = #{commentId,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(CommentDishesKey key);

    @Insert({
        "insert into comment_dishes (dishes_id, comment_id, ",
        "update_time)",
        "values (#{dishesId,jdbcType=INTEGER}, #{commentId,jdbcType=INTEGER}, ",
        "#{updateTime,jdbcType=TIMESTAMP})"
    })
    int insert(CommentDishes record);

    int insertSelective(CommentDishes record);

    @Select({
        "select",
        "dishes_id, comment_id, update_time",
        "from comment_dishes",
        "where dishes_id = #{dishesId,jdbcType=INTEGER}",
          "and comment_id = #{commentId,jdbcType=INTEGER}"
    })
    @ResultMap("BaseResultMap")
    CommentDishes selectByPrimaryKey(CommentDishesKey key);

    int updateByPrimaryKeySelective(CommentDishes record);

    @Update({
        "update comment_dishes",
        "set update_time = #{updateTime,jdbcType=TIMESTAMP}",
        "where dishes_id = #{dishesId,jdbcType=INTEGER}",
          "and comment_id = #{commentId,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(CommentDishes record);
}