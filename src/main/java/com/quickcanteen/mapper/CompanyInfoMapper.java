package com.quickcanteen.mapper;

import com.quickcanteen.model.CompanyInfo;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface CompanyInfoMapper {
    @Delete({
        "delete from company_info",
        "where company_id = #{companyId,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer companyId);

    @Insert({
        "insert into company_info (company_id, company_name, ",
        "account_number, password, ",
        "start_time, end_time, ",
        "update_time)",
        "values (#{companyId,jdbcType=INTEGER}, #{companyName,jdbcType=VARCHAR}, ",
        "#{accountNumber,jdbcType=VARCHAR}, #{password,jdbcType=VARCHAR}, ",
        "#{startTime,jdbcType=TIMESTAMP}, #{endTime,jdbcType=TIMESTAMP}, ",
        "#{updateTime,jdbcType=TIMESTAMP})"
    })
    int insert(CompanyInfo record);

    int insertSelective(CompanyInfo record);

    @Select({
        "select",
        "company_id, company_name, account_number, password, start_time, end_time, update_time",
        "from company_info",
        "where company_id = #{companyId,jdbcType=INTEGER}"
    })
    @ResultMap("BaseResultMap")
    CompanyInfo selectByPrimaryKey(Integer companyId);

    int updateByPrimaryKeySelective(CompanyInfo record);

    @Update({
        "update company_info",
        "set company_name = #{companyName,jdbcType=VARCHAR},",
          "account_number = #{accountNumber,jdbcType=VARCHAR},",
          "password = #{password,jdbcType=VARCHAR},",
          "start_time = #{startTime,jdbcType=TIMESTAMP},",
          "end_time = #{endTime,jdbcType=TIMESTAMP},",
          "update_time = #{updateTime,jdbcType=TIMESTAMP}",
        "where company_id = #{companyId,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(CompanyInfo record);
}