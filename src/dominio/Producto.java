//CAROLINA ETCHART - 278963
//MARIA EUGENIA MATTO - 227056
package dominio;

import java.io.Serializable;
import java.util.*;

public class Producto implements Serializable {
    private ArrayList<Categoria> categorias;
    private String nombre;
    private int precio;
    
    //CONSTRUCTOR
    public Producto(ArrayList<Categoria> unaCategoria, String unNombre, int unPrecio){
        this.setListaCategorias(unaCategoria);
        this.setNombre(unNombre);
        this.setPrecio(unPrecio);
    }
    
    public Producto(){
        this.setListaCategorias(null);
        this.setNombre("");
        this.setPrecio(0);
    }
    

    

    //CATEGORIA
    public void agregarCategoria(Categoria unaCategoria){
        categorias.add(unaCategoria);
    }
    public ArrayList<Categoria> getCategoria(){
        return categorias;
    }
    
    public void setListaCategorias(ArrayList<Categoria> unaLista){
        categorias = unaLista;
    }
    
    //NOMBRE
    public void setNombre(String unNombre){
        nombre = unNombre;
    }
    public String getNombre(){
        return nombre;
    }
    
    //PRECIO
    public void setPrecio(int unPrecio){
        precio = unPrecio;
    }
    public int getPrecio(){
        return precio;
    }
    
    
    @Override
    public String toString(){
        return nombre+" $"+precio;
    }
}
