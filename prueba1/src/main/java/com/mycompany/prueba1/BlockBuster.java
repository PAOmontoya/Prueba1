package com.mycompany.prueba1;

import java.util.ArrayList;
import java.util.Calendar;

public class BlockBuster {
static ArrayList<BlockBusterItem> items= new ArrayList<BlockBusterItem>();

MovieItem movieItem= new MovieItem("",0,0);

public BlockBusterItem buscarItem(int codigo, String tipo){
    for(int i=0; i<BlockBuster.items.size();i++){
        BlockBusterItem item=BlockBuster.items.get(i);
        int code=item.getCodigo();
        String type="";
        if(item instanceof MovieItem){
            type="Movie";
        }else if(item instanceof VideoGameItem){
            type="Game";
        }
        
        if(codigo==code && tipo.equals(type)){
            return BlockBuster.items.get(i);
        }
    }
    return null;
}

public void agregarItem(int codigo, String nombre, String tipoItem){
    if(tipoItem.equals("Movie")){
        MovieItem item = new MovieItem(nombre,codigo,50);
        BlockBuster.items.add(item);
    } else if(tipoItem.equals("Game")){
        VideoGameItem item = new VideoGameItem(nombre,codigo,30,"");
        BlockBuster.items.add(item);
    }
}

public int days(Calendar fechaRenta, Calendar fechaActual){
    long diferenciaMillis = fechaActual.getTimeInMillis()-fechaRenta.getTimeInMillis();
    int dias = (int) (diferenciaMillis/ (1000*60*60*24));
    return dias;
}

public static int months(Calendar fechaRenta, Calendar fechaActual){
    int anos= fechaActual.get(Calendar.YEAR) - fechaRenta.get(Calendar.YEAR);
    int meses1 = fechaActual.get(Calendar.MONTH) - fechaRenta.get(Calendar.MONTH);
    int meses= anos*12+meses1;
    
    return meses;
}

public String auditarMovieEstados(){
    String movies="";
    for(int i=0;i<BlockBuster.items.size();i++){
        BlockBusterItem item=BlockBuster.items.get(i);
        if(item instanceof MovieItem){
            movies+="Name: "+item.getNombre()+"  Estado: "+((MovieItem) item).getEstado()+"\n";
        }
        
    }
    return movies;
}

}
