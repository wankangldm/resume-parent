package top.wankang.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import top.wankang.entity.ProjectExperience;
import top.wankang.entity.ProjectExperienceExample;

import java.util.List;

@Repository
public interface ProjectExperienceMapper {
    long countByExample(ProjectExperienceExample example);

    int deleteByExample(ProjectExperienceExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ProjectExperience record);

    int insertSelective(ProjectExperience record);

    List<ProjectExperience> selectByExampleWithBLOBs(ProjectExperienceExample example);

    List<ProjectExperience> selectByExample(ProjectExperienceExample example);

    ProjectExperience selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ProjectExperience record, @Param("example") ProjectExperienceExample example);

    int updateByExampleWithBLOBs(@Param("record") ProjectExperience record, @Param("example") ProjectExperienceExample example);

    int updateByExample(@Param("record") ProjectExperience record, @Param("example") ProjectExperienceExample example);

    int updateByPrimaryKeySelective(ProjectExperience record);

    int updateByPrimaryKeyWithBLOBs(ProjectExperience record);

    int updateByPrimaryKey(ProjectExperience record);
}
