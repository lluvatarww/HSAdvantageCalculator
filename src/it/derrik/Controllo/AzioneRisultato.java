/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.derrik.Controllo;


import it.derrik.Vista.VistaPrincipale;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JOptionPane;

/**
 *
 * @author derrik
 */
public class AzioneRisultato extends AbstractAction {

   private VistaPrincipale vp;
   private String nome;

    public AzioneRisultato(VistaPrincipale vp, String nome) {
        this.vp = vp;
        this.nome = nome;
        this.putValue(Action.NAME, nome);
        this.putValue(Action.MNEMONIC_KEY, KeyEvent.getExtendedKeyCodeForChar(nome.charAt(0)));
    }
   
   
   
    @Override
    public void actionPerformed(ActionEvent ae) {
        if(this.nome.equals("Vittoria")){
            JOptionPane.showMessageDialog(vp, "Complimenti, hai vinto", "Risultato", JOptionPane.INFORMATION_MESSAGE);
            vp.getBottoneNuovaPartita().setEnabled(true);
            vp.blocca();
        }
        else{
            JOptionPane.showMessageDialog(vp, "Peccato, hai perso", "Risultato", JOptionPane.ERROR_MESSAGE);
            vp.getBottoneNuovaPartita().setEnabled(true);
            vp.blocca();
        }
    }
    
}
