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
 * Cette classe sert à l'ajout des photos des vips, elle rassemble aussi leur photo de profil
 * 
 */
public class Photographie {
    // Attributs
    protected int numPhoto;
    protected int numVIP;
    protected String urlPhoto;
    protected String dateAjoutPhoto;
    
    // Constructeurs
    public Photographie(int numVIP, String urlPhoto, String dateAjoutPhoto) {
        this.numVIP = numVIP;
        this.urlPhoto = urlPhoto;
        this.dateAjoutPhoto = dateAjoutPhoto;
    }
    
    public Photographie() {
    }
    
    // Getters
    public int getNumPhoto() {
        return numPhoto;
    }

    public int getNumVIP() {
        return numVIP;
    }

    public String getUrlPhoto() {
        return urlPhoto;
    }

    public String getDateAjoutPhoto() {
        return dateAjoutPhoto;
    }
    
    // Setters
    public void setNumPhoto(int numPhoto) {
        this.numPhoto = numPhoto;
    }

    public void setNumVIP(int numVIP) {
        this.numVIP = numVIP;
    }

    public void setUrlPhoto(String urlPhoto) {
        this.urlPhoto = urlPhoto;
    }

    public void setDateAjoutPhoto(String dateAjoutPhoto) {
        this.dateAjoutPhoto = dateAjoutPhoto;
    }
    
    // Méthodes
    
}
