package com.quickcanteen.mapper;

import com.quickcanteen.model.CommentDishesKey;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;

public interface CommentDishesMapper {
    @Delete({
        "delete from comment_dishes",
        "where dishes_id = #{dishesId,jdbcType=INTEGER}",
          "and comment_id = #{commentId,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(CommentDishesKey key);

    @Insert({
        "insert into comment_dishes (dishes_id, comment_id)",
        "values (#{dishesId,jdbcType=INTEGER}, #{commentId,jdbcType=INTEGER})"
    })
    int insert(CommentDishesKey record);

    int insertSelective(CommentDishesKey record);
}