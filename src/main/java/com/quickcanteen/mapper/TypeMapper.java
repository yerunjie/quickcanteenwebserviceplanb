package com.quickcanteen.mapper;

import com.quickcanteen.model.Type;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface TypeMapper {
    @Delete({
        "delete from type",
        "where type_id = #{typeId,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer typeId);

    @Insert({
        "insert into type (type_id, type_name, ",
        "company_id)",
        "values (#{typeId,jdbcType=INTEGER}, #{typeName,jdbcType=VARCHAR}, ",
        "#{companyId,jdbcType=INTEGER})"
    })
    int insert(Type record);

    int insertSelective(Type record);

    @Select({
        "select",
        "type_id, type_name, company_id",
        "from type",
        "where type_id = #{typeId,jdbcType=INTEGER}"
    })
    @ResultMap("BaseResultMap")
    Type selectByPrimaryKey(Integer typeId);

    int updateByPrimaryKeySelective(Type record);

    @Update({
        "update type",
        "set type_name = #{typeName,jdbcType=VARCHAR},",
          "company_id = #{companyId,jdbcType=INTEGER}",
        "where type_id = #{typeId,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Type record);

    @Select({
            "select",
            "type_id, type_name, company_id",
            "from type",
            "where company_id = #{companyId,jdbcType=INTEGER}"
    })
    @ResultMap("BaseResultMap")
    List<Type> selectByCompangyId(Integer companyId);
}