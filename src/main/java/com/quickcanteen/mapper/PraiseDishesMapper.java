package com.quickcanteen.mapper;

import com.quickcanteen.model.PraiseDishesKey;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;

public interface PraiseDishesMapper {
    @Delete({
        "delete from praise_dishes",
        "where praise_from_user_id = #{praiseFromUserId,jdbcType=INTEGER}",
          "and praise_dishes_id = #{praiseDishesId,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(PraiseDishesKey key);

    @Insert({
        "insert into praise_dishes (praise_from_user_id, praise_dishes_id)",
        "values (#{praiseFromUserId,jdbcType=INTEGER}, #{praiseDishesId,jdbcType=INTEGER})"
    })
    int insert(PraiseDishesKey record);

    int insertSelective(PraiseDishesKey record);
}