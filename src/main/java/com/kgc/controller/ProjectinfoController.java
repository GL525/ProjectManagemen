package com.kgc.controller;

import com.kgc.pojo.Projectinfo;
import com.kgc.service.ProjectinfoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class ProjectinfoController {
    @Resource
    ProjectinfoService projectinfoService;
    @RequestMapping("/list")
    public String list(Long status,Model model){
        List<Projectinfo> list=projectinfoService.getlist(status);
        model.addAttribute("list",list);
        return "/index";
    }
    @RequestMapping("/cha/{id}")
    public String cha(Long id,Model model){
        List<Projectinfo> list=projectinfoService.getlistbyid(id);
         model.addAttribute("listbyid",list);
        return "/upt";
    }
    @RequestMapping("/toupt")
    public String upt(Projectinfo projectinfo){
        int i=projectinfoService.upt(projectinfo);
        return "redirect:/list";
    }
}
