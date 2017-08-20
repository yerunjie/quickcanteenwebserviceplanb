package com.quickcanteen.mapper;

import com.quickcanteen.model.CompanyTimeSlot;
import com.quickcanteen.model.CompanyTimeSlotKey;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface CompanyTimeSlotMapper {
    @Delete({
        "delete from company_time_slot",
        "where company_id = #{companyId,jdbcType=INTEGER}",
          "and time_slot_id = #{timeSlotId,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(CompanyTimeSlotKey key);

    @Insert({
        "insert into company_time_slot (company_id, time_slot_id, ",
        "people_number, max_people_number, ",
        "busy_state)",
        "values (#{companyId,jdbcType=INTEGER}, #{timeSlotId,jdbcType=INTEGER}, ",
        "#{peopleNumber,jdbcType=INTEGER}, #{maxPeopleNumber,jdbcType=INTEGER}, ",
        "#{busyState,jdbcType=INTEGER})"
    })
    int insert(CompanyTimeSlot record);

    int insertSelective(CompanyTimeSlot record);

    @Select({
        "select",
        "company_id, time_slot_id, people_number, max_people_number, busy_state",
        "from company_time_slot",
        "where company_id = #{companyId,jdbcType=INTEGER}",
          "and time_slot_id = #{timeSlotId,jdbcType=INTEGER}"
    })
    @ResultMap("BaseResultMap")
    CompanyTimeSlot selectByPrimaryKey(CompanyTimeSlotKey key);

    int updateByPrimaryKeySelective(CompanyTimeSlot record);

    @Update({
        "update company_time_slot",
        "set people_number = #{peopleNumber,jdbcType=INTEGER},",
          "max_people_number = #{maxPeopleNumber,jdbcType=INTEGER},",
          "busy_state = #{busyState,jdbcType=INTEGER}",
        "where company_id = #{companyId,jdbcType=INTEGER}",
          "and time_slot_id = #{timeSlotId,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(CompanyTimeSlot record);
}