package parametre;

import java.sql.*;
import java.io.*;
import java.util.*;
import static parametre.Appli.conn;

public class Connexion {

public static java.sql.Connection conn;

    public Connection Connecter() {
        try{
            
        // parametres de connexion
            String url="jdbc:mysql://iutdoua-webetu.univ-lyon1.fr/p1201896";
            String login="p1201896";
            String pass="169657";

        // connexion
        Class.forName("com.mysql.jdbc.Driver").newInstance();
        conn = java.sql.DriverManager.getConnection(url+"?user="+login+"&password="+pass);
        System.out.println("\n connection reussie \n");
        
        }

        catch(Exception e){
                System.out.println("\n Connection ratee: "+ e);
                System.exit(-1);
        }
        return conn;
    }

}