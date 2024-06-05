package services;

import java.util.List;

import entities.cours;
import entities.module;
import repositories.coursReposi;
import repositories.moduleReposi;

public class moduleServices {
     private moduleReposi moduleReposi=new moduleReposi();
    public static void ajouterModule(module module){
        moduleReposi.insertModule(module);
    }
    public static List<Module> listerModule(){
          return moduleReposi.getAllModule();
    }
}
