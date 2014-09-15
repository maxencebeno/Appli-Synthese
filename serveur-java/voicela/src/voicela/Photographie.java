/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package voicela;

import java.util.Date;
import java.util.*;
import java.io.*;

/**
 *
 * @author Vincent
 */
public class Photographie {
    // Attributs
    protected int numPhoto;
    protected int numVIP;
    protected String nomPhoto;
    protected String urlPhoto;
    protected Date dateAjoutPhoto;
    
    // Constructeurs
    public Photographie(int numVIP, String nomPhoto, String urlPhoto, Date dateAjoutPhoto) {
        this.numVIP = numVIP;
        this.nomPhoto = nomPhoto;
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

    public String getNomPhoto() {
        return nomPhoto;
    }

    public String getUrlPhoto() {
        return urlPhoto;
    }

    public Date getDateAjoutPhoto() {
        return dateAjoutPhoto;
    }
    
    // Setters
    public void setNumPhoto(int numPhoto) {
        this.numPhoto = numPhoto;
    }

    public void setNumVIP(int numVIP) {
        this.numVIP = numVIP;
    }

    public void setNomPhoto(String nomPhoto) {
        this.nomPhoto = nomPhoto;
    }

    public void setUrlPhoto(String urlPhoto) {
        this.urlPhoto = urlPhoto;
    }

    public void setDateAjoutPhoto(Date dateAjoutPhoto) {
        this.dateAjoutPhoto = dateAjoutPhoto;
    }
    
    // Méthodes
    
}
