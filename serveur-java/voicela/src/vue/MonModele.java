/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vue;

import metier.*;
/**
 *
 * @author maxencebeno
 */
public class MonModele extends javax.swing.table.AbstractTableModel {
    private String[] nomsColonnes = {"Nom", "Prénom", "Nationalité", "Civilité", "Sexe", "Date de naissance", "Lieu de naissance", "Age", "Statut", "Nombre d'enfants"};
    public java.util.ArrayList<VIP> donnees;

    public MonModele(java.util.ArrayList<VIP> vVIP) {
        donnees = vVIP;
           // ajout  d'un écouteur perso pour espionner les modif
        // this.addTableModelListener( new MonEcouteurTable() );
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
            return donnees.get(row).getNom();
        } else if (col == 1) {
            return donnees.get(row).getPrenomUsage();
        } else if (col == 2) {
            return donnees.get(row).getNationalite();
        } else if (col == 3) {
            return donnees.get(row).getCivilité();
        } else if (col == 4) {
            return donnees.get(row).getSexe();
        } else if (col == 5) {
            return donnees.get(row).getDateNaissance();
        } else if (col == 6) {
            return donnees.get(row).getLieuNaissance();
        } else if (col == 7) {
            return donnees.get(row).getAge();
        } else if (col == 8) {
            return donnees.get(row).getStatut();
        } else {
            return donnees.get(row).getEnfants();
        }
    }

    @Override
    public String getColumnName(int col) {
        return col >= 0 ? nomsColonnes[col] : null;
    }

    @Override
    public Class getColumnClass(int c) {
        return getValueAt(0, c).getClass();
    }
    
    @Override
    // toutes les cellules sont modifiables
    public boolean isCellEditable(int row, int col) {
        return ((col == 0 || col == 1 || col == 2 || col == 3 || col == 4 || col == 5 || col == 6 || col == 7 || col == 8 || col == 9) ? true : false);
    }
    
    @Override
    // seules les cellules des colonnes 2(sport) et 4(vegetarien) sont modifiables
    public void setValueAt(Object value, int row, int col) {
        if(col == 0) {
            donnees.get(row).setNom((String) value);
        }
        if (col == 1) {
            donnees.get(row).setPrenomUsage((String) value);
        }
        if(col == 2) {
            donnees.get(row).setNationalite((String) value);
        }
        if (col == 3) {
            donnees.get(row).setCivilité((String) value);
        }
        if(col == 4) {
            donnees.get(row).setSexe((String) value);
        }
        if (col == 5) {
            donnees.get(row).setDateNaissance((String) value);
        }
        if(col == 6) {
            donnees.get(row).setLieuNaissance((String) value);
        }
        if(col == 7) {
            donnees.get(row).setAge((int) value);
        }
        if(col == 8) {
            donnees.get(row).setStatut((String) value);
        }
        if(col == 9) {
            donnees.get(row).setEnfants((int) value);
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
            java.util.ArrayList<VIP> donneesSupprimees = new java.util.ArrayList<VIP>();
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
