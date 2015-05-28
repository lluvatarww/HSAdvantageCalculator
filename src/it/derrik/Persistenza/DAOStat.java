/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.derrik.Persistenza;

import it.derrik.Modello.Costanti;
import it.derrik.Modello.Statistiche;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;

/**
 *
 * @author derrik
 */
public class DAOStat {
    
  

    public DAOStat() {
    }
    
    
    
    public void salva(Statistiche stats){
        try{
            PrintWriter pw = new PrintWriter(stats.getNomeGiocatore() + ".txt");
            pw.println(stats.getNomeGiocatore());
            pw.println(stats.getPartite());
            pw.println(stats.getVittorie());
            pw.println(stats.getSconfitte());
            pw.println(stats.getMediaTurni());
            for(String string : stats.getVittorieEroe().keySet()){
                pw.println(stats.getVittorieEroe().get(string));
            }
            for(String string : stats.getSconfitteEroe().keySet()){
                pw.println(stats.getSconfitteEroe().get(string));
            }
            pw.close();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
    }
    
    public Statistiche carica(String nomeFile){
        Statistiche stats = new Statistiche();
        try{
            BufferedReader br = new BufferedReader(new FileReader(nomeFile));
            stats.setNomeGiocatore(br.readLine());
            br.close();
        }catch(Exception e){
            stats = null;
            System.out.println("File not found");
        }
        
        return stats;
    } 
    
    public void salvaNome(String nome){
         try{
            PrintWriter pw = new PrintWriter("nomeFile.txt");
            pw.println(nome);
            pw.close();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public String caricaNome(){
        try{
            BufferedReader br = new BufferedReader(new FileReader("nomeFile.txt"));
            String s = br.readLine();
            return s;
        }catch(Exception e){
            System.out.println("File not found");
        }
        return null;
    }
    
}
