/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1_tp4_colegio.Vistas;

import javax.swing.JOptionPane;
import lab1_tp4_colegio.Alumno;

/**
 *
 * @author Pat
 */
public class Fri_Alumno extends javax.swing.JInternalFrame {

   
    public Fri_Alumno() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtLegajo1 = new javax.swing.JTextField();
        lblApellido1 = new javax.swing.JLabel();
        lblLegajo1 = new javax.swing.JLabel();
        txtApellido1 = new javax.swing.JTextField();
        txtNombre1 = new javax.swing.JTextField();
        lblNombre1 = new javax.swing.JLabel();
        btnSalir1 = new javax.swing.JButton();
        btnGuardar1 = new javax.swing.JButton();
        btnNuevo1 = new javax.swing.JButton();
        lbMostrar = new javax.swing.JLabel();
        txtMostrar = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setBorder(null);
        setTitle("FORMULARIO ALUMNOS");
        setPreferredSize(new java.awt.Dimension(500, 500));

        txtLegajo1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtLegajo1.setPreferredSize(new java.awt.Dimension(295, 36));
        txtLegajo1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtLegajo1FocusLost(evt);
            }
        });
        txtLegajo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLegajo1ActionPerformed(evt);
            }
        });

        lblApellido1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblApellido1.setText("APELLIDO");
        lblApellido1.setPreferredSize(new java.awt.Dimension(125, 24));

        lblLegajo1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblLegajo1.setText("N??-LEGAJO");
        lblLegajo1.setName("lbllegajo"); // NOI18N
        lblLegajo1.setPreferredSize(new java.awt.Dimension(125, 24));

        txtApellido1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtApellido1.setPreferredSize(new java.awt.Dimension(295, 36));
        txtApellido1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellido1ActionPerformed(evt);
            }
        });

        txtNombre1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtNombre1.setPreferredSize(new java.awt.Dimension(295, 36));
        txtNombre1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombre1ActionPerformed(evt);
            }
        });

        lblNombre1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblNombre1.setText("NOMBRE");
        lblNombre1.setPreferredSize(new java.awt.Dimension(125, 24));

        btnSalir1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnSalir1.setText("SALIR");
        btnSalir1.setPreferredSize(new java.awt.Dimension(110, 32));
        btnSalir1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalir1ActionPerformed(evt);
            }
        });

        btnGuardar1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnGuardar1.setText("GUARDAR");
        btnGuardar1.setPreferredSize(new java.awt.Dimension(110, 32));
        btnGuardar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardar1ActionPerformed(evt);
            }
        });

        btnNuevo1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnNuevo1.setText("NUEVO");
        btnNuevo1.setPreferredSize(new java.awt.Dimension(110, 32));
        btnNuevo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevo1ActionPerformed(evt);
            }
        });

        lbMostrar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lbMostrar.setText("Mostrar Carga");

        txtMostrar.setPreferredSize(new java.awt.Dimension(440, 27));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lab1_tp4_colegio/Vistas/Recursos/Escudo uniG10-20porciento.png"))); // NOI18N
        jLabel1.setFocusable(false);
        jLabel1.setRequestFocusEnabled(false);
        jLabel1.setVerifyInputWhenFocusTarget(false);

        jLabel3.setText("Ingrese solo numeros");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnGuardar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(55, 55, 55)
                                .addComponent(btnNuevo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(55, 55, 55)
                                .addComponent(btnSalir1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblApellido1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblLegajo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblNombre1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(20, 20, 20)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNombre1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtLegajo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtApellido1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3)))
                            .addComponent(txtMostrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(180, 180, 180)
                        .addComponent(lbMostrar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(181, 181, 181)
                        .addComponent(jLabel1)))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLegajo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtLegajo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblApellido1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtApellido1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombre1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNombre1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnGuardar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnNuevo1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnSalir1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(37, 37, 37)
                .addComponent(lbMostrar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtMostrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalir1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalir1ActionPerformed
         //System.exit(0); -->Cierra todo el Programa
         this.dispose();  //--> Solo cierra la ventana actual
    }//GEN-LAST:event_btnSalir1ActionPerformed

    private void btnNuevo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevo1ActionPerformed
        txtLegajo1.setText("");txtApellido1.setText("");txtNombre1.setText("");txtMostrar.setText("");
    }//GEN-LAST:event_btnNuevo1ActionPerformed

    private void btnGuardar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardar1ActionPerformed
        boolean verifNum = this.txtLegajo1.getText().matches("[0-9]+");
        if (verifNum && (!txtNombre1.getText().equals("")) && (!txtApellido1.getText().equals(""))) {
            Frm_Colegio.getLisAlum().add(new Alumno(Integer.parseInt(txtLegajo1.getText()), txtApellido1.getText(), txtNombre1.getText()));
        txtMostrar.setText("Legajo:  "+txtLegajo1.getText()+" -Nombre y Apellido: "+txtNombre1.getText()+" "+txtApellido1.getText());
            JOptionPane.showMessageDialog(this, "Alumno Guardado Correctamente");
        } else {
            JOptionPane.showMessageDialog(this, "Los datos no son correctos\n o el alumno ya estaba cargado");
        }
        //Frm_Colegio.getLisAlum().add(new Alumno(Integer.parseInt(txtLegajo1.getText()), txtApellido1.getText(), txtNombre1.getText()));
        //txtMostrar.setText("Legajo:  "+txtLegajo1.getText()+" -Nombre y Apellido: "+txtNombre1.getText()+" "+txtApellido1.getText());
        
    }//GEN-LAST:event_btnGuardar1ActionPerformed

    private void txtLegajo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLegajo1ActionPerformed
                 String val= "[0-9]*";//exp regularesif(
       if(!txtLegajo1.getText().matches(val)){
       JOptionPane.showMessageDialog(this,"no ingreso un numero");
       txtLegajo1.requestFocus();}
    }//GEN-LAST:event_txtLegajo1ActionPerformed

    private void txtApellido1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellido1ActionPerformed
           if(txtApellido1.getText().length()== 0){
          JOptionPane.showMessageDialog(this,"debe llenar el campo");
       txtApellido1.requestFocus();
        
        }
    }//GEN-LAST:event_txtApellido1ActionPerformed

    private void txtNombre1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombre1ActionPerformed
                if(txtNombre1.getText().length()== 0){
          JOptionPane.showMessageDialog(this,"debe llenar el campo");
       txtNombre1.requestFocus();
        
        }
    }//GEN-LAST:event_txtNombre1ActionPerformed

    private void txtLegajo1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtLegajo1FocusLost
        String val= "[0-9]*";//exp regular
        if(!txtLegajo1.getText().matches(val) || txtLegajo1.getText().length() == 0){
            JOptionPane.showMessageDialog(this,"Ingrese un NUMERO\n-No deje el campo vac??o-");
            txtLegajo1.requestFocus();
        }
    }//GEN-LAST:event_txtLegajo1FocusLost


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar1;
    private javax.swing.JButton btnNuevo1;
    private javax.swing.JButton btnSalir1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lbMostrar;
    private javax.swing.JLabel lblApellido1;
    private javax.swing.JLabel lblLegajo1;
    private javax.swing.JLabel lblNombre1;
    private javax.swing.JTextField txtApellido1;
    private javax.swing.JTextField txtLegajo1;
    private javax.swing.JTextField txtMostrar;
    private javax.swing.JTextField txtNombre1;
    // End of variables declaration//GEN-END:variables
}
