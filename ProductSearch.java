import java.util.List;
import java.sql.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ProductSearch extends javax.swing.JFrame {
    ConnectionToDB con = new ConnectionToDB();
    Connection con_obj = con.EstablishConnection();
    PreparedStatement pstmt = null;
    ResultSet res = null;
    Map<String, Integer> customerMap = new HashMap<>();
    
    public ProductSearch() {
        initComponents();
        loadCustomers();
        comboCustomer.setEditable(true);
    }
    
    public void loadCustomers() {
        try {
        String sql = "SELECT Customer_ID, Customer_Name FROM Customer";
        pstmt = con_obj.prepareStatement(sql);
        res = pstmt.executeQuery();
        comboCustomer.removeAllItems();
    customerMap.clear();

    while (res.next()) {
        int id = res.getInt("Customer_ID");
        String name = res.getString("Customer_Name");

        comboCustomer.addItem(name);
        customerMap.put(name, id);
    }

    res.close();
    pstmt.close();
} catch (Exception e) {
    e.printStackTrace();
    JOptionPane.showMessageDialog(this, "Failed to load customers.");
}
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtSearch = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblSearchResults = new javax.swing.JTable();
        btnAddtoCart = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblCart = new javax.swing.JTable();
        btnRemovefromcart = new javax.swing.JButton();
        btnUpdateCart = new javax.swing.JButton();
        btnGenerateInvoice = new javax.swing.JButton();
        comboCustomer = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        btnback = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("Product Name");

        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        tblSearchResults.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Product_ID", "Prod_Name", "Price", "Stck_Quantity"
            }
        ));
        jScrollPane1.setViewportView(tblSearchResults);

        btnAddtoCart.setText("Add to Cart");
        btnAddtoCart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddtoCartActionPerformed(evt);
            }
        });

        tblCart.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Prod_ID", "Prod_Name", "Price", "Quantity", "SubTotal"
            }
        ));
        jScrollPane2.setViewportView(tblCart);

        btnRemovefromcart.setText("Remove from Cart");
        btnRemovefromcart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemovefromcartActionPerformed(evt);
            }
        });

        btnUpdateCart.setText("Update Cart");
        btnUpdateCart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateCartActionPerformed(evt);
            }
        });

        btnGenerateInvoice.setText("Generate Invoice");
        btnGenerateInvoice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerateInvoiceActionPerformed(evt);
            }
        });

        comboCustomer.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboCustomerActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 0, 0));
        jLabel2.setText("Invoice Generation");

        btnback.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnback.setText("<- BACK");
        btnback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addComponent(btnSearch)
                        .addGap(90, 90, 90)
                        .addComponent(btnAddtoCart))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnRemovefromcart)
                        .addGap(37, 37, 37))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnGenerateInvoice)
                        .addGap(195, 195, 195))))
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(comboCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(176, 176, 176))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(266, 266, 266)
                        .addComponent(btnback)
                        .addGap(19, 19, 19))))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(580, Short.MAX_VALUE)
                    .addComponent(btnUpdateCart)
                    .addGap(292, 292, 292)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(btnback))
                .addGap(71, 71, 71)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSearch)
                            .addComponent(btnAddtoCart))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(comboCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(btnRemovefromcart)
                        .addGap(19, 19, 19)
                        .addComponent(btnGenerateInvoice)
                        .addGap(18, 18, 18))))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(608, Short.MAX_VALUE)
                    .addComponent(btnUpdateCart)
                    .addGap(68, 68, 68)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed

    try {
        String keyword = txtSearch.getText();
        String sql = "SELECT Product_ID, Product_Name, Price, Stock_Quantity FROM Product WHERE Product_Name LIKE ? OR Product_ID LIKE ?";
        pstmt = con_obj.prepareStatement(sql);
        pstmt.setString(1, "%" + keyword + "%");
        pstmt.setString(2, "%" + keyword + "%");

        res = pstmt.executeQuery();
        DefaultTableModel model = (DefaultTableModel) tblSearchResults.getModel();
        model.setRowCount(0); // clear table

        while (res.next()) {
            model.addRow(new Object[]{
                res.getInt("Product_ID"),
                res.getString("Product_Name"),
                res.getDouble("Price"),
                res.getInt("Stock_Quantity")
            });
        }

        res.close();
        pstmt.close();
    } 
    catch (Exception e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Failed to search products.");
    }
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnAddtoCartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddtoCartActionPerformed
           
    int selectedRow = tblSearchResults.getSelectedRow();
    if (selectedRow == -1) {
        JOptionPane.showMessageDialog(this, "Please select a product to add.");
        return;
    }

    Object productIdObj = tblSearchResults.getValueAt(selectedRow, 0);
    Object productNameObj = tblSearchResults.getValueAt(selectedRow, 1);
    Object priceObj = tblSearchResults.getValueAt(selectedRow, 2);

    // Null checks
    if (productIdObj == null || productNameObj == null || priceObj == null) {
        JOptionPane.showMessageDialog(this, "Selected product has incomplete information. Please choose another.");
        return;
    }

    int productId;
    String productName;
    double price;

    try {
        productId = (int) productIdObj;
        productName = productNameObj.toString();
        price = Double.parseDouble(priceObj.toString());
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Invalid product data. Please try again.");
        return;
    }

    String qtyStr = JOptionPane.showInputDialog(this, "Enter quantity:");
    if (qtyStr == null || qtyStr.isEmpty()) return;

    int quantity;
    try {
        quantity = Integer.parseInt(qtyStr);
        if (quantity <= 0) {
            JOptionPane.showMessageDialog(this, "Quantity must be greater than zero.");
            return;
        }
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Please enter a valid number for quantity.");
        return;
    }

    double subtotal = price * quantity;

    DefaultTableModel cartModel = (DefaultTableModel) tblCart.getModel();
    cartModel.addRow(new Object[]{productId, productName, price, quantity, subtotal});
    }//GEN-LAST:event_btnAddtoCartActionPerformed

    private void btnUpdateCartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateCartActionPerformed

    int selectedRow = tblCart.getSelectedRow();
    if (selectedRow == -1) {
        JOptionPane.showMessageDialog(this, "Please select a cart item to update.");
        return;
    }

    String newQtyStr = JOptionPane.showInputDialog(this, "Enter new quantity:");
    if (newQtyStr == null || newQtyStr.isEmpty()) return;

    try {
        int newQty = Integer.parseInt(newQtyStr);
        double unitPrice = (double) tblCart.getValueAt(selectedRow, 2); // Assuming unit price is column 2
        double newSubtotal = newQty * unitPrice;

        tblCart.setValueAt(newQty, selectedRow, 3);       // Column 3 → Quantity
        tblCart.setValueAt(newSubtotal, selectedRow, 4);  // Column 4 → Subtotal
    } 
    catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Invalid quantity.");
    }

    }//GEN-LAST:event_btnUpdateCartActionPerformed

    private void btnRemovefromcartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemovefromcartActionPerformed

    int selectedRow = tblCart.getSelectedRow();
    if (selectedRow == -1) {
        JOptionPane.showMessageDialog(this, "Please select a cart item to remove.");
        return;
    }

    DefaultTableModel model = (DefaultTableModel) tblCart.getModel();
    model.removeRow(selectedRow);

    JOptionPane.showMessageDialog(this, "Item removed from cart.");


    }//GEN-LAST:event_btnRemovefromcartActionPerformed

    private void btnGenerateInvoiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerateInvoiceActionPerformed
    try {
        System.out.println("Checking database connection...");
        if (con_obj == null || con_obj.isClosed()) {
            throw new SQLException("Database connection is null or closed.");
        }

        String enteredName = (comboCustomer.getEditor().getItem() != null)
                ? ((String) comboCustomer.getEditor().getItem()).trim()
                : "";

        if (enteredName.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter customer name.");
            return;
        }

        int customerId;
        if (customerMap.containsKey(enteredName)) {
            customerId = customerMap.get(enteredName);
        } else {
            String insertCustomerSQL = "INSERT INTO Customer (Customer_Name) VALUES (?)";
            PreparedStatement pstCustomer = con_obj.prepareStatement(insertCustomerSQL, Statement.RETURN_GENERATED_KEYS);
            pstCustomer.setString(1, enteredName);

            if (pstCustomer.executeUpdate() == 0) {
                throw new SQLException("Creating customer failed, no rows affected.");
            }

            ResultSet rs = pstCustomer.getGeneratedKeys();
            if (rs.next()) {
                customerId = rs.getInt(1);
                customerMap.put(enteredName, customerId);
                comboCustomer.addItem(enteredName);
            } else {
                throw new SQLException("Creating customer failed, no ID obtained.");
            }

            rs.close();
            pstCustomer.close();
        }

        DefaultTableModel model = (DefaultTableModel) tblCart.getModel();
        if (model == null || model.getRowCount() == 0) {
            JOptionPane.showMessageDialog(this, "Cart is empty.");
            return;
        }

        // Filter out invalid rows
        List<Integer> validRows = new ArrayList<>();
        double totalAmount = 0.0;
        for (int i = 0; i < model.getRowCount(); i++) {
            if (model.getValueAt(i, 0) == null) {
                System.out.println("Skipping row " + i + " with null Product_ID.");
                continue;
            }
            totalAmount += (double) model.getValueAt(i, 4);
            validRows.add(i);
        }

        if (validRows.isEmpty()) {
            JOptionPane.showMessageDialog(this, "All cart items are invalid.");
            return;
        }

        // Insert into Sale table
        String sqlInvoice = "INSERT INTO Sale (Inv_Date, Customer_ID, Total_Amount) VALUES (?, ?, ?)";
        PreparedStatement pstInvoice = con_obj.prepareStatement(sqlInvoice, Statement.RETURN_GENERATED_KEYS);
        pstInvoice.setDate(1, new java.sql.Date(System.currentTimeMillis()));
        pstInvoice.setInt(2, customerId);
        pstInvoice.setDouble(3, totalAmount);

        if (pstInvoice.executeUpdate() == 0) {
            throw new SQLException("Failed to insert into Sale table.");
        }

        ResultSet generatedKeys = pstInvoice.getGeneratedKeys();
        int saleId = -1;
        if (generatedKeys.next()) {
            saleId = generatedKeys.getInt(1);
        } else {
            throw new SQLException("Failed to retrieve Sale ID.");
        }

        generatedKeys.close();
        pstInvoice.close();

        // Insert into InvoiceDetails (using Invoice_ID, NOT internal Sale_ID)
        String sqlDetail = "INSERT INTO InvoiceDetails (Invoice_ID, Product_ID, Quantity, Unit_Price, Sub_Total) VALUES (?, ?, ?, ?, ?)";
        PreparedStatement pstDetail = con_obj.prepareStatement(sqlDetail);

        for (int i : validRows) {
            int productId = (int) model.getValueAt(i, 0);
            double unitPrice = (double) model.getValueAt(i, 2);
            int quantity = (int) model.getValueAt(i, 3);
            double subtotal = (double) model.getValueAt(i, 4);

            pstDetail.setInt(1, saleId);         // Invoice_ID → Sale.Sale_ID
            pstDetail.setInt(2, productId);
            pstDetail.setInt(3, quantity);
            pstDetail.setDouble(4, unitPrice);
            pstDetail.setDouble(5, subtotal);
            pstDetail.addBatch();
        }

        int[] batchResults = pstDetail.executeBatch();
        for (int result : batchResults) {
            if (result == Statement.EXECUTE_FAILED) {
                throw new SQLException("Insert failed for one or more invoice items.");
            }
        }

        pstDetail.close();
        
        String updateStockSQL = "UPDATE Product SET Stock_Quantity = Stock_Quantity - ? WHERE Product_ID = ?";
PreparedStatement pstUpdateStock = con_obj.prepareStatement(updateStockSQL);

for (int i : validRows) {
    int productId = (int) model.getValueAt(i, 0);
    int quantity = (int) model.getValueAt(i, 3);

    pstUpdateStock.setInt(1, quantity);
    pstUpdateStock.setInt(2, productId);
    pstUpdateStock.addBatch();
}

int[] updateResults = pstUpdateStock.executeBatch();

for (int result : updateResults) {
    if (result == Statement.EXECUTE_FAILED) {
        throw new SQLException("Failed to update stock for one or more products.");
    }
}

pstUpdateStock.close();

        
        JOptionPane.showMessageDialog(this, "Invoice generated successfully!");
        model.setRowCount(0); // Clear cart

    } catch (Exception e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Failed to generate invoice: " + e.getMessage());
    }
    }//GEN-LAST:event_btnGenerateInvoiceActionPerformed

    private void comboCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboCustomerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboCustomerActionPerformed

    private void btnbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbackActionPerformed
        CashierDashboard cd = new CashierDashboard();
        cd.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnbackActionPerformed
    
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
            java.util.logging.Logger.getLogger(ProductSearch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProductSearch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProductSearch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProductSearch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProductSearch().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddtoCart;
    private javax.swing.JButton btnGenerateInvoice;
    private javax.swing.JButton btnRemovefromcart;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnUpdateCart;
    private javax.swing.JButton btnback;
    private javax.swing.JComboBox<String> comboCustomer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblCart;
    private javax.swing.JTable tblSearchResults;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
