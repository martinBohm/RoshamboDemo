/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package it.rockpaperscissor.util;



import it.rockpaperscissor.model.OptionNotFoundException;
import it.rockpaperscissor.model.Paper;
import it.rockpaperscissor.model.Rock;
import it.rockpaperscissor.model.Scissor;
import it.rockpaperscissor.model.Score;

/**
 *
 * @author a.lota
 */
public class GameUtils {

    static Score getOption(int option) throws OptionNotFoundException{
        
        Score score;
        
        switch(option){
          
            case 0: score = new Rock();
            break;
            case 1: score = new Paper();
            break;
            case 2: score = new Scissor();
            break;
            default: throw new OptionNotFoundException("opzione non valida");            
        }
        
        return score;
    }
    
    
    
    public static void startGame(){
        
     System.out.println("************MORRA CINESE*************");
     System.out.println("1. SASSO\n2. CARTA\n3. FORBICE");    
    }

        
}
