/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parametre;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.ArrayList;

/**
 *
 * @author maxencebeno
 */
public class AccesBD {

    public javax.swing.JComboBox afficherComboBoxCivilite(javax.swing.JComboBox combobox) throws Exception {
       
        combobox.addItem("Mr");
        combobox.addItem("Mme");
        combobox.addItem("Mlle");
            
        return combobox;
    }
    
    public javax.swing.JComboBox afficherComboBoxSexe(javax.swing.JComboBox combobox) throws Exception {
        
        combobox.addItem("Homme");
        combobox.addItem("Femme");
        
        return combobox;
    }
    
    public javax.swing.JComboBox afficherComboBoxStatut(javax.swing.JComboBox combobox) throws Exception {
       
        combobox.addItem("Acteur");
        combobox.addItem("Réalisateur");
        combobox.addItem("Acteur/Réalisateur");
        combobox.addItem("Rien");
            
        return combobox;
    }

}
