
package miller_midtermapp;

import javax.sound.sampled.LineUnavailableException;

/**
 *
 * @author Nick
 */
public class Admin {
    
    //User is provided instructions
    public void Intro() throws LineUnavailableException{
        //Alerts sound
        SoundUtils.tone(600,75);
        SoundUtils.tone(600,75);
        System.out.println("Hello! Welcome To The Bowling App!");
        System.out.println("Enter the info when prompted.");
        System.out.println("Once done entering you will get the final count.");
        System.out.println("You will also get the average!");
        System.out.println("Enjoy and have fun!\n\n");
    }
    // User is provided the shutdown
    public void Closing() throws LineUnavailableException{
        //Goodbye to user
        System.out.println("\nThank you. I hope you enjoyed :D");
        //Alerts sound
        SoundUtils.tone(450,75);
        SoundUtils.tone(970,75);
        SoundUtils.tone(300,85);
    }
}

