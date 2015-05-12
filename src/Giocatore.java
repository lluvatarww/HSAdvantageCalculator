/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author derrik
 */
public class Giocatore {
    
    private int pv;
    private int carteInGioco;
    private int carteInMazzo;
    private int carteInMano;
    private int danniInGioco;
    private int saluteProvocazione;
    private String eroe;
    
    public Giocatore(int pv, int carteInGioco, int carteInMazzo, int carteInMano,
            int danniInGioco, int saluteProvocazione, String eroe) {
        this.pv = pv;
        this.carteInGioco = carteInGioco;
        this.carteInMazzo = carteInMazzo;
        this.carteInMano = carteInMano;
        this.danniInGioco = danniInGioco;
        this.saluteProvocazione = saluteProvocazione;
        this.eroe = eroe;
    }

    public int getPv() {
        return pv;
    }

    public void setPv(int pv) {
        this.pv = pv;
    }

    public int getCarteInGioco() {
        return carteInGioco;
    }

    public void setCarteInGioco(int carteInGioco) {
        this.carteInGioco = carteInGioco;
    }

    public int getCarteInMazzo() {
        return carteInMazzo;
    }

    public void setCarteInMazzo(int carteInMazzo) {
        this.carteInMazzo = carteInMazzo;
    }

    public int getCarteInMano() {
        return carteInMano;
    }

    public void setCarteInMano(int carteInMano) {
        this.carteInMano = carteInMano;
    }

    public int getDanniInGioco() {
        return danniInGioco;
    }

    public void setDanniInGioco(int danniInGioco) {
        this.danniInGioco = danniInGioco;
    }
    
    public int totale(int danniAvversario){
        return this.pv - danniAvversario + this.danniInGioco + 
                (2 * this.carteInGioco) + (4 * this.carteInMano) + 
                this.carteInMazzo + this.saluteProvocazione ;
    }

    public int getSaluteProvocazione() {
        return saluteProvocazione;
    }

    public void setSaluteProvocazione(int saluteProvocazione) {
        this.saluteProvocazione = saluteProvocazione;
    }

    public String getEroe() {
        return eroe;
    }

    public void setEroe(String eroe) {
        this.eroe = eroe;
    }
    
    
    
}
