/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prueba1;

import java.util.Calendar;

/**
 *
 * @author ferna
 */
public class MovieItem extends BlockBusterItem {
    private String estado;
    public MovieItem(int code,String name,double rent){
        super(code,name,rent);
        estado="ESTRENO";
        
        
    }
    @Override
    public String toString(){
        return super.toString()+" "+estado+" - Movie";
    }
    public double pagoRenta(int dias){
        if(dias>2&&estado.equalsIgnoreCase("ESTRENO"))
            return super.precio_renta+dias*50;
        else if(dias>5&&estado.equalsIgnoreCase("NORMAL"))
            return super.precio_renta+dias*30;
        return super.precio_renta;
    }
    public void evaluarEstado(){
        if(super.fecha.get(Calendar.MONTH)+5==Calendar.MONTH)
            estado="Normal";    
    }
}
