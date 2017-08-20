package com.quickcanteen.mapper;

import com.quickcanteen.model.CommentCompanyKey;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;

public interface CommentCompanyMapper {
    @Delete({
        "delete from comment_company",
        "where company_id = #{companyId,jdbcType=INTEGER}",
          "and comment_id = #{commentId,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(CommentCompanyKey key);

    @Insert({
        "insert into comment_company (company_id, comment_id)",
        "values (#{companyId,jdbcType=INTEGER}, #{commentId,jdbcType=INTEGER})"
    })
    int insert(CommentCompanyKey record);

    int insertSelective(CommentCompanyKey record);
}