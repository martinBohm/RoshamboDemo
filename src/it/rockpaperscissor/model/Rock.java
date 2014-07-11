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
public class Rock implements Score{

    @Override
    public GameResult defeat(Score score) {
        GameResult result = GameResult.SPARE;
        if(score instanceof Scissor){
         result = GameResult.WIN;
        }
        else if(score instanceof Paper){
         result = GameResult.LOSE;
        }
        return result;
    }
     @Override
    public String toString() {
        return "Sasso";
    }
}
