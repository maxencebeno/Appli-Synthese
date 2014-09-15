package voicela;

import java.sql.*;
import java.io.FileInputStream;
import java.util.*;
import java.sql.*;

public class Connexion { 
  
    Connection          con = null; 
    Statement           sta; 
    ResultSet           re; 
    ResultSetMetaData   metaBase; 
    public Connexion(String url, String NomDriver) { 
        try { 
            Class.forName(NomDriver); 
            con = DriverManager.getConnection(url); 
            System.out.println("Overture de la connection"); 
            sta = con.createStatement(); 
        } 
        catch (ClassNotFoundException ex) { 
            System.err.println("Ne peut pas trouver les classes du conducteur de la base de données."); 
            System.err.println(ex); 
        } 
        catch (SQLException ex) { 
            System.err.println("pas de connection au base de de donnee."); 
            System.err.println(ex); 
        } 
     } 
    public ResultSet rechercher(String query){ 
     try { 
     re=sta.executeQuery(query); 
     System.out.println("Element trouvé "); 
      } 
     catch (SQLException ex) { 
            System.err.println(ex); 
         } 
     return re; 
     }    
    public void ajouter(String query){ 
     try { 
     sta.executeUpdate(query); 
     System.out.println("Element ajouté a la base"); 
      } 
     catch (SQLException ex) { 
            System.err.println(ex); 
     }      
    }   
    public void modifier(String query){ 
     try { 
     sta.executeUpdate(query); 
     System.out.println("Element Modifié"); 
     } 
     catch (SQLException ex){ 
        System.err.println(ex); 
     }    
    }   
    public void supprime(String query){ 
     try { 
     sta.executeUpdate(query); 
     System.out.println("Element suprimé");      
     } 
     catch (SQLException ex) { 
         System.err.println(ex); 
     }    
    } 
    public void fermer(){ 
     try { 
   re.close(); 
  } catch (SQLException e) { 
   System.out.println("Problème de fermeture de la Base de données"); 
  } 
        System.out.println("Base de données Férmée"); 
    } 
} 
