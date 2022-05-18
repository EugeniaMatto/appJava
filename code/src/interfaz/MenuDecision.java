//CAROLINA ETCHART - 278963
//MARIA EUGENIA MATTO - 227056
package interfaz;

import dominio.*;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import javax.swing.JOptionPane;

public class MenuDecision extends javax.swing.JFrame {

    private Rotiseria rot;

    public MenuDecision() {
        initComponents();
        rot = new Rotiseria();
    }

    public MenuDecision(Rotiseria unaRotiseria) {
        rot = unaRotiseria;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButtonSistemaPreGuardado = new javax.swing.JButton();
        jButtonSistemaVacio = new javax.swing.JButton();
        jButtonCVS = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(new java.awt.GridLayout(4, 0, 1, 0));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("¿Como desea iniciar el sistema?");
        getContentPane().add(jLabel1);

        jButtonSistemaPreGuardado.setText("Continuar con últimos datos guardados");
        jButtonSistemaPreGuardado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSistemaPreGuardadoActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSistemaPreGuardado);

        jButtonSistemaVacio.setText("Sistema vacío");
        jButtonSistemaVacio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSistemaVacioActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSistemaVacio);

        jButtonCVS.setText("Cargar datos de prueba");
        jButtonCVS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCVSActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCVS);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSistemaPreGuardadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSistemaPreGuardadoActionPerformed

        try {
            ObjectInputStream in = new ObjectInputStream(
                    Files.newInputStream(Paths.get("datos.ser")));

            // aqui se puede trabajar ya con los objetos
            rot = (Rotiseria) in.readObject();
            MenuPrincipal m = new MenuPrincipal(rot);
            m.setBounds(10, 20, 1100, 400);
            m.setLocationRelativeTo(null);
            m.setVisible(true);
            dispose();

            in.close();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error de recuperación ");

            JOptionPane.showMessageDialog(this,
                    "No hay datos almacenados en el sistema.",
                    "Información",
                    JOptionPane.INFORMATION_MESSAGE);

        }

    }//GEN-LAST:event_jButtonSistemaPreGuardadoActionPerformed

    private void jButtonSistemaVacioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSistemaVacioActionPerformed

        int valor = JOptionPane.showConfirmDialog(this,
                "¿Desea iniciar con un sistema vacío? Esta acción borrara los datos previamente guardados.",
                "Atención",
                JOptionPane.YES_NO_OPTION);
        if (valor == JOptionPane.YES_OPTION) {
            rot = new Rotiseria();
            MenuPrincipal m = new MenuPrincipal(rot);
            m.setBounds(10, 20, 1100, 400);
            m.setLocationRelativeTo(null);
            m.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_jButtonSistemaVacioActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowClosing

    private void jButtonCVSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCVSActionPerformed

        int valor = JOptionPane.showConfirmDialog(this,
                "Esta acción borrara los datos previamente guardados. ¿Desea continuar?",
                "Atención",
                JOptionPane.YES_NO_OPTION);
        if (valor == JOptionPane.YES_OPTION) {

            ListaCSV lista = new ListaCSV();
            lista.setBounds(10, 20, 350, 200);
            lista.setLocationRelativeTo(null);
            lista.setVisible(true);
            dispose();
        }


    }//GEN-LAST:event_jButtonCVSActionPerformed

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
            java.util.logging.Logger.getLogger(MenuDecision.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuDecision.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuDecision.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuDecision.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuDecision().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCVS;
    private javax.swing.JButton jButtonSistemaPreGuardado;
    private javax.swing.JButton jButtonSistemaVacio;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
