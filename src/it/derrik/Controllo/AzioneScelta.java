package it.derrik.Controllo;


import it.derrik.Vista.FrameSceltaMazzo;
import it.derrik.Vista.VistaPrincipale;
import it.derrik.Modello.Giocatore;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.ImageIcon;
import javax.swing.JToggleButton;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author derrik
 */
public class AzioneScelta extends AbstractAction {

    private FrameSceltaMazzo fsm;
    private VistaPrincipale vp;
   

    public AzioneScelta(FrameSceltaMazzo fsm, VistaPrincipale vp
          ) {
        this.fsm = fsm;
        this.vp = vp;
        this.putValue(Action.NAME, "Inizia");
    }
    
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        String nome1 = prendiNome(fsm.getTu().getListaBottoni());
        String nome2 = prendiNome(fsm.getAvversario().getListaBottoni());
        vp.setGiocatore1(creaGiocatore(nome1));
        vp.setGiocatore2(creaGiocatore(nome2));
        vp.getImmagineMazzo().setIcon(sceltaImmagine(nome1));
        vp.getImmagineMazzoAvversario().setIcon(sceltaImmagine(nome2));
        vp.getImmagineMazzo().setText("");
        vp.getImmagineMazzoAvversario().setText("");
        deseleziona(fsm.getTu().getListaBottoni());
        deseleziona(fsm.getAvversario().getListaBottoni());
        vp.getBottoneNuovoTurno().setEnabled(true);
        fsm.setVisible(false);
    }
    
    private void deseleziona(ArrayList<JToggleButton> bottoni){
        for(JToggleButton button: bottoni){
            button.setSelected(false);
        }
    }
    
    private String prendiNome(ArrayList<JToggleButton> bottoni){
        String nome = null;
        for(JToggleButton button: bottoni){
            if(button.isSelected()){
                nome = button.getText();
            }
        }
        return nome;
    }
    
    private ImageIcon sceltaImmagine(String nome){
        ImageIcon icon = null;
        if(nome.equals("Druido")){
            icon = new ImageIcon(getClass().getResource("/immagini/druidSmall.png"));
        }
        if(nome.equals("Cacciatore")){
            icon = new ImageIcon(getClass().getResource("/immagini/HunterSmall.png"));
        }
        if(nome.equals("Ladro")){
            icon = new ImageIcon(getClass().getResource("/immagini/rogueSmall.png"));
        }
        if(nome.equals("Mago")){
            icon = new ImageIcon(getClass().getResource("/immagini/mageSmall.png"));
        }
        if(nome.equals("Guerriero")){
            icon = new ImageIcon(getClass().getResource("/immagini/warriorSmall.png"));
        }
        if(nome.equals("Paladino")){
            icon = new ImageIcon(getClass().getResource("/immagini/paladinSmall.png"));
        }
        if(nome.equals("Sciamano")){
            icon = new ImageIcon(getClass().getResource("/immagini/shamanSmall.png"));
        }
        if(nome.equals("Sacerdote")){
            icon = new ImageIcon(getClass().getResource("/immagini/priesSmall.png"));
        }
        if(nome.equals("Stregone")){
            icon = new ImageIcon(getClass().getResource("/immagini/warlockSmall.png"));
        }
        return icon;
    }
    
    private Giocatore creaGiocatore(String nome){
        return new Giocatore(30, 0, 4, 26, 0, 0, nome); 
    }
}
