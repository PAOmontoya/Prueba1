/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prueba1;

/**
 *
 * @author ferna
 */
public class VideoGameItem extends BlockBusterItem{
    private String console;
    public VideoGameItem(int code,String name,double rent,String console){
        super(code,name,rent);
        this.console=console;
    }
    @Override
    public String toString(){
        return super.toString()+" Game";
    }
    public enum consola{
        PLAYSTATION,XBOX,WII;
    }
  
    public double pagoRenta(int dias){
        return super.precio_renta*dias;
    }
    
}
