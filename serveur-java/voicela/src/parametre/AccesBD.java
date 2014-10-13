/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parametre;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author maxencebeno
 */
public class AccesBD {
    
    public javax.swing.JComboBox afficherComboBoxCivilite(javax.swing.JComboBox combobox) throws Exception {
       
        combobox.addItem("Mr");
        combobox.addItem("Mme");
        combobox.addItem("Mlle");
            
        return combobox;
    }
    
    public javax.swing.JComboBox afficherComboBoxSexe(javax.swing.JComboBox combobox) throws Exception {
        
        combobox.addItem("Homme");
        combobox.addItem("Femme");
        
        return combobox;
    }
    
    public javax.swing.JComboBox afficherComboBoxStatut(javax.swing.JComboBox combobox) throws Exception {
       
        combobox.addItem("Acteur");
        combobox.addItem("Réalisateur");
        combobox.addItem("Acteur/Réalisateur");
        combobox.addItem("Rien");
            
        return combobox;
    }
    
    public void modifNom(String newName, String name, String surname) throws SQLException {
        Connection connection = null;
        try {
            Connexion cnx = new Connexion();
            connection = cnx.Connecter();
            
            String requete = "update vip set nom_vip = ? where nom_vip = ? and prenom_usuel_vip = ?";
            try (PreparedStatement pstmt = connection.prepareStatement(requete)) {
                pstmt.setString(1, newName);
                pstmt.setString(2, name);
                pstmt.setString(3, surname);
                // exécution de l'ordre SQL
                pstmt.executeUpdate();
            }
        } catch (Exception e) {
            throw e;
        }
    } // modifNom
    
    public void modifPrenomUsage(String newPrenom, String name, String surname) throws SQLException {
        Connection connection = null;
        try {
            Connexion cnx = new Connexion();
            connection = cnx.Connecter();
            
            String requete = "update vip set prenom_usuel_vip = ? where nom_vip = ? and prenom_usuel_vip = ?";
            try (PreparedStatement pstmt = connection.prepareStatement(requete)) {
                pstmt.setString(1, newPrenom);
                pstmt.setString(2, name);
                pstmt.setString(3, surname);
                // exécution de l'ordre SQL
                pstmt.executeUpdate();
            }
        } catch (Exception e) {
            throw e;
        }
    } // modifPrenomUsuel
    
    public void modifNationalite(String newNationalite, String name, String surname) throws SQLException {
        Connection connection = null;
        try {
            Connexion cnx = new Connexion();
            connection = cnx.Connecter();
            
            String requete = "update vip set nationalite_vip = ? where nom_vip = ? and prenom_usuel_vip = ?";
            try (PreparedStatement pstmt = connection.prepareStatement(requete)) {
                pstmt.setString(1, newNationalite);
                pstmt.setString(2, name);
                pstmt.setString(3, surname);
                // exécution de l'ordre SQL
                pstmt.executeUpdate();
            }
        } catch (Exception e) {
            throw e;
        }
    } // modifNationalite
    
    public void modifCivilite(String newCivilite, String name, String surname) throws SQLException {
        Connection connection = null;
        try {
            Connexion cnx = new Connexion();
            connection = cnx.Connecter();
            
            String requete = "update vip set civilite_vip = ? where nom_vip = ? and prenom_usuel_vip = ?";
            try (PreparedStatement pstmt = connection.prepareStatement(requete)) {
                pstmt.setString(1, newCivilite);
                pstmt.setString(2, name);
                pstmt.setString(3, surname);
                // exécution de l'ordre SQL
                pstmt.executeUpdate();
            }
        } catch (Exception e) {
            throw e;
        }
    } // modifCivilite
    
    public void modifSexe(String newSexe, String name, String surname) throws SQLException {
        Connection connection = null;
        try {
            Connexion cnx = new Connexion();
            connection = cnx.Connecter();
            
            String requete = "update vip set sexe_vip = ? where nom_vip = ? and prenom_usuel_vip = ?";
            try (PreparedStatement pstmt = connection.prepareStatement(requete)) {
                pstmt.setString(1, newSexe);
                pstmt.setString(2, name);
                pstmt.setString(3, surname);
                // exécution de l'ordre SQL
                pstmt.executeUpdate();
            }
        } catch (Exception e) {
            throw e;
        }
    } // modifSexe
    
    public void modifDateNaissance(String newDateNaissance, String name, String surname) throws SQLException {
        Connection connection = null;
        try {
            Connexion cnx = new Connexion();
            connection = cnx.Connecter();
            
            String requete = "update vip set date_naissance_vip = ? where nom_vip = ? and prenom_usuel_vip = ?";
            try (PreparedStatement pstmt = connection.prepareStatement(requete)) {
                pstmt.setString(1, newDateNaissance);
                pstmt.setString(2, name);
                pstmt.setString(3, surname);
                // exécution de l'ordre SQL
                pstmt.executeUpdate();
            } catch (Exception e) {
                javax.swing.JOptionPane.showMessageDialog(
                        null, 
                        "La date n'est pas au format date !",
                        "Erreur",
                        javax.swing.JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception e) {
            throw e;
        }
    } // modifDateNaissance
    
    public void modifLieuNaissance(String newLieuNaissance, String name, String surname) throws SQLException {
        Connection connection = null;
        try {
            Connexion cnx = new Connexion();
            connection = cnx.Connecter();
            
            String requete = "update vip set lieu_naissance_vip = ? where nom_vip = ? and prenom_usuel_vip = ?";
            try (PreparedStatement pstmt = connection.prepareStatement(requete)) {
                pstmt.setString(1, newLieuNaissance);
                pstmt.setString(2, name);
                pstmt.setString(3, surname);
                // exécution de l'ordre SQL
                pstmt.executeUpdate();
            }
        } catch (Exception e) {
            throw e;
        }
    } // modifLieuNaissance
    
    public void modifAge(int newAge, String name, String surname) throws SQLException {
        Connection connection = null;
        try {
            Connexion cnx = new Connexion();
            connection = cnx.Connecter();
            
            String requete = "update vip set age_vip = ? where nom_vip = ? and prenom_usuel_vip = ?";
            try (PreparedStatement pstmt = connection.prepareStatement(requete)) {
                pstmt.setInt(1, newAge);
                pstmt.setString(2, name);
                pstmt.setString(3, surname);
                // exécution de l'ordre SQL
                pstmt.executeUpdate();
            }
        } catch (Exception e) {
            throw e;
        }
    } // modifAge
    
    public void modifStatut(String newStatut, String name, String surname) throws SQLException {
        Connection connection = null;
        try {
            Connexion cnx = new Connexion();
            connection = cnx.Connecter();
            
            String requete = "update vip set statut_vip = ? where nom_vip = ? and prenom_usuel_vip = ?";
            try (PreparedStatement pstmt = connection.prepareStatement(requete)) {
                pstmt.setString(1, newStatut);
                pstmt.setString(2, name);
                pstmt.setString(3, surname);
                // exécution de l'ordre SQL
                pstmt.executeUpdate();
            }
        } catch (Exception e) {
            throw e;
        }
    } // modifLieuNaissance
    
    public void modifNbEnfants(int newNbEnfants, String name, String surname) throws SQLException {
        Connection connection = null;
        try {
            Connexion cnx = new Connexion();
            connection = cnx.Connecter();
            
            String requete = "update vip set nb_enfants = ? where nom_vip = ? and prenom_usuel_vip = ?";
            try (PreparedStatement pstmt = connection.prepareStatement(requete)) {
                pstmt.setInt(1, newNbEnfants);
                pstmt.setString(2, name);
                pstmt.setString(3, surname);
                // exécution de l'ordre SQL
                pstmt.executeUpdate();
            }
        } catch (Exception e) {
            throw e;
        }
    } // modifNbEnfants

}
