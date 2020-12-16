
package miller_midtermapp;

/**
 *
 * @author Nick
 */
import java.util.Scanner;
import javax.sound.sampled.LineUnavailableException;

public class View {
    
    int score = 0;
    char continueRun;
    char continueEnteringScores;
    Controller f = new Controller();
    Scanner keyboard = new Scanner(System.in);


    public void getContinueApp() throws LineUnavailableException{
        //Asks user to start app
        System.out.println("\nWould you like to continue Y or N?: \t");
        continueRun = keyboard.next().toUpperCase().charAt(0);

        if(continueRun== 'Y')
        {
            f.requestResetScores();
            getScores();
        }
    }
    
    public void getScores() throws LineUnavailableException {
        continueEnteringScores = 'Y';

        while(continueEnteringScores == 'Y') {
            //Asks user to enter score
            System.out.println("Enter Score: \t");
            score = keyboard.nextInt();
            sendScore();
            displayScores();
            //Asks user if they would like to run again
            System.out.println("\nWould you like to enter another score? (Y/N): \t");
            continueEnteringScores = keyboard.next().toUpperCase().charAt(0);
        }
 
        displayScores();
    }

    public void sendScore(){
        f.requestWriteScore(score);
    }

    public void displayScores() throws LineUnavailableException{
        String entries = f.requestScoreEntries();
        int total = f.requestScoreAccum();
        int numScores = f.requestScoreCount();
        int avg = total / numScores;
        //Displays user entered info
        System.out.println("You Entered: " + "\t\t" + entries);
        //Displays average
        System.out.println("Your Average is: " + avg);
        SoundUtils.tone(875,75);
        SoundUtils.tone(930,75);
    }
}
