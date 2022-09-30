/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1_tp4_colegio.Vistas;

import javax.swing.JOptionPane;
import lab1_tp4_colegio.Alumno;
import lab1_tp4_colegio.Materia;

/**
 *
 * @author 54266
 */
public class Fri_Inscripcion extends javax.swing.JInternalFrame {

    /**
     * Creates new form Inscripcion
     */
    public Fri_Inscripcion() {
        initComponents();
        cargaCombo();        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl_elijaMat = new javax.swing.JLabel();
        lbl_elijaAlu = new javax.swing.JLabel();
        jCBox_Mat = new javax.swing.JComboBox<>();
        jCBox_Alu = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        btn_inscribe = new javax.swing.JButton();
        btn_salir = new javax.swing.JButton();

        setTitle("FORMULARIO DE INSCRIPCION");
        setPreferredSize(new java.awt.Dimension(500, 500));

        lbl_elijaMat.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lbl_elijaMat.setText("Elija una Materia:");
        lbl_elijaMat.setPreferredSize(new java.awt.Dimension(160, 24));

        lbl_elijaAlu.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lbl_elijaAlu.setText("Elija un Alumno:");
        lbl_elijaAlu.setPreferredSize(new java.awt.Dimension(160, 24));

        jCBox_Mat.setPreferredSize(new java.awt.Dimension(200, 26));
        jCBox_Mat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBox_MatActionPerformed(evt);
            }
        });

        jCBox_Alu.setPreferredSize(new java.awt.Dimension(200, 26));
        jCBox_Alu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBox_AluActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lab1_tp4_colegio/Vistas/Recursos/Escudo uniG10-20porciento.png"))); // NOI18N
        jLabel1.setRequestFocusEnabled(false);
        jLabel1.setVerifyInputWhenFocusTarget(false);

        btn_inscribe.setText("INSCRIBIR");
        btn_inscribe.setPreferredSize(new java.awt.Dimension(110, 32));
        btn_inscribe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_inscribeActionPerformed(evt);
            }
        });

        btn_salir.setText("SALIR");
        btn_salir.setPreferredSize(new java.awt.Dimension(110, 32));
        btn_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(181, 181, 181)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_elijaMat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_elijaAlu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_inscribe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jCBox_Alu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jCBox_Mat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_salir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_elijaMat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCBox_Mat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCBox_Alu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_elijaAlu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_inscribe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_salir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60)
                .addComponent(jLabel1)
                .addGap(0, 27, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salirActionPerformed
        this.dispose();  //--> Solo cierra la ventana actual
    }//GEN-LAST:event_btn_salirActionPerformed

    private void jCBox_MatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBox_MatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCBox_MatActionPerformed

    private void jCBox_AluActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBox_AluActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCBox_AluActionPerformed

    private void btn_inscribeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_inscribeActionPerformed
       Alumno alAux = (Alumno)jCBox_Alu.getSelectedItem();
       Materia matAux = (Materia)jCBox_Mat.getSelectedItem();
       boolean var = false;
        for (Materia aux : alAux.getMat()) {
            if (aux == matAux) {
                var = true;                
            }
        }
        if (var) {
           JOptionPane.showMessageDialog(this, "ERROR!\nYa se encontraba inscripto en la materia");
        } else {
        JOptionPane.showMessageDialog(this, "Inscripcion Correcta.");
        alAux.AgregarMateria(matAux);
        }      
    }//GEN-LAST:event_btn_inscribeActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_inscribe;
    private javax.swing.JButton btn_salir;
    private javax.swing.JComboBox<Alumno> jCBox_Alu;
    private javax.swing.JComboBox<Materia> jCBox_Mat;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lbl_elijaAlu;
    private javax.swing.JLabel lbl_elijaMat;
    // End of variables declaration//GEN-END:variables

    private void cargaCombo() {
        for (Materia matAux : Frm_Colegio.getLisMateria()) {
            jCBox_Mat.addItem(matAux);
        }
        for (Alumno aluAux : Frm_Colegio.getLisAlum()) {
            jCBox_Alu.addItem(aluAux);
        }
    }
}
