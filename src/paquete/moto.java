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
public class moto extends auto{
    
    int espejos;
    String nombrecirijillo;
    
    public moto(){
        this.nombre="aweonao";
        this.año=1995;
        this.kilometraje=3245324;
        this.espejos=34;
        this.nombrecirijillo="culiao";
    }
    
    public void getNombre(){
        System.out.println(nombre +" "+ nombrecirijillo);
    }
    
    public String escupeNombre(){
        return nombrecirijillo;
    }
    
    public int masAños(){
    
        for(int i=0;i<55;i++){
            System.out.println(i);
            this.año++;
        }
        
        return 12;
    }
}
