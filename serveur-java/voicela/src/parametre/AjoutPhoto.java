/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parametre;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import metier.Photographie;
import org.imgscalr.Scalr;
import org.imgscalr.Scalr.Method;
import static parametre.AjoutVip.copyFileUsingStream;

/**
 *
 * @author maxencebeno
 */
public class AjoutPhoto extends javax.swing.JDialog {

    /**
     * Creates new form AjoutPhoto
     */
    public AjoutPhoto(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        // Liste des fonctions
        listModelVIP = new javax.swing.DefaultListModel<>();
        listvip.setModel(listModelVIP);
        try {
            ajout.alimenterListeVIP(listModelVIP);
        } catch (Exception ex) {
            Logger.getLogger(AjoutPhoto.class.getName()).log(Level.SEVERE, null, ex);
        }

        listvip.setSelectedIndex(0);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listvip = new javax.swing.JList();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Sélectionnez le vip pour lequel vous voulez ajouter une photo : ");

        listvip.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(listvip);

        jButton1.setText("Ajouter une photo");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ajout(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 549, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(252, 252, 252)
                        .addComponent(jButton1)))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ajout(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ajout

        String selectedItem = listvip.getSelectedValue().toString();
        String name, surname, pathPicture;
        String[] split = selectedItem.split(" ");
        name = split[0];
        surname = split[1];
        int numVip = 0;
        try {
            numVip = ajout.searchVip(name, surname);
        } catch (Exception ex) {
            Logger.getLogger(AjoutPhoto.class.getName()).log(Level.SEVERE, null, ex);
        }
        
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
                            copyFileUsingStream(file, new File("../../client-web/files/" + split[0] + ".jpg"));
                            pathPicture = "files/" + split[0] + ".jpg";
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

                            Photographie photo;
                            photo = new Photographie(numVip, split[0] + ".jpg", dateAjoutPhoto);
                            try {
                                ajout.ajoutPhotoVip(photo);
                            } catch (SQLException ex) {
                                Logger.getLogger(AjoutPhoto.class.getName()).log(Level.SEVERE, null, ex);
                            }

                        } catch (IOException e) {

                        }
                        this.pack();
                    }
        dispose();
        
        
    }//GEN-LAST:event_ajout

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList listvip;
    // End of variables declaration//GEN-END:variables
    javax.swing.DefaultListModel<String> listModelVIP;
    AccesBD ajout = new AccesBD();
}
