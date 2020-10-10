package com.kgc.service.impl;

import com.github.pagehelper.PageHelper;
import com.kgc.mapper.ProjectinfoMapper;
import com.kgc.pojo.Projectinfo;
import com.kgc.pojo.ProjectinfoExample;
import com.kgc.service.ProjectinfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service("projectinfoService")
public class ProjectinfoServiceImpl implements ProjectinfoService{
    @Resource
    ProjectinfoMapper projectinfoMapper;
    @Override
    public List<Projectinfo> getlist(Long status) {
        ProjectinfoExample example=new ProjectinfoExample();
        ProjectinfoExample.Criteria criteria=example.createCriteria();
        PageHelper.orderBy("id desc");
        List<Projectinfo> list=null;
        if (status==null){
            list=projectinfoMapper.selectByExample(null);
        }else{
            criteria.andStatusEqualTo(status);
        }
      list=projectinfoMapper.selectByExample(example);
        return list;
    }

    @Override
    public List<Projectinfo> getlistbyid(Long id) {
        ProjectinfoExample example=new ProjectinfoExample();
        ProjectinfoExample.Criteria criteria=example.createCriteria();
        criteria.andIdEqualTo(id);
        List<Projectinfo>list=projectinfoMapper.selectByExample(example);
        return list;
    }

    @Override
    public int upt(Projectinfo projectinfo) {
        int i=projectinfoMapper.insertSelective(projectinfo);
        return i;
    }
}
