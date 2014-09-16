/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package voicela;

import java.util.*;
import java.io.*;
import voicela.VIP;

import java.util.*;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import static voicela.Connexion.conn;
/**
 *
 * @author Vincent
 */
public class Appli {

    /**
     * @param args the command line arguments
     */
    
    public static java.sql.Connection conn;
    
    public static void main(String[] args) {
        try{
            
        // parametres de connexion
            String url="jdbc:mysql://iutdoua-webetu.univ-lyon1.fr/p1200270";
            String login="p1200270";
            String pass="168511";

        // connexion
        Class.forName("com.mysql.jdbc.Driver").newInstance();
        conn = java.sql.DriverManager.getConnection(url+"?user="+login+"&password="+pass);
        System.out.println("\n connection reussie \n");

        }

    catch(Exception e){
            System.out.println("\n Connection ratee: "+ e);
            System.exit(-1);
    }  
        try {
            // la requete
            String requete = "SELECT * FROM images";
            // execution de la requete
            Statement stat=conn.createStatement();
            ResultSet rset = stat.executeQuery(requete);
            // affichage du résultat
            while(rset.next())
            System.out.println(rset.getInt("id_image"));
            rset.close();
        } catch (Exception ex) {
            System.out.println("\n Probleme dans la requete" + ex.getMessage());           
        }
        
    }
}
