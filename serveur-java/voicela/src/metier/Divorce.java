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
public class Divorce {
    // Attributs
    protected int numDivorce;
    protected int divorce1;
    protected Date dateDivorce;
    
    // Constructeurs
    public Divorce(int numDivorce, int divorce1, Date dateDivorce) {
        this.numDivorce = numDivorce;
        this.divorce1 = divorce1;
        this.dateDivorce = dateDivorce;
    }
    
    public Divorce(){
        
    }
    
    // Getters
    public int getNumDivorce() {
        return numDivorce;
    }

    public int getDivorce1() {
        return divorce1;
    }

    public Date getDateDivorce() {
        return dateDivorce;
    }
    
    // Setters
    public void setNumDivorce(int numDivorce) {
        this.numDivorce = numDivorce;
    }

    public void setDivorce1(int divorce1) {
        this.divorce1 = divorce1;
    }

    public void setDateDivorce(Date dateDivorce) {
        this.dateDivorce = dateDivorce;
    }
    
}
