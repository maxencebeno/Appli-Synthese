/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metier;

/**
 *
 * @author maxencebeno
 */
public class Maries {
    
    protected int numVip1;
    protected int numVip2;
    protected String nomVip1;
    protected String nomVip2;

    public Maries(int numVip1, int numVip2) {
        this.numVip1 = numVip1;
        this.numVip2 = numVip2;
        this.nomVip1 = nomVip1;
        this.nomVip2 = nomVip2;
    }
    
    public Maries() {
        
    }

    public int getNumVip1() {
        return numVip1;
    }

    public int getNumVip2() {
        return numVip2;
    }

    public String getNomVip1() {
        return nomVip1;
    }

    public String getNomVip2() {
        return nomVip2;
    }
    
    

    public void setNumVip1(int numVip1) {
        this.numVip1 = numVip1;
    }

    public void setNumVip2(int numVip2) {
        this.numVip2 = numVip2;
    }

    public void setNomVip1(String nomVip1) {
        this.nomVip1 = nomVip1;
    }

    public void setNomVip2(String nomVip2) {
        this.nomVip2 = nomVip2;
    }
    
    
    
    
}
