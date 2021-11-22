/*Tom Lazore
Assignment 2 Rock Paper Scissors
This program is a rock paper scissors game. It asks the user to enter a number that corresponds with either rock, paper, or scissors
It asks how many winning matches they want to play and keeps count of each win from the user and the computer.
*/

import java.util.Scanner;
import java.util.Random;

class RPSGame{
   public static void main(String[]args){
      
      Scanner keyboard = new Scanner(System.in);
      Random rand = new Random();
      
      System.out.println("Lets play Rock Paper Scissors!");
      System.out.println("First choose how many rounds either of us must win to win the game.");
      
      //User enters number of winning rounds to play until
      int numRounds;
      System.out.print("Number of winning rounds?: ");
      numRounds = keyboard.nextInt();
      System.out.println("");
      
      System.out.println("To play...Enter either 0, 1, or 2 to choose ROCK, PAPER, or SCISSORS.");
      System.out.println("Ready? Lets Play...Good Luck!");
      System.out.println("");
      
      //Runs is user enters a round less than 1
      while (numRounds < 1){
         System.out.print("Enter a positive number to play: ");
         numRounds = keyboard.nextInt();
      }
      
      int userWinsCount = 0;//Keeps track of total wins by user
      int compWinsCount = 0;//Keeps track of total wins by computer
      int nextRound = 1; //Keeps track of round number

      //Loops until number of either user or computer wins equals number of rounds entered by user
      while (userWinsCount != numRounds && compWinsCount != numRounds){
      
         System.out.println("ROUND " + nextRound);
         
         //Generates user's choice
         int userPick;
         System.out.println("ROCK = 0, PAPER = 1, SCISSORS = 2 "); 
         userPick = keyboard.nextInt();
         System.out.println(" ");
         
         //Runs if user enters a number other than 0-2
         while (userPick < 0 || userPick > 2){
            System.out.println("Enter a valid choice");
            System.out.println("ROCK = 0, PAPER = 1, SCISSORS = 2 ");
            userPick = keyboard.nextInt();
            
         }
            
         //Generates computer's choice
         int compChoice = rand.nextInt(3);
         System.out.print("The computer chose ");
         
         if (compChoice == 0){
            System.out.println("ROCK");
            }
         else if (compChoice == 1){
            System.out.println("PAPER");
            }
         else{
            System.out.println("SCISSORS");
            }
         //Runs if user enters ROCK
         if (userPick == 0){
            System.out.println("You chose ROCK");
            //Both user and computer chose rock so round ends in a tie
            if (compChoice == 0){ 
               System.out.println("Tie");
               System.out.println(" ");
               }
            //Computer chose paper...computer wins
            else if (compChoice == 1){
               System.out.println("PAPER covers ROCK: You lost this round.");
               System.out.println(" ");
               compWinsCount++;//adds 1 to computer win count
               }
            //computer chose scissors...you win
            else{
               System.out.println("ROCK crushes SCISSORS: You won this round!");
               System.out.println(" ");
               userWinsCount++;//adds 1 to user win count
               }
               }//ends main if      
         
         //Runs if user enters paper
         else if (userPick == 1){
            System.out.println("You chose PAPER");
            
            //computer enters rock...you win
            if (compChoice == 0){
               System.out.println("PAPER covers ROCK: You won this round!");
               System.out.println(" ");
               userWinsCount++;//adds 1 to user win count
            }
            
            //computer enters paper...tie
            else if (compChoice == 1){
               System.out.println("Tie");
               System.out.println(" ");
            }
            
            //computer enters scissors...you lose
            else{
               System.out.println("SCISSORS cut PAPER: You lost this round.");
               System.out.println(" ");
               compWinsCount++;//adds 1 to computer win count
            }
            }//ends main else if
          
         //runs if user enters scissors      
         else {
            System.out.println("You chose SCISSORS");
            
            //computer enters rock...you lose
            if (compChoice == 0){ 
               System.out.println("ROCK crushes SCISSORS: You lost this round");
               System.out.println(" ");
               compWinsCount++;//adds 1 to computer win count
               }
            //computer enters paper...you win
            else if (compChoice == 1){
               System.out.println("SCISSORS cut PAPER: You won this round!");
               System.out.println(" ");
               userWinsCount++;//adds 1 to user win count
               }
            //computer enters scissors...tie
            else{
               System.out.println("Tie");
               System.out.println(" ");
               }
               }//ends main else
            
            System.out.println("User wins: " + userWinsCount);//displays number of user wins
            System.out.println("Computer wins: " + compWinsCount);//displays number of computer wins
            System.out.println("");
            
            nextRound++;//adds 1 to next round...begins new round
            
          }//ends while loop
          //Runs if user wins the game
          if (userWinsCount == numRounds){
            System.out.println("Congratutions you won the game!");
            }
            
          //runs if computer wins the game  
          if (compWinsCount == numRounds){
            System.out.println("You lost the game...Better luck next time!");          
            }
   }//ends main
  
}//end class
      
      
      
      