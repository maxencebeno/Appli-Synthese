package voicela;

import java.sql.*;
import java.io.*;
import java.util.*;

public class Connexion {

public static java.sql.Connection conn;

    public static void Connecter(String [] args) {
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
    }
	
	/*public static int recupererIdMax() {
		int result=0, auto=1;
		try {
            // recherche du plus grand id existant
			String requete = "SELECT MAX(EMPNO) FROM EMP";
			// execution de la requete
			Statement stat=conn.createStatement();
			ResultSet rset = stat.executeQuery(requete);
			// affichage du rÈsultat			
			while(rset.next())
				result=rset.getInt(1);			
			// recherche de la valeur du compteur d'auto-incrÈmentation du serveur pour la table EMP
			requete ="SELECT AUTO_INCREMENT AS LAST_ID FROM INFORMATION_SCHEMA.TABLES WHERE TABLE_NAME = 'EMP'";
			rset = stat.executeQuery(requete);
			while(rset.next())
				auto=rset.getInt(1);
			rset.close();
        } 
		catch (Exception ex) {
            System.out.println("\n Probleme dans la requete recupererIdMax: " + ex.getMessage());           
        }
		// on retourne le prochain numÈro dans la sÈquence
		return auto>result ? result+1 : auto;
	}
	*/
	public static void  lister() {
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
	/*
	public static void rechercher() {
        try {
            String requete = "SELECT * FROM EMP WHERE JOB = ? ";
			System.out.print("\n Entrer le job recherche: ");
			BufferedReader rep = new BufferedReader(new InputStreamReader(System.in));
		 	String leJob = rep.readLine();
            PreparedStatement ps = conn.prepareStatement(requete);
            ps.setString(1, leJob);
            ResultSet rset = ps.executeQuery();
			// affichage du rÈsultat
			while(rset.next())
				System.out.println("\t"+rset.getInt(1)+"\t"+rset.getString(2)+"\t"+rset.getString(3));
			rset.close();
            ps.close();
          } catch (Exception ex) {
            System.out.println("\n Probleme dans la recherche : " + ex.getMessage());
        }
    }
	
	public static void inserer() {
       try {			
			// la requete d'insertion
            String requete = "INSERT INTO EMP(ENAME, JOB) VALUES (?,?)";
            PreparedStatement ps = conn.prepareStatement(requete);
            ps.setString(1, "TOTO");
            ps.setString(2, "MANUEL");
            ps.executeUpdate();
            ps.close();          
        } catch (Exception ex) {
            System.out.println("\n Probleme dans l'insertion de TOTO : " + ex.getMessage());
        }
    }
	
	public static void modifier(int id) {
        try {
            String requete = "UPDATE EMP SET ENAME = ?, JOB = ? WHERE EMPNO = ? ";
            PreparedStatement ps = conn.prepareStatement(requete);
            ps.setString(1, "TITI");
			ps.setString(2, "BOSS");
           	ps.setInt(3, id);		
            ps.executeUpdate();
            ps.close();          
        } catch (Exception ex) {
            System.out.println("\n Probleme dans la modification de TOTO : " + ex.getMessage());
        }
    }	
	
	public static void supprimer(int id) {
        try {
            String requete = "DELETE FROM EMP WHERE EMPNO = ? ";
            PreparedStatement ps = conn.prepareStatement(requete);
            ps.setInt(1, id);
            ps.executeUpdate();
            ps.close();          
        } catch (Exception ex) {
            System.out.println("\n Probleme dans la suppression de TOTO : " + ex.getMessage());
        }
    }
	*/
	
		
}