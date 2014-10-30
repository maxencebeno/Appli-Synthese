/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vue;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import metier.*;
import parametre.AccesBD;

/**
 *
 * @author maxencebeno
 */
public class MonModele extends javax.swing.table.AbstractTableModel {

    private final String[] nomsColonnes = {"Numéro", "Nom", "Prénom", "Nationalité", "Civilité", "Sexe", "Date de naissance", "Lieu de naissance", "Age", "Statut", "Nombre d'enfants", "Marié à"};
    public ArrayList<VIP> donnees;
    private ArrayList<VIP> donneesSupprimees;
    public AccesBD modif = new AccesBD();

    public MonModele(ArrayList<VIP> vVIP, ArrayList<VIP> donneesASupprimer) {
        donnees = vVIP;
        donneesSupprimees = donneesASupprimer;
    }

    @Override
    public int getColumnCount() {
        return nomsColonnes.length;
    }

    @Override
    public int getRowCount() {
        return donnees.size();
    }

    @Override
    public Object getValueAt(int row, int col) {
        if (col == 0) {
            return donnees.get(row).getId();
        } else if (col == 1) {
            return donnees.get(row).getNom();
        } else if (col == 2) {
            return donnees.get(row).getPrenomUsage();
        } else if (col == 3) {
            return donnees.get(row).getNationalite();
        } else if (col == 4) {
            return donnees.get(row).getCivilité();
        } else if (col == 5) {
            return donnees.get(row).getSexe();
        } else if (col == 6) {
            return donnees.get(row).getDateNaissance();
        } else if (col == 7) {
            return donnees.get(row).getLieuNaissance();
        } else if (col == 8) {
            return donnees.get(row).getAge();
        } else if (col == 9) {
            return donnees.get(row).getStatut();
        } else if (col == 10) {
            return donnees.get(row).getEnfants();
        } else {
            String nomVip2 = null;
            int numVip = 0;
            numVip = donnees.get(row).getId();
            
            try {
                nomVip2 = modif.lireLesCouples(numVip);
            } catch (Exception ex) {
                Logger.getLogger(MonModele.class.getName()).log(Level.SEVERE, null, ex);
            }
            return nomVip2;
        } 
    }

    @Override
    public String getColumnName(int col) {
        return col >= 0 ? nomsColonnes[col] : null;
    }

    @Override
    public Class getColumnClass(int column) {
        Object value = this.getValueAt(0, column);
        return (value == null ? Object.class : value.getClass());
    }

    @Override
    // toutes les cellules sont modifiables
    public boolean isCellEditable(int row, int col) {
        return ((col == 1 || col == 2 || col == 3 || col == 4 || col == 5 || col == 6 || col == 7 || col == 8 || col == 9 || col == 10) ? true : false);
    }

    @Override
    // seules les cellules des colonnes 2(sport) et 4(vegetarien) sont modifiables
    public void setValueAt(Object value, int row, int col) {
        if (col == 1) {
            String name = donnees.get(row).getNom();
            String surname = donnees.get(row).getPrenomUsage();
            donnees.get(row).setNom((String) value);
            try {
                modif.modifNom((String) value, name, surname);
            } catch (SQLException ex) {
                Logger.getLogger(MonModele.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if (col == 2) {
            String name = donnees.get(row).getNom();
            String surname = donnees.get(row).getPrenomUsage();
            donnees.get(row).setPrenomUsage((String) value);
            try {
                modif.modifPrenomUsage((String) value, name, surname);
            } catch (SQLException ex) {
                Logger.getLogger(MonModele.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if (col == 3) {
            String name = donnees.get(row).getNom();
            String surname = donnees.get(row).getPrenomUsage();
            donnees.get(row).setNationalite((String) value);
            try {
                modif.modifNationalite((String) value, name, surname);
            } catch (SQLException ex) {
                Logger.getLogger(MonModele.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if (col == 4) {
            String name = donnees.get(row).getNom();
            String surname = donnees.get(row).getPrenomUsage();
            donnees.get(row).setCivilité((String) value);
            try {
                modif.modifCivilite((String) value, name, surname);
            } catch (SQLException ex) {
                Logger.getLogger(MonModele.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if (col == 5) {
            String name = donnees.get(row).getNom();
            String surname = donnees.get(row).getPrenomUsage();
            donnees.get(row).setSexe((String) value);
            try {
                modif.modifSexe((String) value, name, surname);
            } catch (SQLException ex) {
                Logger.getLogger(MonModele.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if (col == 6) {
            String name = donnees.get(row).getNom();
            String surname = donnees.get(row).getPrenomUsage();
            donnees.get(row).setDateNaissance((String) value);
            try {
                modif.modifDateNaissance((String) value, name, surname);
            } catch (SQLException ex) {
                Logger.getLogger(MonModele.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if (col == 7) {
            String name = donnees.get(row).getNom();
            String surname = donnees.get(row).getPrenomUsage();
            donnees.get(row).setLieuNaissance((String) value);
            try {
                modif.modifLieuNaissance((String) value, name, surname);
            } catch (SQLException ex) {
                Logger.getLogger(MonModele.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if (col == 8) {
            String name = donnees.get(row).getNom();
            String surname = donnees.get(row).getPrenomUsage();
            donnees.get(row).setAge((int) value);
            try {
                modif.modifAge((int) value, name, surname);
            } catch (SQLException ex) {
                Logger.getLogger(MonModele.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if (col == 9) {
            String name = donnees.get(row).getNom();
            String surname = donnees.get(row).getPrenomUsage();
            donnees.get(row).setStatut((String) value);
            try {
                modif.modifStatut((String) value, name, surname);
            } catch (SQLException ex) {
                Logger.getLogger(MonModele.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if (col == 10) {
            String name = donnees.get(row).getNom();
            String surname = donnees.get(row).getPrenomUsage();
            donnees.get(row).setEnfants((int) value);
            try {
                modif.modifNbEnfants((int) value, name, surname);
            } catch (SQLException ex) {
                Logger.getLogger(MonModele.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        fireTableCellUpdated(row, col);
    }

    // insertion en fin de table
    public void ajoutLigne(VIP v) {
        donnees.add(v);
        int ligne = donnees.size() - 1;
        fireTableChanged(new javax.swing.event.TableModelEvent(this, ligne, ligne,
                javax.swing.event.TableModelEvent.ALL_COLUMNS,
                javax.swing.event.TableModelEvent.INSERT));
    }

    // suppression multiple selon la sélection
    public void suppLigne(int[] lesLignes) {
        int nb = lesLignes.length;
        if (nb != 0) {
            
            for (int i = 0; i < nb; i++) {
                donneesSupprimees.add(donnees.get(lesLignes[i]));
            }

            // suppression du sous-vecteur donneesSupprimees du Vecteur donnees
            donnees.removeAll(donneesSupprimees);
            fireTableRowsDeleted(lesLignes[0], lesLignes[nb - 1]);
        } else {
            javax.swing.JOptionPane.showMessageDialog(
                    null,
                    "Vous devez sélectionner une ou plusieurs lignes dans la table",
                    "Information",
                    javax.swing.JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
