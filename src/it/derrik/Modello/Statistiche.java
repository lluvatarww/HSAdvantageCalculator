/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.derrik.Modello;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author derrik
 */
public class Statistiche {
    
    private String nomeGiocatore;
    private Map <String, Integer> vittorieEroe = new HashMap<>();
    private Map<String, Integer> sconfitteEroe = new HashMap<>();
    private int partite = 0;
    private int vittorie = 0;
    private int sconfitte = 0;
    private float mediaTurni = 0;

    public Statistiche() {
        this.vittorieEroe.put(Costanti.CACCIATORE, 0);
        this.vittorieEroe.put(Costanti.DRUIDO, 0);
        this.vittorieEroe.put(Costanti.GUERRIERO, 0);
        this.vittorieEroe.put(Costanti.LADRO, 0);
        this.vittorieEroe.put(Costanti.MAGO, 0);
        this.vittorieEroe.put(Costanti.PALADINO, 0);
        this.vittorieEroe.put(Costanti.SACERDOTE, 0);
        this.vittorieEroe.put(Costanti.SCIAMANO, 0);
        this.vittorieEroe.put(Costanti.STREGONE, 0);
        this.sconfitteEroe.put(Costanti.CACCIATORE, 0);
        this.sconfitteEroe.put(Costanti.DRUIDO, 0);
        this.sconfitteEroe.put(Costanti.GUERRIERO, 0);
        this.sconfitteEroe.put(Costanti.LADRO, 0);
        this.sconfitteEroe.put(Costanti.MAGO, 0);
        this.sconfitteEroe.put(Costanti.PALADINO, 0);
        this.sconfitteEroe.put(Costanti.SACERDOTE, 0);
        this.sconfitteEroe.put(Costanti.SCIAMANO, 0);
        this.sconfitteEroe.put(Costanti.STREGONE, 0);
    }

    

    
    public void calcolaMedia(int nuovoValore){
        float nuovaMedia = ((this.mediaTurni * this.vittorie) + nuovoValore)/ (this.vittorie + 1);
        this.mediaTurni = nuovaMedia;
        this.vittorie++;
    }
    
    
    public String getNomeGiocatore() {
        return nomeGiocatore;
    }

    public void setNomeGiocatore(String nomeGiocatore) {
        this.nomeGiocatore = nomeGiocatore;
    }

    public Map<String, Integer> getVittorieEroe() {
        return vittorieEroe;
    }

    public void setVittorieEroe(Map<String, Integer> vittorieEroe) {
        this.vittorieEroe = vittorieEroe;
    }

    public Map<String, Integer> getSconfitteEroe() {
        return sconfitteEroe;
    }

    public void setSconfitteEroe(Map<String, Integer> sconfitteEroe) {
        this.sconfitteEroe = sconfitteEroe;
    }

    public int getPartite() {
        return partite;
    }

    public void setPartite(int partite) {
        this.partite = partite;
    }

    public int getVittorie() {
        return vittorie;
    }

    public void setVittorie(int vittorie) {
        this.vittorie = vittorie;
    }

    public int getSconfitte() {
        return sconfitte;
    }

    public void setSconfitte(int sconfitte) {
        this.sconfitte = sconfitte;
    }

    public float getMediaTurni() {
        return mediaTurni;
    }

    public void setMediaTurni(float mediaTurni) {
        this.mediaTurni = mediaTurni;
    }
    
    
}
