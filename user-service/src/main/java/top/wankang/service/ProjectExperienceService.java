package top.wankang.service;



import top.wankang.entity.ProjectExperience;

import java.util.List;

/**
 * Created with IDEA
 *
 * @author:qianhongshen
 * @Date:2019/9/23 9:43
 * @Desc:
 */
public interface ProjectExperienceService {

    /**
     * 查询列表
     * @param page
     * @param limit
     * @return
     */
    List<ProjectExperience> queryList(Integer page, Integer limit);


    /**
     * 查询
     * @param id
     * @return
     */
    ProjectExperience query(Integer id);

    /**
     * 查询
     * @param
     * @return
     */
    List<ProjectExperience> queryByUserId(Integer UserId);

}
