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
import metier.Maries;
import metier.Photographie;
import metier.VIP;

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

    public void modifNom(String newName, String name, String surname) throws SQLException {
        Connection connection = null;
        try {
            Connexion cnx = new Connexion();
            connection = cnx.Connecter();

            String requete = "update vip set nom_vip = ? where nom_vip = ? and prenom_usuel_vip = ?";
            try (PreparedStatement pstmt = connection.prepareStatement(requete)) {
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
        Connection connection = null;
        try {
            Connexion cnx = new Connexion();
            connection = cnx.Connecter();

            String requete = "update vip set prenom_usuel_vip = ? where nom_vip = ? and prenom_usuel_vip = ?";
            try (PreparedStatement pstmt = connection.prepareStatement(requete)) {
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
        Connection connection = null;
        try {
            Connexion cnx = new Connexion();
            connection = cnx.Connecter();

            String requete = "update vip set nationalite_vip = ? where nom_vip = ? and prenom_usuel_vip = ?";
            try (PreparedStatement pstmt = connection.prepareStatement(requete)) {
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
        Connection connection = null;
        try {
            Connexion cnx = new Connexion();
            connection = cnx.Connecter();

            String requete = "update vip set civilite_vip = ? where nom_vip = ? and prenom_usuel_vip = ?";
            try (PreparedStatement pstmt = connection.prepareStatement(requete)) {
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
        Connection connection = null;
        try {
            Connexion cnx = new Connexion();
            connection = cnx.Connecter();

            String requete = "update vip set sexe_vip = ? where nom_vip = ? and prenom_usuel_vip = ?";
            try (PreparedStatement pstmt = connection.prepareStatement(requete)) {
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
        Connection connection = null;
        try {
            Connexion cnx = new Connexion();
            connection = cnx.Connecter();

            String requete = "update vip set date_naissance_vip = ? where nom_vip = ? and prenom_usuel_vip = ?";
            try (PreparedStatement pstmt = connection.prepareStatement(requete)) {
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
        Connection connection = null;
        try {
            Connexion cnx = new Connexion();
            connection = cnx.Connecter();

            String requete = "update vip set lieu_naissance_vip = ? where nom_vip = ? and prenom_usuel_vip = ?";
            try (PreparedStatement pstmt = connection.prepareStatement(requete)) {
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
        Connection connection = null;
        try {
            Connexion cnx = new Connexion();
            connection = cnx.Connecter();

            String requete = "update vip set age_vip = ? where nom_vip = ? and prenom_usuel_vip = ?";
            try (PreparedStatement pstmt = connection.prepareStatement(requete)) {
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
        Connection connection = null;
        try {
            Connexion cnx = new Connexion();
            connection = cnx.Connecter();

            String requete = "update vip set statut_vip = ? where nom_vip = ? and prenom_usuel_vip = ?";
            try (PreparedStatement pstmt = connection.prepareStatement(requete)) {
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
        Connection connection = null;
        try {
            Connexion cnx = new Connexion();
            connection = cnx.Connecter();

            String requete = "update vip set nb_enfants = ? where nom_vip = ? and prenom_usuel_vip = ?";
            try (PreparedStatement pstmt = connection.prepareStatement(requete)) {
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
        Connection connection = null;
        ResultSet rs = null;
        try {
            Connexion cnx = new Connexion();
            connection = cnx.Connecter();
            String requete = "select nom_vip, prenom_usuel_vip from vip";
            try (PreparedStatement pstmt = connection.prepareStatement(requete)) {
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
        Connection connection = null;
        ResultSet rs = null;
        int numVip = 0;

        try {
            Connexion cnx = new Connexion();
            connection = cnx.Connecter();
            String requete = "SELECT num_vip FROM vip where nom_vip = ? and prenom_usuel_vip = ?";
            try (PreparedStatement pstmt = connection.prepareStatement(requete);) {
                pstmt.setString(1, name);
                pstmt.setString(2, surname);
                rs = pstmt.executeQuery(); // Exécuter la requête

                if (rs.next()) {

                    numVip = rs.getInt(1); // nom

                }
            }

        } catch (Exception e) {
            throw e;
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
        return numVip;
    }

    public void ajoutPhotoVip(Photographie photo) throws SQLException {
        Connection connection = null;
        try {
            Connexion cnx = new Connexion();
            connection = cnx.Connecter();

            String requete = "insert into photos (id_photo, num_vip, url_photo, date_ajout_photo) values(?, ?, ?, ?)";
            try (PreparedStatement pstmt = connection.prepareStatement(requete)) {
                pstmt.setInt(1, photo.getNumPhoto());
                pstmt.setInt(2, photo.getNumPhoto());
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
        Connection connection = null;
        ResultSet rs = null;

        try {
            Connexion cnx = new Connexion();
            connection = cnx.Connecter();
            String requete = "SELECT * FROM vip";
            pstmt = connection.prepareStatement(requete);
            rs = pstmt.executeQuery(); // Exécuter la requête
            ResultSetMetaData md = rs.getMetaData();
            int columns = md.getColumnCount();

            while (rs.next()) {
                VIP v;
                v = new VIP();
                for (int i = 1; i <= columns; i++) {
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
                if (connection != null) {
                    connection.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
        return Appli.vVIP;
    }

    public void insererUnVip(VIP vip) throws SQLException {
        Connection connection = null;
        try {
            Connexion cnx = new Connexion();
            connection = cnx.Connecter();
            String requete = "insert into vip (num_vip, nom_vip, prenom_usuel_vip, prenoms_vip, nationalite_vip, civilite_vip, date_naissance_vip, age_vip, lieu_naissance_vip, statut_vip, nb_enfants, sexe_vip, chemin_photo) values(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            try (PreparedStatement pstmt = connection.prepareStatement(requete)) {
                pstmt.setInt(1, vip.getId());
                pstmt.setString(2, vip.getNom());
                pstmt.setString(3, vip.getPrenomUsage());
                pstmt.setString(4, vip.getPrenoms());
                pstmt.setString(5, vip.getNationalite());
                pstmt.setString(6, vip.getCivilité());
                pstmt.setString(7, vip.getDateNaissance());
                pstmt.setInt(8, vip.getAge());
                pstmt.setString(9, vip.getLieuNaissance());
                pstmt.setString(10, vip.getStatut());
                pstmt.setInt(11, vip.getEnfants());
                pstmt.setString(12, vip.getSexe());
                pstmt.setString(13, vip.getPathImage());

                // exécution de l'ordre SQL
                pstmt.executeUpdate();
            }
        } catch (Exception e) {
            throw e;
        }
    } // insererVip

    public void ajoutPhoto(Photographie photo, VIP vip) throws SQLException {
        Connection connection = null;
        try {
            Connexion cnx = new Connexion();
            connection = cnx.Connecter();

            String requete = "insert into photos (id_photo, num_vip, url_photo, date_ajout_photo) values(?, ?, ?, ?)";
            try (PreparedStatement pstmt = connection.prepareStatement(requete)) {
                pstmt.setInt(1, photo.getNumPhoto());
                pstmt.setInt(2, vip.getId());
                pstmt.setString(3, photo.getUrlPhoto());
                pstmt.setString(4, photo.getDateAjoutPhoto());

                // exécution de l'ordre SQL
                pstmt.executeUpdate();
            }
        } catch (Exception e) {
            throw e;
        }
    } // ajoutPhoto

    public void insererUnMariage(Mariage mariage) throws SQLException {
        Connection connection = null;
        try {
            Connexion cnx = new Connexion();
            connection = cnx.Connecter();
            String requete = "insert into mariage (id_mariage, num_vip1, num_vip2, lieu_mariage, date_mariage, divorce, date_divorce) values(?, ?, ?, ?, ?, ?, ?)";
            try (PreparedStatement pstmt = connection.prepareStatement(requete)) {
                pstmt.setInt(1, mariage.getNumMariage());
                pstmt.setInt(2, mariage.getMarie1());
                pstmt.setInt(3, mariage.getMarie2());
                pstmt.setString(4, mariage.getLieuMariage());
                pstmt.setString(5, mariage.getDateMariage());
                pstmt.setBoolean(6, mariage.getDivorce());
                pstmt.setString(7, mariage.getDateDivorce());

                // exécution de l'ordre SQL
                pstmt.executeUpdate();
            }
        } catch (Exception e) {
            throw e;
        }
    } // insererVip

    public boolean searchMariage(int vip1, int vip2) throws Exception {
        // Affichage de tous les vip
        Connection connection = null;
        ResultSet rs = null;
        boolean bonAMarier = true;

        try {
            Connexion cnx = new Connexion();
            connection = cnx.Connecter();
            String requete = "SELECT divorce FROM mariage WHERE (num_vip1 = ? and num_vip2 = ?) or (num_vip2 = ? and num_vip1 = ?)";
            try (PreparedStatement pstmt = connection.prepareStatement(requete);) {
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
                if (connection != null) {
                    connection.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
        return bonAMarier;
    }

    public boolean searchDejaMarie(int vip) throws Exception {
        // Affichage de tous les vip
        Connection connection = null;
        ResultSet rs = null;
        boolean bonAMarier = true;

        try {
            Connexion cnx = new Connexion();
            connection = cnx.Connecter();
            String requete = "SELECT num_vip1, num_vip2 FROM mariage WHERE (num_vip1 = ? and num_vip2 = ?) or (num_vip2 = ? and num_vip1 = ?)";
            try (PreparedStatement pstmt = connection.prepareStatement(requete);) {
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
                if (connection != null) {
                    connection.close();
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
        int numVip2 = 0;
        PreparedStatement pstmt = null;
        Connection connection = null;
        ResultSet rs = null;

        try {
            Connexion cnx = new Connexion();
            connection = cnx.Connecter();
            String requete = "SELECT num_vip2 FROM mariage where num_vip1 = ?";
            pstmt = connection.prepareStatement(requete);
            pstmt.setInt(1, numVip);
            rs = pstmt.executeQuery(); // Exécuter la requête

            if (rs.next()) {
                numVip2 = rs.getInt(1);
            } else {
                nomVipMarie = "Célibataire";
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
                if (connection != null) {
                    connection.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
        try {
            Connexion cnx = new Connexion();
            connection = cnx.Connecter();
            String requete2 = "SELECT nom_vip FROM vip where num_vip = ?";
            pstmt = connection.prepareStatement(requete2);
            pstmt.setInt(1, numVip2);
            rs = pstmt.executeQuery(); // Exécuter la requête

            if (rs.next()) {
                nomVipMarie = rs.getString(1);
            } else {
                return nomVipMarie = "Célibataire";
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
                if (connection != null) {
                    connection.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
        return nomVipMarie;
    }

}
