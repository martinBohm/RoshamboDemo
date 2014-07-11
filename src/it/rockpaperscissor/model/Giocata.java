/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package it.rockpaperscissor.model;

/**
 *
 * @author a.lota
 */
public class Giocata {
    
    public Score opzioneUtente;
    
    public Score opzioneCPU;

    public Score getOpzioneCPU() {
        return opzioneCPU;
    }

    public void setOpzioneCPU(Score opzioneCPU) {
        this.opzioneCPU = opzioneCPU;
    }
    
    public String esitoGiocata;

    public Score getOpzioneUtente() {
        return opzioneUtente;
    }

    public void setOpzioneUtente(Score opzioneUtente) {
        this.opzioneUtente = opzioneUtente;
    }

    public String getEsitoGiocata() {
        return esitoGiocata;
    }

    public void setEsitoGiocata(String esitoGiocata) {
        this.esitoGiocata = esitoGiocata;
    }
    
    
}
