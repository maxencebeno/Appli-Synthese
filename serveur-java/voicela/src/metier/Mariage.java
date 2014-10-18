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
    protected int marie1;
    protected int marie2;
    protected String lieuMariage;
    protected boolean divorce;
    protected String dateDivorce;
    protected String dateMariage;
    
    private static int dernierNumeroAttribue = 0;
    
    // Constructeur
    public Mariage(int numMariage, int marie1, int marie2, String lieuMariage, boolean divorce, String dateDivorce, String dateMariage) {
        numMariage = ++dernierNumeroAttribue;
        this.marie1 = marie1;
        this.marie2 = marie2;
        this.lieuMariage = lieuMariage;
        this.divorce = divorce;
        this.dateDivorce = dateDivorce;
        this.dateMariage = dateMariage;
    }
    
    public Mariage(){
        
    }
    
    // Getters
    public int getNumMariage() {
        return numMariage;
    }

    public int getMarie1() {
        return marie1;
    }

    public String getLieuMariage() {
        return lieuMariage;
    }

    public boolean getDivorce() {
        return divorce;
    }

    public String getDateMariage() {
        return dateMariage;
    }

    public int getMarie2() {
        return marie2;
    }

    public String getDateDivorce() {
        return dateDivorce;
    }
    
    
    
    
    // Setters
    public void setNumMariage(int numMariage) {
        this.numMariage = numMariage;
    }

    public void setMarie1(int marie1) {
        this.marie1 = marie1;
    }

    public void setLieuMariage(String lieuMariage) {
        this.lieuMariage = lieuMariage;
    }

    public void setDivorce(boolean divorce) {
        this.divorce = divorce;
    }

    public void setDateMariage(String dateMariage) {
        this.dateMariage = dateMariage;
    }

    public void setMarie2(int marie2) {
        this.marie2 = marie2;
    }

    public void setDateDivorce(String dateDivorce) {
        this.dateDivorce = dateDivorce;
    }
    
}
