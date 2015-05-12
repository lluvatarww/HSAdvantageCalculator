package it.derrik.Modello;


import it.derrik.Vista.VistaSceltaMazzo;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author derrik
 */
public class Deselezionatore implements ItemListener{

    VistaSceltaMazzo vsm;
    int pos;

    public Deselezionatore(VistaSceltaMazzo vsm, int pos) {
        this.vsm = vsm;
        this.pos = pos;
    }
    
    
            
    @Override
    public void itemStateChanged(ItemEvent ie) {
        if(ie.getStateChange() == ItemEvent.SELECTED){
            for(int i = 0; i < this.vsm.getListaBottoni().size(); i++){
                if(i != this.pos){
                this.vsm.getListaBottoni().get(i).setSelected(false);
                }
            }
            
        }
    }
    
}
