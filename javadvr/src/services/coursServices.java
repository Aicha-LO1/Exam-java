package services;

import java.util.List;

import repositories.coursReposi;

public class coursServices {
       private coursReposi coursReposi=new coursReposi();
    public void ajouterCours(cours cours){
        coursReposi.insertCours(cours);
    }
    public static List<cours> listerCours(){
          return coursReposi.getAllCours();
    }
}
