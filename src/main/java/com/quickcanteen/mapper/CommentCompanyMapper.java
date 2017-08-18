package com.quickcanteen.mapper;

import com.quickcanteen.model.CommentCompany;
import com.quickcanteen.model.CommentCompanyKey;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface CommentCompanyMapper {
    @Delete({
        "delete from comment_company",
        "where company_id = #{companyId,jdbcType=INTEGER}",
          "and comment_id = #{commentId,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(CommentCompanyKey key);

    @Insert({
        "insert into comment_company (company_id, comment_id, ",
        "update_time)",
        "values (#{companyId,jdbcType=INTEGER}, #{commentId,jdbcType=INTEGER}, ",
        "#{updateTime,jdbcType=TIMESTAMP})"
    })
    int insert(CommentCompany record);

    int insertSelective(CommentCompany record);

    @Select({
        "select",
        "company_id, comment_id, update_time",
        "from comment_company",
        "where company_id = #{companyId,jdbcType=INTEGER}",
          "and comment_id = #{commentId,jdbcType=INTEGER}"
    })
    @ResultMap("BaseResultMap")
    CommentCompany selectByPrimaryKey(CommentCompanyKey key);

    int updateByPrimaryKeySelective(CommentCompany record);

    @Update({
        "update comment_company",
        "set update_time = #{updateTime,jdbcType=TIMESTAMP}",
        "where company_id = #{companyId,jdbcType=INTEGER}",
          "and comment_id = #{commentId,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(CommentCompany record);
}