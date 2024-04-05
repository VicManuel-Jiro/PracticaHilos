/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carreracaballos;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Jiro
 */
public class Caballo extends Thread {
    hipodromo h;
    int caballo;
    public int progreso;
    private static boolean ganador=false;
    public Caballo(int _c,hipodromo _h){
        this.h=_h;
        this.caballo=_c;
        progreso=(int) (Math.random()*5);
    }
    public Caballo(){
    
    }
    public void setGanador(boolean _g){
        ganador=_g;
    }
    public boolean getGanador(){
        return ganador;
    }
    @Override
    public void run(){
       int np=0;
       
       while(!ganador){
            np = (int) (Math.random() * 10);
            progreso = progreso + np;
            this.h.avanza(progreso, caballo);
                try {
                    sleep((long) (Math.random() * 100));
                } catch (InterruptedException ex) {
                    Logger.getLogger(Caballo.class.getName()).log(Level.SEVERE, null, ex);
                }
        }
    }
}
