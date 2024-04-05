/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carreracaballos;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Jiro
 */
public class hipodromo {

    private Principal p;
    private Caballo c = new Caballo();
    public static volatile int turno;
    public static volatile int[] turnos;
    public static volatile int indice = 0;
    public hipodromo(Principal _p) {
        p = _p;
        turnos = new int[4];
        turnos[0] = 1;
        turnos[1] = 2;
        turnos[2] = 3;
        turnos[3] = 4;
        turno = turnos[indice];
        
    }
    public void limpia(){
        turnos = new int[4];
        turnos[0] = 1;
        turnos[1] = 2;
        turnos[2] = 3;
        turnos[3] = 4;
        indice=0;
        turno = turnos[indice];
    }
    public void avanza(int _p, int _c) {
        if (_p >= 100 && !c.getGanador()) {
            _p = 100;
            this.p.mostrarbtn(_c);
            switch (_c) {
                case 1:
                    this.p.pbCaballo1.setValue(_p);
                    break;
                case 2:
                    this.p.pbCaballo2.setValue(_p);
                    break;
                case 3:
                    this.p.pbCaballo3.setValue(_p);
                    break;
                case 4:
                    this.p.pbCaballo4.setValue(_p);
                    break;
            }
            this.c.setGanador(true);
        } else if(!c.getGanador()) {
            switch (_c) {
                case 1:
                    this.p.pbCaballo1.setValue(_p);
                    break;
                case 2:
                    this.p.pbCaballo2.setValue(_p);
                    break;
                case 3:
                    this.p.pbCaballo3.setValue(_p);
                    break;
                case 4:
                    this.p.pbCaballo4.setValue(_p);
                    break;
            }
        }
        p.porcentaje();
        p.repaint();
    }
}
