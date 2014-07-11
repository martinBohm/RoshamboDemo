/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package it.rockpaperscissor.util;



import it.rockpaperscissor.model.GameResult;
import it.rockpaperscissor.model.Giocata;
import it.rockpaperscissor.model.OptionNotFoundException;
import it.rockpaperscissor.model.Score;
import it.rockpaperscissor.program.Program;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

/**
 *
 * @author a.lota
 */
public class ConsoleUtil {


    public static Score generateCPUoption() throws OptionNotFoundException {        
        int cpuOption = new Random().nextInt(2);
        Score opzioneCPU = GameUtils.getOption(cpuOption);
        return opzioneCPU;
    }

      

    public static Score getUserInput() throws OptionNotFoundException{
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      int userOption;     
      try {
         userOption = Integer.parseInt(br.readLine());
         Score opzioneUtente = GameUtils.getOption(userOption);
         return opzioneUtente;
         
      } catch (IOException ioe) {
         System.out.println("IO errore durante la lettura dell'input");
         System.exit(1);
         
      } catch (NumberFormatException ex){
         System.out.println("Input non valido");
         System.exit(1);
      }    
           
      throw new OptionNotFoundException("Opzione non valida");
    }

    public static void formatErrorMessage(String message) {
        System.out.println("ATTENZIONE:\n" + message);
    }

    public static void promptNewGame() {
        System.out.println("Nuovo Gioco?\n Y N");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String userOption;     
        try {
         userOption = br.readLine().toUpperCase();
         if("Y".equals(userOption)){
           Program.main(new String[2]);
         }else{
          System.exit(1);
         }
         } catch (IOException ioe) {
         System.out.println("IO errore durante la lettura dell'input");
         System.exit(1);
         }     
    }

    public static void printWinner(Giocata giocata) {
     
       System.out.println("CPU ha scelto: " + giocata.opzioneCPU.toString() + "\n");
       
       GameResult esito = giocata.opzioneUtente.defeat(giocata.opzioneCPU);
       if(esito == GameResult.WIN){
           System.out.println("Complimenti! hai battuto CPU!!");
       }
       else{
          System.out.println("\nGame Over! CPU ha vinto!");
       }
        
    }

   
    
    
    
}
