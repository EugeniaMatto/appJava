//CAROLINA ETCHART - 278963
//MARIA EUGENIA MATTO - 227056
package dominio;

import java.io.*;
import java.util.*;
import resources.ArchivoLectura;


public class Rotiseria extends Observable implements Serializable{
    private Cliente cActual;
    private Pedido pActual;
    private ArrayList<Cliente> listaClientes;
    private ArrayList<Categoria> listaCategorias;
    private ArrayList<Producto> listaProductos;
    private ArrayList<Pedido> listaPedidos;
    
    public Rotiseria(){
        listaClientes = new ArrayList<>();
        listaCategorias = new ArrayList<>();
        listaProductos = new ArrayList<>();
        listaPedidos = new ArrayList<>();
        cActual = new Cliente();
        pActual = new Pedido();
    }
    
     public Rotiseria(Cliente uncActual, Pedido unpActual, ArrayList<Cliente> unaListaClientes,
        ArrayList<Categoria> unaListaCategorias, ArrayList<Producto> unaListaProductos, ArrayList<Pedido> unaListaPedidos){
        listaClientes = unaListaClientes;
        listaCategorias = unaListaCategorias;
        listaProductos = unaListaProductos;
        listaPedidos = unaListaPedidos;
        cActual = uncActual;
        pActual = unpActual;
    }
    
    
    //AGREGAR
    public void agregarCliente(Cliente unCliente){
        listaClientes.add(unCliente);
        setChanged();
        notifyObservers();
    }
    public void agregarCategoria(Categoria unaCategoria){
        listaCategorias.add(unaCategoria);
        setChanged();
        notifyObservers();
    }
    public void agregarProducto(Producto unProducto){
        listaProductos.add(unProducto);
        setChanged();
        notifyObservers();
    }
    public void agregarPedido(Pedido unPedido){
        listaPedidos.add(unPedido);
        setChanged();
        notifyObservers();
    }
    
    public void setClienteActual(Cliente unCliente){
        cActual = unCliente;
        setChanged();
        notifyObservers();
    }
    public void setPedidoActual(Pedido unPedido){
        pActual = unPedido;
        pActual.setCliente(cActual);
        pActual.setTotal(0);
        setChanged();
        notifyObservers();
    }
    
    public void setListaClientes(ArrayList<Cliente> llistaClientes){
        listaClientes = llistaClientes;
    }
    
    public void setListaProductos(ArrayList<Producto> llistaProductos){
        listaProductos = llistaProductos;
    }
    
    public void setListaPedidos(ArrayList<Pedido> llistaPedidos){
        listaPedidos = llistaPedidos;
    }
   
    //GET
    public ArrayList<Cliente> getListaClientes(){
        return listaClientes;
    }
    public ArrayList<Categoria> getListaCategorias(){
        return listaCategorias;
    }
    public ArrayList<Producto> getListaProductos(){
        return listaProductos;
    }
    public ArrayList<Pedido> getListaPedidos(){
        return listaPedidos;
    }
    public Cliente getClienteActual(){
        return cActual;
    }
    public Pedido getPedidoActual(){
        return pActual;
    }
    public int getTotalPedido(Pedido unPedido){
        int tot = 0;
        for(int i=0 ; i<unPedido.getListaProductos().size() ; i++){
            tot += unPedido.getListaProductos().get(i).getPrecio();
        }
        return tot;
    }
    

//para CLIENTE
    public boolean nombreExistente(String unNombre){
        boolean si = false;
        for(int i = 0 ; i<this.getListaClientes().size() ; i++){
            if(this.getListaClientes().get(i).getNombre().equalsIgnoreCase(unNombre)){
                si = true;
            }
        }
        return si;
    }
    
//para CATEGORIAS
    public boolean descripcionExistente(String unaDescripcion){
        boolean si = false;
        for(int i = 0 ; i<this.getListaCategorias().size() ; i++){
            if(this.getListaCategorias().get(i).getDescripcion().equalsIgnoreCase(unaDescripcion)){
                si = true;
            }
        }
        return si;
    }
    
    public Categoria buscarCategoria(String descripcion){
        Categoria cat = new Categoria();
        for(Categoria c: this.getListaCategorias()){
            if(c.getDescripcion().equalsIgnoreCase(descripcion)){
                cat = c;
            }
        }
        return cat;
    }
    
//para PRODUCTOS
    public boolean nombreProdExistente(String unNombre){
        boolean si = false;
        for(int i = 0 ; i<this.getListaProductos().size() ; i++){
            if(this.getListaProductos().get(i).getNombre().equalsIgnoreCase(unNombre)){
                si = true;
            }
        }
        return si;
    }
    
 
    
    public ArrayList<Producto> buscarProductos(Categoria unaCategoria){
        ArrayList<Producto> produs = new ArrayList<>();
        for(Producto prod: this.getListaProductos()){
            if(prod.getCategoria().contains(unaCategoria)){
                produs.add(prod);
            }
        }
        return produs;
    }
    
    
    public Producto buscarProd(String unString){
        Producto ret = new Producto();
        for(Producto prod: this.getListaProductos()){
            if(prod.toString().equalsIgnoreCase(unString)){
                ret = prod;
            }
        }
        return ret;
    }
    
    
    //para PEDIDOS
    public Pedido buscarPedido(String unString){
        Pedido p = new Pedido();
        for(Pedido ped: this.getListaPedidos()){
            if(ped.toString().equalsIgnoreCase(unString)){
                p = ped;
            }
        }
        return p;
    }
   

    public boolean esNumero(String cadena) {
        boolean res;

        try {
            Integer.parseInt(cadena);
            res = true;
        } catch (NumberFormatException excepcion) { // si no es numero:
            res = false;
        }
        return res;
    }
    
    
    
    
    public void cargaCsv(ArchivoLectura arch) {

        //CLIENTES
        arch.hayMasLineas();
        String linea = arch.linea();
        String[] partes = linea.split(";");
        int valor;
        if (this.esNumero(partes[0])) {
            valor = Integer.parseInt(partes[0]);
            for (int i = 0; i < valor; i++) {
                arch.hayMasLineas();
                linea = arch.linea();
                partes = linea.split(";");
                Cliente cliente = new Cliente();
                cliente.setNombre(partes[0]);
                cliente.setDireccion(partes[1]);
                cliente.setTelefono(partes[2]);
                this.agregarCliente(cliente);
            }
        } // fin for fin if Clientes

        //CATEGORIAS
        arch.hayMasLineas();
        linea = arch.linea();
        partes = linea.split(";");
        if (this.esNumero(partes[0])) {
            valor = Integer.parseInt(partes[0]);
            for (int i = 0; i < valor; i++) {
                arch.hayMasLineas();
                linea = arch.linea();
                partes = linea.split(";");
                Categoria cat = new Categoria();
                cat.setDescripcion(partes[0]);
                cat.setDetalles(partes[1]);
                cat.setPrioridad(Integer.parseInt(partes[2]));
                this.agregarCategoria(cat);
            }
        } // fin for fin if Categorias

        //PRODUCTOS
        arch.hayMasLineas();
        linea = arch.linea();
        partes = linea.split(";");
        if (this.esNumero(partes[0])) {
            valor = Integer.parseInt(partes[0]);
            for (int i = 0; i < valor; i++) {
                arch.hayMasLineas();
                linea = arch.linea();
                partes = linea.split(";");
                Producto pro = new Producto();
                pro.setNombre(partes[0]);
                pro.setPrecio(Integer.parseInt(partes[1]));
                //agregar categorias
                ArrayList<Categoria> categorias = new ArrayList();
                for (int j = 2; j < partes.length; j++) {
                    Categoria cat = (this.buscarCategoria(partes[j]));
                    categorias.add(cat);
                }
                pro.setListaCategorias(categorias);

                //agregar producto
                this.agregarProducto(pro);
            }
        } // fin for fin if Productos

        arch.cerrar();
    }

    
    

}
