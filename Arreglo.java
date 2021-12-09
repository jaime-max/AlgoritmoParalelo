/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import controlador.Metodos;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jais1
 */
public class Arreglo extends Thread implements Runnable{
    private Metodos proceso;
    private int cont;

    public Arreglo(int cont, Metodos proceso) {
        this.cont=cont;
        this.proceso=proceso;
    }
    @Override
    public void run(){
        try {
            if(this.cont==1){
               proceso.extraerdatos();
            }else if(this.cont==2){
                proceso.media();
            }else if(this.cont==3){
                proceso.mediames();
            }
        } catch (Exception ex) {
            Logger.getLogger(Arreglo.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    
   
            
           
}
