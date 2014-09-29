/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package metier;

import java.util.Date;
import java.util.*;
import java.io.*;
import java.sql.*;
import parametre.Connexion;

/**
 *
 * @author Vincent
 */
public class VIP {
    // Attributs de VIP
    protected int id;
    protected String nom;
    protected String prenomUsage;
    protected String prenoms;
    protected String sexe;
    protected String civilité;
    protected int age;
    protected String statut;
    protected String lieuNaissance;
    protected long dateNaissance;
    protected int enfants;
    
    // Constructeurs
    public VIP(String nom, String prenomUsage, String prenoms, String sexe, String civilite, int age, String statut, String lieuNaissance, long dateNaissance, int enfants) {
        this.nom = nom;
        this.prenomUsage = prenomUsage;
        this.prenoms = prenoms;
        this.sexe = sexe;
        this.civilité = civilite;
        this.age = age;
        this.statut = statut;
        this.lieuNaissance = lieuNaissance;
        this.dateNaissance = dateNaissance;
        this.enfants = enfants;
    }
    
    
    public VIP(){
        
    }
    
    // Getters
    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenomUsage() {
        return prenomUsage;
    }

    public String getPrenoms() {
        return prenoms;
    }

    public String getSexe() {
        return sexe;
    }

    public int getAge() {
        return age;
    }

    public String getStatut() {
        return statut;
    }

    public String getLieuNaissance() {
        return lieuNaissance;
    }

    public long getDateNaissance() {
        return dateNaissance;
    }

    public String getCivilité() {
        return civilité;
    }
    
    public int getEnfants() {
        return enfants;
    }

    // Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenomUsage(String prenomUsage) {
        this.prenomUsage = prenomUsage;
    }

    public void setPrenoms(String prenoms) {
        this.prenoms = prenoms;
    }

    public void setSexe(String sexe) {
        this.sexe = sexe;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setStatut(String statut) {
        this.statut = statut;
    }

    public void setLieuNaissance(String lieuNaissance) {
        this.lieuNaissance = lieuNaissance;
    }

    public void setDateNaissance(long dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public void setEnfants(int enfants) {
        this.enfants = enfants;
    }

    public void setCivilité(String civilité) {
        this.civilité = civilité;
    }
    
     
    // Méthodes
    public void seMarier(VIP vip, String lieuMariage, Date dateMariage){
        // Instanciation du mariage
        /*Mariage mariage = new Mariage();
        mariage.setNumMariage(1);
        mariage.setMarie1(this.nom);
        mariage.setMarie2(vip.getNom());
        mariage.setLieuMariage(lieuMariage);
        mariage.setDivorce(false);
        mariage.setDateMariage(dateMariage);*/
        
        // Insertion du mariage en base de données
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection connection = null;
        try {
            Connexion cnx = new Connexion();
            connection = cnx.Connecter();
            
            //----------------------------------------------------------------
            // PREMIERE INSERTION
            //----------------------------------------------------------------
            // Préparation de la date pour conversion date java -> date SQL
            java.util.Date utilDate = dateMariage;
            java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());
            // Requête d'insertion
            ps = connection.prepareStatement("INSERT INTO mariage (num_vip1, num_vip2, lieu_mariage, date_mariage, divorce, date_divorce) VALUES (?, ?, ?, ?, ? , ?)");         
            ps.setString(1, lieuMariage);
            ps.setDate(2, sqlDate);
            ps.setBoolean(3, false);
            ps.setDate(4, null);
            // On valide la première insertion
            ps.executeUpdate();
        }catch(Exception e){
            //throw e;
        }finally{
            try{
                if(rs != null) rs.close();
                if(ps != null) ps.close();
                if(connection != null) connection.close();
            }catch(Exception e){
                e.printStackTrace();
            }
        }
    }
    
    public void divorcer(VIP vip){
        
    }
}
