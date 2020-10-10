package com.kgc.service;

import com.kgc.pojo.Projectinfo;

import java.util.List;

public interface ProjectinfoService {
    List<Projectinfo> getlist(Long status);
    List<Projectinfo> getlistbyid(Long id);
    int upt(Projectinfo projectinfo);


}
