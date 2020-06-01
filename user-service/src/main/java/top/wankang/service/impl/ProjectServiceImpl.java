package top.wankang.service.impl;

import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.wankang.dao.ProjectExperienceMapper;
import top.wankang.entity.ProjectExperience;
import top.wankang.entity.ProjectExperienceExample;
import top.wankang.service.ProjectExperienceService;

import java.util.List;

/**
 * Created with IDEA
 *
 * @author:qianhongshen
 * @Date:2019/9/23 9:44
 * @Desc:
 */
@Service
public class ProjectServiceImpl implements ProjectExperienceService {
//    private static final Logger logger = LoggerFactory.getLogger(com.hongshen.boke.jianli.service.impl.ProjectServiceImpl.class);


    @Autowired
    private ProjectExperienceMapper projectExperienceMapper;

    @Override
    public List<ProjectExperience> queryList(Integer page, Integer limit) {
        PageHelper.startPage(page,limit);
        ProjectExperienceExample example = new ProjectExperienceExample();
        return projectExperienceMapper.selectByExampleWithBLOBs(example);
    }

    @Override
    public ProjectExperience query(Integer id) {
        return projectExperienceMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<ProjectExperience> queryByUserId(Integer UserId) {
        ProjectExperienceExample example = new ProjectExperienceExample();
        ProjectExperienceExample.Criteria criteria = example.createCriteria();
        criteria.andUserIdEqualTo(UserId);
        List<ProjectExperience> projectExperiences = projectExperienceMapper.selectByExample(example);
        return projectExperiences;
    }
}
