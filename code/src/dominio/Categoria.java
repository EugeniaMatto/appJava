//CAROLINA ETCHART - 278963
//MARIA EUGENIA MATTO - 227056

package dominio;

import java.io.*;


public class Categoria implements Comparable<Categoria>, Serializable{
    private String descripcion;
    private int prioridad;
    private String detalles;
    
    //CONSTRUCTOR
    public Categoria(String unaDescripcion, int unaPrioridad, String unosDetalles){
        this.setDescripcion(unaDescripcion);
        this.setPrioridad(unaPrioridad);
        this.setDetalles(unosDetalles);
    }
    
    public Categoria(){
        this.setDescripcion("");
        this.setPrioridad(10);
        this.setDetalles("");
    }
    
    //DESCRIPCION
    public void setDescripcion(String unaDescripcion){
        descripcion = unaDescripcion;
    }
    public String getDescripcion(){
        return descripcion;
    }
    
    //PRIORIDAD
    public void setPrioridad(int unaPrioridad){
        prioridad = unaPrioridad;
    }
    public int getPrioridad(){
        return prioridad;
    }
    
    //DETALLES
    public void setDetalles(String unosDetalles){
        detalles = unosDetalles;
    }
    public String getDetalles(){
        return detalles;
    }
    
    //ORDENAR POR PRIORIDAD
    public int compareTo(Categoria unaCategoria){
        return  this.getPrioridad() - unaCategoria.getPrioridad();//creciente
    } //0 si iguales, + el primero mas grande, - el seg mas grande
    
    
    
   @Override 
    public String toString(){
        return descripcion;
    }
}
