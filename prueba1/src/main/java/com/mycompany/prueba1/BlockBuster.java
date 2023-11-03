package com.mycompany.prueba1;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author ferna
 */
public class BlockBuster {
    public BlockBusterItem movie_item;
    public BlockBusterItem game_item;
    public ArrayList<BlockBusterItem> items;
    
    public BlockBuster(){
         
    }
    public BlockBusterItem buscarItem(int codigo, String tipo){
        if(tipo.equalsIgnoreCase("movie")){
        for(int i=0;i<items.size();i++){
            if(codigo==items.get(i).codigo)
                return items.get(i);
            return null;
        }}
        else if(tipo.equalsIgnoreCase("game")){
            for(int i=0;i<items.size();i++){
               if(codigo==items.get(i).codigo)
                return items.get(i);
            return null;
            }
        }return null;
        
    }
    public void agregarItem(int codigo, String nombre, String tipoItem,String console){
        if(tipoItem.equalsIgnoreCase("Movie")&&buscarItem(codigo,nombre)==null){
            movie_item=new MovieItem(codigo,nombre,50);
            items.add(movie_item);
            JOptionPane.showMessageDialog(null, "Movie agregada exitosamente");
        }
        else if(tipoItem.equalsIgnoreCase("Game")&&buscarItem(codigo,nombre)==null){
            game_item= new VideoGameItem(codigo,nombre,30,console);
            items.add(game_item);
            JOptionPane.showMessageDialog(null, "Game agregado exitosamente");
        }
    }
    public String rentar(int codigo, String tipoItem,int dias){
        if(buscarItem(codigo,tipoItem)!=null){
            return "Monto a pagar: "+buscarItem(codigo,tipoItem).pagoRenta(dias);
        }
        else return "Item no existe";
    }
    public int auditarMovieEstados(int n){
        if(n<items.size()){
            if(items.get(n).equals(movie_item)){
                
            }
                        
            return auditarMovieEstados(n+1);}
        return 0;
    } 
    
}
