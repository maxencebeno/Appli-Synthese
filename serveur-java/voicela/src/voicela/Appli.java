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
import static voicela.Connexion.lister;
/**
 *
 * @author Vincent
 */
public class Appli {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        lister();
        VIP vip = new VIP();
    }
}
