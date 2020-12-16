
package miller_insertfunapp;

import java.util.Scanner;

/**
 *
 * @author Nick
 */
public final class GameController {
    
    Scanner keyboard = new Scanner(System.in);
    
    String gender;
    String noun;
    String food;
    String adjective;
    String adverb;
    char runAgain;
    
    
    public  GameController()
    {
        do {
            inScreen();
            displayPoem();
            //User is prompted with being able to run app again
            System.out.println("Would you like to play again? Y or N");
            runAgain = keyboard.nextLine().toUpperCase().charAt(0);
                
        } while (runAgain == 'Y');
    }
    
    public void inScreen(){
        //User is prompted to enter info for poem
        System.out.println("Enter Man, Woman or Other: \t");
        gender = keyboard.nextLine();
        System.out.println("Enter A Noun: \t");
        noun = keyboard.nextLine();
        System.out.println("Enter A Food: \t");
        food = keyboard.nextLine();
        System.out.println("Enter A Adjective: \t");
        adjective = keyboard.nextLine();
        System.out.println("Enter A Adverb: \t");
        adverb = keyboard.nextLine();
    }
    
    public void displayPoem(){
        //Poem is displayed to the user
        System.out.println("\nThere was an old " + gender + " who lived in a " + noun + ".");
        System.out.println("They had so many, " + noun + " they didn't know what to do." );
        System.out.println("They gave them some " + food + " without any " + food + ";");
        System.out.println("Then " + adjective + " them all " + adverb  + " and put them to bed.\n\n");
        
        //The poem I used was:
        //There was an old woman who lived in a shoe.
        //She had so many children, she didn't know what to do.
        //She gave them some broth without any bread;
        //And whipped them all soundly and put them to bed.
    }
}