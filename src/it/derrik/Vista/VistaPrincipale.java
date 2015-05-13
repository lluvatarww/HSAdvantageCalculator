package it.derrik.Vista;


import it.derrik.Controllo.AzioneGAP;
import it.derrik.Controllo.AzioneNuovaPartita;
import it.derrik.Controllo.AzioneNuovoTurno;
import it.derrik.Modello.Suggeritore;
import it.derrik.Modello.Grafico;
import it.derrik.Modello.Giocatore;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTextArea;
import javax.swing.JTextField;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author derrik
 */
public class VistaPrincipale extends javax.swing.JPanel {

  
    public VistaPrincipale() {
        initComponents();
        this.jTextArea1.setEditable(false);
        this.jTextArea1.setText("Qui usciranno dei suggerimenti durante la partita");
        this.fsm = new FrameSceltaMazzo(this);
        this.bottoneNuovaPartita.setAction(new AzioneNuovaPartita(this, fsm));
        this.vg.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.GAP.setAction(new AzioneGAP(this));
        this.vg.setResizable(false);
        this.bottoneNuovoTurno.setAction(new AzioneNuovoTurno(this));
        this.bottoneNuovoTurno.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pannelloGiocatore1 = new javax.swing.JPanel();
        pv = new javax.swing.JSpinner();
        javax.swing.JLabel jLabel1 = new javax.swing.JLabel();
        cig = new javax.swing.JSpinner();
        javax.swing.JLabel jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cim = new javax.swing.JSpinner();
        javax.swing.JLabel jLabel5 = new javax.swing.JLabel();
        ciz = new javax.swing.JSpinner();
        javax.swing.JLabel jlabel6 = new javax.swing.JLabel();
        dig = new javax.swing.JSpinner();
        javax.swing.JLabel jlabeldanni = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        totale = new javax.swing.JTextField();
        SSP = new javax.swing.JSpinner();
        javax.swing.JLabel jLabel6 = new javax.swing.JLabel();
        pannelloBasso = new javax.swing.JPanel();
        percentualeTu = new javax.swing.JLabel();
        percentualeAvversario = new javax.swing.JLabel();
        immagineEsito = new javax.swing.JLabel();
        immagineMazzo = new javax.swing.JLabel();
        immagineMazzoAvversario = new javax.swing.JLabel();
        pannelloGiocatore2 = new javax.swing.JPanel();
        pv1 = new javax.swing.JSpinner();
        javax.swing.JLabel jLabel7 = new javax.swing.JLabel();
        cig1 = new javax.swing.JSpinner();
        javax.swing.JLabel jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        cim1 = new javax.swing.JSpinner();
        javax.swing.JLabel jLabel13 = new javax.swing.JLabel();
        ciz1 = new javax.swing.JSpinner();
        javax.swing.JLabel jlabel7 = new javax.swing.JLabel();
        dig1 = new javax.swing.JSpinner();
        javax.swing.JLabel jlabeldanni1 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        totale1 = new javax.swing.JTextField();
        SSP1 = new javax.swing.JSpinner();
        javax.swing.JLabel jLabel4 = new javax.swing.JLabel();
        info = new javax.swing.JButton();
        bottoneNuovoTurno = new javax.swing.JButton();
        bottoneNuovaPartita = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        javax.swing.JLabel labelTurni = new javax.swing.JLabel();
        contatoreTurno = new javax.swing.JLabel();
        GAP = new javax.swing.JButton();

        pannelloGiocatore1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        pannelloGiocatore1.setToolTipText("il totale è calcolato secondo la formula PuntiVita + dannoInGioco - dannoAvversario + carteInGioco + 4 * ( carte in mano+ carte nel mazzo)");

        pv.setModel(new javax.swing.SpinnerNumberModel(30, 0, 100, 1));

        jLabel1.setText("Punti Vita");
        jLabel1.setToolTipText("punti vita totali compresa l'armatura");

        cig.setModel(new javax.swing.SpinnerNumberModel(0, 0, 7, 1));

        jLabel2.setText("Servitori in Gioco");
        jLabel2.setToolTipText("inserisci il numero delle carte in gioco, compresi i poteri eroe");

        jLabel3.setText("Avversario");

        cim.setModel(new javax.swing.SpinnerNumberModel(4, 0, 10, 1));

        jLabel5.setText("Carte in Mano");
        jLabel5.setToolTipText("non si conta la moneta iniziale");

        ciz.setModel(new javax.swing.SpinnerNumberModel(26, 0, 26, 1));

        jlabel6.setText("Carte nel Mazzo");

        dig.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(0), Integer.valueOf(0), null, Integer.valueOf(1)));

        jlabeldanni.setText("Danni In Gioco");
        jlabeldanni.setToolTipText("danni di tutti i minion con i propri poteri attivi,  più attacco eroe dovuto a poteri, magie, armi. ");

        jLabel8.setText("Totale");
        jLabel8.setToolTipText("il totale è calcolato secondo la formula:  Punti Vita + danno In Gioco - danno Avversario + 2* servitori in campo + 4 * carte in mano+ carte nel mazzo");

        totale.setEditable(false);
        totale.setToolTipText("Totale");

        SSP.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(0), Integer.valueOf(0), null, Integer.valueOf(1)));

        jLabel6.setText("SSP");
        jLabel6.setToolTipText("SSP vuol dire Salute Servitori con Provocazione. ");

        javax.swing.GroupLayout pannelloGiocatore1Layout = new javax.swing.GroupLayout(pannelloGiocatore1);
        pannelloGiocatore1.setLayout(pannelloGiocatore1Layout);
        pannelloGiocatore1Layout.setHorizontalGroup(
            pannelloGiocatore1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pannelloGiocatore1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pannelloGiocatore1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pannelloGiocatore1Layout.createSequentialGroup()
                        .addComponent(cig, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2))
                    .addGroup(pannelloGiocatore1Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jLabel3))
                    .addGroup(pannelloGiocatore1Layout.createSequentialGroup()
                        .addComponent(cim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5))
                    .addGroup(pannelloGiocatore1Layout.createSequentialGroup()
                        .addComponent(ciz, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jlabel6))
                    .addGroup(pannelloGiocatore1Layout.createSequentialGroup()
                        .addComponent(dig, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jlabeldanni))
                    .addGroup(pannelloGiocatore1Layout.createSequentialGroup()
                        .addComponent(totale, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel8))
                    .addGroup(pannelloGiocatore1Layout.createSequentialGroup()
                        .addComponent(SSP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel6))
                    .addGroup(pannelloGiocatore1Layout.createSequentialGroup()
                        .addComponent(pv, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        pannelloGiocatore1Layout.setVerticalGroup(
            pannelloGiocatore1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pannelloGiocatore1Layout.createSequentialGroup()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pannelloGiocatore1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(pannelloGiocatore1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cig, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(pannelloGiocatore1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(pannelloGiocatore1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ciz, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlabel6))
                .addGap(18, 18, 18)
                .addGroup(pannelloGiocatore1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dig, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlabeldanni))
                .addGap(18, 18, 18)
                .addGroup(pannelloGiocatore1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(SSP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(pannelloGiocatore1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(totale, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addContainerGap())
        );

        pannelloBasso.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        percentualeTu.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        percentualeTu.setText("%");

        percentualeAvversario.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        percentualeAvversario.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        percentualeAvversario.setText("%");

        immagineMazzo.setText(" ");

        immagineMazzoAvversario.setText(" ");

        javax.swing.GroupLayout pannelloBassoLayout = new javax.swing.GroupLayout(pannelloBasso);
        pannelloBasso.setLayout(pannelloBassoLayout);
        pannelloBassoLayout.setHorizontalGroup(
            pannelloBassoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pannelloBassoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(immagineMazzo)
                .addGap(36, 36, 36)
                .addComponent(percentualeTu, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(immagineEsito, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(percentualeAvversario, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(immagineMazzoAvversario)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pannelloBassoLayout.setVerticalGroup(
            pannelloBassoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pannelloBassoLayout.createSequentialGroup()
                .addGroup(pannelloBassoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pannelloBassoLayout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(pannelloBassoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pannelloBassoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(percentualeTu)
                                .addComponent(immagineMazzo))
                            .addGroup(pannelloBassoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(percentualeAvversario)
                                .addComponent(immagineMazzoAvversario)))
                        .addGap(0, 26, Short.MAX_VALUE))
                    .addComponent(immagineEsito, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pannelloGiocatore2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        pv1.setModel(new javax.swing.SpinnerNumberModel(30, 0, 100, 1));

        jLabel7.setText("Punti Vita");
        jLabel7.setToolTipText("punti vita totali compresa l'armatura");

        cig1.setModel(new javax.swing.SpinnerNumberModel(0, 0, 7, 1));

        jLabel11.setText("Servitori in Gioco");
        jLabel11.setToolTipText("inserisci il numero delle carte in gioco, compresi i poteri eroe");

        jLabel12.setText("Tu");

        cim1.setModel(new javax.swing.SpinnerNumberModel(4, 0, 10, 1));

        jLabel13.setText("Carte in Mano");
        jLabel13.setToolTipText("non si conta la moneta iniziale");

        ciz1.setModel(new javax.swing.SpinnerNumberModel(26, 0, 26, 1));

        jlabel7.setText("Carte nel Mazzo");

        dig1.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(0), Integer.valueOf(0), null, Integer.valueOf(1)));

        jlabeldanni1.setText("Danni In Gioco");
        jlabeldanni1.setToolTipText("danni di tutti i minion con i propri poteri attivi,  più attacco eroe dovuto a poteri, magie, armi. ");

        jLabel14.setText("Totale");
        jLabel14.setToolTipText("il totale è calcolato secondo la formula:  Punti Vita + danno In Gioco - danno Avversario + 2* servitori in campo + 4 * carte in mano+ carte nel mazzo + totale salute dei servitori con provocazione");

        totale1.setEditable(false);
        totale1.setToolTipText("Totale");

        SSP1.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(0), Integer.valueOf(0), null, Integer.valueOf(1)));

        jLabel4.setText("SSP");
        jLabel4.setToolTipText("SSP vuol dire Salute Servitori con Provocazione. ");

        javax.swing.GroupLayout pannelloGiocatore2Layout = new javax.swing.GroupLayout(pannelloGiocatore2);
        pannelloGiocatore2.setLayout(pannelloGiocatore2Layout);
        pannelloGiocatore2Layout.setHorizontalGroup(
            pannelloGiocatore2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pannelloGiocatore2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pannelloGiocatore2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pannelloGiocatore2Layout.createSequentialGroup()
                        .addComponent(cig1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel11))
                    .addGroup(pannelloGiocatore2Layout.createSequentialGroup()
                        .addComponent(pv1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pannelloGiocatore2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(jLabel7)))
                    .addGroup(pannelloGiocatore2Layout.createSequentialGroup()
                        .addComponent(cim1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel13))
                    .addGroup(pannelloGiocatore2Layout.createSequentialGroup()
                        .addComponent(ciz1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jlabel7))
                    .addGroup(pannelloGiocatore2Layout.createSequentialGroup()
                        .addComponent(dig1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jlabeldanni1))
                    .addGroup(pannelloGiocatore2Layout.createSequentialGroup()
                        .addComponent(totale1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel14))
                    .addGroup(pannelloGiocatore2Layout.createSequentialGroup()
                        .addComponent(SSP1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pannelloGiocatore2Layout.setVerticalGroup(
            pannelloGiocatore2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pannelloGiocatore2Layout.createSequentialGroup()
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pannelloGiocatore2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pv1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(pannelloGiocatore2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cig1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addGap(18, 18, 18)
                .addGroup(pannelloGiocatore2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cim1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addGap(18, 18, 18)
                .addGroup(pannelloGiocatore2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ciz1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlabel7))
                .addGap(18, 18, 18)
                .addGroup(pannelloGiocatore2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dig1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlabeldanni1))
                .addGap(18, 18, 18)
                .addGroup(pannelloGiocatore2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SSP1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(pannelloGiocatore2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(totale1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addContainerGap())
        );

        info.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        info.setText("?");
        info.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                infoActionPerformed(evt);
            }
        });

        bottoneNuovoTurno.setText("Nuovo Turno");
        bottoneNuovoTurno.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        bottoneNuovoTurno.setEnabled(false);

        bottoneNuovaPartita.setText("Nuova Partita");
        bottoneNuovaPartita.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jScrollPane1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Hints", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 10))); // NOI18N

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(30);
        jTextArea1.setFont(new java.awt.Font("Bell MT", 0, 14)); // NOI18N
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jTextArea1.setWrapStyleWord(true);
        jTextArea1.setBorder(null);
        jTextArea1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane1.setViewportView(jTextArea1);

        labelTurni.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelTurni.setText("Turni");

        contatoreTurno.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        contatoreTurno.setText("0");

        GAP.setText("GAP");
        GAP.setToolTipText("Premi per mostrare il Grafico Andamento Partita");
        GAP.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pannelloBasso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pannelloGiocatore2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(bottoneNuovaPartita, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bottoneNuovoTurno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labelTurni, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(info, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(contatoreTurno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(GAP, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(pannelloGiocatore1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pannelloGiocatore2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pannelloGiocatore1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bottoneNuovaPartita)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bottoneNuovoTurno)
                        .addGap(18, 18, 18)
                        .addComponent(labelTurni)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(contatoreTurno)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(GAP, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(info, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pannelloBasso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void infoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_infoActionPerformed
        JOptionPane.showMessageDialog(this, "Come Funziona:\n"
                + "Clicca su Nuova Partita all'inizio del gioco, selezionando la classe con cui giocherai e quella dell'avversario per iniziare la partita \n"
                + "Inserisci alla fine del tuo turno i valori richiesti (sono dati facilissimi da trovare) e premi il tasto Nuovo Turno.\n"
                + "Verrà visualizzata una percentuale che indica una stima dell'andamento della partita in base all'ultima giocata fatta. \n Ovviamente si può calcolare in qualsiasi momento della partita, ma è consigliabile farlo alla fine del proprio turno.\n", "Come si usa", JOptionPane.INFORMATION_MESSAGE);
        
    }//GEN-LAST:event_infoActionPerformed
    
    
    
    public int percentuale(int a, int b) {
        return (a * 100) / (a + b);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton GAP;
    private javax.swing.JSpinner SSP;
    private javax.swing.JSpinner SSP1;
    private javax.swing.JButton bottoneNuovaPartita;
    private javax.swing.JButton bottoneNuovoTurno;
    private javax.swing.JSpinner cig;
    private javax.swing.JSpinner cig1;
    private javax.swing.JSpinner cim;
    private javax.swing.JSpinner cim1;
    private javax.swing.JSpinner ciz;
    private javax.swing.JSpinner ciz1;
    private javax.swing.JLabel contatoreTurno;
    private javax.swing.JSpinner dig;
    private javax.swing.JSpinner dig1;
    private javax.swing.JLabel immagineEsito;
    private javax.swing.JLabel immagineMazzo;
    private javax.swing.JLabel immagineMazzoAvversario;
    private javax.swing.JButton info;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JPanel pannelloBasso;
    private javax.swing.JPanel pannelloGiocatore1;
    private javax.swing.JPanel pannelloGiocatore2;
    private javax.swing.JLabel percentualeAvversario;
    private javax.swing.JLabel percentualeTu;
    private javax.swing.JSpinner pv;
    private javax.swing.JSpinner pv1;
    private javax.swing.JTextField totale;
    private javax.swing.JTextField totale1;
    // End of variables declaration//GEN-END:variables

    private Giocatore giocatore1;
    private Giocatore giocatore2;
    private int turno = 0;
    private Grafico grafico = new Grafico();
    private Suggeritore suggeritore;
    private FrameSceltaMazzo fsm;
    VistaGrafico vg = new VistaGrafico();
    JPanel panel = new JPanel();
    JButton button = new JButton("Chiudi");
    
    public JLabel getContatoreTurno() {
        return contatoreTurno;
    }
    
    public void setContatoreTurno(JLabel contatoreTurno) {
        this.contatoreTurno = contatoreTurno;
    }
    
    public int getTurno() {
        return turno;
    }
    
    public void setTurno(int turno) {
        this.turno = turno;
    }
    
    public Grafico getGrafico() {
        return grafico;
    }
    
    public void setGrafico(Grafico grafico) {
        this.grafico = grafico;
    }
    
    public JSpinner getSSP() {
        return SSP;
    }
    
    public void setSSP(JSpinner SSP) {
        this.SSP = SSP;
    }
    
    public JSpinner getSSP1() {
        return SSP1;
    }
    
    public void setSSP1(JSpinner SSP1) {
        this.SSP1 = SSP1;
    }
    
    public JButton getBottoneNuovaPartita() {
        return bottoneNuovaPartita;
    }
    
    public void setBottoneNuovaPartita(JButton bottoneNuovaPartita) {
        this.bottoneNuovaPartita = bottoneNuovaPartita;
    }
    
    public JButton getBottoneNuovoTurno() {
        return bottoneNuovoTurno;
    }
    
    public void setBottoneNuovoTurno(JButton bottoneNuovoTurno) {
        this.bottoneNuovoTurno = bottoneNuovoTurno;
    }
    
    public JSpinner getCig() {
        return cig;
    }
    
    public void setCig(JSpinner cig) {
        this.cig = cig;
    }
    
    public JSpinner getCig1() {
        return cig1;
    }
    
    public void setCig1(JSpinner cig1) {
        this.cig1 = cig1;
    }
    
    public JSpinner getCim() {
        return cim;
    }
    
    public void setCim(JSpinner cim) {
        this.cim = cim;
    }
    
    public JSpinner getCim1() {
        return cim1;
    }
    
    public void setCim1(JSpinner cim1) {
        this.cim1 = cim1;
    }
    
    public JSpinner getCiz() {
        return ciz;
    }
    
    public void setCiz(JSpinner ciz) {
        this.ciz = ciz;
    }
    
    public JSpinner getCiz1() {
        return ciz1;
    }
    
    public void setCiz1(JSpinner ciz1) {
        this.ciz1 = ciz1;
    }
    
    public JSpinner getDig() {
        return dig;
    }
    
    public void setDig(JSpinner dig) {
        this.dig = dig;
    }
    
    public JSpinner getDig1() {
        return dig1;
    }
    
    public void setDig1(JSpinner dig1) {
        this.dig1 = dig1;
    }
    
    public JLabel getImmagineEsito() {
        return immagineEsito;
    }
    
    public void setImmagineEsito(JLabel immagineEsito) {
        this.immagineEsito = immagineEsito;
    }
    
    public JLabel getImmagineMazzo() {
        return immagineMazzo;
    }
    
    public void setImmagineMazzo(JLabel immagineMazzo) {
        this.immagineMazzo = immagineMazzo;
    }
    
    public JLabel getImmagineMazzoAvversario() {
        return immagineMazzoAvversario;
    }
    
    public void setImmagineMazzoAvversario(JLabel immagineMazzoAvversario) {
        this.immagineMazzoAvversario = immagineMazzoAvversario;
    }
    
    public JButton getInfo() {
        return info;
    }
    
    public void setInfo(JButton info) {
        this.info = info;
    }
    
    public JTextArea getjTextArea1() {
        return jTextArea1;
    }
    
    public void setjTextArea1(JTextArea jTextArea1) {
        this.jTextArea1 = jTextArea1;
    }
    
    public JLabel getPercentualeAvversario() {
        return percentualeAvversario;
    }
    
    public void setPercentualeAvversario(JLabel percentualeAvversario) {
        this.percentualeAvversario = percentualeAvversario;
    }
    
    public JLabel getPercentualeTu() {
        return percentualeTu;
    }
    
    public void setPercentualeTu(JLabel percentualeTu) {
        this.percentualeTu = percentualeTu;
    }
    
    public JSpinner getPv() {
        return pv;
    }
    
    public void setPv(JSpinner pv) {
        this.pv = pv;
    }
    
    public JSpinner getPv1() {
        return pv1;
    }
    
    public void setPv1(JSpinner pv1) {
        this.pv1 = pv1;
    }
    
    public JTextField getTotale() {
        return totale;
    }
    
    public void setTotale(JTextField totale) {
        this.totale = totale;
    }
    
    public JTextField getTotale1() {
        return totale1;
    }
    
    public void setTotale1(JTextField totale1) {
        this.totale1 = totale1;
    }
    
    public Giocatore getGiocatore1() {
        return giocatore1;
    }
    
    public void setGiocatore1(Giocatore giocatore1) {
        this.giocatore1 = giocatore1;
    }
    
    public Giocatore getGiocatore2() {
        return giocatore2;
    }
    
    public void setGiocatore2(Giocatore giocatore2) {
        this.giocatore2 = giocatore2;
    }
    
    public JButton getGAP() {
        return GAP;
    }
    
    public void setGAP(JButton GAP) {
        this.GAP = GAP;
    }
    
    public Suggeritore getSuggeritore() {
        return suggeritore;
    }
    
    public void setSuggeritore(Suggeritore suggeritore) {
        this.suggeritore = suggeritore;
    }
    
    public FrameSceltaMazzo getFsm() {
        return fsm;
    }
    
    public void setFsm(FrameSceltaMazzo fsm) {
        this.fsm = fsm;
    }

    public VistaGrafico getVg() {
        return vg;
    }

    public void setVg(VistaGrafico vg) {
        this.vg = vg;
    }

    public JPanel getPanel() {
        return panel;
    }

    public void setPanel(JPanel panel) {
        this.panel = panel;
    }

    public JButton getButton() {
        return button;
    }

    public void setButton(JButton button) {
        this.button = button;
    }
    
    
}
