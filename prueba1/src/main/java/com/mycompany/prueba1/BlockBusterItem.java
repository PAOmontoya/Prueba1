package com.mycompany.prueba1;

import java.util.Calendar;

public abstract class BlockBusterItem {
    protected String nombre;
    protected int codigo;
    protected double precioRenta;
    protected Calendar fecha;

    public BlockBusterItem(String nombre, int codigo, double precioRenta) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.precioRenta = precioRenta;
        fecha=Calendar.getInstance();
        
    }
    
    
    public String toString() {
        return "Nombre: "+nombre+", Código: "+codigo+", Precio de renta: Lps. "+precioRenta;
    }
    public abstract double pagoRenta(int dias); 

    public Calendar getFecha(){
        return fecha;
    }
    
    public double getPrecio(){
        return precioRenta;
    }
    
    public int getCodigo(){
        return codigo;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public static int days(Calendar fechaRenta, Calendar fechaActual){
    long diferenciaMillis = fechaActual.getTimeInMillis()-fechaRenta.getTimeInMillis();
    int dias = (int) (diferenciaMillis/ (1000*60*60*24));
    return dias;
}
    
    public static int months(Calendar fechaRenta, Calendar fechaActual){
        int anos=fechaActual.get(Calendar.YEAR)-fechaRenta.get(Calendar.YEAR);
        return 0;
    }
    
}
