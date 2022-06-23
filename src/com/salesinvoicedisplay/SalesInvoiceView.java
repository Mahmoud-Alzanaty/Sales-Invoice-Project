/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.salesinvoicedisplay;

import com.salesinvoicecontroller.Controller;
import com.salesinvoicemodel.Invoice;
import com.salesinvoicemodel.InvoicesGridModel;
import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JTable;

/**
 *
 * @author Heba
 */
public class SalesInvoiceView extends javax.swing.JFrame {

    /**
     * Creates new form SalesinvoiceScreen
     */
    public SalesInvoiceView() {
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

        jMenuItem1 = new javax.swing.JMenuItem();
        jScrollPane1 = new javax.swing.JScrollPane();
        invoiceGrid = new javax.swing.JTable();
        invoiceGrid.getSelectionModel().addListSelectionListener(controller);
        newInvoiceButton = new javax.swing.JButton();
        newInvoiceButton.addActionListener(controller);
        deleteInvoiceButton = new javax.swing.JButton();
        deleteInvoiceButton.addActionListener(controller);
        invoiceIdLabel = new javax.swing.JLabel();
        invoicedaydateLabel = new javax.swing.JLabel();
        customerNameLabel = new javax.swing.JLabel();
        invoiceAmountLabel = new javax.swing.JLabel();
        invoiceIdValueLabel = new javax.swing.JLabel();
        invoicedaydateValueLabel = new javax.swing.JLabel();
        customerNameValueLabel = new javax.swing.JLabel();
        invoiceAmountValueLabel = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        itemsGrid = new javax.swing.JTable();
        newItemButton = new javax.swing.JButton();
        newItemButton.addActionListener(controller);
        deleteItemButton = new javax.swing.JButton();
        deleteItemButton.addActionListener(controller);
        jMenuBar1 = new javax.swing.JMenuBar();
        fileMenuBar = new javax.swing.JMenu();
        loadFileMenuItem = new javax.swing.JMenuItem();
        loadFileMenuItem.addActionListener(controller);
        saveFileMenuItem = new javax.swing.JMenuItem();
        saveFileMenuItem.addActionListener(controller);

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        invoiceGrid.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(invoiceGrid);

        newInvoiceButton.setText("Create New Invoice");

        deleteInvoiceButton.setText("Delete Invoice");

        invoiceIdLabel.setText("Invoice Number");

        invoicedaydateLabel.setText("Invoice Date");

        customerNameLabel.setText("Customer Name");

        invoiceAmountLabel.setText("Invoice Total");

        itemsGrid.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(itemsGrid);

        newItemButton.setText("Create New Item");
        newItemButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newItemButtonActionPerformed(evt);
            }
        });

        deleteItemButton.setText("Delete Item");

        fileMenuBar.setText("File");

        loadFileMenuItem.setText("Load File");
        fileMenuBar.add(loadFileMenuItem);

        saveFileMenuItem.setText("Save File");
        fileMenuBar.add(saveFileMenuItem);

        jMenuBar1.add(fileMenuBar);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(newInvoiceButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(deleteInvoiceButton)
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(newItemButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(deleteItemButton)
                        .addGap(29, 29, 29))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(customerNameLabel)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(invoicedaydateLabel)
                                            .addComponent(invoiceIdLabel)
                                            .addComponent(invoiceAmountLabel))
                                        .addGap(35, 35, 35)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(invoiceAmountValueLabel)
                                            .addComponent(invoiceIdValueLabel)
                                            .addComponent(invoicedaydateValueLabel)
                                            .addComponent(customerNameValueLabel))))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(invoiceIdLabel)
                            .addComponent(invoiceIdValueLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(invoicedaydateLabel)
                            .addComponent(invoicedaydateValueLabel))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(customerNameLabel)
                            .addComponent(customerNameValueLabel))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(invoiceAmountLabel)
                            .addComponent(invoiceAmountValueLabel))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deleteInvoiceButton)
                    .addComponent(newItemButton)
                    .addComponent(deleteItemButton)
                    .addComponent(newInvoiceButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void newItemButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newItemButtonActionPerformed

    }//GEN-LAST:event_newItemButtonActionPerformed

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
            java.util.logging.Logger.getLogger(SalesInvoiceView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SalesInvoiceView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SalesInvoiceView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SalesInvoiceView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SalesInvoiceView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel customerNameLabel;
    private javax.swing.JLabel customerNameValueLabel;
    private javax.swing.JButton deleteInvoiceButton;
    private javax.swing.JButton deleteItemButton;
    private javax.swing.JMenu fileMenuBar;
    private javax.swing.JLabel invoiceAmountLabel;
    private javax.swing.JLabel invoiceAmountValueLabel;
    private javax.swing.JTable invoiceGrid;
    private javax.swing.JLabel invoiceIdLabel;
    private javax.swing.JLabel invoiceIdValueLabel;
    private javax.swing.JLabel invoicedaydateLabel;
    private javax.swing.JLabel invoicedaydateValueLabel;
    private javax.swing.JTable itemsGrid;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JMenuItem loadFileMenuItem;
    private javax.swing.JButton newInvoiceButton;
    private javax.swing.JButton newItemButton;
    private javax.swing.JMenuItem saveFileMenuItem;
    // End of variables declaration//GEN-END:variables

private ArrayList<Invoice> invoices;
private Controller controller = new Controller (this);
private InvoicesGridModel invoicesGridModel;

    public ArrayList<Invoice> getInvoices() {
        if (invoices == null) invoices = new ArrayList<>();
        System.out.println(invoices);
        return invoices;
    }

    public void setInvoices(ArrayList<Invoice> invoices) {
        this.invoices = invoices;
    }

    public InvoicesGridModel getInvoicesGridModel() {
         if (invoicesGridModel == null) {
            invoicesGridModel = new InvoicesGridModel(getInvoices());
        }
         System.out.println(invoices);
        return invoicesGridModel;
    }

    public void setInvoicesGridModel(InvoicesGridModel invoicesTableModel) {
        this.invoicesGridModel = invoicesTableModel;
    }

    public JLabel getcustomerNameValueLabel() {

        return customerNameValueLabel;
    }

    public void setcustomerNameValueLabel(JLabel customerNameValueLabel) {
        this.customerNameValueLabel = customerNameValueLabel;
    }

    public JLabel getinvoicedaydateValueLabel() {
        return invoicedaydateValueLabel;
    }

    public void setinvoicedaydateValueLabel(JLabel invoiceDateValueLabel) {
        this.invoicedaydateValueLabel = invoiceDateValueLabel;
    }

    public JLabel getinvoiceIdValueLabel() {
        return invoiceIdValueLabel;
    }

    public void setinvoiceIdValueLabel(JLabel invoiceNumberValueLabel) {
        this.invoiceIdValueLabel = invoiceNumberValueLabel;
    }

    public JTable getInvoGrid() {
        return invoiceGrid;
    }

    public void setInvoiceGrid(JTable invoiceTable) {
        this.invoiceGrid = invoiceTable;
    }

    public JLabel getinvoiceAmountValueLabel() {
        return invoiceAmountValueLabel;
    }

    public void setinvoiceAmountValueLabel(JLabel invoiceTotalValueLabel) {
        this.invoiceAmountValueLabel = invoiceTotalValueLabel;
    }

    public JTable getItemsGrid() {
        return itemsGrid;
    }

    public void setItemsGrid(JTable itemsTable) {
        this.itemsGrid = itemsTable;
    }

    public Controller getcontroller() {
        return controller;
    }
    
    public int getNextInvoiceId(){
    int num = 0;
    for (Invoice invoice : getInvoices()){
    if (invoice.getid()>num)
            num = invoice.getid();
    }
    return ++num;
    }
    

    public void setController(Controller controller) {
        this.controller = controller;
    }

   




}
