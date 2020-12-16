//Nicholas Miller
//ITDEV110-500
//Assignment 10
package miller_guesstheword;

import java.io.IOException;
import javax.sound.sampled.LineUnavailableException;

/**
 *
 * @author Nick
 */
public class Miller_GuessTheWord {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws LineUnavailableException, IOException {
        Admin ad = new Admin();
        ad.Introduction();
        Runner run = new Runner();
        ad.Termination();
    }
}
    

