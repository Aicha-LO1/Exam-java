import java.util.List;
import java.util.Scanner;

import entities.cours;
import entities.module;
import services.coursServices;
import services.moduleServices;
import services.professeurServices;

public class App {
    public static void main(String[] args) throws Exception {
        int choix;
        Scanner sc=new Scanner(System.in);
        coursServices zoneService=new coursServices();
        moduleServices bienService=new moduleServices();
        professeurServices professeurServices=new professeurServices();

       
        do {
            System.out.println("1-Ajouter une module");
            System.out.println("2-Lister les modules"); 
            System.out.println("3-Creer un  cours"); 
            System.out.println("4-Lister tous les cours");
            System.out.println("5-Lister les cours d'un modules et d'un professeur"); 
            System.out.println("6-Quitter"); 

             choix=sc.nextInt();
             sc.nextLine();
            switch (choix) {
                case 1:  
                      System.out.println("Entrer le nom du module");
                     String nomZone=sc.nextLine(); 
                     module module=new module();
                     module.setNomM(nomZone);
                     moduleServices.ajouterModule(module);
                    break;
                case 2:
                    List<Module> modules= moduleServices.listerModule();
                    for (Module m : modules) {
                        System.out.println("idM: "+m.getIdM() ); 
                        System.out.println("NOM : "+m.getNomM() );     
                    }
                    break; 
             
                case 3:
                    
                   break;
                   case 4:
                   List<cours> cours= coursServices.listerCours();
                   for (cours b : cours) {
                       System.out.println("idC : "+b.getIdC() ); 
                       System.out.println("date : "+b.getDate() ); 
                       System.out.println("heurDebut : "+b.getHeureDebut() ); 
                       System.out.println("heureFin : "+b.getHeureFin());   
                       System.out.println("professeur : "+b.getProfesseur() ); 
                       System.out.println("module : "+b.getModule() ); 
                       System.out.println("------------------------------------");      
                   }
                   break; 
                   case 5:

                   break; 

        }
    } while (choix!=6);
}
}
