package it.derrik.Modello;

import it.derrik.Vista.VistaPrincipale;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author derrik
 */
public class Suggeritore {

    private Giocatore giocatore1;
    private Giocatore giocatore2;
    private ArrayList<String> suggerimenti = new ArrayList<String>();
    private VistaPrincipale vp;

    public Suggeritore(Giocatore giocatore1, Giocatore giocatore2, VistaPrincipale vp) {
        this.giocatore1 = giocatore1;
        this.giocatore2 = giocatore2;
        this.vp = vp;
    }

    private void suggerimentiSalute() {
        if (giocatore1.getPv() <= 10) {
            suggerimenti.add(StringheSuggerimenti.SALUTEBASSATU);
        }
        if (giocatore1.getPv() >= 25) {
            suggerimenti.add(StringheSuggerimenti.SALUTEALTATU);
        }
        if (giocatore2.getPv() <= 7) {
            suggerimenti.add(StringheSuggerimenti.SALUTEBASSAAVVERSARIO);
        }
        if (giocatore2.getPv() >= 24) {
            suggerimenti.add(StringheSuggerimenti.SALUTEALTAAVVERSARIO);
        }
        if (giocatore1.getPv() > giocatore2.getPv()) {
            suggerimenti.add(StringheSuggerimenti.SALUTEMAGGIORE);
        }
        if (giocatore2.getPv() > giocatore1.getPv()) {
            suggerimenti.add(StringheSuggerimenti.SALUTEMINORE);
        }
    }

    private void suggerimentiDanni() {
        if (giocatore1.getDanniInGioco() > giocatore2.getSaluteProvocazione() && giocatore1.getDanniInGioco() >= 4 && giocatore2.getPv() > giocatore1.getDanniInGioco()) {
            if (giocatore2.getCarteInGioco() == 0) {
                suggerimenti.add(StringheSuggerimenti.DANNIMAGGIORI);
            }
            if (giocatore2.getSaluteProvocazione() >= 1) {
                suggerimenti.add(StringheSuggerimenti.DANNIMAGGIORIPROVOCAZIONE);
            }
        }
        if (giocatore1.getDanniInGioco() < 4 && giocatore1.getCarteInGioco() > 0) {
            if (giocatore2.getCarteInGioco() != 0) {
                suggerimenti.add(StringheSuggerimenti.DANNIMINORI);
            } else {
                suggerimenti.add(StringheSuggerimenti.DANNIMAGGIORI);
            }
        }
        if (giocatore1.getSaluteProvocazione() >= giocatore2.getDanniInGioco() && giocatore1.getSaluteProvocazione() > 0) {
            suggerimenti.add(StringheSuggerimenti.DANNINEMICOPROVOCAZIONE);
        }
        if (giocatore1.getSaluteProvocazione() < giocatore2.getDanniInGioco()) {
            suggerimenti.add("Giocare servitori con provocazione non ti farà perdere punti vita");
        }
        if (giocatore1.getDanniInGioco() > giocatore2.getPv() + giocatore2.getSaluteProvocazione()) {
            suggerimenti.add(StringheSuggerimenti.DANNILETALI);
        }
        if (giocatore2.getDanniInGioco() > giocatore1.getPv() + giocatore1.getSaluteProvocazione()) {
            suggerimenti.add(StringheSuggerimenti.DANNILETALINEMICO);
        }
    }

    private void suggerimentiServitori() {
        if (vp.getTurno() > 1 && giocatore1.getCarteInGioco() == 0) {
            suggerimenti.add(StringheSuggerimenti.NESSUNSERVITORE);
        }
        if (vp.getTurno() > 1 && giocatore2.getCarteInGioco() == 0) {
            suggerimenti.add(StringheSuggerimenti.NESSUNSERVITORENEMICO);
        }
        if (giocatore1.getCarteInGioco() > 0 && giocatore1.getCarteInGioco() > giocatore2.getCarteInGioco()) {
            suggerimenti.add(StringheSuggerimenti.SERVITORIMAGGIORI);
        }
        if (giocatore2.getCarteInGioco() > 0 && giocatore2.getCarteInGioco() > giocatore1.getCarteInGioco()) {
            suggerimenti.add(StringheSuggerimenti.SERVITORIMINORI);
        }
        if (giocatore1.getCarteInGioco() > 4) {
            suggerimenti.add(StringheSuggerimenti.MOLTISERVITORI);
        }
        if (giocatore1.getSaluteProvocazione() > 0) {
            suggerimenti.add(StringheSuggerimenti.SERVITORIPROVOCAZIONE);
        }
        if (giocatore2.getSaluteProvocazione() > 0) {
            suggerimenti.add(StringheSuggerimenti.SERVITORIPROVOCAZIONEAVV);
        }
    }

    private void suggerimentiCarteMano() {
        if (giocatore1.getCarteInMano() >= 4) {
            this.suggerimenti.add(StringheSuggerimenti.MOLTECARTEINMANO);
        }
        if (giocatore1.getCarteInMano() <= 2 && giocatore1.getCarteInMano() > 0) {
            this.suggerimenti.add(StringheSuggerimenti.POCHECARTEINMANO);
        }
        if (giocatore1.getCarteInMano() > giocatore2.getCarteInMano()) {
            this.suggerimenti.add(StringheSuggerimenti.CARTEMAGGIORI);
        }
        if (giocatore1.getCarteInMano() < giocatore2.getCarteInMano()) {
            this.suggerimenti.add(StringheSuggerimenti.CARTEMINORI);
        }
        if (giocatore1.getCarteInMano() == 0) {
            this.suggerimenti.add(StringheSuggerimenti.NESSUNACARTAINMANO);
        }
        if (giocatore1.getCarteInMano() == 0) {
            this.suggerimenti.add(StringheSuggerimenti.NESSUNACARTAAVV);
        }
    }

    private void suggerimentiCarteMazzo() {
        if (giocatore1.getCarteInMazzo() > 0 && giocatore2.getCarteInMazzo() > 0 && giocatore1.getCarteInMazzo() > giocatore2.getCarteInMazzo()) {
            this.suggerimenti.add(StringheSuggerimenti.PIUCARTE);
        }
        if (giocatore1.getCarteInMazzo() > 0 && giocatore2.getCarteInMazzo() > 0 && giocatore2.getCarteInMazzo() > giocatore1.getCarteInMazzo()) {
            this.suggerimenti.add(StringheSuggerimenti.MENOCARTE);
        }
        if (giocatore1.getCarteInMazzo() > 4 && giocatore1.getCarteInMazzo() <= 10) {
            this.suggerimenti.add(StringheSuggerimenti.POCHECARTE);
        }
        if (giocatore2.getCarteInMazzo() > 4 && giocatore2.getCarteInMazzo() <= 10) {
            this.suggerimenti.add(StringheSuggerimenti.POCHECARTEAVV);
        }
        if (giocatore1.getCarteInMazzo() > 0 && giocatore1.getCarteInMazzo() <= 4) {
            this.suggerimenti.add(StringheSuggerimenti.POCHISSIMECARTE);
        }
        if (giocatore1.getCarteInMazzo() == 0) {
            this.suggerimenti.add(StringheSuggerimenti.NESSUNACARTA);
        }
        if (giocatore2.getCarteInMazzo() == 0) {
            this.suggerimenti.add(StringheSuggerimenti.NESSUNACARTAAVVERSARIO);
        }
    }

    private void suggerimentiTurno() {
        if (vp.getTurno() == 2) {
            this.suggerimenti.add(StringheSuggerimenti.TURNO2);
        }
        if (vp.getTurno() == 3 && this.giocatore1.getCarteInGioco() == 0) {
            this.suggerimenti.add(StringheSuggerimenti.TURNO3NOSERVITORI);
        }
        if (vp.getTurno() == 3 && this.giocatore2.getCarteInGioco() == 0) {
            this.suggerimenti.add(StringheSuggerimenti.TURNO3NOSERVITORINEMICI);
        }
        if (vp.getTurno() == 6) {
            this.suggerimenti.add(StringheSuggerimenti.TURNO6);
        }
        if (vp.getTurno() == 10) {
            this.suggerimenti.add(StringheSuggerimenti.TURNO10);
        }
    }

    private void suggerimentiEroe() {
        if ("Druido".equals(giocatore1.getEroe())) {
            this.suggerimentiDruido();
        }
        if ("Druido".equals(giocatore2.getEroe())) {
            this.suggerimentiDruidoAvv();
        }
        if ("Cacciatore".equals(giocatore1.getEroe())) {
            this.suggerimentiCacciatoreTu();
        }
        if ("Cacciatore".equals(giocatore2.getEroe())) {
            this.suggerimentiCacciatoreAvv();
        }
        if ("Guerriero".equals(giocatore1.getEroe())) {
            this.suggerimentiGuerriero();
        }
        if ("Guerriero".equals(giocatore2.getEroe())) {
            this.suggerimentiGuerrieroAvv();
        }
        if ("Ladro".equals(giocatore1.getEroe())) {
            this.suggerimentiLadro();
        }
        if ("Ladro".equals(giocatore2.getEroe())) {
            this.suggerimentiLadroAvv();
        }
        if ("Mago".equals(giocatore1.getEroe())) {
            this.suggerimentiMago();
        }
        if ("Mago".equals(giocatore2.getEroe())) {
            this.suggerimentiMagoAvv();
        }
        if ("Paladino".equals(giocatore1.getEroe())) {
            this.suggerimentiPaladino();
        }
        if ("Paladino".equals(giocatore1.getEroe())) {
            this.suggerimentiPaladinoAvv();
        }
        if ("Sacerdote".equals(giocatore1.getEroe())) {
            this.suggerimentiSacerdote();
        }
        if ("Sacerdote".equals(giocatore2.getEroe())) {
            this.suggerimentiSacerdoteAvv();
        }
        if ("Sciamano".equals(giocatore1.getEroe())) {
            this.suggerimentiSciamano();
        }
        if ("Sciamano".equals(giocatore2.getEroe())) {
            this.suggerimentiSciamanoAvv();
        }
        if ("Stregone".equals(giocatore1.getEroe())) {
            this.suggerimentiStregone();
        }
        if ("Stregone".equals(giocatore2.getEroe())) {
            this.suggerimentiStregoneAvv();
        }
    }

    private void suggerimentiCacciatoreTu() {
        if (giocatore2.getPv() < 8) {
            this.suggerimenti.add(StringheSuggerimenti.POCAVITAAVVCACC);
        }
        if (giocatore1.getCarteInGioco() > 4) {
            this.suggerimenti.add(StringheSuggerimenti.MOLTISERVITORICACC);
        }
        if (giocatore1.getCarteInMano() < 3 && giocatore2.getCarteInGioco() < 3) {
            this.suggerimenti.add(StringheSuggerimenti.POCHECARTECACCPOCHISERVAVV);
        }
        if (giocatore2.getCarteInGioco() > 3) {
            this.suggerimenti.add(StringheSuggerimenti.MOLTISERVITORIAVVCACC);
        }
        if (giocatore2.getCarteInGioco() == 1 && giocatore2.getSaluteProvocazione() > 0) {
            this.suggerimenti.add(StringheSuggerimenti.UNSERVITOREMOLTAPROVCACC);
        }
    }

    private void suggerimentiCacciatoreAvv() {
        if (giocatore1.getPv() < 7) {
            this.suggerimenti.add(StringheSuggerimenti.POCAVITATUCACC);
        }
        if (giocatore2.getPv() <= 3) {
            this.suggerimenti.add(StringheSuggerimenti.POCAVITACACCAVV);
        }
        if (giocatore2.getSaluteProvocazione() > 0) {
            this.suggerimenti.add(StringheSuggerimenti.PROVOCAZIONECACC);
        }
        if (vp.getTurno() == 5) {
            this.suggerimenti.add(StringheSuggerimenti.TURNO5CACC);
        }
        if (giocatore2.getCarteInMano() <= 2) {
            this.suggerimenti.add(StringheSuggerimenti.POCHECARTECACCAVV);
        }
    }

    private void suggerimentiDruido() {
        if (giocatore1.getCarteInGioco() > 4) {
            this.suggerimenti.add(StringheSuggerimenti.MOLTISERVITORIAVVDRUIDO);
        }
        if (giocatore1.getPv() <= 8) {
            this.suggerimenti.add(StringheSuggerimenti.POCAVITATUDRUIDO);
        }
        if (giocatore1.getCarteInGioco() > 1 && giocatore1.getSaluteProvocazione() < 2) {
            this.suggerimenti.add(StringheSuggerimenti.POCAPROVOCAZIONEDRUIDO);
        }
        if (giocatore1.getSaluteProvocazione() >= 5) {
            this.suggerimenti.add(StringheSuggerimenti.MOLTAPROVOCAZIONEDRUIDO);
        }
        if (giocatore1.getCarteInGioco() > 3 && giocatore2.getPv() < 10 && giocatore2.getSaluteProvocazione() < 5) {
            this.suggerimenti.add(StringheSuggerimenti.MOLTISERVITORIDRUIDOPOCAVITAAVV);
        }
    }

    private void suggerimentiDruidoAvv() {
        if (giocatore2.getCarteInGioco() > 3) {
            this.suggerimenti.add(StringheSuggerimenti.MOLTISERVITORIDRUIDOAVV);
        }
        if (giocatore2.getPv() <= 3) {
            this.suggerimenti.add(StringheSuggerimenti.POCAVITADRUIDOAVV);
        }
        if (vp.getTurno() == 4) {
            this.suggerimenti.add(StringheSuggerimenti.TURNO4DRUIDOAVV);
        }
        if (vp.getTurno() == 7) {
            this.suggerimenti.add(StringheSuggerimenti.TURNO7DRUIDOAVV);
        }
        if (vp.getTurno() == 2) {
            this.suggerimenti.add(StringheSuggerimenti.TURNO2DRUIDOAVV);
        }
    }

    private void suggerimentiMago() {
        if (giocatore1.getEroe().equals("Mago")) {
            this.suggerimenti.add(StringheSuggerimenti.MAGOTU);
        }
        if (giocatore2.getPv() == 10) {
            this.suggerimenti.add(StringheSuggerimenti.NEMICO10PVMAGO);
        }
        if (vp.getTurno() == 3 && giocatore2.getCarteInGioco() > 0) {
            this.suggerimenti.add(StringheSuggerimenti.TURNO2MAGOSERVITORIAVV);
        }
        if (vp.getTurno() == 4) {
            this.suggerimenti.add(StringheSuggerimenti.TURNO4MAGO);
        }
        if (giocatore2.getCarteInGioco() > 3) {
            this.suggerimenti.add(StringheSuggerimenti.MOLTISERVITORIAVVMAGO);
        }
    }

    private void suggerimentiMagoAvv() {
        if (giocatore2.getEroe().equals("Mago")) {
            this.suggerimenti.add(StringheSuggerimenti.MAGOAVV);
        }
        if (giocatore1.getPv() <= 10) {
            this.suggerimenti.add(StringheSuggerimenti.SALUTE10MAGOAVV);
        }
        if (vp.getTurno() == 6) {
            this.suggerimenti.add(StringheSuggerimenti.TURNO6MAGOAVV);
        }
        if (vp.getTurno() == 7) {
            this.suggerimenti.add(StringheSuggerimenti.TURNO7MAGOAVV);
        }
        if (vp.getTurno() == 3) {
            this.suggerimenti.add(StringheSuggerimenti.TURNO3MAGOAVV);
        }
    }

    private void suggerimentiLadro() {
        if (giocatore1.getCarteInMano() < 3) {
            this.suggerimenti.add(StringheSuggerimenti.POCHECARTELADRO);
        }
        if (giocatore2.getPv() < 5) {
            this.suggerimenti.add(StringheSuggerimenti.POCAVITAAVVLADRO);
        }
        if (vp.getTurno() > 5 && giocatore2.getCarteInGioco() == 1) {
            this.suggerimenti.add(StringheSuggerimenti.LADROUNSERVITOREAVV);
        }
        if (vp.getTurno() == 5) {
            this.suggerimenti.add(StringheSuggerimenti.LADROTURNO5);
        }
        if (giocatore2.getCarteInGioco() > 3) {
            this.suggerimenti.add(StringheSuggerimenti.LADROMOLTISERVITORAVV);
        }
    }

    private void suggerimentiLadroAvv() {
        if (giocatore1.getEroe().equals("Ladro")) {
            this.suggerimenti.add(StringheSuggerimenti.LADROAVV);
        }
        if (vp.getTurno() == 5 && giocatore1.getCarteInGioco() == 1 && giocatore1.getPv() + 5 < giocatore2.getDanniInGioco()) {
            this.suggerimenti.add(StringheSuggerimenti.SERVITOREPOCAVITALADROAVV);
        }
        if (vp.getTurno() == 2 && giocatore1.getCarteInGioco() == 1) {
            this.suggerimenti.add(StringheSuggerimenti.SERVITORESUBITOLADROAVV);
        }
        if (vp.getTurno() == 3) {
            this.suggerimenti.add(StringheSuggerimenti.TURNO3LADROAVV);
        }
        if (vp.getTurno() == 5 && giocatore1.getCarteInGioco() == 1 && giocatore1.getPv() > 15) {
            this.suggerimenti.add(StringheSuggerimenti.SERVITOREMOLTAVITALADROAVVTURNO5);
        }
    }

    private void suggerimentiGuerriero() {
        if (giocatore1.getPv() > 30) {
            this.suggerimenti.add(StringheSuggerimenti.MOLTAVITAGUERRIERO);
        }
        if (giocatore2.getCarteInGioco() == 2) {
            this.suggerimenti.add(StringheSuggerimenti.DUESERVITORIGUERR);
        }
        if (giocatore2.getCarteInGioco() > 3) {
            this.suggerimenti.add(StringheSuggerimenti.MOLTISERVITORINEMICIGUERR);
        }
        if (giocatore1.getPv() < 10) {
            this.suggerimenti.add(StringheSuggerimenti.POCASALUTEGUERRIERO);
        }
        if (vp.getTurno() > 3 && giocatore1.getCarteInGioco() == 1) {
            this.suggerimenti.add(StringheSuggerimenti.UNSERVITOREGUERR);
        }
    }

    private void suggerimentiGuerrieroAvv() {
        if (giocatore2.getPv() > 30) {
            this.suggerimenti.add(StringheSuggerimenti.MOLTISSIMAVITAGUERRIEROAVV);
        }
        if (giocatore2.getCarteInGioco() == 0 && giocatore2.getDanniInGioco() > 0) {
            this.suggerimenti.add(StringheSuggerimenti.GUERRIERONOSERVITORIDANNOAVV);
        }
        if (giocatore1.getCarteInGioco() > 3 && giocatore2.getCarteInGioco() < 2) {
            this.suggerimenti.add(StringheSuggerimenti.MOLTISERVITORIGUERRAVV);
        }
        if (vp.getTurno() == 7) {
            this.suggerimenti.add(StringheSuggerimenti.TURNO7GUERRAVV);
        }
        if (giocatore2.getSaluteProvocazione() > 5) {
            this.suggerimenti.add(StringheSuggerimenti.ALTAPROVOCAZIONEGUERRAVV);
        }
    }

    private void suggerimentiPaladino() {
        if (giocatore1.getPv() < 10 && giocatore1.getCarteInMano() <= 3) {
            this.suggerimenti.add(StringheSuggerimenti.POCHECARTEINMANOPOCAVITA);
        }
        if (giocatore1.getSaluteProvocazione() >= 5) {
            this.suggerimenti.add(StringheSuggerimenti.POCODANNOPALADINOPROVOCAZIONE);
        }
        if (giocatore2.getCarteInGioco() < 2) {
            this.suggerimenti.add(StringheSuggerimenti.POCHISERVITORIPALADINO);
        }
        if (giocatore2.getDanniInGioco() > 5 && giocatore2.getCarteInGioco() < 3) {
            this.suggerimenti.add(StringheSuggerimenti.MOLTIDANNIAVVPALADINO);
        }
        if (giocatore2.getCarteInGioco() >= 4 && vp.getTurno() > 6) {
            this.suggerimenti.add(StringheSuggerimenti.MOLTISERVITORIAVVPALADINO);
        }
    }

    private void suggerimentiPaladinoAvv() {
        if (vp.getTurno() > 3) {
            this.suggerimenti.add(StringheSuggerimenti.TURNO3PALADINOAVV);
        }
        if (giocatore1.getCarteInGioco() > 3 && vp.getTurno() == 4) {
            this.suggerimenti.add(StringheSuggerimenti.TURNO4PALADINOAVVMOLTISERV);
        }
        if (giocatore2.getCarteInGioco() == 1 && giocatore2.getDanniInGioco() > 4) {
            this.suggerimenti.add(StringheSuggerimenti.MOLTIDANNIPALADINOAVV);
        }
        if (vp.getTurno() > 5 && vp.getTurno() <= 9 && giocatore2.getCarteInGioco() < 2) {
            this.suggerimenti.add(StringheSuggerimenti.POCHISERVITORIPALADINOAVVTURNO5);
        }
        if (giocatore2.getEroe().equals("Paladino")) {
            this.suggerimenti.add(StringheSuggerimenti.PALADINOAVV);
        }
    }

    private void suggerimentiSacerdote() {
        if (giocatore1.getSaluteProvocazione() > 2) {
            this.suggerimenti.add(StringheSuggerimenti.SERVITORIPROVOCAZIONESACC);
        }
        if (giocatore2.getCarteInGioco() > 3) {
            this.suggerimenti.add(StringheSuggerimenti.MOLTISERVAVVSAC);
        }
        if (giocatore2.getCarteInGioco() == 1 && giocatore2.getDanniInGioco() <= 3) {
            this.suggerimenti.add(StringheSuggerimenti.SERVNEMICO3DANNI);
        }
        if (giocatore1.getEroe().equals("Sacerdote")) {
            this.suggerimenti.add(StringheSuggerimenti.SACERDOTE);
        }
        if (giocatore2.getSaluteProvocazione() > 5) {
            this.suggerimenti.add(StringheSuggerimenti.POCODANNOALTAPROVOCAZIONESAC);
        }
    }

    private void suggerimentiSacerdoteAvv() {
        if (giocatore2.getSaluteProvocazione() > 3) {
            this.suggerimenti.add(StringheSuggerimenti.MOLTAPROVOCAZIONESACAVV);
        }
        if (vp.getTurno() >= 10) {
            this.suggerimenti.add(StringheSuggerimenti.TURNO10SACAVV);
        }
        if (giocatore1.getCarteInGioco() > 3 && vp.getTurno() > 4) {
            this.suggerimenti.add(StringheSuggerimenti.TURNO5MOLTISERVSACACC);
        }
        if (vp.getTurno() == 1) {
            this.suggerimenti.add(StringheSuggerimenti.TURNO1SACAVV);
        }
        if (vp.getTurno() == 3) {
            this.suggerimenti.add(StringheSuggerimenti.TURNO3SACAVV);
        }
    }

    private void suggerimentiSciamano() {
        if (giocatore1.getEroe().equals("Sciamano")) {
            this.suggerimenti.add(StringheSuggerimenti.SCIAMANO);
        }
        if (giocatore2.getCarteInGioco() > 3) {
            this.suggerimenti.add(StringheSuggerimenti.MOLTISERVITORIAVVSCIAMANO);
        }
        if (giocatore1.getCarteInGioco() > 3 && giocatore2.getSaluteProvocazione() < 4) {
            this.suggerimenti.add(StringheSuggerimenti.MOLTISERVITORISCIAMANO);
        }
        if (giocatore1.getSaluteProvocazione() == 0) {
            this.suggerimenti.add(StringheSuggerimenti.NOPROVOCAZIONESCIAMANO);
        }
        if (giocatore2.getDanniInGioco() > 10 && giocatore2.getCarteInGioco() < 3) {
            this.suggerimenti.add(StringheSuggerimenti.SERVITORENEMICOGROSSOSCIAMANO);
        }
    }

    private void suggerimentiSciamanoAvv() {
        if (giocatore2.getEroe().equals("Sciamano")) {
            this.suggerimenti.add(StringheSuggerimenti.SCIAMANOAVV);
        }
        if (giocatore1.getCarteInGioco() == 1 && giocatore1.getDanniInGioco() > 4) {
            this.suggerimenti.add(StringheSuggerimenti.SERVITOREGROSSOSCIAMANOAVV);
        }
        if (giocatore1.getCarteInGioco() > 3 && giocatore2.getCarteInGioco() < 2) {
            this.suggerimenti.add(StringheSuggerimenti.MOLTISERVITORITUOISCIAMANOAVV);
        }
        if (giocatore2.getCarteInMano() < 3) {
            this.suggerimenti.add(StringheSuggerimenti.POCHECARTESCIAMANOAVV);
        }
        if (giocatore2.getSaluteProvocazione() > 5 && giocatore2.getCarteInGioco() > 3) {
            this.suggerimenti.add(StringheSuggerimenti.MOLTISERVITORIPOCAPROVOCAZIONESCIAMANOAVV);
        }
    }

    private void suggerimentiStregone() {
        if (giocatore1.getEroe().equals("Stregone")) {
            this.suggerimenti.add(StringheSuggerimenti.STREGONE);
        }
        if (giocatore1.getPv() < 10) {
            this.suggerimenti.add(StringheSuggerimenti.POCAVITASTREGONE);
        }
        if (giocatore2.getCarteInGioco() > 3 && giocatore1.getCarteInGioco() < 2) {
            this.suggerimenti.add(StringheSuggerimenti.MOLTISERVITORIAVVSTREGONE);
        }
        if (vp.getTurno() == 2 && giocatore1.getSaluteProvocazione() > 0) {
            this.suggerimenti.add(StringheSuggerimenti.TURNO2PROVOCAZIONESREGONE);
        }
        if (giocatore2.getSaluteProvocazione() > 5) {
            this.suggerimenti.add(StringheSuggerimenti.MOLTAPROVOCAZIONEAVVSTREGONEMOLTISERVITORI);
        }
    }

    private void suggerimentiStregoneAvv() {
        if (giocatore2.getPv() < 8) {
            this.suggerimenti.add(StringheSuggerimenti.POCAVITASTREGONEAVV);
        }
        if (giocatore2.getEroe().equals("Stregone")) {
            this.suggerimenti.add(StringheSuggerimenti.STREGONEAVV);
        }
        if (vp.getTurno() == 9) {
            this.suggerimenti.add(StringheSuggerimenti.TURNO9STREGONEAVV);
        }
        if (vp.getTurno() == 3) {
            this.suggerimenti.add(StringheSuggerimenti.TURNO3STREGONEAVV);
        }
        if (giocatore2.getSaluteProvocazione() > 0 && vp.getTurno() == 2) {
            this.suggerimenti.add(StringheSuggerimenti.TURNO2PROVOCAZIONESTREGONEAVV);
        }
    }

    public String suggerisci() {
        this.suggerimentiDanni();
        this.suggerimentiSalute();
        this.suggerimentiServitori();
        this.suggerimentiCarteMano();
        this.suggerimentiCarteMazzo();
        this.suggerimentiTurno();
        this.suggerimentiEroe();
        Random random = new Random();
        String s = "\n";
        int j1 = random.nextInt(this.suggerimenti.size());
        int j2 = random.nextInt(this.suggerimenti.size());
        int j3 = random.nextInt(this.suggerimenti.size());
        if (j1 == j2 && j2 == j3) {
            s = s + this.suggerimenti.get(j1);
        } else if (j1 == j2 && j1 != j3) {
            s = s + this.suggerimenti.get(j1) + "\n" + this.suggerimenti.get(j3);
        } else if (j1 != j2 && j1 == j3) {
            s = s + this.suggerimenti.get(j1) + "\n" + this.suggerimenti.get(j2);
        } else {
            s = s + this.suggerimenti.get(j1) + "\n" + this.suggerimenti.get(j2) + "\n" + this.suggerimenti.get(
                    j3);
        }

        this.suggerimenti.clear();
        return s;
    }

}
