/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package voicela;

import java.util.*;
import java.util.Date;
import java.io.*;
import voicela.VIP;

import java.util.*;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import static voicela.Connexion.conn;
/**
 *
 * @author Vincent
 */
public class Appli extends javax.swing.JFrame {

    /**
     * Creates new form Appli
     */
    public Appli() {
        initComponents();
        
        // Les 3 prochaines lignes permettent de mettre l'application en plein écran
        this.pack();
        setDefaultLookAndFeelDecorated(true);
        this.setExtendedState(MAXIMIZED_BOTH);
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
        ajoutVIP = new javax.swing.JPanel();
        nomVIP = new javax.swing.JLabel();
        prenomVIP = new javax.swing.JLabel();
        prenomUsageVIP = new javax.swing.JLabel();
        sexeVIP = new javax.swing.JLabel();
        ageVIP = new javax.swing.JLabel();
        statutVIP = new javax.swing.JLabel();
        lieuNaissanceVip = new javax.swing.JLabel();
        dateNaissanceVIP = new javax.swing.JLabel();
        nbEnfantsVIP = new javax.swing.JLabel();
        nom = new javax.swing.JTextField();
        prenom = new javax.swing.JTextField();
        prenomUsage = new javax.swing.JTextField();
        lieuNaissance = new javax.swing.JTextField();
        dateNaissance = new javax.swing.JTextField();
        validerVIP = new javax.swing.JButton();
        sexeHomme = new javax.swing.JRadioButton();
        sexeFemme = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        civilite = new javax.swing.JComboBox();
        acteur = new javax.swing.JCheckBox();
        realisateur = new javax.swing.JCheckBox();
        rien = new javax.swing.JCheckBox();
        age = new javax.swing.JSlider();
        ageAffiche = new javax.swing.JLabel();
        nbEnfantsSlider = new javax.swing.JSlider();
        nbEnfantsAffiche = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        boutonMenuModifierVIP = new javax.swing.JMenu();
        boutonMenuAjouterVIP = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        boutonMenuModifierMariage = new javax.swing.JMenuItem();
        boutonMenuAjouterDivorce = new javax.swing.JMenuItem();
        boutonMenuAjouterPhoto = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        boutonMenuAide = new javax.swing.JMenuItem();
        boutonMenuAPropos = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Voicela");

        ajoutVIP.setBorder(javax.swing.BorderFactory.createTitledBorder("Ajout d'un VIP"));
        ajoutVIP.setVisible(false);

        nomVIP.setText("Nom :");

        prenomVIP.setText("Prénom : ");

        prenomUsageVIP.setText("Prénom d'usage :");

        sexeVIP.setText("Sexe : ");

        ageVIP.setText("Age : ");

        statutVIP.setText("Statut :");

        lieuNaissanceVip.setText("Lieu de naissance :");

        dateNaissanceVIP.setText("Date de naissance : ");

        nbEnfantsVIP.setText("Nombre d'enfants : ");

        validerVIP.setText("Valider");
        validerVIP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valider(evt);
            }
        });

        buttonGroup1.add(sexeHomme);
        sexeHomme.setSelected(true);
        sexeHomme.setText("Homme");

        buttonGroup1.add(sexeFemme);
        sexeFemme.setText("Femme");

        jLabel1.setText("Civitilité");

        civilite.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Mr", "Mme", "Mlle", " " }));

        acteur.setText("Acteur");

        realisateur.setText("Réalisateur");

        rien.setText("Rien");

        age.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                changerAge(evt);
            }
        });

        nbEnfantsSlider.setMaximum(10);
        nbEnfantsSlider.setValue(0);
        nbEnfantsSlider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                nbEnfantsSlide(evt);
            }
        });

        javax.swing.GroupLayout ajoutVIPLayout = new javax.swing.GroupLayout(ajoutVIP);
        ajoutVIP.setLayout(ajoutVIPLayout);
        ajoutVIPLayout.setHorizontalGroup(
            ajoutVIPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ajoutVIPLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ajoutVIPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ajoutVIPLayout.createSequentialGroup()
                        .addComponent(dateNaissanceVIP)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(ajoutVIPLayout.createSequentialGroup()
                        .addComponent(statutVIP)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(ajoutVIPLayout.createSequentialGroup()
                        .addGroup(ajoutVIPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sexeVIP)
                            .addComponent(ageVIP)
                            .addComponent(lieuNaissanceVip)
                            .addComponent(jLabel1)
                            .addComponent(nbEnfantsVIP))
                        .addGap(152, 152, 152)
                        .addGroup(ajoutVIPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ajoutVIPLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(age, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(ageAffiche, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ajoutVIPLayout.createSequentialGroup()
                                .addGroup(ajoutVIPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(dateNaissance, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lieuNaissance, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(130, 130, 130))
                            .addGroup(ajoutVIPLayout.createSequentialGroup()
                                .addGroup(ajoutVIPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(ajoutVIPLayout.createSequentialGroup()
                                        .addComponent(nbEnfantsSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(nbEnfantsAffiche, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(ajoutVIPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(ajoutVIPLayout.createSequentialGroup()
                                            .addComponent(sexeHomme, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(sexeFemme))
                                        .addComponent(civilite, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(ajoutVIPLayout.createSequentialGroup()
                                            .addComponent(acteur)
                                            .addGap(18, 18, 18)
                                            .addComponent(realisateur)
                                            .addGap(18, 18, 18)
                                            .addComponent(rien))))
                                .addContainerGap(111, Short.MAX_VALUE))))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ajoutVIPLayout.createSequentialGroup()
                .addGroup(ajoutVIPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(ajoutVIPLayout.createSequentialGroup()
                        .addGap(282, 282, 282)
                        .addComponent(prenomUsage))
                    .addGroup(ajoutVIPLayout.createSequentialGroup()
                        .addGroup(ajoutVIPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ajoutVIPLayout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addGroup(ajoutVIPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(nomVIP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(prenomVIP, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)))
                            .addGroup(ajoutVIPLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(prenomUsageVIP)))
                        .addGap(169, 169, 169)
                        .addGroup(ajoutVIPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(prenom)
                            .addComponent(nom))))
                .addGap(130, 130, 130))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ajoutVIPLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(validerVIP)
                .addGap(46, 46, 46))
        );
        ajoutVIPLayout.setVerticalGroup(
            ajoutVIPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ajoutVIPLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ajoutVIPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nomVIP)
                    .addComponent(nom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(ajoutVIPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(prenomVIP)
                    .addComponent(prenom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(ajoutVIPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(prenomUsageVIP)
                    .addComponent(prenomUsage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(ajoutVIPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sexeVIP)
                    .addComponent(sexeHomme)
                    .addComponent(sexeFemme))
                .addGap(7, 7, 7)
                .addGroup(ajoutVIPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(civilite, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(ajoutVIPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ajoutVIPLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(ageVIP)
                        .addGap(20, 20, 20))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ajoutVIPLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(ajoutVIPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(ageAffiche, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(age, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(ajoutVIPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(acteur, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(ajoutVIPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(statutVIP)
                        .addComponent(realisateur)
                        .addComponent(rien)))
                .addGap(18, 18, 18)
                .addGroup(ajoutVIPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lieuNaissanceVip)
                    .addComponent(lieuNaissance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(ajoutVIPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(ajoutVIPLayout.createSequentialGroup()
                        .addComponent(dateNaissanceVIP)
                        .addGap(18, 18, 18)
                        .addComponent(nbEnfantsVIP)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(ajoutVIPLayout.createSequentialGroup()
                        .addComponent(dateNaissance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(ajoutVIPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(nbEnfantsSlider, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(nbEnfantsAffiche, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(29, 29, 29)
                        .addComponent(validerVIP)
                        .addContainerGap())))
        );

        boutonMenuModifierVIP.setText("File");

        boutonMenuAjouterVIP.setText("Ajouter un VIP");
        boutonMenuAjouterVIP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ajoutVIP(evt);
            }
        });
        boutonMenuModifierVIP.add(boutonMenuAjouterVIP);

        jMenuItem1.setText("Modifier un VIP");
        boutonMenuModifierVIP.add(jMenuItem1);

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
            .addGroup(layout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addComponent(ajoutVIP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(196, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(ajoutVIP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(64, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void boutonMenuModifierMariageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boutonMenuModifierMariageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boutonMenuModifierMariageActionPerformed

    private void boutonMenuAjouterDivorceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boutonMenuAjouterDivorceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boutonMenuAjouterDivorceActionPerformed

    private void boutonMenuAProposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boutonMenuAProposActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boutonMenuAProposActionPerformed

    private void ajoutVIP(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ajoutVIP
        this.ajoutVIP.setVisible(true);
    }//GEN-LAST:event_ajoutVIP

    private void valider(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valider
        String prenoms, prenomsUsage, nomVIP, civiliteVIP, statutVIP, lieuNaissanceVIP;
        String ageVIP, nbEnfantsVIP, testChaine;
        Date date;
        
        // Début vérification des champs bien remplis
        
        prenoms = prenom.getText();
        if(prenoms.isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(
                    this,
                    "Vous n'avez pas rentré de prénom",
                    "Erreur",
                    javax.swing.JOptionPane.ERROR_MESSAGE
            );
        }
        prenomsUsage = prenomUsage.getText();
        if(prenomsUsage.isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(
                    this,
                    "Vous n'avez pas rentré de prénom d'usage",
                    "Erreur",
                    javax.swing.JOptionPane.ERROR_MESSAGE
            );
        }
        nomVIP = nom.getText();
        if(nomVIP.isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(
                    this,
                    "Vous n'avez pas rentré de nom",
                    "Erreur",
                    javax.swing.JOptionPane.ERROR_MESSAGE
            );
        }
        lieuNaissanceVIP = lieuNaissance.getText();
        if(lieuNaissanceVIP.isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(
                    this,
                    "Vous n'avez pas rentré de lieu de naissance",
                    "Erreur",
                    javax.swing.JOptionPane.ERROR_MESSAGE
            );
        }
        
        // Fin vérification des champs bien remplis
        
        civiliteVIP = civilite.getSelectedItem().toString();
        ageVIP = ageAffiche.getText();
        nbEnfantsVIP = nbEnfantsAffiche.getText();
        
        // Assignation dans la varible civilité l'item sélectionné
        
        if(acteur.isSelected()) {
            statutVIP = acteur.getText();
        }        
        else if(realisateur.isSelected()) {
            statutVIP = realisateur.getText();
        }
        else if (rien.isSelected()) {
            statutVIP = rien.getText();
        }
        else if (acteur.isSelected() && realisateur.isSelected()) {
            statutVIP = "Les deux";
        }
        else {
            javax.swing.JOptionPane.showMessageDialog(
                    this,
                    "Vous n'avez pas coché de statut",
                    "Erreur",
                    javax.swing.JOptionPane.ERROR_MESSAGE
            );
        }
        
        
    }//GEN-LAST:event_valider

    private void changerAge(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_changerAge
        int ageSlider = age.getValue();
        String ageConverti;
        ageConverti = String.valueOf(ageSlider);
        
        ageAffiche.setText(ageConverti);
        age.setMaximum(AGE_MAX);
        age.setMinimum(AGE_MIN);
    }//GEN-LAST:event_changerAge

    private void nbEnfantsSlide(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_nbEnfantsSlide
        int nbEnfantsValeur = nbEnfantsSlider.getValue();
        String nbEnfantsConverti;
        nbEnfantsConverti = String.valueOf(nbEnfantsValeur);
        
        nbEnfantsAffiche.setText(nbEnfantsConverti);
        nbEnfantsSlider.setMaximum(NB_ENFANTS_MAX);
        nbEnfantsSlider.setMinimum(NB_ENFANTS_MIN);
    }//GEN-LAST:event_nbEnfantsSlide

    // Connexion
    public static java.sql.Connection conn;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Appli.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Appli.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Appli.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Appli.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        new Admin().setVisible(true);
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Appli().setVisible(false);
            }
        });
        // Test insertion mariage
        /*VIP vip = new VIP("Federer", "Roger", "XXXXX", "Homme", "Monsieur", 33, "Marié", "Bâle", new java.util.Date().getTime(), 3);
        VIP.seMarier(this, "Kaboul", new java.util.Date().getTime());*/
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox acteur;
    private javax.swing.JSlider age;
    private javax.swing.JLabel ageAffiche;
    private javax.swing.JLabel ageVIP;
    private javax.swing.JPanel ajoutVIP;
    private javax.swing.JMenuItem boutonMenuAPropos;
    private javax.swing.JMenuItem boutonMenuAide;
    private javax.swing.JMenuItem boutonMenuAjouterDivorce;
    private javax.swing.JMenuItem boutonMenuAjouterPhoto;
    private javax.swing.JMenuItem boutonMenuAjouterVIP;
    private javax.swing.JMenuItem boutonMenuModifierMariage;
    private javax.swing.JMenu boutonMenuModifierVIP;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox civilite;
    private javax.swing.JTextField dateNaissance;
    private javax.swing.JLabel dateNaissanceVIP;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JTextField lieuNaissance;
    private javax.swing.JLabel lieuNaissanceVip;
    private javax.swing.JLabel nbEnfantsAffiche;
    private javax.swing.JSlider nbEnfantsSlider;
    private javax.swing.JLabel nbEnfantsVIP;
    private javax.swing.JTextField nom;
    private javax.swing.JLabel nomVIP;
    private javax.swing.JTextField prenom;
    private javax.swing.JTextField prenomUsage;
    private javax.swing.JLabel prenomUsageVIP;
    private javax.swing.JLabel prenomVIP;
    private javax.swing.JCheckBox realisateur;
    private javax.swing.JCheckBox rien;
    private javax.swing.JRadioButton sexeFemme;
    private javax.swing.JRadioButton sexeHomme;
    private javax.swing.JLabel sexeVIP;
    private javax.swing.JLabel statutVIP;
    private javax.swing.JButton validerVIP;
    // End of variables declaration//GEN-END:variables
    static final int AGE_MIN = 1;
    static final int AGE_MAX = 120;
    
    static final int NB_ENFANTS_MIN = 0;
    static final int NB_ENFANTS_MAX = 10;
}
