/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.unir.farmacia.views;

/**
 *
 * @author Juan David Naranjo
 */
public class PrintView extends javax.swing.JFrame {
    FarmaciaView farmacia;
    /**
     * Creates new form PrintView
     */
    public PrintView (FarmaciaView farmacia) {
        initComponents();
        this.farmacia = farmacia;
        printMessage();
    }
    
    private void printMessage(){
        String address = "";
        if(this.farmacia.brand1.isSelected()){
            address = address + "Calle de la Rosa N. 28";
        }
        
        if(this.farmacia.brand2.isSelected()){
            if(this.farmacia.brand1.isSelected()){
                address = address + " y ";
            }
            address = address + "Calle Alcazabilla N. 3";
        }
        
        labelInfo.setText(this.farmacia.cantField.getText() + " unidades del " + String.valueOf(this.farmacia.typeField.getSelectedItem()) + " " + this.farmacia.nameField.getText());
        labelAddress.setText("Para la farmacia situada en: " + address);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelInfo = new javax.swing.JLabel();
        labelAddress = new javax.swing.JLabel();
        btnCancel = new javax.swing.JButton();
        btnSend = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labelInfo.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        labelAddress.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        btnCancel.setBackground(new java.awt.Color(255, 153, 153));
        btnCancel.setText("Cancelar pedido");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        btnSend.setBackground(new java.awt.Color(153, 153, 255));
        btnSend.setText("Enviar pedido");
        btnSend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSendActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelAddress, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(btnSend, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(455, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(labelInfo)
                .addGap(18, 18, 18)
                .addComponent(labelAddress)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancel)
                    .addComponent(btnSend))
                .addContainerGap(66, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnSendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSendActionPerformed
        System.out.println("Pedido enviado");
    }//GEN-LAST:event_btnSendActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnSend;
    private javax.swing.JLabel labelAddress;
    private javax.swing.JLabel labelInfo;
    // End of variables declaration//GEN-END:variables
}
