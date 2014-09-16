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
        Statement statement = null;
        ResultSet resultat = null;
        Connection connexion = null;
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
            System.out.println( "Requête préparée créée !" );
            String requete = "SELECT * FROM images;";
            resultat = statement.executeQuery(requete);
            System.out.println( "Requête \"SELECT * FROM photographie;\" effectuée !" );

            /* Récupération des données du résultat de la requête de lecture */
            while ( resultat.next() ) {
                /* Formatage des données pour affichage dans la JSP finale. */
                System.out.println( resultat.getInt("id_image") );
            }
	} catch (SQLException sqle) {
            System.out.println("Erreur" + sqle);
        }
    }
}
