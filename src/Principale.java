
import it.derrik.Controllo.AzioneNuovaPartita;
import it.derrik.Vista.FrameSceltaMazzo;
import it.derrik.Vista.VistaPrincipale;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author derrik
 */
public class Principale extends javax.swing.JFrame {

    /**
     * Creates new form Principale
     */
    VistaPrincipale vp;
    FrameSceltaMazzo fsm;

    public Principale() {
        initComponents();
        this.setTitle("HS Advantage Calculator");
        vp = new VistaPrincipale();
        this.setContentPane(vp);
        this.pack();
        this.setResizable(false);
        fsm = vp.getFsm();
        this.menuNuovaPartita.setAction(new AzioneNuovaPartita(vp, fsm));

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        menuFile = new javax.swing.JMenu();
        menuNuovaPartita = new javax.swing.JMenuItem();
        menuEsci = new javax.swing.JMenuItem();
        menuInfo = new javax.swing.JMenu();
        menuAbout = new javax.swing.JMenuItem();
        menuHow = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        menuFile.setText("File");

        menuNuovaPartita.setText("Nuova Partita");
        menuFile.add(menuNuovaPartita);

        menuEsci.setText("Esci");
        menuEsci.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuEsciActionPerformed(evt);
            }
        });
        menuFile.add(menuEsci);

        jMenuBar1.add(menuFile);

        menuInfo.setText("?");

        menuAbout.setText("About");
        menuAbout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAboutActionPerformed(evt);
            }
        });
        menuInfo.add(menuAbout);

        menuHow.setText("Come funziona");
        menuHow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuHowActionPerformed(evt);
            }
        });
        menuInfo.add(menuHow);

        jMenuBar1.add(menuInfo);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 279, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuEsciActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuEsciActionPerformed
        System.exit(0);
    }//GEN-LAST:event_menuEsciActionPerformed

    private void menuHowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuHowActionPerformed
       JOptionPane.showMessageDialog(this, "Come Funziona:\n"
                + "Clicca su Nuova Partita all'inizio del gioco, selezionando la classe con cui giocherai e quella dell'avversario per iniziare la partita \n"
                + "Inserisci alla fine del tuo turno i valori richiesti (sono dati facilissimi da trovare) e premi il tasto Nuovo Turno.\n"
                + "Verrà visualizzata una percentuale che indica una stima dell'andamento della partita in base all'ultima giocata fatta. \n Ovviamente si può calcolare in qualsiasi momento della partita, ma è consigliabile farlo alla fine del proprio turno.\n", "Come si usa", JOptionPane.INFORMATION_MESSAGE);
        
    }//GEN-LAST:event_menuHowActionPerformed

    private void menuAboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAboutActionPerformed
        JOptionPane.showMessageDialog(vp, "Versione 1.0 \n"
                + "Author: Francesco D'Errico \n"
                + "Contact me: francesco.derrik@gmail.com");
    }//GEN-LAST:event_menuAboutActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info
                    : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principale.class.getName()).log(
                    java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principale.class.getName()).log(
                    java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principale.class.getName()).log(
                    java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principale.class.getName()).log(
                    java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principale().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem menuAbout;
    private javax.swing.JMenuItem menuEsci;
    private javax.swing.JMenu menuFile;
    private javax.swing.JMenuItem menuHow;
    private javax.swing.JMenu menuInfo;
    private javax.swing.JMenuItem menuNuovaPartita;
    // End of variables declaration//GEN-END:variables
}
