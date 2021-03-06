/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;
import java.lang.Object;
import javax.swing.*;
import java.awt.*;


/**
 *
 * @author farnaz
 */
public class SpendingbyCategoryUI extends javax.swing.JFrame {

    /**
     * Creates new form ContactEditorUI
     */
    public SpendingbyCategoryUI() {
        initComponents();
        scaleLabelImageToOneThird(shoppingLabel);
        scaleLabelImageToOneThird(travelLabel);
        scaleLabelImageToOneThird(cashLabel);
        scaleLabelImageToOneThird(groceriesLabel);
        scaleLabelImageToOneThird(diningLabel);
        scaleLabelImageToOneThird(entertainmentLabel);
        scaleLabelImageToOneThird(feesLabel);
        scaleLabelImageToOneThird(homeLabel);
        scaleLabelImage(dollarLabel);
//        scaleButtonImage(returnHomeButton);
        

    }
    private void scaleLabelImageToOneThird(JLabel jlabel){
        ImageIcon icon = (ImageIcon)jlabel.getIcon();
        Image img = icon.getImage();
        Image imgScale = img.getScaledInstance(jlabel.getWidth()/3, jlabel.getHeight(), img.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon (imgScale);
        jlabel.setIcon(scaledIcon);
    }
    private void scaleLabelImage(JLabel jlabel){
        ImageIcon icon = (ImageIcon)jlabel.getIcon();
        Image img = icon.getImage();
        Image imgScale = img.getScaledInstance(jlabel.getWidth(), jlabel.getHeight(), img.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon (imgScale);
        jlabel.setIcon(scaledIcon);
    }
    private void scaleButtonImage(JButton jbutton){
        ImageIcon icon = (ImageIcon)jbutton.getIcon();
        Image img = icon.getImage();
        Image imgScale = img.getScaledInstance(jbutton.getWidth(), jbutton.getHeight(), img.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon (imgScale);
        jbutton.setIcon(scaledIcon);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        belowTypicalTextField = new javax.swing.JTextField();
        typicalSpendTextField = new javax.swing.JTextField();
        spentSofarTextField = new javax.swing.JTextField();
        belowTypicalLabel = new javax.swing.JLabel();
        typicalSpendLabel = new javax.swing.JLabel();
        spentSofarLabel = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        shoppingLabel = new javax.swing.JLabel();
        shoppingTextField = new javax.swing.JTextField();
        groceriesLabel = new javax.swing.JLabel();
        groceriesTextField = new javax.swing.JTextField();
        diningLabel = new javax.swing.JLabel();
        diningTextField = new javax.swing.JTextField();
        homeLabel = new javax.swing.JLabel();
        homeTextField = new javax.swing.JTextField();
        entertainmentLabel = new javax.swing.JLabel();
        entertainmentTextField = new javax.swing.JTextField();
        travelLabel = new javax.swing.JLabel();
        travelTextField = new javax.swing.JTextField();
        cashLabel = new javax.swing.JLabel();
        cashTextField = new javax.swing.JTextField();
        feesLabel = new javax.swing.JLabel();
        feesTextField = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        monthComboBox = new javax.swing.JComboBox<>();
        yearComboBox = new javax.swing.JComboBox<>();
        dollarLabel = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        spendingByCategoryLabel = new javax.swing.JLabel();
        returnHomeButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Spending by Category");

        jPanel1.setLayout(new java.awt.GridLayout(3, 4));

        jButton1.setText("ALL");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);

        jButton2.setText("WANTS");
        jPanel1.add(jButton2);

        jButton3.setText("NEEDS");
        jPanel1.add(jButton3);
        jPanel1.add(belowTypicalTextField);

        typicalSpendTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                typicalSpendTextFieldActionPerformed(evt);
            }
        });
        jPanel1.add(typicalSpendTextField);

        spentSofarTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                spentSofarTextFieldActionPerformed(evt);
            }
        });
        jPanel1.add(spentSofarTextField);

        belowTypicalLabel.setText("BELOW TYPICAL");
        jPanel1.add(belowTypicalLabel);

        typicalSpendLabel.setText("TYPICAL SPEND");
        jPanel1.add(typicalSpendLabel);

        spentSofarLabel.setText("SPENT SO FAR");
        jPanel1.add(spentSofarLabel);

        jPanel2.setLayout(new java.awt.GridLayout(8, 3));

        shoppingLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/Shopping.png"))); // NOI18N
        shoppingLabel.setText("Shopping");
        jPanel2.add(shoppingLabel);

        shoppingTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                shoppingTextFieldActionPerformed(evt);
            }
        });
        jPanel2.add(shoppingTextField);

        groceriesLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/Groceries.png"))); // NOI18N
        groceriesLabel.setText("Groceries");
        jPanel2.add(groceriesLabel);
        jPanel2.add(groceriesTextField);

        diningLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/Dining.png"))); // NOI18N
        diningLabel.setText("Dining Out");
        jPanel2.add(diningLabel);
        jPanel2.add(diningTextField);

        homeLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/Home.png"))); // NOI18N
        homeLabel.setText("Home");
        jPanel2.add(homeLabel);
        jPanel2.add(homeTextField);

        entertainmentLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/Entertainment.png"))); // NOI18N
        entertainmentLabel.setText("Entertainment");
        jPanel2.add(entertainmentLabel);

        entertainmentTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entertainmentTextFieldActionPerformed(evt);
            }
        });
        jPanel2.add(entertainmentTextField);

        travelLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/Travel.png"))); // NOI18N
        travelLabel.setText("Travel");
        jPanel2.add(travelLabel);
        jPanel2.add(travelTextField);

        cashLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/Cash.png"))); // NOI18N
        cashLabel.setText("Cash");
        jPanel2.add(cashLabel);

        cashTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cashTextFieldActionPerformed(evt);
            }
        });
        jPanel2.add(cashTextField);

        feesLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/Fees.jpg"))); // NOI18N
        feesLabel.setText("Fees");
        jPanel2.add(feesLabel);
        jPanel2.add(feesTextField);

        monthComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" }));
        monthComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                monthComboBoxActionPerformed(evt);
            }
        });

        yearComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2020", "2019", "2018", "2017", "2016", "2015", "2014", "2013", "2012", "2010", "2009", "2008", "2007", "2006", "2005", "2004", "2003", "2002", "2001", "2000" }));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(monthComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(yearComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(monthComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(yearComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        dollarLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/dollarMeter.jpg"))); // NOI18N
        dollarLabel.setText("jLabel1");

        spendingByCategoryLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        spendingByCategoryLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        spendingByCategoryLabel.setText("Spending by Category");

        returnHomeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/returnHome.jpg"))); // NOI18N
        returnHomeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnHomeButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(spendingByCategoryLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(79, 79, 79)
                .addComponent(returnHomeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(spendingByCategoryLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(returnHomeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 465, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(dollarLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dollarLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 478, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void monthComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_monthComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_monthComboBoxActionPerformed

    private void shoppingTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_shoppingTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_shoppingTextFieldActionPerformed

    private void entertainmentTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entertainmentTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_entertainmentTextFieldActionPerformed

    private void cashTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cashTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cashTextFieldActionPerformed

    private void typicalSpendTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_typicalSpendTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_typicalSpendTextFieldActionPerformed

    private void spentSofarTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_spentSofarTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_spentSofarTextFieldActionPerformed

    private void returnHomeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnHomeButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_returnHomeButtonActionPerformed

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
            java.util.logging.Logger.getLogger(SpendingbyCategoryUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SpendingbyCategoryUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SpendingbyCategoryUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SpendingbyCategoryUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SpendingbyCategoryUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel belowTypicalLabel;
    private javax.swing.JTextField belowTypicalTextField;
    private javax.swing.JLabel cashLabel;
    private javax.swing.JTextField cashTextField;
    private javax.swing.JLabel diningLabel;
    private javax.swing.JTextField diningTextField;
    private javax.swing.JLabel dollarLabel;
    private javax.swing.JLabel entertainmentLabel;
    private javax.swing.JTextField entertainmentTextField;
    private javax.swing.JLabel feesLabel;
    private javax.swing.JTextField feesTextField;
    private javax.swing.JLabel groceriesLabel;
    private javax.swing.JTextField groceriesTextField;
    private javax.swing.JLabel homeLabel;
    private javax.swing.JTextField homeTextField;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JComboBox<String> monthComboBox;
    private javax.swing.JButton returnHomeButton;
    private javax.swing.JLabel shoppingLabel;
    private javax.swing.JTextField shoppingTextField;
    private javax.swing.JLabel spendingByCategoryLabel;
    private javax.swing.JLabel spentSofarLabel;
    private javax.swing.JTextField spentSofarTextField;
    private javax.swing.JLabel travelLabel;
    private javax.swing.JTextField travelTextField;
    private javax.swing.JLabel typicalSpendLabel;
    private javax.swing.JTextField typicalSpendTextField;
    private javax.swing.JComboBox<String> yearComboBox;
    // End of variables declaration//GEN-END:variables
}
