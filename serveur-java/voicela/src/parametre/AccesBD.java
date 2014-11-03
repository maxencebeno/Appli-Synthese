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
import metier.Divorce;
import metier.Mariage;
import metier.Photographie;
import metier.VIP;

/**
 *
 * @author maxencebeno
 */
public class AccesBD {

    public Connection connect = Connexion.Connecter(); // On récupère la connexion globale une fois l'utilisateur connecté

    public AccesBD() {

    }
    // Les trois fonctions qui suivent servent à l'affichage des combo box dans la jTable de VIPs
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
    
    // les fonctions qui suivent permette l'update de la table vip en fonction des modifications enrigistrée via la jTable
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

    // Cette fonction aliment les jList de la classe Ajouter un Mariage
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

    // Comme pour marier les Vip, nous créons une liste pour les divorcer.
    // La seule difference est que pour cette liste, nous récupérons seulement les vip mariés.
    public javax.swing.DefaultListModel<String> alimenterListeDivorce(javax.swing.DefaultListModel<String> listvip) throws Exception {

        ResultSet rs = null;
        try {
            String requete = "select nom_vip, prenom_usuel_vip from vip, mariage where vip.num_vip = mariage.num_vip1 and divorce = 0";
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
    
    // On récupère le vip cherché
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
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
        return numVip;
    }

    // Cette fonction permet l'ajout d'une photo pour un vip
    public void ajoutPhotoVip(Photographie photo) throws SQLException {

        try {

            String requete = "insert into photos (num_vip, url_photo, date_ajout_photo) values(?, ?, ?)";
            try (PreparedStatement pstmt = connect.prepareStatement(requete)) {
                pstmt.setInt(1, photo.getNumVIP());
                pstmt.setString(2, photo.getUrlPhoto());
                pstmt.setString(3, photo.getDateAjoutPhoto());

                // exécution de l'ordre SQL
                pstmt.executeUpdate();
            }
        } catch (Exception e) {
            throw e;
        }
    } // ajoutPhoto

    // Ici on lit les vips pour alimenter la jTable
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
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
        return Appli.vVIP;
    }

    // Cette fonction sert à l'insertion d'un vip
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

    // Cette fonction sert à l'ajout de photo d'un vip en plus de celle de profil
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

    // Cette fonction sert à l'insertion du mariage de 2 vip après vérification
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
    } // insererDivorce

    // Ici on divorce des vips mariés
    public void insererUnDivorce(Divorce divorce) throws SQLException {

        try {
            String requete = "update mariage set divorce = ?, date_divorce = ? where num_vip1 = ? and num_vip2 = ?";

            try (PreparedStatement pstmt = connect.prepareStatement(requete)) {
                pstmt.setBoolean(1, true);
                pstmt.setString(2, divorce.getDateDivorce());
                pstmt.setInt(3, divorce.getDivorce1());
                pstmt.setInt(4, divorce.getDivorce2());

                // exécution de l'ordre SQL
                pstmt.executeUpdate();
            }
        } catch (Exception e) {
            throw e;
        }
    } // insererDivorce

    // Ici on regarde si le vip est divorcé ou pas
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
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
        return bonAMarier;
    }

    // Ici on récupère la date du mariage pour vérifier que le vip qui se marie n'est pas né après son mariage
    public String RecupDateDuMariage(int numVip, int numVip2) throws Exception {
        // Affichage de tous les vip
        ResultSet rs = null;
        String dateDuMariage = null;

        try {
            String requete = "SELECT date_mariage FROM mariage WHERE (num_vip1 = ? and num_vip2 = ?) or (num_vip2 = ? and num_vip1 = ?)";
            try (PreparedStatement pstmt = connect.prepareStatement(requete);) {
                pstmt.setInt(1, numVip);
                pstmt.setInt(2, numVip2);
                pstmt.setInt(3, numVip2);
                pstmt.setInt(4, numVip);
                rs = pstmt.executeQuery(); // Exécuter la requête

                if (rs.next()) {
                    dateDuMariage = rs.getString(1);
                } else {
                    dateDuMariage = "aucun";
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
        return dateDuMariage;
    }

    // Ici on récupère les id des deux vip pour pouvoir les marier
    public boolean searchDejaMarie(int vip) throws Exception {
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
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
        return bonAMarier;
    }

    // Ici on récupère le ou la partenanire du vip pour afficher les couples dans la jTable
    public String lireLesCouples(int numVip) throws Exception {
        // Affichage de tous les vip
        String nomVipMarie = null;
        int numVip2;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {
            String requete = "SELECT num_vip2 FROM mariage where num_vip1 = ? and divorce = 0";
            pstmt = connect.prepareStatement(requete);
            pstmt.setInt(1, numVip);
            rs = pstmt.executeQuery(); // Exécuter la requête

            if (rs.next()) {
                numVip2 = rs.getInt(1);

                requete = "SELECT nom_vip, prenom_usuel_vip FROM vip where num_vip = ?";
                pstmt = connect.prepareStatement(requete);
                pstmt.setInt(1, numVip2);
                rs = pstmt.executeQuery(); // Exécuter la requête

                if (rs.next()) {
                    nomVipMarie = rs.getString(1) + " " + rs.getString(2);
                } else {
                    nomVipMarie = "Célibataire";
                    return nomVipMarie;
                }
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
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return nomVipMarie;

    }

    // Ici pour supprimer un vip, on supprime dans la table vip, photo et mariage s'il est marié
    public void supprimerVip(ArrayList<VIP> lesVipsASupprimer) throws Exception {

        PreparedStatement pstmt = null;
        ResultSet rs = null;

        for (VIP vip : lesVipsASupprimer) {

            try {
                String requete = "DELETE FROM vip WHERE num_vip = ?";
                pstmt = connect.prepareStatement(requete);
                pstmt.setInt(1, vip.getId());
                pstmt.executeUpdate(); // Exécuter la requête

                String requete2 = "DELETE FROM photos where num_vip = ?";
                pstmt = connect.prepareStatement(requete2);
                pstmt.setInt(1, vip.getId());
                pstmt.executeUpdate();

                String requete3 = "DELETE FROM mariage where num_vip1 = ?";
                pstmt = connect.prepareStatement(requete3);
                pstmt.setInt(1, vip.getId());
                pstmt.executeUpdate();

                String requete4 = "DELETE FROM mariage where num_vip2 = ?";
                pstmt = connect.prepareStatement(requete4);
                pstmt.setInt(1, vip.getId());
                pstmt.executeUpdate();

            } catch (Exception e) {
                throw e;
            } finally {
                try {
                    if (pstmt != null) {
                        pstmt.close();
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }

            }
        }
    }
}
