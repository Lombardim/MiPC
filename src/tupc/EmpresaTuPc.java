package tupc;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.*;
import javax.swing.Timer;
/**
 *
 * @author lombardim
 */
public class EmpresaTuPc extends javax.swing.JFrame {
    
    Inventario inv = new Inventario();
    
    public EmpresaTuPc() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TuPc = new javax.swing.JFrame();
        titulo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        campo = new javax.swing.JTextField();
        elegirb = new javax.swing.JButton();
        cambiarb = new javax.swing.JButton();
        objb = new javax.swing.JLabel();
        objnb = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        nombod = new javax.swing.JLabel();
        TITLE = new javax.swing.JLabel();
        INSTRU = new javax.swing.JLabel();
        B = new javax.swing.JProgressBar();

        TuPc.setPreferredSize(new java.awt.Dimension(465, 340));
        TuPc.setSize(new java.awt.Dimension(465, 340));

        titulo.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        titulo.setText("TuPc");

        jLabel1.setText("Escriba el nombre de la bodega que quiere utilizar, por ejemplo: bodega1");

        campo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoActionPerformed(evt);
            }
        });

        elegirb.setText("BUSCAR");
        elegirb.setFocusable(false);
        elegirb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                elegirbActionPerformed(evt);
            }
        });

        cambiarb.setText("CAMBIAR");
        cambiarb.setEnabled(false);
        cambiarb.setFocusable(false);
        cambiarb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cambiarbActionPerformed(evt);
            }
        });

        objb.setText("Objetos en la bodega:");

        objnb.setForeground(new java.awt.Color(102, 0, 0));
        objnb.setText("        ");

        jButton1.setText("PC-ESCRITORIO");

        jButton2.setText("PC-PORTATIL");

        jButton3.setText("SERVIDOR");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel2.setText("Presione el botón con el nombre del producto");

        jLabel3.setText("que desee agregar en la bodega # ");

        nombod.setForeground(new java.awt.Color(102, 0, 0));
        nombod.setText("   ");

        javax.swing.GroupLayout TuPcLayout = new javax.swing.GroupLayout(TuPc.getContentPane());
        TuPc.getContentPane().setLayout(TuPcLayout);
        TuPcLayout.setHorizontalGroup(
            TuPcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TuPcLayout.createSequentialGroup()
                .addGroup(TuPcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(TuPcLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(TuPcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(TuPcLayout.createSequentialGroup()
                                .addComponent(campo, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(elegirb)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cambiarb))
                            .addGroup(TuPcLayout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addGap(30, 30, 30)
                                .addComponent(jButton2)
                                .addGap(30, 30, 30)
                                .addComponent(jButton3))
                            .addGroup(TuPcLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(TuPcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(TuPcLayout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(nombod))
                                    .addComponent(jLabel2)
                                    .addGroup(TuPcLayout.createSequentialGroup()
                                        .addComponent(objb)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(objnb))))))
                    .addGroup(TuPcLayout.createSequentialGroup()
                        .addGap(204, 204, 204)
                        .addComponent(titulo))
                    .addGroup(TuPcLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel1)))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        TuPcLayout.setVerticalGroup(
            TuPcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TuPcLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(titulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(TuPcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(elegirb)
                    .addComponent(cambiarb))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(TuPcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(objb)
                    .addComponent(objnb))
                .addGap(39, 39, 39)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(TuPcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(nombod))
                .addGap(18, 18, 18)
                .addGroup(TuPcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addGap(0, 70, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(402, 200));
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });

        TITLE.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        TITLE.setText("BIENVENIDO A TUPC S.A.");
        TITLE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TITLEMouseClicked(evt);
            }
        });

        INSTRU.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        INSTRU.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        INSTRU.setText("Presione en cualquier lugar para continuar.");
        INSTRU.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                INSTRUMouseClicked(evt);
            }
        });

        B.setForeground(new java.awt.Color(0, 204, 0));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(TITLE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(B, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addComponent(INSTRU)
                .addContainerGap(33, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TITLE)
                .addGap(31, 31, 31)
                .addComponent(INSTRU)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addComponent(B, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public class progress implements ActionListener{

        /**
         *
         * @param evt
         */
        @Override
        public void actionPerformed(ActionEvent evt){
            
            if(B.getValue() < 100){
                B.setValue(B.getValue() + 25);
            }else{
                time.stop();
                dispose();
                TuPc.setVisible(true);
                TuPc.setLocationRelativeTo(null);
            }
        }
    }
        
    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        time = new Timer(500, new progress());
        time.start();
    }//GEN-LAST:event_formMouseClicked

    private void INSTRUMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_INSTRUMouseClicked
        formMouseClicked(evt);
    }//GEN-LAST:event_INSTRUMouseClicked

    private void TITLEMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TITLEMouseClicked
        formMouseClicked(evt);
    }//GEN-LAST:event_TITLEMouseClicked

    private void campoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoActionPerformed

    private void elegirbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_elegirbActionPerformed
        String bodega = campo.getText();
        int n = inv.getObjetos();
        if(bodega.equals("")){
            
            JOptionPane.showMessageDialog(null, "No puede dejar el campo en blanco.", "ERROR", ERROR_MESSAGE);
            
        }else{
            
            if(bodega.equalsIgnoreCase("bodega1")){
                campo.setText("bodega1");
                JOptionPane.showMessageDialog(null, "Puede cambiar de bodega en cualquier momento presionando el botón [CAMBIAR].", "INFORMACION IMPORTANTE", INFORMATION_MESSAGE);
                campo.setEnabled(false);
                cambiarb.setEnabled(true);
                nombod.setText("[ " + "1" + " ]");
                objnb.setText("[ " + Integer.toString(n) + " ]");
            }else{
                if(bodega.equalsIgnoreCase("bodega2")){
                    campo.setText("bodega2");
                    JOptionPane.showMessageDialog(null, "Puede cambiar de bodega en cualquier momento presionando el botón [CAMBIAR].", "INFORMACION IMPORTANTE", INFORMATION_MESSAGE);
                    campo.setEnabled(false);
                    cambiarb.setEnabled(true);
                    nombod.setText("[ " + "2" + " ]");
                    objnb.setText("[ " + Integer.toString(n) + " ]");
                }else{
                    if (bodega.equalsIgnoreCase("bodega3")) {
                        campo.setText("bodega3");
                        JOptionPane.showMessageDialog(null, "Puede cambiar de bodega en cualquier momento presionando el botón [CAMBIAR].", "INFORMACION IMPORTANTE", INFORMATION_MESSAGE);
                        campo.setEnabled(false);
                        cambiarb.setEnabled(true);
                        nombod.setText("[ " + "3" + " ]");
                        objnb.setText("[ " + Integer.toString(n) + " ]");
                    }else{
                        JOptionPane.showMessageDialog(null, "Solo existen 3 bodegas:\nbodega1, bodega2 y bodega3", "ERROR", ERROR_MESSAGE);
                    }
                }
            }
            
        }
    }//GEN-LAST:event_elegirbActionPerformed

    private void cambiarbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cambiarbActionPerformed
        campo.setText("");
        campo.setEnabled(true);
        cambiarb.setEnabled(false);
    }//GEN-LAST:event_cambiarbActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(EmpresaTuPc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EmpresaTuPc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EmpresaTuPc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EmpresaTuPc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EmpresaTuPc().setVisible(true);
            }
        });
    }
    
    private Timer time;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar B;
    private javax.swing.JLabel INSTRU;
    private javax.swing.JLabel TITLE;
    private javax.swing.JFrame TuPc;
    private javax.swing.JButton cambiarb;
    private javax.swing.JTextField campo;
    private javax.swing.JButton elegirb;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel nombod;
    private javax.swing.JLabel objb;
    private javax.swing.JLabel objnb;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
