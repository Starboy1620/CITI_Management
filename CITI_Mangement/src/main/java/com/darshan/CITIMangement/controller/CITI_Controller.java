package com.darshan.CITIMangement.controller;


import com.darshan.CITIMangement.model.CITI_Projects;
import com.darshan.CITIMangement.repo.CITI_Repo;
import com.darshan.CITIMangement.service.CITI_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/CITI")
public class CITI_Controller {

    @Autowired
    private CITI_Service service;

    @GetMapping("/projects")
    public List<CITI_Projects> getAllProjects(){
        return service.getAllProjects();
    }

    @GetMapping("/project/{projectId}")
    public CITI_Projects getAllProjects(@PathVariable int projectId){
        return service.getProject(projectId);

    }

    @PostMapping("/project")
    public CITI_Projects addProject(@RequestBody CITI_Projects project){
        service.addProject(project);
        return service.getProject(project.getProject_Id());
    }

    @PutMapping("/project/{projectId}")
    public CITI_Projects updateProject(@PathVariable int projectId , @RequestBody CITI_Projects newProject){
        System.out.println("from PUT Controller.....");
        return service.updateProject(projectId,newProject);
     //   return service.getAllProjects();
    }

    @DeleteMapping("/project/{projectId}")
    public List<CITI_Projects> deleteProject(@PathVariable int projectId){
        System.out.println("from Delete Controller.....");
        service.deleteProject(projectId);
        return service.getAllProjects();
    }


}
