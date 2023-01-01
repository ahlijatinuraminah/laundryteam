/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.laundrydailyclean;

/**
 *
 * @author Lenovo
 */
public class BiodataCustomer extends javax.swing.JFrame {

    /**
     * Creates new form BiodataCustomer
     */
    public BiodataCustomer() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LastNameLabel = new javax.swing.JLabel();
        inputLastName = new javax.swing.JTextField();
        inputAddress = new javax.swing.JTextField();
        addressLabel = new javax.swing.JLabel();
        inputPhone = new javax.swing.JTextField();
        phoneLabel = new javax.swing.JLabel();
        customerBioLabel = new javax.swing.JLabel();
        firstNameLabel = new javax.swing.JLabel();
        inputFirstName = new javax.swing.JTextField();
        backButton = new javax.swing.JButton();
        nextButton = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        LastNameLabel.setBackground(new java.awt.Color(0, 65, 110));
        LastNameLabel.setForeground(new java.awt.Color(0, 65, 110));
        LastNameLabel.setText("Last Name:");

        inputLastName.setBackground(new java.awt.Color(0, 65, 110));
        inputLastName.setForeground(new java.awt.Color(150, 210, 217));
        inputLastName.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        inputLastName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputLastNameActionPerformed(evt);
            }
        });

        inputAddress.setBackground(new java.awt.Color(0, 65, 110));
        inputAddress.setForeground(new java.awt.Color(150, 210, 217));
        inputAddress.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        inputAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputAddressActionPerformed(evt);
            }
        });

        addressLabel.setBackground(new java.awt.Color(0, 65, 110));
        addressLabel.setForeground(new java.awt.Color(0, 65, 110));
        addressLabel.setText("Address:");

        inputPhone.setBackground(new java.awt.Color(0, 65, 110));
        inputPhone.setForeground(new java.awt.Color(150, 210, 217));
        inputPhone.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        phoneLabel.setBackground(new java.awt.Color(0, 65, 110));
        phoneLabel.setForeground(new java.awt.Color(0, 65, 110));
        phoneLabel.setText("Phone:");

        customerBioLabel.setBackground(new java.awt.Color(0, 65, 110));
        customerBioLabel.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        customerBioLabel.setForeground(new java.awt.Color(0, 65, 110));
        customerBioLabel.setText("Customer's Bio");

        firstNameLabel.setBackground(new java.awt.Color(0, 65, 110));
        firstNameLabel.setForeground(new java.awt.Color(0, 65, 110));
        firstNameLabel.setText("First Name:");

        inputFirstName.setBackground(new java.awt.Color(0, 65, 110));
        inputFirstName.setForeground(new java.awt.Color(150, 210, 217));
        inputFirstName.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        backButton.setBackground(new java.awt.Color(0, 65, 110));
        backButton.setIcon(new javax.swing.ImageIcon("C:\\Users\\Lenovo\\OneDrive\\Documents\\PROJECT AKHIR\\New Project\\laundryteam3\\src\\main\\java\\Image\\outline_navigate_before_white_36dp.png")); // NOI18N
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        nextButton.setBackground(new java.awt.Color(0, 65, 110));
        nextButton.setIcon(new javax.swing.ImageIcon("C:\\Users\\Lenovo\\OneDrive\\Documents\\PROJECT AKHIR\\New Project\\laundryteam3\\src\\main\\java\\Image\\round_navigate_next_white_36dp.png")); // NOI18N
        nextButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextButtonActionPerformed(evt);
            }
        });

        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\Lenovo\\OneDrive\\Documents\\PROJECT AKHIR\\New Project\\laundryteam3\\src\\main\\java\\Image\\biodataIcon.png")); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(backButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(nextButton)
                .addGap(29, 29, 29))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(101, 101, 101))
            .addGroup(layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(customerBioLabel)
                .addContainerGap(71, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(26, 26, 26)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(LastNameLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(inputLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(firstNameLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(inputFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(phoneLabel)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(inputPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(addressLabel)
                                    .addGap(18, 18, 18)
                                    .addComponent(inputAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(1, 1, 1)))
                    .addContainerGap(27, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(customerBioLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 188, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(backButton)
                    .addComponent(nextButton))
                .addGap(23, 23, 23))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(163, 163, 163)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(firstNameLabel)
                        .addComponent(inputFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(LastNameLabel)
                        .addComponent(inputLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(addressLabel)
                        .addComponent(inputAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(phoneLabel)
                        .addComponent(inputPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(103, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void inputAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputAddressActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
    OpsiLayanan back = new OpsiLayanan();
    back.setVisible(true);
    back.setLocationRelativeTo(null);
    this.setVisible(false);        // TODO add your handling code here:
    }//GEN-LAST:event_backButtonActionPerformed

    private void nextButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextButtonActionPerformed
    //Buat variabel
    NotaPembayaran sendData = new NotaPembayaran();

    
    //Pindah Frame
    KalkulasiHargaLaundry next = new KalkulasiHargaLaundry();
    next.setVisible(true);
    next.setLocationRelativeTo(null);
    this.setVisible(false);
    //Titip data buat diteruskan ke NotaPembayaran.java
    next.titipNama = ": " + inputFirstName.getText() + " " + inputLastName.getText();
    next.titipAlamat = (": " + inputAddress.getText());
    next.titipHP = (": " + inputPhone.getText());
    }//GEN-LAST:event_nextButtonActionPerformed

    private void inputLastNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputLastNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputLastNameActionPerformed

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
            java.util.logging.Logger.getLogger(BiodataCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BiodataCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BiodataCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BiodataCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BiodataCustomer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LastNameLabel;
    private javax.swing.JLabel addressLabel;
    private javax.swing.JButton backButton;
    private javax.swing.JLabel customerBioLabel;
    private javax.swing.JLabel firstNameLabel;
    private javax.swing.JTextField inputAddress;
    private javax.swing.JTextField inputFirstName;
    private javax.swing.JTextField inputLastName;
    private javax.swing.JTextField inputPhone;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JButton nextButton;
    private javax.swing.JLabel phoneLabel;
    // End of variables declaration//GEN-END:variables
}
