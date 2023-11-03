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
public abstract class BlockBusterItem {
    protected int codigo;
    protected String nombre;
    protected double precio_renta;
    protected Calendar fecha;

    public BlockBusterItem(int codigo, String nombre, double precio_renta) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio_renta = precio_renta;
        fecha= Calendar.getInstance();
    }
    @Override
    public String toString(){
        return "Codigo: "+codigo+" Nombre: "+nombre+" Precio de renta:  "+precio_renta;
    }
     
    public abstract double pagoRenta(int dias);
        
    
    
}
