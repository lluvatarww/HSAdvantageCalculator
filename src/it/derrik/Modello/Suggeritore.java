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

    
    private void suggerimentiSalute(){
        if(giocatore1.getPv() <= 10){
            suggerimenti.add(StringheSuggerimenti.SALUTEBASSATU);
        }
        if(giocatore1.getPv() >= 25){
            suggerimenti.add(StringheSuggerimenti.SALUTEALTATU);
        }
        if(giocatore2.getPv() <= 7){
            suggerimenti.add(StringheSuggerimenti.SALUTEBASSAAVVERSARIO);
        }
        if(giocatore2.getPv() >= 24){
            suggerimenti.add(StringheSuggerimenti.SALUTEALTAAVVERSARIO);
        }
        if(giocatore1.getPv() > giocatore2.getPv()){
            suggerimenti.add(StringheSuggerimenti.SALUTEMAGGIORE);
        }
        if(giocatore2.getPv() > giocatore1.getPv()){
            suggerimenti.add(StringheSuggerimenti.SALUTEMINORE);
        }
    }
    
    private void suggerimentiDanni(){
        if(giocatore1.getDanniInGioco() > giocatore2.getSaluteProvocazione() && giocatore1.getDanniInGioco() >= 4 && giocatore2.getPv() > giocatore1.getDanniInGioco()){
            if(giocatore2.getCarteInGioco() == 0){
                suggerimenti.add(StringheSuggerimenti.DANNIMAGGIORI);
            }    
            if(giocatore2.getSaluteProvocazione() >= 1){
                suggerimenti.add(StringheSuggerimenti.DANNIMAGGIORIPROVOCAZIONE);
            }
        }
        if(giocatore1.getDanniInGioco() < 4 && giocatore1.getCarteInGioco() > 0 ){
            if(giocatore2.getCarteInGioco() != 0){
                suggerimenti.add(StringheSuggerimenti.DANNIMINORI);
            }
            else{
            suggerimenti.add(StringheSuggerimenti.DANNIMAGGIORI);
            }
        }
        if(giocatore1.getSaluteProvocazione() >= giocatore2.getDanniInGioco() && giocatore1.getSaluteProvocazione() > 0){
            suggerimenti.add(StringheSuggerimenti.DANNINEMICOPROVOCAZIONE);
        }
        if(giocatore1.getSaluteProvocazione() < giocatore2.getDanniInGioco()){
            suggerimenti.add( "Giocare servitori con provocazione non ti farà perdere punti vita");
        }
        if(giocatore1.getDanniInGioco() > giocatore2.getPv() + giocatore2.getSaluteProvocazione()){
            suggerimenti.add(StringheSuggerimenti.DANNILETALI);
        }
        if(giocatore2.getDanniInGioco() > giocatore1.getPv() + giocatore1.getSaluteProvocazione()){
            suggerimenti.add(StringheSuggerimenti.DANNILETALINEMICO);
        }   
    }
    
    private void suggerimentiServitori(){
        if(vp.getTurno() > 1 && giocatore1.getCarteInGioco() == 0){
            suggerimenti.add(StringheSuggerimenti.NESSUNSERVITORE);
        }
        if(vp.getTurno() > 1 && giocatore2.getCarteInGioco() == 0){
            suggerimenti.add(StringheSuggerimenti.NESSUNSERVITORENEMICO);
        }
        if(giocatore1.getCarteInGioco() > 0 && giocatore1.getCarteInGioco() > giocatore2.getCarteInGioco()){
            suggerimenti.add(StringheSuggerimenti.SERVITORIMAGGIORI);
        }
        if(giocatore2.getCarteInGioco() > 0 && giocatore2.getCarteInGioco() > giocatore1.getCarteInGioco()){
            suggerimenti.add(StringheSuggerimenti.SERVITORIMINORI);
        }
        if(giocatore1.getCarteInGioco() > 4){
            suggerimenti.add(StringheSuggerimenti.MOLTISERVITORI);
        }
        if(giocatore1.getSaluteProvocazione() > 0){
            suggerimenti.add(StringheSuggerimenti.SERVITORIPROVOCAZIONE);
        }
        if(giocatore2.getSaluteProvocazione() > 0){
            suggerimenti.add(StringheSuggerimenti.SERVITORIPROVOCAZIONEAVV);
        }
    }
    
    private void suggerimentiCarteMano(){
        if(giocatore1.getCarteInMano() >= 4){
            this.suggerimenti.add(StringheSuggerimenti.MOLTECARTEINMANO);
        }
        if(giocatore1.getCarteInMano() <= 2 && giocatore1.getCarteInMano() > 0){
            this.suggerimenti.add(StringheSuggerimenti.POCHECARTEINMANO);
        }
        if(giocatore1.getCarteInMano() > giocatore2.getCarteInMano()){
            this.suggerimenti.add(StringheSuggerimenti.CARTEMAGGIORI);
        }
        if(giocatore1.getCarteInMano() < giocatore2.getCarteInMano()){
            this.suggerimenti.add(StringheSuggerimenti.CARTEMINORI);
        }
        if(giocatore1.getCarteInMano() == 0){
            this.suggerimenti.add(StringheSuggerimenti.NESSUNACARTAINMANO);
        }
        if(giocatore1.getCarteInMano() == 0){
            this.suggerimenti.add(StringheSuggerimenti.NESSUNACARTAAVV);
        }
    }
    
    private void suggerimentiCarteMazzo(){
        if(giocatore1.getCarteInMazzo() > 0 && giocatore2.getCarteInMazzo() > 0 && giocatore1.getCarteInMazzo() > giocatore2.getCarteInMazzo()){
            this.suggerimenti.add(StringheSuggerimenti.PIUCARTE);
        }
        if(giocatore1.getCarteInMazzo() > 0 && giocatore2.getCarteInMazzo() > 0 && giocatore2.getCarteInMazzo() > giocatore1.getCarteInMazzo()){
            this.suggerimenti.add(StringheSuggerimenti.MENOCARTE);
        }
        if(giocatore1.getCarteInMazzo() > 4 && giocatore1.getCarteInMazzo() <= 10){
            this.suggerimenti.add(StringheSuggerimenti.POCHECARTE);
        }
        if(giocatore2.getCarteInMazzo() > 4 && giocatore2.getCarteInMazzo() <= 10){
            this.suggerimenti.add(StringheSuggerimenti.POCHECARTEAVV);
        }
        if(giocatore1.getCarteInMazzo() > 0 && giocatore1.getCarteInMazzo() <= 4){
            this.suggerimenti.add(StringheSuggerimenti.POCHISSIMECARTE);
        }
        if(giocatore1.getCarteInMazzo() == 0){
            this.suggerimenti.add(StringheSuggerimenti.NESSUNACARTA);
        }
        if(giocatore2.getCarteInMazzo() == 0){
            this.suggerimenti.add(StringheSuggerimenti.NESSUNACARTAAVVERSARIO);
        }
    }
    
    private void suggerimentiTurno(){
        if(vp.getTurno() == 2){
            this.suggerimenti.add(StringheSuggerimenti.TURNO2);
        }
         if(vp.getTurno() == 3 && this.giocatore1.getCarteInGioco() == 0){
            this.suggerimenti.add(StringheSuggerimenti.TURNO3NOSERVITORI);
        }
         if(vp.getTurno() == 3 && this.giocatore2.getCarteInGioco() == 0){
            this.suggerimenti.add(StringheSuggerimenti.TURNO3NOSERVITORINEMICI);
        }
          if(vp.getTurno() == 6){
            this.suggerimenti.add(StringheSuggerimenti.TURNO6);
        }
         if(vp.getTurno() == 10){
            this.suggerimenti.add(StringheSuggerimenti.TURNO10);
        }
    }
    
    private void suggerimentiEroe(){
    if("Druido".equals(giocatore1.getEroe())){
    
    }
    if("Druido".equals(giocatore2.getEroe())){
    
    }
    if("Cacciatore".equals(giocatore1.getEroe())){
        this.suggerimentiCacciatoreTu();
    }
    if("Cacciatore".equals(giocatore2.getEroe())){
        this.suggerimentiCacciatoreAvv();
    }
    if("Guerriero".equals(giocatore1.getEroe())){
    
    }
    if("Guerriero".equals(giocatore2.getEroe())){
    
    }
    if("Ladro".equals(giocatore1.getEroe())){
    
    }
    if("Ladro".equals(giocatore2.getEroe())){
    
    }
    if("Mago".equals(giocatore1.getEroe())){
    
    }
    if("Mago".equals(giocatore2.getEroe())){
    
    }
    if("Paladino".equals(giocatore1.getEroe())){
    
    }
    if("Paladino".equals(giocatore1.getEroe())){
    
    }
    if("Sacerdote".equals(giocatore1.getEroe())){
    
    }
    if("Sacerdote".equals(giocatore2.getEroe())){
    
    }
    if("Sciamano".equals(giocatore1.getEroe())){
    
    }
    if("Sciamano".equals(giocatore2.getEroe())){
    
    }
    if("Stregone".equals(giocatore1.getEroe())){
    
    }
    if("Stregone".equals(giocatore2.getEroe())){
    
    }
    }
   
    private void suggerimentiCacciatoreTu(){
        if(giocatore2.getPv() < 8){
        this.suggerimenti.add(StringheSuggerimenti.POCAVITAAVVCACC);
        }
        if(giocatore1.getCarteInGioco() > 4){
        this.suggerimenti.add(StringheSuggerimenti.MOLTISERVITORICACC);    
        }
        if(giocatore1.getCarteInMano() < 3 && giocatore2.getCarteInGioco() < 3){
        this.suggerimenti.add(StringheSuggerimenti.POCHECARTECACCPOCHISERVAVV);  
        }
        if(giocatore2.getCarteInGioco() > 3){
        this.suggerimenti.add(StringheSuggerimenti.MOLTISERVITORIAVVCACC);
        }
        if(giocatore2.getCarteInGioco() == 1 && giocatore2.getSaluteProvocazione() > 0){
        this.suggerimenti.add(StringheSuggerimenti.UNSERVITOREMOLTAPROVCACC);
        }
    }
    
    private void suggerimentiCacciatoreAvv(){
        if(giocatore1.getPv() < 7){
        this.suggerimenti.add(StringheSuggerimenti.POCAVITATUCACC);
        }
        if(giocatore2.getPv() <= 3 ){
        this.suggerimenti.add(StringheSuggerimenti.POCAVITACACCAVV);    
        }
        if(giocatore2.getSaluteProvocazione() > 0 ){
        this.suggerimenti.add(StringheSuggerimenti.PROVOCAZIONECACC);  
        }
        if(vp.getTurno() == 5){
        this.suggerimenti.add(StringheSuggerimenti.TURNO5CACC);
        }
        if(giocatore2.getCarteInMano() <= 2){
        this.suggerimenti.add(StringheSuggerimenti.POCHECARTECACCAVV);
        }
    }
    
    
    
    public String suggerisci(){
        this.suggerimentiDanni();
        this.suggerimentiSalute();
        this.suggerimentiServitori();
        this.suggerimentiCarteMano();
        this.suggerimentiCarteMazzo();
        this.suggerimentiTurno();
        this.suggerimentiEroe();
        Random random = new Random();
        String s = "\n";
        int j1 = random.nextInt(this.suggerimenti.size() );
        int j2 = random.nextInt(this.suggerimenti.size() );
        int j3 = random.nextInt(this.suggerimenti.size() );
        if(j1 == j2 && j2 ==j3){
            s = s + this.suggerimenti.get(j1);
        }
        else if(j1 == j2 && j1 != j3){
            s = s + this.suggerimenti.get(j1) + "\n" + this.suggerimenti.get(j3);
        }
        else if(j1 != j2 && j1 == j3){
            s = s + this.suggerimenti.get(j1) + "\n" + this.suggerimenti.get(j2);
        }
        else{
            s = s + this.suggerimenti.get(j1) + "\n" + this.suggerimenti.get(j2) + "\n" + this.suggerimenti.get(
                    j3);
        }
        
        this.suggerimenti.clear();
        return s;
    }
    
    
    
}
