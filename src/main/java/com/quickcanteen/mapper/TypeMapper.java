package com.quickcanteen.mapper;

import com.quickcanteen.model.Type;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface TypeMapper {
    @Delete({
        "delete from type",
        "where type_id = #{typeId,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer typeId);

    @Insert({
        "insert into type (type_id, type_name, ",
        "company_id, update_time)",
        "values (#{typeId,jdbcType=INTEGER}, #{typeName,jdbcType=VARCHAR}, ",
        "#{companyId,jdbcType=INTEGER}, #{updateTime,jdbcType=TIMESTAMP})"
    })
    int insert(Type record);

    int insertSelective(Type record);

    @Select({
        "select",
        "type_id, type_name, company_id, update_time",
        "from type",
        "where type_id = #{typeId,jdbcType=INTEGER}"
    })
    @ResultMap("BaseResultMap")
    Type selectByPrimaryKey(Integer typeId);

    int updateByPrimaryKeySelective(Type record);

    @Update({
        "update type",
        "set type_name = #{typeName,jdbcType=VARCHAR},",
          "company_id = #{companyId,jdbcType=INTEGER},",
          "update_time = #{updateTime,jdbcType=TIMESTAMP}",
        "where type_id = #{typeId,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Type record);
}