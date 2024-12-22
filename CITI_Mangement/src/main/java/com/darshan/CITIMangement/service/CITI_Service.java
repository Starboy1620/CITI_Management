package com.darshan.CITIMangement.service;

import com.darshan.CITIMangement.model.CITI_Projects;
import com.darshan.CITIMangement.repo.CITI_Repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class CITI_Service {

    @Autowired
    private CITI_Repo repo;

    public List<CITI_Projects> getAllProjects(){
        return repo.getAll();
    }

    public CITI_Projects getProject(int projectId){
           return repo.getProject(projectId);
    }


    public void addProject(CITI_Projects project) {
        repo.addProjects(project);
    }

    public CITI_Projects deleteProject(int projectId) {
        System.out.println("from Delete Service.....");
        return repo.remove(projectId);

    }

    public CITI_Projects updateProject(int projectId,CITI_Projects newProject){
        System.out.println("from PUT Service.....");

        return repo.update(projectId,newProject);
    }
}
