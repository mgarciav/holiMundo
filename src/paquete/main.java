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
public class main {
    public static void main (String[] args){
        
   
        System.out.println("Hola Mundo");
        auto auto1= new auto();
        auto aut2 = new auto(34294);
        auto1.mostrarAño();
        aut2.mostrarAño();
        moto auto3 = new moto();
        auto3.getNombre();
        System.out.println(aut2.año + auto1.año);
        System.out.println(auto3.escupeNombre());
        System.out.println(auto3.masAños());
    } 
}
