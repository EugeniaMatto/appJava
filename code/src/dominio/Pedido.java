//CAROLINA ETCHART - 278963
//MARIA EUGENIA MATTO - 227056

package dominio;

import java.io.Serializable;
import java.util.*;

public class Pedido implements Serializable{
    private int numero;
    private Cliente cliente;
    private int total;
    private String observaciones;
    private ArrayList<Producto> listaProductos;
    
    //CONSTRUCTOR
    public Pedido(int unNumero, Cliente unCliente, int unTotal, String unasObservaciones, ArrayList<Producto> unosProductos){
        this.setNumero(unNumero);
        this.setCliente(unCliente);
        this.setTotal(unTotal);
        this.setObservaciones(unasObservaciones);
        listaProductos = unosProductos;
        
    }
    
    public Pedido(){
        this.setNumero(1);
        this.setCliente(null);
        this.setTotal(0);
        this.setObservaciones(null);
        listaProductos = new ArrayList<>();
    }
    
    
    //NUMERO
    public void setNumero(int unNumero){
        numero = unNumero;
    }
    public int getNumero(){
        return numero;
    }
    public void incrementarNumero(){
        numero++;
    }
    
    //CLIENTE
    public void setCliente(Cliente unCliente){
        cliente = unCliente;
    }
    public Cliente getCliente(){
        return cliente;
    }
    
    //TOTAL
    public void setTotal(int unTotal){
        total = unTotal;
    }
    public int getTotal(){
        return total;
    }
    public void sumarATotal(int unPrecio){
        total += unPrecio;
    }
    
    //OBSERVACIONES
    public void setObservaciones(String unasObservaciones){
        observaciones = unasObservaciones;
    }
    public String getObservaciones(){
        return observaciones;
    }
    
    //PRODUCTOS
    public void agregarProducto(Producto unProducto){
        listaProductos.add(unProducto);
    }
    public ArrayList<Producto> getListaProductos(){
        return listaProductos;
    }
    
    //PEDIDOS
    public void setListaProductosVacio(){
        listaProductos = new ArrayList<>();
    }
    
    @Override 
    public String toString(){
        return "Pedido nº"+numero+" "+cliente;
    }
}
