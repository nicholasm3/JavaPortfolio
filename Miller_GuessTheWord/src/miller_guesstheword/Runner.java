
package miller_guesstheword;

import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import javax.sound.sampled.LineUnavailableException;

/**
 *
 * @author Nick
 */
public final class Runner {

    String[] myWordListArray = {"frog", "boat", "fish", "hope", "number", "cat", "james", "fruit", "abacus", "shamrock"};
    
    String thisword;
    int MAX = 10;
    int MIN = 1;
    int MAX_GUESSES = 7;
    int guessCounter = 0;
    boolean quit;
    char runAgain = 'Y';
    
    char holdChar;
    char[] aWord;
    char[] wordInPlayArray;
    char[] boardInPlayArray;
    
    ArrayList <Character> badGuessArray = new ArrayList();
    Scanner keys = new Scanner(System.in);
    Random rand = new Random();
    SoundUtils noise = new SoundUtils();
    
    public Runner() throws IOException, LineUnavailableException
    {
        do
        {
            
            gameSetup();
            System.out.println("Would you like to play again?");
            runAgain = keys.next().toUpperCase().charAt(0);
            
        }while(runAgain == 'Y');
        
    }
   
    public void gameSetup() throws IOException, LineUnavailableException
    {
        thisword = myWordListArray[rand.nextInt(MAX - MIN) + 1];
        
        aWord = new char[thisword.length()];
        wordInPlayArray = new char[thisword.length()];
        boardInPlayArray = new char[thisword.length()];
        
        StringReader readstring = new StringReader(thisword);
        readstring.read(aWord, 0, thisword.length());
        
        System.arraycopy(aWord, 0, wordInPlayArray, 0, aWord.length);
        System.out.println( );
        
        for(int i = 0; i < aWord.length; i++)
        {
            System.out.print("[ ]");
        }
        
        System.out.println( );
        guessCounter = 0;
        
        do
        {
            getGuessFromUser();
            if(holdChar == '0')
            {
                quit = true;
                return;
            }
            isGuessValid();
            displayGameBoard();
            displayBadGuesses();
            checkForWinner();
        }while(holdChar !='0');
        
    
    }
    
    
    public void getGuessFromUser() throws LineUnavailableException
    {
        if(guessCounter < 7)
        {
            System.out.println("\nEnter Guess or 0 to Quit: ");
            holdChar = keys.next().toLowerCase().charAt(0);
        }
        else
        { 
            
            SoundUtils.tone(240, 560);
            SoundUtils.tone(360, 670);
            SoundUtils.tone(430, 850);
            System.out.println("Sorry, no more guesses left!");
            holdChar = 0;
        }
    }
    public void isGuessValid() throws LineUnavailableException
    {
        boolean bad;
        bad = badGuessArray.contains(holdChar);
        if(bad)
        {
            System.out.println("This guess was already made" + holdChar);
            SoundUtils.tone(200, 570);
                    
        }
        else
        {
            handleMatch();
        }
    }
    public void handleMatch() throws LineUnavailableException
    {
        boolean matchFound = false;
        for(int i = 0; i < wordInPlayArray.length; i++)
        {
            if(wordInPlayArray[i] == holdChar)
            {
                boardInPlayArray[i] = holdChar;
                matchFound = true;
                SoundUtils.tone(200, 400);
                SoundUtils.tone(300, 400);
                
            }
        }
        if(matchFound == false)
        {
            SoundUtils.tone(500, 400);
            SoundUtils.tone(700, 400);
            
            badGuessArray.add(holdChar);
            guessCounter++;
            System.out.println("Your guesses remaining are:  " + (MAX_GUESSES - guessCounter));
        }
    }
    
    public void displayGameBoard()
    {
        for(int i = 0; i < wordInPlayArray.length; i++)
        {
            System.out.print("[" + boardInPlayArray[i] + "]" + " ");
        }
    }
    public void checkForWinner() throws LineUnavailableException
    {
        if(Arrays.equals(wordInPlayArray, boardInPlayArray))
                {
                    
                    System.out.println("\nWow, I'm really shocked you got it!");
                    SoundUtils.tone(600, 250);
                    SoundUtils.tone(700, 205);
                    SoundUtils.tone(900, 670);
                }
    }
    public void displayBadGuesses()
    {
        System.out.print("\tIncorrect Guesses: ");
        badGuessArray.forEach((letter) -> {
            System.out.print(letter + ", ");
        });
    }
    
}


