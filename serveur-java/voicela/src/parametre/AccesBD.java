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
import java.sql.SQLException;
import java.util.ArrayList;
import metier.Mariage;
import metier.Photographie;
import metier.VIP;
/**
 *
 * @author maxencebeno
 */
public class AccesBD {
    
    public Connection connect = Connexion.Connecter();
    
    
    
    public AccesBD() {
        
    }
    
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

    public void modifNom(String newName, String name, String surname) throws SQLException {
        
        try {

            String requete = "update vip set nom_vip = ? where nom_vip = ? and prenom_usuel_vip = ?";
            try (PreparedStatement pstmt = connect.prepareStatement(requete)) {
                pstmt.setString(1, newName);
                pstmt.setString(2, name);
                pstmt.setString(3, surname);
                // exécution de l'ordre SQL
                pstmt.executeUpdate();
            }
        } catch (Exception e) {
            throw e;
        }
    } // modifNom

    public void modifPrenomUsage(String newPrenom, String name, String surname) throws SQLException {
        
        try {

            String requete = "update vip set prenom_usuel_vip = ? where nom_vip = ? and prenom_usuel_vip = ?";
            try (PreparedStatement pstmt = connect.prepareStatement(requete)) {
                pstmt.setString(1, newPrenom);
                pstmt.setString(2, name);
                pstmt.setString(3, surname);
                // exécution de l'ordre SQL
                pstmt.executeUpdate();
            }
        } catch (Exception e) {
            throw e;
        }
    } // modifPrenomUsuel

    public void modifNationalite(String newNationalite, String name, String surname) throws SQLException {
        
        try {

            String requete = "update vip set nationalite_vip = ? where nom_vip = ? and prenom_usuel_vip = ?";
            try (PreparedStatement pstmt = connect.prepareStatement(requete)) {
                pstmt.setString(1, newNationalite);
                pstmt.setString(2, name);
                pstmt.setString(3, surname);
                // exécution de l'ordre SQL
                pstmt.executeUpdate();
            }
        } catch (Exception e) {
            throw e;
        }
    } // modifNationalite

    public void modifCivilite(String newCivilite, String name, String surname) throws SQLException {
        
        try {

            String requete = "update vip set civilite_vip = ? where nom_vip = ? and prenom_usuel_vip = ?";
            try (PreparedStatement pstmt = connect.prepareStatement(requete)) {
                pstmt.setString(1, newCivilite);
                pstmt.setString(2, name);
                pstmt.setString(3, surname);
                // exécution de l'ordre SQL
                pstmt.executeUpdate();
            }
        } catch (Exception e) {
            throw e;
        }
    } // modifCivilite

    public void modifSexe(String newSexe, String name, String surname) throws SQLException {
        
        try {

            String requete = "update vip set sexe_vip = ? where nom_vip = ? and prenom_usuel_vip = ?";
            try (PreparedStatement pstmt = connect.prepareStatement(requete)) {
                pstmt.setString(1, newSexe);
                pstmt.setString(2, name);
                pstmt.setString(3, surname);
                // exécution de l'ordre SQL
                pstmt.executeUpdate();
            }
        } catch (Exception e) {
            throw e;
        }
    } // modifSexe

    public void modifDateNaissance(String newDateNaissance, String name, String surname) throws SQLException {
        
        try {

            String requete = "update vip set date_naissance_vip = ? where nom_vip = ? and prenom_usuel_vip = ?";
            try (PreparedStatement pstmt = connect.prepareStatement(requete)) {
                pstmt.setString(1, newDateNaissance);
                pstmt.setString(2, name);
                pstmt.setString(3, surname);
                // exécution de l'ordre SQL
                pstmt.executeUpdate();
            } catch (Exception e) {
                javax.swing.JOptionPane.showMessageDialog(
                        null,
                        "La date n'est pas au format date !",
                        "Erreur",
                        javax.swing.JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception e) {
            throw e;
        }
    } // modifDateNaissance

    public void modifLieuNaissance(String newLieuNaissance, String name, String surname) throws SQLException {
        
        try {

            String requete = "update vip set lieu_naissance_vip = ? where nom_vip = ? and prenom_usuel_vip = ?";
            try (PreparedStatement pstmt = connect.prepareStatement(requete)) {
                pstmt.setString(1, newLieuNaissance);
                pstmt.setString(2, name);
                pstmt.setString(3, surname);
                // exécution de l'ordre SQL
                pstmt.executeUpdate();
            }
        } catch (Exception e) {
            throw e;
        }
    } // modifLieuNaissance

    public void modifAge(int newAge, String name, String surname) throws SQLException {
        
        try {

            String requete = "update vip set age_vip = ? where nom_vip = ? and prenom_usuel_vip = ?";
            try (PreparedStatement pstmt = connect.prepareStatement(requete)) {
                pstmt.setInt(1, newAge);
                pstmt.setString(2, name);
                pstmt.setString(3, surname);
                // exécution de l'ordre SQL
                pstmt.executeUpdate();
            }
        } catch (Exception e) {
            throw e;
        }
    } // modifAge

    public void modifStatut(String newStatut, String name, String surname) throws SQLException {
        
        try {

            String requete = "update vip set statut_vip = ? where nom_vip = ? and prenom_usuel_vip = ?";
            try (PreparedStatement pstmt = connect.prepareStatement(requete)) {
                pstmt.setString(1, newStatut);
                pstmt.setString(2, name);
                pstmt.setString(3, surname);
                // exécution de l'ordre SQL
                pstmt.executeUpdate();
            }
        } catch (Exception e) {
            throw e;
        }
    } // modifLieuNaissance

    public void modifNbEnfants(int newNbEnfants, String name, String surname) throws SQLException {
        
        try {

            String requete = "update vip set nb_enfants = ? where nom_vip = ? and prenom_usuel_vip = ?";
            try (PreparedStatement pstmt = connect.prepareStatement(requete)) {
                pstmt.setInt(1, newNbEnfants);
                pstmt.setString(2, name);
                pstmt.setString(3, surname);
                // exécution de l'ordre SQL
                pstmt.executeUpdate();
            }
        } catch (Exception e) {
            throw e;
        }
    } // modifNbEnfants

    public javax.swing.DefaultListModel<String> alimenterListeVIP(javax.swing.DefaultListModel<String> listvip) throws Exception {
        
        ResultSet rs = null;
        try {
            String requete = "select nom_vip, prenom_usuel_vip from vip";
            try (PreparedStatement pstmt = connect.prepareStatement(requete)) {
                rs = pstmt.executeQuery();
                while (rs.next()) {
                    listvip.addElement(rs.getString(1) + " " + rs.getString(2));
                }
            }

        } catch (Exception e) {
            throw e;
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return listvip;
    }

    public int searchVip(String name, String surname) throws Exception {
        // Affichage de tous les vip
        
        ResultSet rs = null;
        int numVip = 0;

        try {
            String requete = "SELECT num_vip FROM vip where nom_vip = ? and prenom_usuel_vip = ?";
            try (PreparedStatement pstmt = connect.prepareStatement(requete);) {
                pstmt.setString(1, name);
                pstmt.setString(2, surname);
                rs = pstmt.executeQuery(); // Exécuter la requête

                if (rs.next()) {
                    numVip = rs.getInt(1); // nom
                } else {
                    return 0;
                }
            }

        } catch (Exception e) {
            throw e;
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (connect != null) {
                    connect.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
        return numVip;
    }

    public void ajoutPhotoVip(Photographie photo) throws SQLException {
        
        try {

            String requete = "insert into photos (num_vip, url_photo, date_ajout_photo) values(?, ?, ?)";
            try (PreparedStatement pstmt = connect.prepareStatement(requete)) {
                pstmt.setInt(2, photo.getNumVIP());
                pstmt.setString(3, photo.getUrlPhoto());
                pstmt.setString(4, photo.getDateAjoutPhoto());

                // exécution de l'ordre SQL
                pstmt.executeUpdate();
            }
        } catch (Exception e) {
            throw e;
        }
    } // ajoutPhoto

    public ArrayList<VIP> lireLesVIP() throws Exception {
        // Affichage de tous les vip
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {
            String requete = "SELECT * FROM vip";
            pstmt = connect.prepareStatement(requete);
            rs = pstmt.executeQuery(); // Exécuter la requête
            ResultSetMetaData md = rs.getMetaData();
            int columns = md.getColumnCount();

            while (rs.next()) {
                VIP v;
                v = new VIP();
                for (int i = 1; i <= columns; i++) {
                    int numVip = rs.getInt(1);
                    String nom = rs.getString(2); // nom
                    String prenomUsage = rs.getString(3); // prenom usage
                    String prenom = rs.getString(4); // prenom
                    String sexe = rs.getString(12);// sexe 
                    String civilite = rs.getString(6); // civilité
                    int age = rs.getInt(8);    // age
                    String statut = rs.getString(10);// statut
                    String lieuNaissance = rs.getString(9); // lieu de naissance
                    String dateNaissance = rs.getString(7); // date de naissance
                    int nbEnfants = rs.getInt(11);   // nombre d'enfants
                    String nationalite = rs.getString(5); // nationalité

                    v.setId(numVip);
                    v.setNom(nom);
                    v.setPrenomUsage(prenomUsage);
                    v.setPrenoms(prenom);
                    v.setSexe(sexe);
                    v.setCivilité(civilite);
                    v.setAge(age);
                    v.setStatut(statut);
                    v.setLieuNaissance(lieuNaissance);
                    v.setDateNaissance(dateNaissance);
                    v.setEnfants(nbEnfants);
                    v.setNationalite(nationalite);

                }
                Appli.vVIP.add(v);
            }
        } catch (Exception e) {
            throw e;
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (pstmt != null) {
                    pstmt.close();
                }
                if (connect != null) {
                    connect.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
        return Appli.vVIP;
    }

    public void insererUnVip(VIP vip) throws SQLException {
        try {
            String requete = "insert into vip (nom_vip, prenom_usuel_vip, prenoms_vip, nationalite_vip, civilite_vip, date_naissance_vip, age_vip, lieu_naissance_vip, statut_vip, nb_enfants, sexe_vip, chemin_photo) values(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            try (PreparedStatement pstmt = connect.prepareStatement(requete)) {
                pstmt.setString(1, vip.getNom());
                pstmt.setString(2, vip.getPrenomUsage());
                pstmt.setString(3, vip.getPrenoms());
                pstmt.setString(4, vip.getNationalite());
                pstmt.setString(5, vip.getCivilité());
                pstmt.setString(6, vip.getDateNaissance());
                pstmt.setInt(7, vip.getAge());
                pstmt.setString(8, vip.getLieuNaissance());
                pstmt.setString(9, vip.getStatut());
                pstmt.setInt(10, vip.getEnfants());
                pstmt.setString(11, vip.getSexe());
                pstmt.setString(12, vip.getPathImage());

                // exécution de l'ordre SQL
                pstmt.executeUpdate();
            }
        } catch (Exception e) {
            throw e;
        }
    } // insererVip

    public void ajoutPhoto(Photographie photo, int numVip) throws SQLException, Exception {
        
        try {
            String requete = "insert into photos (num_vip, url_photo, date_ajout_photo) values(?, ?, ?)";
            try (PreparedStatement pstmt = connect.prepareStatement(requete)) {
                pstmt.setInt(1, numVip);
                pstmt.setString(2, photo.getUrlPhoto());
                pstmt.setString(3, photo.getDateAjoutPhoto());

                // exécution de l'ordre SQL
                pstmt.executeUpdate();
            }
        } catch (Exception e) {
            throw e;
        }
    } // ajoutPhoto

    public void insererUnMariage(Mariage mariage) throws SQLException {
        
        try {
            String requete = "insert into mariage (num_vip1, num_vip2, lieu_mariage, date_mariage, divorce, date_divorce) values(?, ?, ?, ?, ?, ?)";
            try (PreparedStatement pstmt = connect.prepareStatement(requete)) {
                pstmt.setInt(1, mariage.getMarie1());
                pstmt.setInt(2, mariage.getMarie2());
                pstmt.setString(3, mariage.getLieuMariage());
                pstmt.setString(4, mariage.getDateMariage());
                pstmt.setBoolean(5, mariage.getDivorce());
                pstmt.setString(6, mariage.getDateDivorce());

                // exécution de l'ordre SQL
                pstmt.executeUpdate();
            }
        } catch (Exception e) {
            throw e;
        }
    } // insererVip

    public boolean searchMariage(int vip1, int vip2) throws Exception {
        // Affichage de tous les vip
        ResultSet rs = null;
        boolean bonAMarier = true;

        try {
            String requete = "SELECT divorce FROM mariage WHERE (num_vip1 = ? and num_vip2 = ?) or (num_vip2 = ? and num_vip1 = ?)";
            try (PreparedStatement pstmt = connect.prepareStatement(requete);) {
                pstmt.setInt(1, vip1);
                pstmt.setInt(2, vip2);
                pstmt.setInt(3, vip1);
                pstmt.setInt(4, vip2);
                rs = pstmt.executeQuery(); // Exécuter la requête

                if (rs.next()) {
                    bonAMarier = rs.getBoolean(1);
                }
            }

        } catch (Exception e) {
            throw e;
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (connect != null) {
                    connect.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
        return bonAMarier;
    }

    public boolean searchDejaMarie(int vip) throws Exception {
        // Affichage de tous les vip
        ResultSet rs = null;
        boolean bonAMarier = true;

        try {
            String requete = "SELECT num_vip1, num_vip2 FROM mariage WHERE (num_vip1 = ? and num_vip2 = ?) or (num_vip2 = ? and num_vip1 = ?)";
            try (PreparedStatement pstmt = connect.prepareStatement(requete);) {
                pstmt.setInt(1, vip);
                pstmt.setInt(2, vip);
                rs = pstmt.executeQuery(); // Exécuter la requête

                if (rs.next()) {
                    bonAMarier = false;
                }
            }

        } catch (Exception e) {
            throw e;
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (connect != null) {
                    connect.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
        return bonAMarier;
    }

    public String lireLesCouples(int numVip) throws Exception {
        // Affichage de tous les vip
        String nomVipMarie = null;
        int numVip2;
        PreparedStatement pstmt = null;
        PreparedStatement pstmt2 = null;
        PreparedStatement pstmt3 = null;
        PreparedStatement pstmt4 = null;
        ResultSet rs = null;
        ResultSet rs2 = null;
        ResultSet rs3 = null;
        ResultSet rs4 = null;

        try {
            String requete = "SELECT num_vip2 FROM mariage where num_vip1 = ? and divorce = 0";
            pstmt = connect.prepareStatement(requete);
            pstmt.setInt(1, numVip);
            rs = pstmt.executeQuery(); // Exécuter la requête

            if (rs.next()) {
                numVip2 = rs.getInt(1);

                String requete2 = "SELECT nom_vip, prenom_usuel_vip FROM vip where num_vip = ?";
                pstmt2 = connect.prepareStatement(requete2);
                pstmt2.setInt(1, numVip2);
                rs2 = pstmt2.executeQuery(); // Exécuter la requête

                if (rs2.next()) {
                    nomVipMarie = rs2.getString(1) + " " + rs2.getString(2);
                } else {
                    nomVipMarie = "Célibataire";
                    return nomVipMarie;
                }
            } else {
                String requete3 = "SELECT num_vip1 FROM mariage where num_vip2 = ? and divorce = 0";
                pstmt3 = connect.prepareStatement(requete3);
                pstmt3.setInt(1, numVip);
                rs3 = pstmt3.executeQuery();
                if (rs3.next()) {
                    numVip2 = rs3.getInt(1);

                    String requete4 = "SELECT nom_vip, prenom_usuel_vip FROM vip where num_vip = ?";
                    pstmt4 = connect.prepareStatement(requete4);
                    pstmt4.setInt(1, numVip2);
                    rs4 = pstmt4.executeQuery(); // Exécuter la requête

                    if (rs4.next()) {
                        nomVipMarie = rs4.getString(1) + " " + rs4.getString(2);
                    } else {
                        nomVipMarie = "Célibataire";
                        return nomVipMarie;
                    }
                } else {
                    nomVipMarie = "Célibataire";
                    return nomVipMarie;
                }
            }
        } catch (Exception e) {
            throw e;
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (pstmt != null) {
                    pstmt.close();
                }
                if (rs2 != null) {
                    rs2.close();
                }
                if (pstmt2 != null) {
                    pstmt2.close();
                }
                if (rs3 != null) {
                    rs3.close();
                }
                if (pstmt3 != null) {
                    pstmt3.close();
                }
                if (rs4 != null) {
                    rs4.close();
                }
                if (pstmt4 != null) {
                    pstmt4.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return nomVipMarie;

    }

}
