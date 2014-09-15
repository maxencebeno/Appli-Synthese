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
public class Film {
    // Attributs
    protected int numFilm;
    protected String titreFilm;
    protected Date dateSortie;
    protected String genre;
    protected String numVisa;
    
    // Constructeurs
    public Film(int numFilm, String titreFilm, Date dateSortie, String genre, String numVisa) {
        this.numFilm = numFilm;
        this.titreFilm = titreFilm;
        this.dateSortie = dateSortie;
        this.genre = genre;
        this.numVisa = numVisa;
    }
    
    public Film(){
        
    }
    
    // Getters
    public int getNumFilm() {
        return numFilm;
    }

    public String getTitreFilm() {
        return titreFilm;
    }

    public Date getDateSortie() {
        return dateSortie;
    }

    public String getGenre() {
        return genre;
    }

    public String getNumVisa() {
        return numVisa;
    }
    
    // Setters
    public void setNumFilm(int numFilm) {
        this.numFilm = numFilm;
    }

    public void setTitreFilm(String titreFilm) {
        this.titreFilm = titreFilm;
    }

    public void setDateSortie(Date dateSortie) {
        this.dateSortie = dateSortie;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setNumVisa(String numVisa) {
        this.numVisa = numVisa;
    }
    
    // Méthodes
    
}
