/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.derrik.Controllo;

import it.derrik.Modello.Grafico;
import it.derrik.Vista.VistaPrincipale;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author derrik
 */
public class AzioneGAP extends AbstractAction{

    private VistaPrincipale vp;

    public AzioneGAP(VistaPrincipale vp) {
        this.vp = vp;
        this.putValue(NAME, "GAP");
        this.putValue(Action.SHORT_DESCRIPTION, "Clicca per visualizzare il Grafico Andamento Partita");
    }
    
    
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        vp.getVg().setVisible(false);
        vp.getVg().setVisible(true);
    }
    
}
