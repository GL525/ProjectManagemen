package com.kgc.mapper;

import com.kgc.pojo.Projectinfo;
import com.kgc.pojo.ProjectinfoExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ProjectinfoMapper {
    int countByExample(ProjectinfoExample example);

    int deleteByExample(ProjectinfoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Projectinfo record);

    int insertSelective(Projectinfo record);

    List<Projectinfo> selectByExample(ProjectinfoExample example);

    Projectinfo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Projectinfo record, @Param("example") ProjectinfoExample example);

    int updateByExample(@Param("record") Projectinfo record, @Param("example") ProjectinfoExample example);

    int updateByPrimaryKeySelective(Projectinfo record);

    int updateByPrimaryKey(Projectinfo record);
}