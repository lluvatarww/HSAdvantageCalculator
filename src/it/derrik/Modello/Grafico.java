package it.derrik.Modello;


import java.awt.Color;
import java.awt.Graphics;
import java.util.HashMap;
import javax.swing.JPanel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author derrik
 */
public class Grafico {
    
    private HashMap<Integer, Integer> turno = new HashMap<>();
    private  Disegno grafico;
    
    public HashMap<Integer, Integer> getTurno() {
        return turno;
    }

    public void setTurno(HashMap<Integer, Integer> turno) {
        this.turno = turno;
    }
    
    public Disegno  disegnaGrafico(){
        int[] valori = new int[turno.size()];
        for(int i = 0; i < valori.length; i++){
            valori[i] = turno.get(i + 1);
        }
        grafico = new Disegno(valori, turno.size());
        return grafico;
    }
    
   
}
