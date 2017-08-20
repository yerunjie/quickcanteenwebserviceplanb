package com.quickcanteen.mapper;

import com.quickcanteen.model.UserComment;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface UserCommentMapper {
    @Delete({
        "delete from user_comment",
        "where comment_id = #{commentId,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer commentId);

    @Insert({
        "insert into user_comment (comment_id, commenter_id, ",
        "rating, comment_content)",
        "values (#{commentId,jdbcType=INTEGER}, #{commenterId,jdbcType=INTEGER}, ",
        "#{rating,jdbcType=DOUBLE}, #{commentContent,jdbcType=LONGVARCHAR})"
    })
    int insert(UserComment record);

    int insertSelective(UserComment record);

    @Select({
        "select",
        "comment_id, commenter_id, rating, comment_content",
        "from user_comment",
        "where comment_id = #{commentId,jdbcType=INTEGER}"
    })
    @ResultMap("ResultMapWithBLOBs")
    UserComment selectByPrimaryKey(Integer commentId);

    int updateByPrimaryKeySelective(UserComment record);

    @Update({
        "update user_comment",
        "set commenter_id = #{commenterId,jdbcType=INTEGER},",
          "rating = #{rating,jdbcType=DOUBLE},",
          "comment_content = #{commentContent,jdbcType=LONGVARCHAR}",
        "where comment_id = #{commentId,jdbcType=INTEGER}"
    })
    int updateByPrimaryKeyWithBLOBs(UserComment record);

    @Update({
        "update user_comment",
        "set commenter_id = #{commenterId,jdbcType=INTEGER},",
          "rating = #{rating,jdbcType=DOUBLE}",
        "where comment_id = #{commentId,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(UserComment record);
}