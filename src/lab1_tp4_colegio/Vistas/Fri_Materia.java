package lab1_tp4_colegio.Vistas;

import javax.swing.JOptionPane;
import lab1_tp4_colegio.Materia;


/**
 * @author Pat
 */
public class Fri_Materia extends javax.swing.JInternalFrame {

    
    public Fri_Materia() {
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

        lbIdM = new javax.swing.JLabel();
        lbNombreM = new javax.swing.JLabel();
        lbAnioM = new javax.swing.JLabel();
        txtIdM = new javax.swing.JTextField();
        txtNombreM = new javax.swing.JTextField();
        txtAnioM = new javax.swing.JTextField();
        bGuardar = new javax.swing.JButton();
        bNuevo = new javax.swing.JButton();
        bSalir = new javax.swing.JButton();
        lbMostrarM = new javax.swing.JLabel();
        txtMostrarM = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setTitle("FORMULARIO MATERIA");
        setPreferredSize(new java.awt.Dimension(500, 500));

        lbIdM.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lbIdM.setText("CODIGO-ID");
        lbIdM.setPreferredSize(new java.awt.Dimension(125, 24));

        lbNombreM.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lbNombreM.setText("NOMBRE-Mat");
        lbNombreM.setPreferredSize(new java.awt.Dimension(125, 24));

        lbAnioM.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lbAnioM.setText("AÑO-Cursada");
        lbAnioM.setPreferredSize(new java.awt.Dimension(125, 24));

        txtIdM.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtIdM.setPreferredSize(new java.awt.Dimension(295, 36));

        txtNombreM.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtNombreM.setPreferredSize(new java.awt.Dimension(295, 36));

        txtAnioM.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtAnioM.setPreferredSize(new java.awt.Dimension(295, 36));

        bGuardar.setText("GUARDAR");
        bGuardar.setPreferredSize(new java.awt.Dimension(110, 32));
        bGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bGuardarActionPerformed(evt);
            }
        });

        bNuevo.setText("NUEVO");
        bNuevo.setPreferredSize(new java.awt.Dimension(110, 32));
        bNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bNuevoActionPerformed(evt);
            }
        });

        bSalir.setText("SALIR");
        bSalir.setPreferredSize(new java.awt.Dimension(110, 32));
        bSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSalirActionPerformed(evt);
            }
        });

        lbMostrarM.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lbMostrarM.setText("Mostrar Carga");

        txtMostrarM.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtMostrarM.setPreferredSize(new java.awt.Dimension(440, 27));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lab1_tp4_colegio/Vistas/Recursos/Escudo uniG10-20porciento.png"))); // NOI18N
        jLabel1.setPreferredSize(new java.awt.Dimension(100, 100));

        jLabel2.setText("Ingrese solo numeros");

        jLabel3.setText("Ingrese solo numeros");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(bGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(55, 55, 55)
                                        .addComponent(bNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(bSalir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(157, 157, 157)
                                        .addComponent(lbMostrarM))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(lbNombreM, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(lbAnioM, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(lbIdM, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(20, 20, 20)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtIdM, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(txtNombreM, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(txtAnioM, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel2)
                                                    .addComponent(jLabel3))
                                                .addGap(0, 0, Short.MAX_VALUE))))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(181, 181, 181)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 28, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(txtMostrarM, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbIdM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtIdM, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbNombreM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombreM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAnioM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbAnioM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bSalir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addComponent(lbMostrarM)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtMostrarM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bNuevoActionPerformed
        txtMostrarM.setText("");txtIdM.setText("");txtNombreM.setText("");txtAnioM.setText("");        // TODO add your handling code here:
    }//GEN-LAST:event_bNuevoActionPerformed

    private void bSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSalirActionPerformed
         //System.exit(0); -->Cierra todo el Programa
         this.dispose(); //--> Solo cierra la ventana actual
    }//GEN-LAST:event_bSalirActionPerformed

    private void bGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bGuardarActionPerformed
        //chequear si la materia ya estaba.. 
        boolean verifNum = this.txtIdM.getText().matches("[0-9]+");
        boolean verifNum2 = this.txtAnioM.getText().matches("[0-9]+");
        if (verifNum && verifNum2 && (!txtNombreM.getText().equals(""))) {
            Frm_Colegio.getLisMateria().add(new Materia(Integer.parseInt(txtIdM.getText()), Integer.parseInt(txtAnioM.getText()), txtNombreM.getText()));
            txtMostrarM.setText("ID:  "+txtIdM.getText()+" -Materia: "+txtNombreM.getText()+" -"+txtAnioM.getText()+" Año");
            JOptionPane.showMessageDialog(this, "Materia Cargada Correctamente");
        } else {
            JOptionPane.showMessageDialog(this, "Los datos no son correctos\n o la materia ya estaba cargada");
        }
        
    //    Frm_Colegio.getLisMateria().add(new Materia(Integer.parseInt(txtIdM.getText()), Integer.parseInt(txtAnioM.getText()), txtNombreM.getText()));
    //    txtMostrarM.setText("ID:  "+txtIdM.getText()+" -Materia: "+txtNombreM.getText()+" -"+txtAnioM.getText()+" Año");
    }//GEN-LAST:event_bGuardarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bGuardar;
    private javax.swing.JButton bNuevo;
    private javax.swing.JButton bSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lbAnioM;
    private javax.swing.JLabel lbIdM;
    private javax.swing.JLabel lbMostrarM;
    private javax.swing.JLabel lbNombreM;
    private javax.swing.JTextField txtAnioM;
    private javax.swing.JTextField txtIdM;
    private javax.swing.JTextField txtMostrarM;
    private javax.swing.JTextField txtNombreM;
    // End of variables declaration//GEN-END:variables
}
