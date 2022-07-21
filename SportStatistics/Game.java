/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author monte
 */
public class Game {
    private String teamOne;
    private String teamTwo;
    private int scoreOne;
    private int scoreTwo;
    
    public Game(String teamOne, String teamTwo, int scoreOne, int scoreTwo) {
        this.teamOne = teamOne;
        this.teamTwo = teamTwo;
        this.scoreOne = scoreOne;
        this.scoreTwo = scoreTwo;
    }
    
    public String winner () {
        String winner = "";
        if (this.scoreOne > this.scoreTwo) {
            winner = this.teamOne;
        }
        if (this.scoreOne < this.scoreTwo) {
            winner = this.teamTwo;
        }
        return winner;
        
    }
            
            
    @Override
    public String toString() {
        return this.teamOne + ", " + this.teamTwo + ", " + this.scoreOne + ", " + this.scoreTwo;
    }
    
}
