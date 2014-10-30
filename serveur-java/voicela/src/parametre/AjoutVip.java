/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parametre;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import org.imgscalr.Scalr;
import metier.VIP;
import org.imgscalr.Scalr.Method;
import java.text.SimpleDateFormat;
import java.util.Date;
import metier.Photographie;
import vue.MonModele;

/**
 *
 * @author maxencebeno
 */
public class AjoutVip extends javax.swing.JDialog {

    /**
     * Creates new form AjoutVip
     */
    public AjoutVip(java.awt.Frame parent, boolean modal, MonModele monModele) {
        super(parent, modal);
        initComponents();
        AjoutVip.monModele = monModele;
        //this.setLocation(150, 200);
    }

    public AjoutVip() {

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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        valider = new javax.swing.JButton();
        nom = new javax.swing.JTextField();
        prenom = new javax.swing.JTextField();
        prenomUsage = new javax.swing.JTextField();
        sexeHomme = new javax.swing.JRadioButton();
        sexeFemme = new javax.swing.JRadioButton();
        civilite = new javax.swing.JComboBox();
        nationalite = new javax.swing.JTextField();
        acteur = new javax.swing.JCheckBox();
        realisateur = new javax.swing.JCheckBox();
        rien = new javax.swing.JCheckBox();
        lieuNaissance = new javax.swing.JTextField();
        dateNaissance = new javax.swing.JTextField();
        nbEnfantsSlider = new javax.swing.JSlider();
        nbEnfantsAffiche = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Nom : ");

        jLabel2.setText("Prénoms : ");

        jLabel3.setText("Prenom d'usage : ");

        jLabel4.setText("Sexe : ");

        jLabel5.setText("Etat civile : ");

        jLabel6.setText("Nationalité : ");

        jLabel7.setText("Statut : ");

        jLabel8.setText("Lieu de naissance : ");

        jLabel9.setText("Date de naissance : ");

        jLabel10.setText("Nombre d'enfants : ");

        valider.setText("Valider");
        valider.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valider(evt);
            }
        });

        buttonGroup1.add(sexeHomme);
        sexeHomme.setSelected(true);
        sexeHomme.setText("Homme");

        buttonGroup1.add(sexeFemme);
        sexeFemme.setText("Femme");

        civilite.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Mr", "Mme", "Mlle" }));

        acteur.setText("Acteur");
        acteur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acteurActionPerformed(evt);
            }
        });

        realisateur.setText("Réalisateur ");
        realisateur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                realisateurActionPerformed(evt);
            }
        });

        rien.setText("Aucun");
        rien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rienActionPerformed(evt);
            }
        });

        dateNaissance.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                gestionDate(evt);
            }
        });

        nbEnfantsSlider.setMaximum(10);
        nbEnfantsSlider.setValue(0);
        nbEnfantsSlider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                nbEnfantsSliderStateChanged(evt);
            }
        });

        nbEnfantsAffiche.setText("0");

        jLabel11.setText("Au format AAAA-MM-JJ");

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setText("Ajouter un VIP");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE))
                            .addComponent(jLabel10))
                        .addGap(80, 80, 80)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(acteur)
                                                .addGap(18, 18, 18)
                                                .addComponent(realisateur)
                                                .addGap(18, 18, 18)
                                                .addComponent(rien))
                                            .addComponent(lieuNaissance, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(nbEnfantsSlider, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(nbEnfantsAffiche, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(dateNaissance, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)))
                                .addGap(18, 18, 18))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(civilite, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nationalite, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(sexeHomme)
                                        .addGap(83, 83, 83)
                                        .addComponent(sexeFemme)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(prenom, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nom, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(prenomUsage, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(179, 179, 179))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(284, 284, 284)
                        .addComponent(valider))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(290, 290, 290)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(prenom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(prenomUsage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(sexeHomme)
                    .addComponent(sexeFemme))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(civilite, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nationalite, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(acteur)
                        .addComponent(realisateur)
                        .addComponent(rien)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(lieuNaissance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(dateNaissance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nbEnfantsSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addGap(35, 35, 35)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(nbEnfantsAffiche, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(valider)
                .addContainerGap(66, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void valider(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valider
        AccesBD bdd;
        bdd = new AccesBD();
        String prenoms, prenomsUsage, nomVIP, civiliteVIP, statutVIP, lieuNaissanceVIP, marieA = "Célibataire";
        String sexeVIP, nbEnfantsRecup, nationaliteVIP, dateNaissanceVIP, pathPicture = "non renseigné";
        int ageVIP = 0, nbEnfantsVIP = 0;
        statutVIP = "Rien";
        boolean ajoutVip = false;

        dateNaissanceVIP = dateNaissance.getText();
        nationaliteVIP = nationalite.getText();
        prenoms = prenom.getText();
        prenomsUsage = prenomUsage.getText();
        nomVIP = nom.getText();
        lieuNaissanceVIP = lieuNaissance.getText();
        civiliteVIP = civilite.getSelectedItem().toString();
        nbEnfantsRecup = nbEnfantsAffiche.getText();
        nbEnfantsVIP = Integer.parseInt(nbEnfantsRecup);
        // Assignation dans la varible civilité l'item sélectionné
        if (acteur.isSelected()) {
            statutVIP = acteur.getText();
        } else if (realisateur.isSelected()) {
            statutVIP = realisateur.getText();
        } else if (rien.isSelected()) {
            statutVIP = rien.getText();
        } else if (acteur.isSelected() && realisateur.isSelected()) {
            statutVIP = "Les deux";
        } else {
            javax.swing.JOptionPane.showMessageDialog(
                    this,
                    "Vous n'avez pas coché de statut",
                    "Erreur",
                    javax.swing.JOptionPane.ERROR_MESSAGE
            );
            ajoutVip = false;
        }
        if (sexeHomme.isSelected()) {
            sexeVIP = sexeHomme.getText();
        } else {
            sexeVIP = sexeFemme.getText();
        }

        // Début vérification des champs bien remplis
        if (dateNaissanceVIP.compareTo("") == 0 || nationaliteVIP.compareTo("") == 0 || prenoms.compareTo("") == 0 || prenomsUsage.compareTo("") == 0 || nomVIP.compareTo("") == 0 || lieuNaissanceVIP.compareTo("") == 0) {
            javax.swing.JOptionPane.showMessageDialog(
                    this,
                    "Certains champs ne sont pas remplis",
                    "Erreur",
                    javax.swing.JOptionPane.ERROR_MESSAGE
            );
            ajoutVip = false;
        } else {
            if (dateNaissanceVIP.compareTo("") == 0) {
                javax.swing.JOptionPane.showMessageDialog(
                        this,
                        "Vous n'avez pas rentré de date de naissance",
                        "Erreur",
                        javax.swing.JOptionPane.ERROR_MESSAGE
                );
                ajoutVip = false;
            } else {
                String aaaa = dateNaissanceVIP.substring(0, 4);
                int anneeNaissanceVIP = Integer.parseInt(aaaa);
                Calendar c = Calendar.getInstance();
                int year = c.get(Calendar.YEAR);
                ageVIP = year - anneeNaissanceVIP;
                aaaa = String.valueOf(ageVIP);
                jLabel12.setText(aaaa);
            }

            if (nationaliteVIP.compareTo("") == 0) {
                javax.swing.JOptionPane.showMessageDialog(
                        this,
                        "Vous n'avez pas rentré de nationalite",
                        "Erreur",
                        javax.swing.JOptionPane.ERROR_MESSAGE
                );
                ajoutVip = false;
            }

            if (prenoms.compareTo("") == 0) {
                javax.swing.JOptionPane.showMessageDialog(
                        this,
                        "Vous n'avez pas rentré de prénom",
                        "Erreur",
                        javax.swing.JOptionPane.ERROR_MESSAGE
                );
                ajoutVip = false;
            }

            if (prenomsUsage.compareTo("") == 0) {
                javax.swing.JOptionPane.showMessageDialog(
                        this,
                        "Vous n'avez pas rentré de prénom d'usage",
                        "Erreur",
                        javax.swing.JOptionPane.ERROR_MESSAGE
                );
                ajoutVip = false;
            }

            if (nomVIP.compareTo("") == 0) {
                javax.swing.JOptionPane.showMessageDialog(
                        this,
                        "Vous n'avez pas rentré de nom",
                        "Erreur",
                        javax.swing.JOptionPane.ERROR_MESSAGE
                );
                ajoutVip = false;
            }

            if (lieuNaissanceVIP.compareTo("") == 0) {
                javax.swing.JOptionPane.showMessageDialog(
                        this,
                        "Vous n'avez pas rentré de lieu de naissance",
                        "Erreur",
                        javax.swing.JOptionPane.ERROR_MESSAGE
                );
                ajoutVip = false;
            }
            ajoutVip = true;
            // Fin vérification des champs bien remplis
        }

        if (ajoutVip == true) {
            int result = javax.swing.JOptionPane.showConfirmDialog(
                    this,
                    "Voici le vip que vous êtes sur le point d'insérer : \n"
                    + "Nom : " + nomVIP + "\n"
                    + "Prénoms : " + prenoms + "\n"
                    + "Prénom usage : " + prenomsUsage + "\n"
                    + "Sexe : " + sexeVIP + "\n"
                    + "Civilité : " + civiliteVIP + "\n"
                    + "Age : " + ageVIP + "\n"
                    + "Statut : " + statutVIP + "\n"
                    + "Lieu de naissance : " + lieuNaissanceVIP + "\n"
                    + "Date de naissance : " + dateNaissanceVIP + "\n"
                    + "Nationalité : " + nationaliteVIP + "\n"
                    + "Nombre d'enfants : " + nbEnfantsVIP + "\n",
                    "Confirmation VIP",
                    javax.swing.JOptionPane.OK_CANCEL_OPTION
            );
            if (result == javax.swing.JOptionPane.OK_OPTION) {
                VIP vip;
                vip = new VIP(nomVIP, prenomsUsage, prenoms, sexeVIP, civiliteVIP, ageVIP, statutVIP, lieuNaissanceVIP, dateNaissanceVIP, nbEnfantsVIP, nationaliteVIP, marieA);

                try {
                    int resultPhoto = javax.swing.JOptionPane.showConfirmDialog(
                            this,
                            "Voulez vous ajouter une photo à votre vip ?",
                            "Ajout Photo",
                            javax.swing.JOptionPane.OK_CANCEL_OPTION
                    );
                    if (resultPhoto == javax.swing.JOptionPane.OK_OPTION) {
                        javax.swing.JFileChooser filechooser = new javax.swing.JFileChooser();
                        filechooser.setDialogTitle("Choisissez la photo");
                        filechooser.setFileSelectionMode(javax.swing.JFileChooser.FILES_ONLY);
                        //below codes for select  the file
                        int returnval = filechooser.showOpenDialog(this);
                        if (returnval == javax.swing.JFileChooser.APPROVE_OPTION) {
                            File file = filechooser.getSelectedFile();

                            BufferedImage bi;

                            try {   //display the image in jlabel
                                bi = ImageIO.read(file);
                                copyFileUsingStream(file, new File("../../client-web/files/photos/" + vip.getNom() + ".jpg"));
                                pathPicture = "files/photos/" + vip.getNom() + ".jpg";
                                vip.setPathImage(pathPicture);
                                BufferedImage bISmallImage = Scalr.resize(bi, Method.ULTRA_QUALITY, 300, 150); // after this line my dimensions in bISmallImage are correct!
                                ImageIO.write(bISmallImage, "jpg", file);

                                Date date = new Date();
                                // Specify the desired date format
                                String DATE_FORMAT = "yyyy/MM/dd";
                                // Create object of SimpleDateFormat and pass the desired date format.
                                SimpleDateFormat sdf = new SimpleDateFormat(DATE_FORMAT);
                                /*
                                 * Use format method of SimpleDateFormat class to format the date.
                                 */
                                String dateAjoutPhoto = sdf.format(date);

                            } catch (IOException e) {

                            }
                            this.pack();
                        }
                    } else {
                        vip.setPathImage(pathPicture);
                    }

                    Date date = new Date();
                    // Specify the desired date format
                    String DATE_FORMAT = "yyyy/MM/dd";
                    // Create object of SimpleDateFormat and pass the desired date format.
                    SimpleDateFormat sdf = new SimpleDateFormat(DATE_FORMAT);
                    /*
                     * Use format method of SimpleDateFormat class to format the date.
                     */
                    String dateAjoutPhoto = sdf.format(date);

                    bdd.insererUnVip(vip);
                    monModele.ajoutLigne(vip);
                    Photographie photo;

                    int numVip = 0;
                    try {
                        numVip = bdd.searchVip(vip.getNom(), vip.getPrenomUsage());
                    } catch (Exception ex) {
                        Logger.getLogger(AjoutVip.class.getName()).log(Level.SEVERE, null, ex);
                    }

                    photo = new Photographie(numVip, vip.getNom() + ".jpg", dateAjoutPhoto);
                    try {
                        bdd.ajoutPhoto(photo, numVip);
                    } catch (Exception ex) {
                        Logger.getLogger(AjoutVip.class.getName()).log(Level.SEVERE, null, ex);
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(Appli.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            this.dispose();
        }
    }//GEN-LAST:event_valider

    private void nbEnfantsSliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_nbEnfantsSliderStateChanged
        int nbEnfantsValeur = nbEnfantsSlider.getValue();
        String nbEnfantsConverti;
        nbEnfantsConverti = String.valueOf(nbEnfantsValeur);

        nbEnfantsAffiche.setText(nbEnfantsConverti);
        nbEnfantsSlider.setMaximum(NB_ENFANTS_MAX);
        nbEnfantsSlider.setMinimum(NB_ENFANTS_MIN);
    }//GEN-LAST:event_nbEnfantsSliderStateChanged

    private void gestionDate(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_gestionDate
        char c = evt.getKeyChar();

        if (dateNaissance.getDocument().getLength() < 10) {
            if (!Character.isDigit(c)) {
                evt.consume();
            }
            if (dateNaissance.getDocument().getLength() == 4) {
                evt.setKeyChar('-');
            }
            if (dateNaissance.getDocument().getLength() == 7) {
                evt.setKeyChar('-');
            }

        } else {
            evt.consume();
        }
    }//GEN-LAST:event_gestionDate

    private void rienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rienActionPerformed
        if (acteur.isSelected() || realisateur.isSelected()) {
            rien.setSelected(false);
        }
    }//GEN-LAST:event_rienActionPerformed

    private void realisateurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_realisateurActionPerformed
        if (rien.isSelected()) {
            realisateur.setSelected(false);
        }
    }//GEN-LAST:event_realisateurActionPerformed

    private void acteurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acteurActionPerformed
        if (rien.isSelected()) {
            acteur.setSelected(false);
        }
    }//GEN-LAST:event_acteurActionPerformed

    public static void copyFileUsingStream(File source, File dest) throws IOException {
        InputStream is = null;
        OutputStream os = null;
        try {
            is = new FileInputStream(source);
            os = new FileOutputStream(dest);
            byte[] buffer = new byte[1024];
            int length;
            while ((length = is.read(buffer)) > 0) {
                os.write(buffer, 0, length);
            }
        } finally {
            is.close();
            os.close();
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox acteur;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox civilite;
    private javax.swing.JTextField dateNaissance;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField lieuNaissance;
    private javax.swing.JTextField nationalite;
    private javax.swing.JLabel nbEnfantsAffiche;
    private javax.swing.JSlider nbEnfantsSlider;
    private javax.swing.JTextField nom;
    private javax.swing.JTextField prenom;
    private javax.swing.JTextField prenomUsage;
    private javax.swing.JCheckBox realisateur;
    private javax.swing.JCheckBox rien;
    private javax.swing.JRadioButton sexeFemme;
    private javax.swing.JRadioButton sexeHomme;
    private javax.swing.JButton valider;
    // End of variables declaration//GEN-END:variables
    static final int NB_ENFANTS_MIN = 0;
    static final int NB_ENFANTS_MAX = 10;
    static MonModele monModele;
}
