/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package it.rockpaperscissor.program;

import it.rockpaperscissor.util.ConsoleUtil;
import it.rockpaperscissor.util.GameUtils;
import it.rockpaperscissor.model.Giocata;
import it.rockpaperscissor.model.OptionNotFoundException;
import it.rockpaperscissor.model.Score;


/**
 *
 * @author a.lota
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
     //PropertiesManager.instance().getMessage("WellcomeMessage");
    
     Giocata giocata = new Giocata();     
     
     GameUtils.startGame();
     
     try{
     giocata.opzioneUtente = (Score)ConsoleUtil.getUserInput();
     giocata.opzioneCPU = ConsoleUtil.generateCPUoption();
     }
     catch(OptionNotFoundException ex){
       ConsoleUtil.formatErrorMessage(ex.getMessage());     
     }
          
     ConsoleUtil.printWinner(giocata);
     
     ConsoleUtil.promptNewGame();     
      
    }
    
}
