/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package voicela;

import java.util.Date;
import java.util.*;
import java.io.*;
import java.util.Objects;

/**
 *
 * @author Vincent
 */
public class VIP {
    // Attributs de VIP
    private int id;
    private String nom;
    private String prenomUsage;
    private String prenoms;
    private String sexe;
    private int age;
    private String statut;
    private String lieuNaissance;
    private Date dateNaissance;
    private int enfants;
    
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

    public Date getDateNaissance() {
        return dateNaissance;
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

    public void setDateNaissance(Date dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public void setEnfants(int enfants) {
        this.enfants = enfants;
    }
    
    // Méthodes
    public void seMarier(VIP vip){
        
    }
    
    public void divorcer(VIP vip){
        
    }
}
