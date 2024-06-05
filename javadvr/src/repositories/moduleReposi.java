package repositories;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import entities.cours;
import entities.module;

public class moduleReposi extends Database {
    private final  String SQL_SELECT_ALL="select * from cours c, module m, professeur p " ;
    private final  String SQL_INSERT="INSERT INTO `bien` (`id`, `date`, `heurDebut`, `heurFin`,  `module`,  `professeur`) VALUES (?,?,?,?)";
    public void insertBien(cours cours){
            openConnexion();
            try {
                initPreparedStatement(SQL_INSERT);
                statement.setInt(1, cours.getIdC());
                statement.setDate(2, cours.getDate());
                statement.setTime(3, cours.getHeureDebut());
                statement.setTime(4, cours.getHeureFin());
                statement.setProfesseur(5, cours.getProfesseur());
                statement.setModule(6, cours.getModule());

                int nbreLigne=executeUpdate();
            closeConnexion();
            } catch (SQLException e) {
            e.printStackTrace();
            }
       }
       public List<cours> getAllCours(){
            List<cours> cours=new ArrayList<>();
       try {
           openConnexion();
           initPreparedStatement(SQL_SELECT_ALL);
           ResultSet rs= executeSelect();
             while (rs.next()) {
                     module module=new module();
                     module.setIdM(0);(rs.getInt("idM"));
                     module.setNomM(rs.getString("nomC"));
                     
                     cours cours=new cours();
                     cours.setIdC(rs.getInt("id"));
                     cours.setDate(rs.getDate("date"));
                     cours.setTime(rs.getTime("heuredebut"));
                     cours.setModule(module);
                     cours.setTime(rs.getTime("heurfin"));
                     cours.add(cours);
             }
             rs.close();
            closeConnexion();
          }
          catch (SQLException e) {
              System.out.println("Erreur de Connexion a la BD");
         }
         return  cours;
       }
}

