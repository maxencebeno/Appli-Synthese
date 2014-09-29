/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package metier;

/**
 *
 * @author Vincent
 */
public class Realisateur{
    // Attributs
    protected int numFilm;
    protected int numVIP;
    
    // Constructeurs
    public Realisateur(int numFilm, int numVIP) {
        this.numFilm = numFilm;
        this.numVIP = numVIP;
    }
    
    public Realisateur(){
        
    }
    
    // Getters
    public int getNumFilm() {
        return numFilm;
    }

    public int getNumVIP() {
        return numVIP;
    }
    
    
    // Setters
    public void setNumFilm(int numFilm) {
        this.numFilm = numFilm;
    }

    public void setNumVIP(int numVIP) {
        this.numVIP = numVIP;
    }
    
    // Méthodes
}