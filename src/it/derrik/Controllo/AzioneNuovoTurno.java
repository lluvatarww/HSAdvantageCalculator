/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.derrik.Controllo;

import it.derrik.Modello.Giocatore;
import it.derrik.Modello.Suggeritore;
import it.derrik.Vista.VistaPrincipale;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.AbstractAction;
import javax.swing.ImageIcon;

/**
 *
 * @author derrik
 */
public class AzioneNuovoTurno extends AbstractAction{

    private VistaPrincipale vp;

    public AzioneNuovoTurno(VistaPrincipale vp) {
        this.vp = vp;
        this.putValue(NAME, "Nuovo Turno");
        
    }
   
    
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        Giocatore giocatore1 = vp.getGiocatore1();
        Giocatore giocatore2 = vp.getGiocatore2();
        giocatore1.setPv((Integer) vp.getPv1().getValue());
        giocatore2.setPv((Integer) vp.getPv().getValue());
        giocatore1.setCarteInMano((Integer) vp.getCim1().getValue());
        giocatore2.setCarteInMano((Integer) vp.getCim().getValue());
        giocatore1.setCarteInMazzo((Integer) vp.getCiz1().getValue());
        giocatore2.setCarteInMazzo((Integer) vp.getCiz().getValue());
        giocatore1.setCarteInGioco((Integer) vp.getCig1().getValue());
        giocatore2.setCarteInGioco((Integer) vp.getCig().getValue());
        giocatore1.setDanniInGioco((Integer) vp.getDig1().getValue());
        giocatore2.setDanniInGioco((Integer) vp.getDig().getValue());
        giocatore1.setSaluteProvocazione((Integer) vp.getSSP1().getValue());
        giocatore2.setSaluteProvocazione((Integer) vp.getSSP().getValue());
        int totale1g = giocatore1.totale(giocatore2.getDanniInGioco());
        int totale2 = giocatore2.totale(giocatore1.getDanniInGioco());
        vp.getTotale1().setText("" + totale1g);
        vp.getTotale().setText("" + totale2);
        int perc1 = vp.percentuale(totale1g, totale2);
        int perc2 = 100 - perc1;
        vp.getPercentualeTu().setText("" + perc1 + "%");
        vp.getPercentualeAvversario().setText("" + perc2 + "%");
        this.risultato(perc1);
        vp.setTurno(vp.getTurno() + 1);
        vp.getContatoreTurno().setText("" + vp.getTurno());
        vp.getGrafico().getTurno().put(vp.getTurno(), perc1);
        vp.getPanel().removeAll();
        vp.getPanel().setLayout(new BorderLayout());
        vp.getPanel().add(vp.getGrafico().disegnaGrafico(), BorderLayout.NORTH);
        vp.getPanel().add(vp.getButton(), BorderLayout.SOUTH);
        vp.getButton().addActionListener(new ActionListener() {            
            @Override
            public void actionPerformed(ActionEvent ae) {
                vp.getVg().setVisible(false);
            }
        });
        vp.getVg().setContentPane(vp.getPanel());
        vp.setSuggeritore(new Suggeritore(vp.getGiocatore1(), vp.getGiocatore2(), vp));
        vp.getjTextArea1().setText(vp.getSuggeritore().suggerisci());
        vp.getCiz().setValue(giocatore2.getCarteInMazzo() - 1);
        vp.getCiz1().setValue(giocatore1.getCarteInMazzo() - 1);
    }
    
    
    private void risultato(int a) {
        if (a <= 47) {
            vp.getImmagineEsito().setIcon(new ImageIcon(getClass().getResource(
                    "/immagini/sconfitta.png")));
        }
        if (a > 47 && a < 53) {
            vp.getImmagineEsito().setIcon(new ImageIcon(getClass().getResource(
                    "/immagini/pari.png")));
        }
        if (a >= 53) {
            vp.getImmagineEsito().setIcon(new ImageIcon(getClass().getResource(
                    "/immagini/vittoria.png")));
        }
    }
    
}
