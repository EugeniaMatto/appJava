//CAROLINA ETCHART - 278963
//MARIA EUGENIA MATTO - 227056
package interfaz;

import dominio.*;
import java.util.*;
import javax.swing.*;


public class VentanaProducto extends javax.swing.JFrame {

    private Rotiseria rot;
    
    /**
     * Creates new form VentanaProductos
     */
    public VentanaProducto() {
        initComponents();
    }
    
    public VentanaProducto(Rotiseria unaRotiseria) {
        rot = unaRotiseria;
        initComponents();
        listaCategorias.setListData(rot.getListaCategorias().toArray());
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlPanel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        lblCategoria = new javax.swing.JLabel();
        jScrollPaneCategorias = new javax.swing.JScrollPane();
        listaCategorias = new javax.swing.JList();
        jPanel2 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        lblNombre = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        lblPrecio = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("PRODUCTOS");
        getContentPane().setLayout(new java.awt.CardLayout(20, 20));

        pnlPanel.setLayout(new java.awt.GridLayout(4, 1));

        jPanel1.setLayout(new java.awt.GridLayout(1, 2));

        lblCategoria.setText("Categoría/s:");
        jPanel1.add(lblCategoria);

        jScrollPaneCategorias.setViewportView(listaCategorias);

        jPanel1.add(jScrollPaneCategorias);

        pnlPanel.add(jPanel1);

        jPanel2.setLayout(new java.awt.GridLayout(3, 2));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 425, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 24, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel5);

        jPanel4.setLayout(new java.awt.GridLayout(1, 2));

        lblNombre.setText("Nombre:");
        jPanel4.add(lblNombre);

        txtNombre.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel4.add(txtNombre);

        jPanel2.add(jPanel4);

        pnlPanel.add(jPanel2);

        jPanel3.setLayout(new java.awt.GridLayout(3, 2));

        jPanel6.setLayout(new java.awt.GridLayout(1, 2));

        lblPrecio.setText("Precio:");
        jPanel6.add(lblPrecio);

        txtPrecio.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel6.add(txtPrecio);

        jPanel3.add(jPanel6);

        pnlPanel.add(jPanel3);

        btnAgregar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        pnlPanel.add(btnAgregar);

        getContentPane().add(pnlPanel, "card2");

        setBounds(0, 0, 481, 377);
    }// </editor-fold>//GEN-END:initComponents

    //BTN AGREGAR
    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        ArrayList<Categoria> cat = new ArrayList<>();
        String nombre = txtNombre.getText();
        String precio = txtPrecio.getText();
        
        if(nombre.equals("")||precio.equals("")){
            JOptionPane.showMessageDialog(null,"Complete todos los campos.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        else {
            if(listaCategorias.isSelectionEmpty()){
            JOptionPane.showMessageDialog(null,"Seleccione al menos una categoría.", "Error", JOptionPane.ERROR_MESSAGE);
            }
            else {
                cat = (ArrayList)listaCategorias.getSelectedValuesList();
                if(!rot.esNumero(precio)){
                    JOptionPane.showMessageDialog(null,"El precio debe ser un número, reingrese.", "Error", JOptionPane.ERROR_MESSAGE);
                }
                else {
                    int pre = Integer.parseInt(precio);
                    if(rot.nombreProdExistente(nombre)){
                        JOptionPane.showMessageDialog(null,"Nombre ya existente, ingrese uno diferente.", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                    else {
                        Producto p = new Producto(cat, nombre, pre);
                        rot.agregarProducto(p);
                        dispose();                
                        JOptionPane.showMessageDialog(this, "Producto agregado con éxito.", "Atención", JOptionPane.INFORMATION_MESSAGE);
                    }
                }
            }
            
        }    
    }//GEN-LAST:event_btnAgregarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPaneCategorias;
    private javax.swing.JLabel lblCategoria;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblPrecio;
    private javax.swing.JList listaCategorias;
    private javax.swing.JPanel pnlPanel;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPrecio;
    // End of variables declaration//GEN-END:variables
}
