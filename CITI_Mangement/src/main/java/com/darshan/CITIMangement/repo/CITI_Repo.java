package com.darshan.CITIMangement.repo;

import com.darshan.CITIMangement.model.CITI_Projects;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class CITI_Repo {


    List<CITI_Projects> citi_Projects = new ArrayList<CITI_Projects>();

    public CITI_Repo(){

        citi_Projects.add(new CITI_Projects(1,"Onbe",75, 345000,List.of("JAVA","REACT","SQL")));

        citi_Projects.add(new CITI_Projects(2,"AirSpan",40,28000.97,List.of("SQL","Python")));

        citi_Projects.add(new CITI_Projects(3,"GTEK",50, 60000,List.of("JAVA","REACT","SQL","Microprocessor","Android")));

        citi_Projects.add(new CITI_Projects(4,"Fiscals",142,4543504.4565,List.of("SQL","Python","Java","UX","React","DataBricks","Hadoop")));


    }

    public List<CITI_Projects> getAll(){
        return citi_Projects;
    }

    public CITI_Projects getProject(int projectID){

        for(CITI_Projects projects : citi_Projects){
            if(projects.getProject_Id()== projectID){
               return projects;
            }
        }
            return null;
    }

    public void addProjects(CITI_Projects project){
        citi_Projects.add(project);
        System.out.println("Projects Added Successfully.....");
    }


    public CITI_Projects remove(int projectId) {
        System.out.println("from Delete REPO.....");
        for(CITI_Projects projects : citi_Projects){
            System.out.println("inside for loop.....");
            if(projects.getProject_Id()==projectId){
                System.out.println("found the project id.....");
                citi_Projects.remove(projects);
                System.out.println("Projects deleted Successfully....." );
                return projects;
            }
        }
        return null;
    }

    public CITI_Projects update(int projectId,CITI_Projects newProject){
        System.out.println("from PUT REPO.....");
            for(CITI_Projects projects : citi_Projects){
                System.out.println("inside for loop.....");
             if(projects.getProject_Id()==projectId){
                 System.out.println("found the project id.....");
                 citi_Projects.add(newProject);
                 System.out.println("Projects Updated Successfully.....");
                 return projects;
             }
        }
            return null;
    }
}
