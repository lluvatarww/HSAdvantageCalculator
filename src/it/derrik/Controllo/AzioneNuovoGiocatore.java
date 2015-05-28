/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.derrik.Controllo;

import it.derrik.Modello.Statistiche;
import it.derrik.Persistenza.DAOStat;
import it.derrik.Vista.VistaPrincipale;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JOptionPane;

/**
 *
 * @author derrik
 */
public class AzioneNuovoGiocatore extends AbstractAction {

    private Statistiche stats;
    private DAOStat dao;
    private VistaPrincipale vp;
    
    public AzioneNuovoGiocatore(Statistiche stats, DAOStat dao, VistaPrincipale vp) {
        this.stats = stats;
        this.putValue(Action.NAME, "Nuovo Giocatore");
        this.dao = dao;
        this.vp = vp;
    }

     
    @Override
    public void actionPerformed(ActionEvent ae) {
        String nome = JOptionPane.showInputDialog("Inserisci il nome del giocatore");
        this.stats.setNomeGiocatore(nome);
        dao.salva(this.stats);
        dao.salvaNome(nome);
        vp.getBottoneNuovaPartita().setEnabled(true);
        vp.getLabelGiocatore().setText(nome);
        
    }
    
}
