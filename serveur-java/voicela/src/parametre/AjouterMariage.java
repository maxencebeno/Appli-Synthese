/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parametre;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import metier.Mariage;

/**
 *
 * @author maxencebeno
 */
public class AjouterMariage extends javax.swing.JDialog {

    /**
     * Creates new form ModifierMariage
     */
    public AjouterMariage(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        listModelVIP1 = new javax.swing.DefaultListModel<>();
        listvip1.setModel(listModelVIP1);
        try {
            ajout.alimenterListeVIP(listModelVIP1);
        } catch (Exception ex) {
            Logger.getLogger(AjoutPhoto.class.getName()).log(Level.SEVERE, null, ex);
        }

        listvip1.setSelectedIndex(0);

        listModelVIP2 = new javax.swing.DefaultListModel<>();
        listvip2.setModel(listModelVIP2);
        try {
            ajout.alimenterListeVIP(listModelVIP2);
        } catch (Exception ex) {
            Logger.getLogger(AjoutPhoto.class.getName()).log(Level.SEVERE, null, ex);
        }

        listvip2.setSelectedIndex(0);
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
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        listvip1 = new javax.swing.JList();
        jScrollPane2 = new javax.swing.JScrollPane();
        listvip2 = new javax.swing.JList();
        lieu = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        dateMariage = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("AJOUTER UN MARIAGE");

        jLabel1.setText("Nom du Vip 1 :");

        jLabel2.setText("Nom du vip 2 : ");

        jButton1.setText("Marier");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ajouterMariage(evt);
            }
        });

        listvip1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(listvip1);

        listvip2.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane2.setViewportView(listvip2);

        jLabel3.setText("Lieu du mariage : ");

        jLabel4.setText("Date du mariage : ");

        dateMariage.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                dateMariageKeyTyped(evt);
            }
        });

        jLabel5.setText("AAAA-MM-JJ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(67, 67, 67)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                    .addComponent(lieu)
                    .addComponent(dateMariage))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(257, 257, 257)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lieu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(dateMariage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ajouterMariage(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ajouterMariage
        String vip1, vip2, lieuMariage;
        String[] vipArray1;
        String[] vipArray2;
        String nomVip1, nomVip2, prenomVip1, prenomVip2;
        int numVip1 = 0, numVip2 = 0;
        boolean verifMariage = false, mariageSolo = false, dejaMarie = false;

        lieuMariage = lieu.getText();
        if (lieuMariage == null) {
            javax.swing.JOptionPane.showMessageDialog(
                    this,
                    "Erreur : vous n'avez pas entré de lieu pour ce mariage",
                    "Erreur",
                    javax.swing.JOptionPane.ERROR_MESSAGE
            );
        }
        
        String dateDuMariage;
        dateDuMariage = dateMariage.getText();
        if (dateDuMariage == null) {
            javax.swing.JOptionPane.showMessageDialog(
                    this,
                    "Erreur : vous n'avez pas entré de date pour ce mariage",
                    "Erreur",
                    javax.swing.JOptionPane.ERROR_MESSAGE
            );
        }
        
        vip1 = listvip1.getSelectedValue().toString();
        vip2 = listvip2.getSelectedValue().toString();

        vipArray1 = vip1.split(" ");
        nomVip1 = vipArray1[0];
        prenomVip1 = vipArray1[1];

        vipArray2 = vip2.split(" ");
        nomVip2 = vipArray2[0];
        prenomVip2 = vipArray2[1];

        
        try {
            numVip1 = ajout.searchVip(nomVip1, prenomVip1);
        } catch (Exception ex) {
            Logger.getLogger(AjouterMariage.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            numVip2 = ajout.searchVip(nomVip2, prenomVip2);
        } catch (Exception ex) {
            Logger.getLogger(AjouterMariage.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            verifMariage = ajout.searchMariage(numVip1, numVip2);
        } catch (Exception ex) {
            Logger.getLogger(AjouterMariage.class.getName()).log(Level.SEVERE, null, ex);
        }
        String nomMarie = null;
        String nomMarie2 = null;
        try {
            nomMarie = ajout.lireLesCouples(numVip1);
        } catch (Exception ex) {
            Logger.getLogger(AjouterMariage.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            nomMarie2 = ajout.lireLesCouples(numVip1);
        } catch (Exception ex) {
            Logger.getLogger(AjouterMariage.class.getName()).log(Level.SEVERE, null, ex);
        }
        if(nomMarie.compareTo("Célibataire") != 0 || nomMarie2.compareTo("Célibataire") != 0) {
            dejaMarie = true;
        }
        
        
        if(numVip1 == numVip2) {
            mariageSolo = true;
        }
        if (verifMariage == true && mariageSolo == false && dejaMarie == false) {
            int result = javax.swing.JOptionPane.showConfirmDialog(
                    this,
                    "Voici le mariage que vous êtes sur le point d'insérer : \n"
                    + nomVip1 + " "
                    + prenomVip1 + " est sur le point de se marier avec "
                    + nomVip2 + " "
                    + prenomVip2 + ".\n"
                    + "Ils se sont mariés le : "
                    + dateDuMariage
                    + " à "
                    + lieuMariage
                    + ".\nEtes vous sur de ceci?",
                    "Confirmation mariage",
                    javax.swing.JOptionPane.OK_CANCEL_OPTION
            );
            if (result == javax.swing.JOptionPane.OK_OPTION) {
                Mariage mariage;
                mariage = new Mariage();

                mariage.setDivorce(false);
                mariage.setMarie1(numVip1);
                mariage.setMarie2(numVip2);
                mariage.setDateMariage(dateDuMariage);
                mariage.setLieuMariage(lieuMariage);
                mariage.setDateDivorce(null);
                
                Mariage mariage2;
                mariage2 = new Mariage();

                mariage2.setDivorce(false);
                mariage2.setMarie1(numVip2);
                mariage2.setMarie2(numVip1);
                mariage2.setDateMariage(dateDuMariage);
                mariage2.setLieuMariage(lieuMariage);
                mariage2.setDateDivorce(null);
                
                try {
                    ajout.insererUnMariage(mariage);
                } catch (SQLException ex) {
                    Logger.getLogger(AjouterMariage.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                try {
                    ajout.insererUnMariage(mariage2);
                } catch (SQLException ex) {
                    Logger.getLogger(AjouterMariage.class.getName()).log(Level.SEVERE, null, ex);
                }
                dispose();
            }
        } else if(verifMariage == false && mariageSolo == false || dejaMarie == true) {
            javax.swing.JOptionPane.showMessageDialog(
                    this,
                    "Erreur, ces VIPs sont déjà mariés.",
                    "Conflits de mariages",
                    javax.swing.JOptionPane.ERROR_MESSAGE
            );
        } else {
            javax.swing.JOptionPane.showMessageDialog(
                    this,
                    "Erreur, un vip ne peut pas se marier avec lui-même.",
                    "Conflits de mariages",
                    javax.swing.JOptionPane.ERROR_MESSAGE
            );
        }

    }//GEN-LAST:event_ajouterMariage

    private void dateMariageKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dateMariageKeyTyped
        char c = evt.getKeyChar();
        int jj, mm, aaaa;

        if (dateMariage.getDocument().getLength() < 10) {
            if (!Character.isDigit(c)) {
                evt.consume();
            }
            if (dateMariage.getDocument().getLength() == 4) {
                evt.setKeyChar('-');
            }
            if (dateMariage.getDocument().getLength() == 7) {
                evt.setKeyChar('-');
            }

        } else {
            evt.consume();
        }
    }//GEN-LAST:event_dateMariageKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField dateMariage;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField lieu;
    private javax.swing.JList listvip1;
    private javax.swing.JList listvip2;
    // End of variables declaration//GEN-END:variables
    javax.swing.DefaultListModel<String> listModelVIP1;
    javax.swing.DefaultListModel<String> listModelVIP2;
    AccesBD ajout = new AccesBD();
}
