/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package metier;

// On crée ici la classe Divorce dans laquelle on va communiquer les numéros des vips concernés et la date de divorce
public class Divorce {
    // Attributs
    protected int numDivorce;
    protected int divorce1;
    protected int divorce2;
    protected String dateDivorce;
    
    // Constructeurs
    public Divorce(int numDivorce, int divorce1, int divorce2, String dateDivorce) {
        this.numDivorce = numDivorce;
        this.divorce1 = divorce1;
        this.divorce2 = divorce2;
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

    public String getDateDivorce() {
        return dateDivorce;
    }

    public int getDivorce2() {
        return divorce2;
    }
    
    
    
    // Setters
    public void setNumDivorce(int numDivorce) {
        this.numDivorce = numDivorce;
    }

    public void setDivorce1(int divorce1) {
        this.divorce1 = divorce1;
    }

    public void setDateDivorce(String dateDivorce) {
        this.dateDivorce = dateDivorce;
    }

    public void setDivorce2(int divorce2) {
        this.divorce2 = divorce2;
    }
    
    
}
