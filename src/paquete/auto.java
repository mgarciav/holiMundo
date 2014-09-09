/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package paquete;

/**
 *
 * @author mati
 */
public class auto {
    String nombre;
    int año;
    int kilometraje;
    
    public auto(){
        this.año=99;
        this.kilometraje=20000;
        this.nombre="Coleto";
    
    }
    public auto(int numerito){
        this.año=numerito;
        this.kilometraje=15000;
        this.nombre="taxi";
    }
    
    public void mostrarAño(){
        System.out.println(año);
    }
    
}
