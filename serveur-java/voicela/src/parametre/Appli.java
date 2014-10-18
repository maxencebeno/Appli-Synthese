/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parametre;

import metier.VIP;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import vue.MonModele;

/**
 *
 * @author Vincent
 */
public final class Appli extends javax.swing.JFrame {

    public static java.sql.Connection conn;
    public static java.util.ArrayList<VIP> vVIP;
    
    /**
     * Creates new form Appli
     *
     * @throws java.lang.Exception
     */
    public Appli() throws Exception {
        vVIP = new java.util.ArrayList<>();
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

        // fixer l'éditeur pour la colonne numéro 3 (civilite)
        javax.swing.table.TableColumn colcivilite
                = table.getColumnModel().getColumn(3);
        colcivilite.setCellEditor(new javax.swing.DefaultCellEditor(comboBoxCivilite));

        // associer une ComboBox  à la colonne SEXE
        javax.swing.JComboBox comboBoxSexe = new javax.swing.JComboBox();

        try {
            vip.afficherComboBoxSexe(comboBoxSexe);
        } catch (Exception ex) {
            Logger.getLogger(Appli.class.getName()).log(Level.SEVERE, null, ex);
        }

        // fixer l'éditeur pour la colonne numéro 4 (sexe)
        javax.swing.table.TableColumn colsexe
                = table.getColumnModel().getColumn(4);
        colsexe.setCellEditor(new javax.swing.DefaultCellEditor(comboBoxSexe));

        // associer une ComboBox  à la colonne statut
        javax.swing.JComboBox comboBoxStatut = new javax.swing.JComboBox();

        try {
            vip.afficherComboBoxStatut(comboBoxStatut);
        } catch (Exception ex) {
            Logger.getLogger(Appli.class.getName()).log(Level.SEVERE, null, ex);
        }

        // fixer l'éditeur pour la colonne numéro 3 (statut)
        javax.swing.table.TableColumn colstatut
                = table.getColumnModel().getColumn(8);
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
        setTitle("Voicela");

        table.setModel(new MonModele(vVIP));
        jScrollPane1.setViewportView(table);

        actualiser.setText("Actualiser");
        actualiser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actualiser(evt);
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(actualiser)
                .addGap(147, 147, 147))
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(actualiser)
                .addGap(154, 154, 154))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void boutonMenuModifierMariageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boutonMenuModifierMariageActionPerformed
        AjouterMariage Bdd;
        Bdd = new AjouterMariage(this, true);
        Bdd.setLocation(250, 150);
        Bdd.setVisible(true);
    }//GEN-LAST:event_boutonMenuModifierMariageActionPerformed

    private void boutonMenuAjouterDivorceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boutonMenuAjouterDivorceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boutonMenuAjouterDivorceActionPerformed

    private void boutonMenuAProposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boutonMenuAProposActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boutonMenuAProposActionPerformed

    private void ajoutVIP(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ajoutVIP
        AjoutVip BddVip;
        BddVip = new AjoutVip(this, true);
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

    
    // Connexion
    //public static java.sql.Connection conn;

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
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
    private final MonModele monModele;
    
}
