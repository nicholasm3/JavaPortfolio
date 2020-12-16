/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miller_guesstheword;

import javax.sound.sampled.LineUnavailableException;

/**
 *
 * @author Nick
 */
public class Admin {
    
     public void Introduction() throws LineUnavailableException
        {
            SoundUtils.tone(100, 800);
            SoundUtils.tone(155, 600);
            System.out.println("Greetings FRIEND! Get ready to play a game, the computer will choose a random word!");
            System.out.println("In this game you will be guessing a word, you have seven chances to guess!");
            System.out.println("If you do not guess it correctly, you lose!!!!!!");

     
        }
        public void Termination()
        {
            System.out.println("\n\nThank you for playing!");
        }
}       

