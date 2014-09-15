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
/**
 *
 * @author Vincent
 */
public class Appli {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            java.sql.Connection connection = DriverManager.getConnection("jdbc:mysql:iuta.univ-lyon1.fr", "p1201896", "169657");    
        } catch(SQLException ex) {
            System.out.println(ex);
        }
        VIP vip = new VIP();
    }
}
