package com.mycompany.prueba1;

public class VideoGameItem extends BlockBusterItem{
    String consola;
    String PS="Playstation", XB="XBox", W="Wii";
    
    @Override
    public String toString(){
        return super.toString()+" - Game";
    }
    
    @Override
    public double pagoRenta(int dias){
        return precioRenta*dias;
    }

    public VideoGameItem(String nombre, int codigo, double precioRenta, String console) {
        super(nombre, codigo, precioRenta=30);
        consola=console;
        
    }
    
    
}
