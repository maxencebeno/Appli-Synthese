/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parametre;

import java.util.ArrayList;
import metier.VIP;
import java.util.logging.Level;
import java.util.logging.Logger;
import metier.Mariage;
import vue.MonModele;

/**
 *
 * Cette classe est la classe principale du logiciel
 * Elle est composée d'une jTable listant tous les vips, d'un menu permettant l'ajout de vips, photos, mariages et divorce
 * Les modifications se font directement en modifiant les champs dans la jTable
 * La suppression se fait en sélectionnant une ou plusieurs lignes de la table et en cliquant sur supprimer
 */
public final class Appli extends javax.swing.JFrame {

    public static java.util.ArrayList<VIP> vVIP;
    public static java.util.ArrayList<Mariage> vMariage;

    /**
     * Creates new form Appli
     *
     * @throws java.lang.Exception
     */
    public Appli() throws Exception {
        vVIP = new java.util.ArrayList<>();
        vMariage = new java.util.ArrayList<>();
        donneesASupprimer = new ArrayList<>();
        initComponents();

        // Les 3 prochaines lignes permettent de mettre l'application en plein écran
        this.pack();
        setDefaultLookAndFeelDecorated(true);
        this.setExtendedState(MAXIMIZED_BOTH);
        monModele = (MonModele) table.getModel();

        AccesBD vip = new AccesBD();
        vVIP = vip.lireLesVIP();
        setLocation(250, 150);

        // associer une ComboBox  à la colonne CIVILITE
        javax.swing.JComboBox comboBoxCivilite = new javax.swing.JComboBox();

        try {
            vip.afficherComboBoxCivilite(comboBoxCivilite);
        } catch (Exception ex) {
            Logger.getLogger(Appli.class.getName()).log(Level.SEVERE, null, ex);
        }

        // fixer l'éditeur pour la colonne numéro 4 (civilite)
        javax.swing.table.TableColumn colcivilite
                = table.getColumnModel().getColumn(4);
        colcivilite.setCellEditor(new javax.swing.DefaultCellEditor(comboBoxCivilite));

        // associer une ComboBox  à la colonne SEXE
        javax.swing.JComboBox comboBoxSexe = new javax.swing.JComboBox();

        try {
            vip.afficherComboBoxSexe(comboBoxSexe);
        } catch (Exception ex) {
            Logger.getLogger(Appli.class.getName()).log(Level.SEVERE, null, ex);
        }

        // fixer l'éditeur pour la colonne numéro 5 (sexe)
        javax.swing.table.TableColumn colsexe
                = table.getColumnModel().getColumn(5);
        colsexe.setCellEditor(new javax.swing.DefaultCellEditor(comboBoxSexe));

        // associer une ComboBox  à la colonne statut
        javax.swing.JComboBox comboBoxStatut = new javax.swing.JComboBox();

        try {
            vip.afficherComboBoxStatut(comboBoxStatut);
        } catch (Exception ex) {
            Logger.getLogger(Appli.class.getName()).log(Level.SEVERE, null, ex);
        }

        // fixer l'éditeur pour la colonne numéro 9 (statut)
        javax.swing.table.TableColumn colstatut
                = table.getColumnModel().getColumn(9);
        colstatut.setCellEditor(new javax.swing.DefaultCellEditor(comboBoxStatut));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        actualiser = new javax.swing.JButton();
        supprimer = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        boutonMenuModifierVIP = new javax.swing.JMenu();
        boutonMenuAjouterVIP = new javax.swing.JMenuItem();
        boutonMenuModifierMariage = new javax.swing.JMenuItem();
        boutonMenuAjouterDivorce = new javax.swing.JMenuItem();
        boutonMenuAjouterPhoto = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        boutonMenuAide = new javax.swing.JMenuItem();
        boutonMenuAPropos = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Voicela KeepControl");

        table.setModel(new MonModele(vVIP, donneesASupprimer));
        jScrollPane1.setViewportView(table);

        actualiser.setText("Actualiser");
        actualiser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actualiser(evt);
            }
        });

        supprimer.setText("Supprimer");
        supprimer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                supprimer(evt);
            }
        });

        boutonMenuModifierVIP.setText("Fichier");

        boutonMenuAjouterVIP.setText("Ajouter un VIP");
        boutonMenuAjouterVIP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ajoutVIP(evt);
            }
        });
        boutonMenuModifierVIP.add(boutonMenuAjouterVIP);

        boutonMenuModifierMariage.setText("Ajouter mariage");
        boutonMenuModifierMariage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boutonMenuModifierMariageActionPerformed(evt);
            }
        });
        boutonMenuModifierVIP.add(boutonMenuModifierMariage);

        boutonMenuAjouterDivorce.setText("Ajouter divorce");
        boutonMenuAjouterDivorce.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boutonMenuAjouterDivorceActionPerformed(evt);
            }
        });
        boutonMenuModifierVIP.add(boutonMenuAjouterDivorce);

        boutonMenuAjouterPhoto.setText("Ajouter une photo");
        boutonMenuAjouterPhoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ajouterPhoto(evt);
            }
        });
        boutonMenuModifierVIP.add(boutonMenuAjouterPhoto);

        jMenuBar1.add(boutonMenuModifierVIP);

        jMenu2.setText("A propos");

        boutonMenuAide.setText("Aide");
        boutonMenuAide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boutonMenuAideActionPerformed(evt);
            }
        });
        jMenu2.add(boutonMenuAide);

        boutonMenuAPropos.setText("A propos de voicela");
        boutonMenuAPropos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boutonMenuAProposActionPerformed(evt);
            }
        });
        jMenu2.add(boutonMenuAPropos);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(710, Short.MAX_VALUE)
                .addComponent(supprimer)
                .addGap(28, 28, 28)
                .addComponent(actualiser)
                .addGap(147, 147, 147))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1088, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(43, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(actualiser)
                    .addComponent(supprimer))
                .addGap(154, 154, 154))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void boutonMenuModifierMariageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boutonMenuModifierMariageActionPerformed
        AjouterMariage BddAjouterMariage;
        BddAjouterMariage = new AjouterMariage(this, true);
        BddAjouterMariage.setLocation(250, 150);
        BddAjouterMariage.setVisible(true);
    }//GEN-LAST:event_boutonMenuModifierMariageActionPerformed

    private void boutonMenuAjouterDivorceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boutonMenuAjouterDivorceActionPerformed
        AjouterDivorce BddAjouterDivorce;
        BddAjouterDivorce = new AjouterDivorce(this, true);
        BddAjouterDivorce.setLocation(250, 150);
        BddAjouterDivorce.setVisible(true);
    }//GEN-LAST:event_boutonMenuAjouterDivorceActionPerformed

    private void boutonMenuAProposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boutonMenuAProposActionPerformed
        javax.swing.JOptionPane.showMessageDialog(
            this,
            "Voicela KeepControl - Version 1.0.1\n\nCréé par Maxence BENO, Vincent MORAL et Etienne TROUILLET\n\n Copyright © 2014",
            "A propos",
            javax.swing.JOptionPane.INFORMATION_MESSAGE
        );
    }//GEN-LAST:event_boutonMenuAProposActionPerformed

    private void ajoutVIP(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ajoutVIP
        AjoutVip BddVip;
        BddVip = new AjoutVip(this, true, monModele);
        BddVip.setLocation(250, 150);
        BddVip.setVisible(true);
    }//GEN-LAST:event_ajoutVIP

    private void actualiser(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualiser
        try {
            AccesBD bdd;
            bdd = new AccesBD();
            monModele.donnees.clear();
            vVIP = bdd.lireLesVIP();
            monModele.fireTableDataChanged();
        } catch (Exception ex) {
            Logger.getLogger(Appli.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_actualiser

    private void ajouterPhoto(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ajouterPhoto
        AjoutPhoto BddVip;
        BddVip = new AjoutPhoto(this, true);
        BddVip.setLocation(250, 150);
        BddVip.setVisible(true);
    }//GEN-LAST:event_ajouterPhoto

    private void supprimer(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_supprimer
        int [] lesLignes;
        lesLignes = table.getSelectedRows();
        monModele.suppLigne(lesLignes);
        AccesBD bdd = new AccesBD();
        try {
            bdd.supprimerVip(donneesASupprimer);
        } catch (Exception ex) {
            Logger.getLogger(Appli.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_supprimer

    private void boutonMenuAideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boutonMenuAideActionPerformed
        javax.swing.JOptionPane.showMessageDialog(
            this,
            "Toutes les actions dont vous pouvez avoir besoin pour l'administration de cette base de données\n sont regroupées dans le menu en haut à gauche (bouton \"Fichier\").",
            "Aide",
            javax.swing.JOptionPane.INFORMATION_MESSAGE
        );
    }//GEN-LAST:event_boutonMenuAideActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton actualiser;
    private javax.swing.JMenuItem boutonMenuAPropos;
    private javax.swing.JMenuItem boutonMenuAide;
    private javax.swing.JMenuItem boutonMenuAjouterDivorce;
    private javax.swing.JMenuItem boutonMenuAjouterPhoto;
    private javax.swing.JMenuItem boutonMenuAjouterVIP;
    private javax.swing.JMenuItem boutonMenuModifierMariage;
    private javax.swing.JMenu boutonMenuModifierVIP;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton supprimer;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
    private final MonModele monModele;
    public ArrayList<VIP> donneesASupprimer;
}
