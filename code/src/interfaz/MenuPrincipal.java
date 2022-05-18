//CAROLINA ETCHART - 278963
//MARIA EUGENIA MATTO - 227056

package interfaz;

import dominio.*;
import java.awt.Color;
import java.awt.Insets;
import java.awt.event.*;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import javax.swing.*;

public class MenuPrincipal extends javax.swing.JFrame implements Observer {

    private Rotiseria rot;
    private DefaultListModel modelo;

    public MenuPrincipal() {
        initComponents();
    }
    
    public MenuPrincipal(Rotiseria unaRotiseria) {
        rot = unaRotiseria;
        modelo = new DefaultListModel();
        initComponents();
        rot.addObserver(this);
        //combo categorias
        listProductosPedidoA.setModel(modelo);
        
    
        this.update(null, null);
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        pnlPanel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        btnElegirCliente = new javax.swing.JButton();
        lblClienteElegido = new javax.swing.JLabel();
        lblObservaciones = new javax.swing.JLabel();
        txtObservaciones = new javax.swing.JTextField();
        rbtnOrdenAlfabetico = new javax.swing.JRadioButton();
        rbtnOrdenPrioridad = new javax.swing.JRadioButton();
        jPanel2 = new javax.swing.JPanel();
        btnClientes = new javax.swing.JButton();
        btnCategorias = new javax.swing.JButton();
        btnProductos = new javax.swing.JButton();
        btnPedidos = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        comboCategorias = new javax.swing.JComboBox();
        jPanel4 = new javax.swing.JPanel();
        btnReiniciarPedido = new javax.swing.JButton();
        lblTotalPedido = new javax.swing.JLabel();
        panelProducto = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listProductosPedidoA = new javax.swing.JList();
        btnEliminarItem = new javax.swing.JButton();
        btnGrabar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("ROTISERIA");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(new java.awt.GridLayout(1, 0));

        pnlPanel.setFont(pnlPanel.getFont().deriveFont(pnlPanel.getFont().getSize()-3f));
        pnlPanel.setLayout(new java.awt.GridLayout(3, 2));

        jPanel1.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        jPanel1.setLayout(new java.awt.GridLayout(3, 2));

        btnElegirCliente.setText("Elegir Cliente");
        btnElegirCliente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnElegirCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnElegirClienteActionPerformed(evt);
            }
        });
        jPanel1.add(btnElegirCliente);

        lblClienteElegido.setBackground(new java.awt.Color(183, 255, 196));
        lblClienteElegido.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblClienteElegido.setOpaque(true);
        jPanel1.add(lblClienteElegido);

        lblObservaciones.setBackground(new java.awt.Color(183, 255, 196));
        lblObservaciones.setText("Observaciones:");
        lblObservaciones.setOpaque(true);
        jPanel1.add(lblObservaciones);

        txtObservaciones.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(txtObservaciones);

        buttonGroup1.add(rbtnOrdenAlfabetico);
        rbtnOrdenAlfabetico.setText("Categorias por orden alfabetico");
        rbtnOrdenAlfabetico.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rbtnOrdenAlfabeticoItemStateChanged(evt);
            }
        });
        jPanel1.add(rbtnOrdenAlfabetico);

        buttonGroup1.add(rbtnOrdenPrioridad);
        rbtnOrdenPrioridad.setText("Categorias por orden prioridad");
        rbtnOrdenPrioridad.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rbtnOrdenPrioridadItemStateChanged(evt);
            }
        });
        jPanel1.add(rbtnOrdenPrioridad);

        pnlPanel.add(jPanel1);

        jPanel2.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        jPanel2.setPreferredSize(new java.awt.Dimension(600, 100));
        jPanel2.setLayout(new java.awt.GridLayout(1, 0));

        btnClientes.setText("Clientes");
        btnClientes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClientesActionPerformed(evt);
            }
        });
        jPanel2.add(btnClientes);

        btnCategorias.setText("Categorias");
        btnCategorias.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnCategorias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCategoriasActionPerformed(evt);
            }
        });
        jPanel2.add(btnCategorias);

        btnProductos.setText("Productos");
        btnProductos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProductosActionPerformed(evt);
            }
        });
        jPanel2.add(btnProductos);

        btnPedidos.setText("Ver Pedidos");
        btnPedidos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnPedidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPedidosActionPerformed(evt);
            }
        });
        jPanel2.add(btnPedidos);

        pnlPanel.add(jPanel2);

        jPanel3.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        jPanel3.setLayout(new java.awt.GridLayout(1, 0));

        comboCategorias.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        comboCategorias.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboCategoriasItemStateChanged(evt);
            }
        });
        jPanel3.add(comboCategorias);

        pnlPanel.add(jPanel3);

        jPanel4.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        jPanel4.setLayout(new java.awt.GridLayout(2, 1));

        btnReiniciarPedido.setText("Reiniciar Pedido");
        btnReiniciarPedido.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnReiniciarPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReiniciarPedidoActionPerformed(evt);
            }
        });
        jPanel4.add(btnReiniciarPedido);

        lblTotalPedido.setBackground(new java.awt.Color(183, 255, 196));
        lblTotalPedido.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTotalPedido.setText("Pedido x $");
        lblTotalPedido.setOpaque(true);
        jPanel4.add(lblTotalPedido);

        pnlPanel.add(jPanel4);

        panelProducto.setBackground(new java.awt.Color(183, 255, 196));
        panelProducto.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        panelProducto.setLayout(new java.awt.GridLayout(3, 2));
        pnlPanel.add(panelProducto);

        jPanel6.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        jPanel6.setLayout(new java.awt.GridLayout(1, 0));

        jScrollPane1.setViewportView(listProductosPedidoA);

        jPanel6.add(jScrollPane1);

        btnEliminarItem.setText("Eliminar Item");
        btnEliminarItem.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnEliminarItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarItemActionPerformed(evt);
            }
        });
        jPanel6.add(btnEliminarItem);

        btnGrabar.setText("Grabar Pedido");
        btnGrabar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnGrabar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGrabarActionPerformed(evt);
            }
        });
        jPanel6.add(btnGrabar);

        pnlPanel.add(jPanel6);

        getContentPane().add(pnlPanel);

        setSize(new java.awt.Dimension(800, 298));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


//UPDATE
    public void update(Observable o, Object arg){
        //etiqueta cliente
        lblClienteElegido.setText(rot.getClienteActual().toString());
        //lista productos pActual
        modelo.clear();
        for(Producto p: rot.getPedidoActual().getListaProductos()){
            modelo.addElement(p.toString());
        }        
        listProductosPedidoA.setModel(modelo);
        if(rot.getListaCategorias().size()>=1){
            cargarCombo(rot.getListaCategorias());
            String descripcion = comboCategorias.getSelectedItem().toString();
            Categoria c = rot.buscarCategoria(descripcion);
            cargarPanelProductos(c);
        }
        //etiqueta n y total pActual
        lblTotalPedido.setText("Pedido: "+rot.getPedidoActual().getNumero()+" $"+rot.getTotalPedido(rot.getPedidoActual()));
    }
    
    
    
    public void cargarCombo(ArrayList<Categoria> lista){
        comboCategorias.removeAllItems();
        comboCategorias.updateUI();
        comboCategorias.repaint();
        if(lista.size()>0){
            for(int i=0 ; i < lista.size() ; i++){
                comboCategorias.addItem(lista.get(i).getDescripcion());
            }
        }
    }
    
    //CARGAR PANELES PRODUCTOS
    private void cargarPanelProductos(Categoria cat){
        panelProducto.removeAll();
        panelProducto.updateUI();
        panelProducto.repaint();
        ArrayList<Producto> produs = rot.buscarProductos(cat);
            for(Producto p: produs){
                JButton nuevo = new JButton();
                nuevo.setMargin(new Insets(-5,-5,-5,-5));
                nuevo.setBackground(Color.BLACK);
                nuevo.setForeground(Color.WHITE);
                nuevo.setText(p.toString());
                nuevo.addActionListener(new ProductoListener());
                panelProducto.add(nuevo);
                nuevo.repaint();
            }
    }
    
    //AGREGAR PRODUCTOS CUANDO SE PRESIONA BOTON
    private class ProductoListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            //codigo a ejecutar al presionar el boton, obtengo cual boton
            JButton cual = ((JButton) e.getSource());
            //codigo a implementar segun el boton presionado
            Producto prod = rot.buscarProd(cual.getText());//busco el producto
            rot.getPedidoActual().agregarProducto(prod); //lo agrego al pedido actual
            update(null, null);
        }
    }

    //LIMPIAR VENTANA
    private void limpiar() {
        Cliente cliente = new Cliente("", "", "");
        rot.setClienteActual(cliente);
        rot.getPedidoActual().setTotal(0);
        rot.getPedidoActual().setObservaciones("");
        rot.getPedidoActual().setListaProductosVacio();

        lblClienteElegido.setText("");
        modelo.clear();
        listProductosPedidoA.setModel(modelo);
        lblTotalPedido.setText("Pedido: " + ((rot.getPedidoActual().getNumero())) + " $0");
        txtObservaciones.setText("");

      
    }

    // a) CLIENTES
    private void btnClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClientesActionPerformed
        VentanaCliente a = new VentanaCliente(rot);
        a.setLocationRelativeTo(null);
        a.setVisible(true);
    }//GEN-LAST:event_btnClientesActionPerformed

    // b) CATEGORIAS
    private void btnCategoriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCategoriasActionPerformed
        VentanaCategoria b = new VentanaCategoria(rot);
        b.setLocationRelativeTo(null);
        b.setVisible(true);
    }//GEN-LAST:event_btnCategoriasActionPerformed

    // c) PRODUCTOS
    private void btnProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProductosActionPerformed
        VentanaProducto c = new VentanaProducto(rot);
        c.setLocationRelativeTo(null);
        c.setVisible(true);
    }//GEN-LAST:event_btnProductosActionPerformed

    // d) VER PEDIDOS
    private void btnPedidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPedidosActionPerformed
        VentanaPedidos d = new VentanaPedidos(rot);
        d.setLocationRelativeTo(null);
        d.setVisible(true);
    }//GEN-LAST:event_btnPedidosActionPerformed

    // f) ELEGIR CLIENTE
    private void btnElegirClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnElegirClienteActionPerformed
        VentanaElegirCliente f = new VentanaElegirCliente(rot);
        f.setLocationRelativeTo(null);
        f.setVisible(true);
    }//GEN-LAST:event_btnElegirClienteActionPerformed

    // m) REINICIAR 
    private void btnReiniciarPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReiniciarPedidoActionPerformed
     limpiar();
    }//GEN-LAST:event_btnReiniciarPedidoActionPerformed

    //k) CARGAR COMBO CATEGORIAS
    private void comboCategoriasItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboCategoriasItemStateChanged
        if(comboCategorias.getSelectedItem() != null){
            String descripcion = comboCategorias.getSelectedItem().toString();
            Categoria c = rot.buscarCategoria(descripcion);
            cargarPanelProductos(c);
        }
    }//GEN-LAST:event_comboCategoriasItemStateChanged

    private void rbtnOrdenPrioridadItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rbtnOrdenPrioridadItemStateChanged
        if(rbtnOrdenPrioridad.isSelected()){
            Collections.sort(rot.getListaCategorias());
            cargarCombo(rot.getListaCategorias());
        }
    }//GEN-LAST:event_rbtnOrdenPrioridadItemStateChanged

    private void rbtnOrdenAlfabeticoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rbtnOrdenAlfabeticoItemStateChanged
            if(rbtnOrdenAlfabetico.isSelected()){
                Collections.sort(rot.getListaCategorias(), new criterioDescripcion());
                cargarCombo(rot.getListaCategorias());
            }
    }//GEN-LAST:event_rbtnOrdenAlfabeticoItemStateChanged

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
       try {
            ObjectOutputStream out = new ObjectOutputStream(
            Files.newOutputStream(Paths.get("datos.ser")));
            out.writeObject(rot);
            out.close();
            JOptionPane.showMessageDialog(this, "Datos guardados correctamente", "Atención", JOptionPane.INFORMATION_MESSAGE);
            System.exit(0);
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Error al guardar datos.", "Atención", JOptionPane.ERROR_MESSAGE);
            System.exit(1);
            } 
    }//GEN-LAST:event_formWindowClosing

    private void btnEliminarItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarItemActionPerformed
        ArrayList<Producto> elim = new ArrayList<>();
        for(int i=0 ; i< listProductosPedidoA.getSelectedValuesList().size() ; i++){
            Producto p = rot.buscarProd(listProductosPedidoA.getSelectedValuesList().get(i).toString());
            elim.add(p);
        }
        if(elim.size()>=1){
            for(Producto p: elim){
                rot.getPedidoActual().getListaProductos().remove(p);
                update(null,null);
            }
        }
    }//GEN-LAST:event_btnEliminarItemActionPerformed

    //Q) GRABAR PEDIDO
    private void btnGrabarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGrabarActionPerformed
        int numero = rot.getPedidoActual().getNumero();
        Cliente c = rot.getClienteActual();
        int total = rot.getTotalPedido(rot.getPedidoActual());
        String observaciones = txtObservaciones.getText();
        ArrayList<Producto> productos = rot.getPedidoActual().getListaProductos();
        

        if ((total == 0) || ("".equals(c.getNombre()))) {
            JOptionPane.showMessageDialog(this, "Seleccione un cliente válido o agregue productos.", "Atención", JOptionPane.ERROR_MESSAGE);
        } else {
            Pedido p = new Pedido(numero, c, total, observaciones, productos);
            rot.agregarPedido(p);
            rot.getPedidoActual().incrementarNumero();
            limpiar();
        }

    }//GEN-LAST:event_btnGrabarActionPerformed


    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCategorias;
    private javax.swing.JButton btnClientes;
    private javax.swing.JButton btnElegirCliente;
    private javax.swing.JButton btnEliminarItem;
    private javax.swing.JButton btnGrabar;
    private javax.swing.JButton btnPedidos;
    private javax.swing.JButton btnProductos;
    private javax.swing.JButton btnReiniciarPedido;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox comboCategorias;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblClienteElegido;
    private javax.swing.JLabel lblObservaciones;
    private javax.swing.JLabel lblTotalPedido;
    private javax.swing.JList listProductosPedidoA;
    private javax.swing.JPanel panelProducto;
    private javax.swing.JPanel pnlPanel;
    private javax.swing.JRadioButton rbtnOrdenAlfabetico;
    private javax.swing.JRadioButton rbtnOrdenPrioridad;
    private javax.swing.JTextField txtObservaciones;
    // End of variables declaration//GEN-END:variables
}