// Application:    Final Project
// Author:         Grace Phillips
// Description:    Zombie Maze Game
// Version:        1.0
// Date Motified:  May 6th, 2019
package gracephillipsfinalproject;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.Random; 



public class GracePhillipsFinalProject {

    
    public static void main(String[] args) throws FileNotFoundException, IOException {
    Scanner keyboard= new Scanner(System.in);
    System.out.println("Welcome to the game of maze survival! ");
    System.out.println("You will make choices to see if you can escape this maze alive!");
    
    System.out.println("Your first crossroad has appeared would you like to go:");
    System.out.println("1. Left");
    System.out.println("   or"); 
    System.out.println("2. Right");
    System.out.print("Please choose a number: ");
    int firstQuestion = keyboard.nextInt();
    
    if (firstQuestion <= 1)
    {
       System.out.println("Wise choice! Let's continue.\n");
    }
    
    else 
    {
       System.out.println("A zombie was going to kill you but you dodged it! Let's continue\n");
        
    }
    
    
    
    System.out.print("You hear footsteps, how many seconds should you wait?:");
    
    double secondQuestion = keyboard.nextInt();

    if (secondQuestion <50 )
    {
        System.out.println("Perfect timing! Hurry lets keep going!\n");
    }
    
   
        
    while (secondQuestion >=50 )
    {
      System.out.println("Breathe... " + secondQuestion);
      secondQuestion--; 
      System.out.println("Sneak attack! A zombie ate your brain! GAME OVER!");
      System.out.println("Check out some of the scores from this week!\n");
      
    int players = 3;
    int rounds = 2;
    
    //Turn on randomizer 
    Random randomNumber = new Random();

    //Create array 
       int [][] games = new int [players][rounds]; 
       
       for(int i = 0; i < players; i++)
       {
           for (int c = 0; c < rounds; c++)
           {
               games [i][c]= randomNumber.nextInt(10);
           }
       }
       
       //Output scoreboard
       System.out.println("Scores of the week");
       System.out.println("================");
       
       for (int c = 0; c < rounds; c++)
       {
                   System.out.print("| ");
                   for(int i = 0; i < players; i++)
                   {
                      if (games [i][c] < 10)
                          System.out.print("");
                       System.out.print(games [i][c]);
                       System.out.print(" | ");
                   }
                   System.out.print("\n");
       }
      System.exit(0);     
    }
    
    System.out.println("Congrats on making it this far. I have a feeling that you are almost out!\n");
    System.out.println("You see a figure in the distance should you:");
    System.out.println("1. Go towards it");
    System.out.println("   or"); 
    System.out.println("2. Go back the way you came");
    System.out.print("Please choose a number: ");
    
    int thirdQuestion = keyboard.nextInt();
    
    if (thirdQuestion <= 1)
    {
       System.out.println("NICE TRY! You went straight towards the zombie and died! GAME OVER");
       System.out.println("Check out some of the scores from this week:\n");
       int players = 3;
    int rounds = 2;
    
    Random randomNumber = new Random();

//Create array 
       int [][] games = new int [players][rounds]; 
       
       for(int i = 0; i < players; i++)
       {
           for (int c = 0; c < rounds; c++)
           {
               games [i][c]= randomNumber.nextInt(10);
           }
       }
       
       //Output scoreboard
       System.out.println("Scores of the week");
       System.out.println("================");
       
       for (int c = 0; c < rounds; c++)
       {
                   System.out.print("| ");
                   for(int i = 0; i < players; i++)
                   {
                      if (games [i][c] < 10)
                          System.out.print("");
                       System.out.print(games [i][c]);
                       System.out.print(" | ");
                   }
                   System.out.print("\n");
       }
   
       System.exit(0);
    
    }
    else 
    {
       System.out.println("Wow you are super smart lets find another exit!\n");    
    }
    
    
    System.out.println("There's a straight path to the exit! How many steps do you think it will take you to get out?");
   
    float fourthQuestion = keyboard.nextInt();
    
    while (fourthQuestion >= 0)
    {
      System.out.println("Step.. " + fourthQuestion);
      fourthQuestion--;   
    }
    
    System.out.println("Did you really think you could escape this maze? No one does :) GAME OVER!");
    System.out.println("Check out some of the scores from this week!\n");
    
    
     //define file and open it
        FileWriter fw = new FileWriter("/Users/gracephillips/Desktop/FinalScores.txt", true);
        PrintWriter outputFile = new PrintWriter(fw); 
        
        outputFile.println("Scores of the week\n" +"================\n" +"| 6 | 2 | 5 | \n" +"| 9 | 1 | 4 | ");

       
        
        //close output file
        outputFile.close();    

            
      
    }
  
  }

