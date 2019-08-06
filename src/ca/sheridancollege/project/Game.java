/**
 * SYST 17796 Project Winter 2019 Base code.
 * Students can modify and extend to implement their game.
 * Add your name as a modifier and the date!
 */
package ca.sheridancollege.project;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * The class that models your game. You should create a more specific
 * child of this class and instantiate the methods given.
 * @author dancye, 2018
 */
public abstract class Game 
{
    private  String gameName = "Knock Out Whist";//the title of the game
    private ArrayList <Player> players;// the players of the game
    
    public Game(String givenName)
    {
        gameName = givenName;
       
    }

    /**
     * @return the gameName
     */
    public String getGameName() 
    {
        return gameName;
    }
    
     /**
     * @return the players of this game
     */
    public ArrayList <Player> getPlayers() 
    {
        return players;
    }

    /**
     * @param players the players of this game
     */
    public void setPlayers(ArrayList <Player> players) 
    {
        this.players = players;
    }
    
    /**
     * Play the game. This might be one method or many method calls depending
     * on your game.
     */
    public abstract void play();
    
    /**
     * When the game is over, use this method to declare and display a winning
     * player.
     */
    public abstract void declareWinner();

   
   public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean playAgain = true;
        int userScore = 0;
        int compScore = 0;
        int round = 0;
        
        System.out.println("hi! welcome to Knock Out Whist");
        System.out.print("enter your name");
        String userName = input.nextLine();
        do {
            round++;
            System.out.println("enter 1 for spade " + "\n"
                    + "enter 2 for heart " + "\n"
                    + "enter 3 for diamonds " + "\n"
                    + "enter 4 for clubs " + "\n"
            );

            int cardNum = input.nextInt();
            GroupOfCards gc = new GroupOfCards();
            gc.setSuit(GroupOfCards.SUITS[cardNum - 1]);

            System.out.println("Enter regular card number from 1 to 10 " + "\n"
                    + "& 11 for jack" + "\n"
                    + "& 12 for king" + "\n"
                    + "13 for king"
            );
            int cardVal = input.nextInt();
            System.out.println(userName + " selected " + gc.getSuit() + "  " + cardVal);
            Card cd = new Card();
            int cmpval = cd.getRandomValue();
            if (cmpval <= 10) {
                System.out.println("computer selected " + gc.getSuit() + " " + cmpval);
            } else if (cmpval == 11) {
                System.out.println("computer selected " + gc.getSuit() + " jack ");
            } else if (cmpval == 12) {
                System.out.println("computer selected " + gc.getSuit() + " queen ");
            } else if (cmpval == 13) {
                System.out.println("computer selected " + gc.getSuit() + " jack ");
            }
            if (cardVal > cmpval) {
                System.out.println(userName + " wins");
                userScore++;
            } else if (cardVal < cmpval) {
                System.out.println("computer wins");
                compScore++;
            } else {
                System.out.println("tie");
            }
            System.out.println();
            System.out.println("Round: "+ round);
            System.out.println(userName + " score :" + userScore);

            System.out.println("computer score :" + compScore);
            System.out.println();
            System.out.println("press 1 to play again ..enter any number to quit");
            int playnum = input.nextInt();
            if (playnum == 1) {
                playAgain = true;
            } else{
                System.out.println("Round: "+ round);
                System.out.println(userName + " score :" + userScore);
                System.out.println("computer score :" + compScore);
                
                if(userScore < compScore){
                    System.out.println("You lost...try again!");
                }else if(userScore == compScore){
                    System.out.println("Its a Tie!");
                }else{
                    System.out.println("congrates you won!!!");
                }
                
                
                playAgain = false;
            }
            
         
            
            
        } while (playAgain == true || round == 24);}
}//end class
