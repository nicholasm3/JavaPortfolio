//Nicholas Miller
//ITDEV110-500
//Mid-Term Exam 
package miller_midtermapp;

/**
 *
 * @author Nick
 */
import javax.sound.sampled.LineUnavailableException;

public class Miller_MidTermApp {

    /**
     * @param args the command line arguments
     * @throws javax.sound.sampled.LineUnavailableException
     */
    public static void main(String[] args) throws LineUnavailableException {
        Admin ad = new Admin();
        //Intro
        ad.Intro();
        Controller cont = new Controller();
        cont.missionControl();
        //Closing statement
        ad.Closing();
    }
    
}
