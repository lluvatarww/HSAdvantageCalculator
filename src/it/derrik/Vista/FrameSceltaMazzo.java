package it.derrik.Vista;


import it.derrik.Controllo.AzioneScelta;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
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
public class FrameSceltaMazzo extends javax.swing.JFrame {

    /**
     * Creates new form FrameSceltaMazzo
     */
    
    private VistaSceltaMazzo tu = new VistaSceltaMazzo("Tu");
    private VistaSceltaMazzo avversario = new VistaSceltaMazzo("Avversario");
    private JButton bottoneScelta = new JButton("Inizia");
    private VistaPrincipale vp;
    
    public FrameSceltaMazzo(VistaPrincipale vp) {
        initComponents();
        this.vp = vp;
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout(10, 10));
        panel.add( new JLabel("Scegli i campioni in gioco"),BorderLayout.NORTH);
        panel.add(tu,BorderLayout.WEST);
        panel.add(avversario,BorderLayout.EAST);
        panel.add(bottoneScelta, BorderLayout.SOUTH);
        bottoneScelta.setAction(new AzioneScelta(this, vp));
        this.setContentPane(panel);
        this.setAlwaysOnTop(true);
        this.pack();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables

    public VistaSceltaMazzo getTu() {
        return tu;
    }

    public void setTu(VistaSceltaMazzo tu) {
        this.tu = tu;
    }

    public VistaSceltaMazzo getAvversario() {
        return avversario;
    }

    public void setAvversario(VistaSceltaMazzo avversario) {
        this.avversario = avversario;
    }

    public JButton getBottoneScelta() {
        return bottoneScelta;
    }

    public void setBottoneScelta(JButton bottoneScelta) {
        this.bottoneScelta = bottoneScelta;
    }
}
