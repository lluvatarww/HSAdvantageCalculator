/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.derrik.Controllo;



import it.derrik.Modello.Statistiche;
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
        Statistiche stats = Principale.stats;
        vp.getBottoneNuovoTurno().setEnabled(false);
        vp.blocca();
        if(this.nome.equals("Vittoria")){
            JOptionPane.showMessageDialog(vp, "Complimenti, hai vinto", "Risultato", JOptionPane.INFORMATION_MESSAGE);
            if(vp.getBoxConta().isSelected()){
                this.aggiungiStatVittoria(stats);
            }
        }
        else{
            JOptionPane.showMessageDialog(vp, "Peccato, hai perso", "Risultato", JOptionPane.ERROR_MESSAGE);
            if(vp.getBoxConta().isSelected()){
                this.aggiungiStatSconfitta(stats);
            }
        }
       vp.getBottoneNuovaPartita().setEnabled(true);
       Principale.dao.salva(stats);
    }
    
    public void aggiungiStatVittoria(Statistiche stats){
        stats.setPartite(stats.getPartite() + 1);
        stats.calcolaMedia(vp.getTurno());
        String nome = vp.getGiocatore1().getEroe();
        int valore = stats.getVittorieEroe().get(nome) + 1;
        stats.getVittorieEroe().put(nome, valore);
    }
    
    public void aggiungiStatSconfitta(Statistiche stats){
        stats.setPartite(stats.getPartite() + 1);
        stats.setSconfitte(stats.getSconfitte() + 1);
        String nome = vp.getGiocatore2().getEroe();
        int valore = stats.getSconfitteEroe().get(nome) + 1;
        stats.getSconfitteEroe().put(nome, valore);
    }
}
