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
        try {
            System.out.println( "Chargement du driver..." );
            Class.forName( "com.mysql.jdbc.Driver" );
            System.out.println( "Driver chargé !" );
        } catch ( ClassNotFoundException e ) {
            System.out.println( "Erreur lors du chargement : le driver n'a pas été trouvé dans le classpath ! <br/>"
                    + e.getMessage() );
        }
        try{

            // parametres de connexion
            String url="jdbc:mysql://iutdoua-webetu.univ-lyon1.fr/";
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
		try {
            // la requete
			String requete = "SELECT * FROM vip";
			// execution de la requete
			Statement stat=conn.createStatement();
			ResultSet rset = stat.executeQuery(requete);
			// affichage du rÈsultat
			while(rset.next())
				System.out.println("\t"+rset.getString("nom_vip"));
			rset.close();
        } catch (Exception ex) {
            System.out.println("\n Probleme dans la requete listeEmp: " + ex.getMessage());           
        }
	}
    
}
