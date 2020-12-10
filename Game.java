package AllPgms;

import java.util.*;
/*
 * Purpose- Write a program that plays Rock, Paper, Scissors better than random against 
 *          a human. Try to exploit that humans are very bad at generating random numbers
 * 
 * Author:Shubham Sathe
 * Version:12.0
 * since 10th Dec 2020
 */
public class Game 
{ 
    public static final String ROCK = "ROCK";
    public static final String PAPER = "PAPER";
    public static final String SCISSORS = "SCISSORS";
    
    public static void main(String args[]) 
     { 
       
      String playerMove = getPlayerMove();
      String computerMove = getComputerMove(); 
 
      
      /*if both playerMove and computerMove
        produces the same formation, then 
        Game is a tie*/
      if (playerMove.equals(computerMove))
      {
            System.out.println("Game is Tie !!");
      }
      
      // if playerMove is ROCK         
      else if (playerMove.equals(Game.ROCK))
      {
        System.out.println(computerMove.equals(Game.PAPER) ? "Computer Wins": "Player wins");   
      }
       
      // if playerMove is PAPER
      else if (playerMove.equals(Game.PAPER))
      {
    	  System.out.println(computerMove.equals(Game.SCISSORS) ? "Computer Wins": "Player wins");   
      }
    	  // if playerMove is SCISSORS    
      else
      {
        System.out.println(computerMove.equals(Game.ROCK) ? "Computer Wins": "Player wins");   
    
      }
 }  
     
    public static String getComputerMove()
    {
        String computermove;
        Random random = new Random();
        int input = random.nextInt(3)+1;
        if (input == 1)
            computermove = Game.ROCK;
        else if(input == 2)
            computermove = Game.PAPER;
        else
            computermove = Game.SCISSORS;
            
        System.out.println("Computer move is: " + computermove);
        System.out.println();
        return computermove;    
    }
    
    public static String getPlayerMove()
    {
    	System.out.println("Enter any one of the following inputs:  ");
        System.out.println("ROCK");
        System.out.println("PAPER");
        System.out.println("SCISSORS");
        System.out.println();
        Scanner in = new Scanner(System.in);
        String playermove = in.next();     
        System.out.println("Player move is: "+ playermove);
        return playermove;
    }    
}