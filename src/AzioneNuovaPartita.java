
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JFrame;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author derrik
 */
public class AzioneNuovaPartita extends AbstractAction {

    private FrameSceltaMazzo fsm;
    private VistaPrincipale vp;
    
    public AzioneNuovaPartita(VistaPrincipale vp, FrameSceltaMazzo fsm){
        this.putValue(NAME, "Nuova Partita");
        this.putValue(Action.SHORT_DESCRIPTION, "Premi per resettare i contatori ed iniziare una nuova partita");
        this.vp = vp;
        this.fsm = fsm;
        
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        fsm.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        fsm.setVisible(true);
        vp.getContatoreTurno().setText("0");
        vp.setTurno(0);
        vp.getPv().setValue(30);
        vp.getPv1().setValue(30);
        vp.getCig().setValue(0);
        vp.getCig1().setValue(0);
        vp.getCim1().setValue(4);
        vp.getCim().setValue(4);
        vp.getCiz().setValue(26);
        vp.getCiz1().setValue(26);
        vp.getDig1().setValue(0);
        vp.getDig().setValue(0);
        vp.getSSP().setValue(0);
        vp.getSSP1().setValue(0);
        vp.getTotale().setText("" + 0);
        vp.getTotale1().setText("" + 0);
        vp.getPercentualeAvversario().setText("%");
        vp.getPercentualeTu().setText("%");
        vp.getImmagineEsito().setIcon(null);
        vp.setGrafico(new Grafico());
    }
    
}
