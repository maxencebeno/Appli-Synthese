/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package metier;

import java.util.Date;
import java.util.*;
import java.io.*;

/**
 *
 * @author Vincent
 */
public class Mariage {
    // Attributs
    protected int numMariage;
    protected String marie1;
    protected String marie2;
    protected String lieuMariage;
    protected boolean divorce;
    protected Date dateMariage;
    
    // Constructeur
    public Mariage(int numMariage, String marie1, String marie2, String lieuMariage, boolean divorce, Date dateMariage) {
        this.numMariage = numMariage;
        this.marie1 = marie1;
        this.marie2 = marie2;
        this.lieuMariage = lieuMariage;
        this.divorce = divorce;
        this.dateMariage = dateMariage;
    }
    
    public Mariage(){
        
    }
    
    // Getters
    public int getNumMariage() {
        return numMariage;
    }

    public String getMarie1() {
        return marie1;
    }

    public String getLieuMariage() {
        return lieuMariage;
    }

    public boolean isDivorce() {
        return divorce;
    }

    public Date getDateMariage() {
        return dateMariage;
    }

    public String getMarie2() {
        return marie2;
    }
    
    
    // Setters
    public void setNumMariage(int numMariage) {
        this.numMariage = numMariage;
    }

    public void setMarie1(String marie1) {
        this.marie1 = marie1;
    }

    public void setLieuMariage(String lieuMariage) {
        this.lieuMariage = lieuMariage;
    }

    public void setDivorce(boolean divorce) {
        this.divorce = divorce;
    }

    public void setDateMariage(Date dateMariage) {
        this.dateMariage = dateMariage;
    }

    public void setMarie2(String marie2) {
        this.marie2 = marie2;
    }
    
}
