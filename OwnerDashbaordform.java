
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author bilal
 */
public class OwnerDashbaordform extends javax.swing.JFrame {

    /**
     * Creates new form OwnerDashbaordform
     */
    public OwnerDashbaordform() {
        initComponents();
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
        btnmanageemployees = new javax.swing.JButton();
        btnlogout = new javax.swing.JButton();
        btnmanageproducts = new javax.swing.JButton();
        btnsalesreport = new javax.swing.JButton();
        btnmanagesuppliers = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 0, 0));
        jLabel1.setText("Owner Dashboard");

        btnmanageemployees.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnmanageemployees.setText("Manage Employees");
        btnmanageemployees.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmanageemployeesActionPerformed(evt);
            }
        });

        btnlogout.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnlogout.setText("Logout");
        btnlogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlogoutActionPerformed(evt);
            }
        });

        btnmanageproducts.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnmanageproducts.setText("Manage Products");
        btnmanageproducts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmanageproductsActionPerformed(evt);
            }
        });

        btnsalesreport.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnsalesreport.setText("View Sales Reports");
        btnsalesreport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsalesreportActionPerformed(evt);
            }
        });

        btnmanagesuppliers.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnmanagesuppliers.setText("Manage Suppliers");
        btnmanagesuppliers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmanagesuppliersActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(117, 117, 117)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnmanageemployees, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnmanagesuppliers, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 121, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnmanageproducts, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnsalesreport, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(117, 117, 117))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(263, 263, 263)
                        .addComponent(btnlogout, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(155, 155, 155)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(91, 91, 91)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnmanageproducts, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnmanageemployees, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnsalesreport, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnmanagesuppliers, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51)
                .addComponent(btnlogout, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(116, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnmanageemployeesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmanageemployeesActionPerformed
        Employeeform ef = new Employeeform();
        ef.setVisible(true);
    }//GEN-LAST:event_btnmanageemployeesActionPerformed

    private void btnsalesreportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalesreportActionPerformed
        ViewSalesReport vsr = new ViewSalesReport();
        vsr.setVisible(true);
    }//GEN-LAST:event_btnsalesreportActionPerformed

    private void btnmanageproductsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmanageproductsActionPerformed
        ManageProducts mp = new ManageProducts();
        mp.setVisible(true);
    }//GEN-LAST:event_btnmanageproductsActionPerformed

    private void btnmanagesuppliersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmanagesuppliersActionPerformed
        ManageSuppliers ms = new ManageSuppliers();
        ms.setVisible(true);
    }//GEN-LAST:event_btnmanagesuppliersActionPerformed

    private void btnlogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlogoutActionPerformed
        JOptionPane.showMessageDialog(null, "Logged out!");
        Loginform lf = new Loginform();
        lf.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnlogoutActionPerformed

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
            java.util.logging.Logger.getLogger(OwnerDashbaordform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OwnerDashbaordform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OwnerDashbaordform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OwnerDashbaordform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OwnerDashbaordform().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnlogout;
    private javax.swing.JButton btnmanageemployees;
    private javax.swing.JButton btnmanageproducts;
    private javax.swing.JButton btnmanagesuppliers;
    private javax.swing.JButton btnsalesreport;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
