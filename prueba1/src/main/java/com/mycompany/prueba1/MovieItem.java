package com.mycompany.prueba1;

import java.util.Calendar;

public class MovieItem extends BlockBusterItem{
    String estado="";

    public MovieItem(String nombre, int codigo, double precioRenta) {
        super(nombre, codigo, precioRenta);
        estado="ESTRENO";
        
    }
    
    @Override
    public String toString(){
        return super.toString()+" - Movie";
    }
    
    @Override
    public double pagoRenta(int dias){
        double precio=precioRenta;
        if(estado.equals("ESTRENO") && dias>2){
            return precioRenta+(50*(dias-2));
        }else if(estado.equals("NORMAL") && dias>5){
            return precioRenta+(30*(dias-5));
        }
            return precioRenta;  
    }
    

    public void evaluarEstado(){
        if(months(super.getFecha(),Calendar.getInstance())>5){
            estado="NORMAL";
        }
    }

    public String getEstado(){
        return estado;
    }
    
    
}
