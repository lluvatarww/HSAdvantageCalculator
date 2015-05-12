package it.derrik.Modello;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author derrik
 */
public class Disegno extends JPanel {
    
    private int[] valori;
    private int turni;
    
    public Disegno(int[] valori, int turni){
        setPreferredSize(new Dimension(500, 500 ));
        this.valori = valori;
        this.turni = turni;
    }
    
    
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        if(this.turni == 0){
            this.disegnaVuoto(g);
        }
        else{
        this.disegna(g, this.turni, this.valori );
        }
    }
    
    public void disegnaVuoto(Graphics g){
        g.setColor(Color.white);
    g.fillRect(40, 40, 360, 200);
    g.setColor(Color.black);
    g.drawLine(40, 40, 40, 239);
    g.drawLine(399, 40, 399, 239);
    g.drawString("% Vantaggio",20,20);
    g.drawLine(40, 40, 399, 40);
    g.drawLine(40, 60 , 399, 60);
    g.drawLine(40, 80, 399, 80);
    g.drawLine(40, 100, 399, 100);
    g.drawLine(40, 120, 399, 120);
    g.drawLine(40, 140, 399, 140);
    g.drawLine(40, 160, 399, 160);
    g.drawLine(40, 180, 399, 180);
    g.drawLine(40, 200, 399, 200);
    g.drawLine(40, 220, 399, 220);
    g.drawLine(40, 240, 399, 240);
    g.drawString("Turno", 410, 240 );
    g.drawString("100", 10,40);
    g.drawString("0", 10, 240);
    g.drawString("50", 10, 140);
    }
    
    public void disegna(Graphics g, int nTurni, int[] valori){
    g.setColor(Color.white);
    g.fillRect(40, 40, 360, 200);
    g.setColor(Color.black);
    g.drawLine(40, 40, 40, 239);
    g.drawLine(399, 40, 399, 239);
    g.drawString("% Vantaggio",20,20);
    g.drawLine(40, 40, 399, 40);
    g.drawLine(40, 60 , 399, 60);
    g.drawLine(40, 80, 399, 80);
    g.drawLine(40, 100, 399, 100);
    g.drawLine(40, 120, 399, 120);
    g.drawLine(40, 140, 399, 140);
    g.drawLine(40, 160, 399, 160);
    g.drawLine(40, 180, 399, 180);
    g.drawLine(40, 200, 399, 200);
    g.drawLine(40, 220, 399, 220);
    g.drawLine(40, 240, 399, 240);
    g.drawString("Turno", 410, 240 );
    g.drawString("100", 10,40);
    g.drawString("0", 10, 240);
    g.drawString("50", 10, 140);
    
    disegnaPunti(g, nTurni, valori, 40, 399);
    }
    
    private int dividi( int nTurni, int larghezza){
        return larghezza/(nTurni) ;
    }
    
    private void disegnaPunti(Graphics g, int turni, int[] valori, int partenza, int fine){
        int larghezza = fine - partenza;
        int passo = dividi(turni, larghezza);
        g.setColor(Color.BLACK);
        int[] pedici = calcolaX(turni, partenza, fine);
        for(int i = 0; i < pedici.length ; i++){
            g.drawLine(pedici[i], 235, pedici[i], 245);
            g.drawString(Integer.toString(i + 1), pedici[i] - 5, 260);
        }
        g.setColor(Color.RED);
        int inizio = 0;        
        for(int i = 1; i < turni; i++ ){
            
        }
        g.setColor(Color.BLUE);
        g.drawPolyline( calcolaX(turni, partenza, fine), calcolaY(valori), turni);
    }
    
    private int[] calcolaY(int[] valori){
        int[] risultati = new int[valori.length];
        for(int i = 0; i < valori.length; i++){
            risultati[i] = (int) (240 - (2 * valori[i])); 
        }
        return risultati;
    }
    
    private int[] calcolaX(int nTurni, int partenza, int fine){
        int[] risultati = new int[nTurni];
        int passo = 0;
        if (nTurni == 0){
            return risultati;
        }
        else if(nTurni == 1){
            passo = (fine - partenza)/(nTurni);
        }
        else{
            passo = (fine - partenza)/(nTurni - 1);
        }
        int start = partenza;
        for(int i = 0; i < nTurni; i++){
            risultati[i] = start;
            start = start + passo;
        }
        return risultati;
    }
    
}
