/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package voicela;

import java.util.*;
import java.io.*;
import voicela.VIP;

import java.util.*;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import static voicela.Connexion.conn;
/**
 *
 * @author Vincent
 */
public class Appli extends javax.swing.JFrame{

    /**
     * @param args the command line arguments
     */
    
    /**
     * Creates new form Copier
     */
    public Appli() {
        //initComponents();
        setLocation(250, 150);
    }
    
    // Connexion
    public static java.sql.Connection conn;
    
    public static void main(String[] args) {
        Connexion.Connecter(args);
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Appli().setVisible(true);
            }
        });
    }
}
