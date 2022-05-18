//CAROLINA ETCHART - 278963
//MARIA EUGENIA MATTO - 227056
package dominio;

import java.io.*;


public class Cliente implements Serializable{
    private String nombre;
    private String direccion;
    private String telefono;
    
    //CONSTRUCTOR
    public Cliente(String unNombre, String unaDireccion, String unTelefono){
        this.setNombre(unNombre);
        this.setDireccion(unaDireccion);
        this.setTelefono(unTelefono);
    }
    
    public Cliente(){
        this.setNombre("");
        this.setDireccion("");
        this.setTelefono("");
    }
    
    
    //NOMBRE
    public void setNombre(String unNombre){
        nombre = unNombre;
    }
    public String getNombre(){
        return nombre;
    }
    
    //DIRECCION
    public void setDireccion(String unaDireccion){
        direccion = unaDireccion;
    }
    public String getDireccion(){
        return direccion;
    }
    
    //TELEFONO
    public void setTelefono(String unTelefono){
        telefono = unTelefono;
    }
    public String getTelefono(String unTelefono){
        return telefono;
    }
    
    
    @Override 
    public String toString(){
        return nombre+" ("+direccion+" - "+telefono+")";
    }
    
}
