/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import parametre.Admin;

/**
 *
 * @author maxencebeno
 */
public class Main {
    /*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // look and feel windows
        try {
            // création du DAO avec la connexion à la base concernée
            new Admin().setVisible(true);
            // création de la vue avec le modèle de données à afficher
        } catch (NumberFormatException e) {
            System.out.print(e.getMessage());
        }

    }
}
