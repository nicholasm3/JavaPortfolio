
package miller_midtermapp;

import javax.sound.sampled.LineUnavailableException;

/**
 *
 * @author Nick
 */
public class Controller {

    Model md = new Model();
    
    public void missionControl() throws LineUnavailableException
    {   //View class
        View vi = new View();
        
        //Do loop
        do
        {
            vi.getContinueApp();
        } while(vi.continueRun == 'Y');
    }

    public void requestResetScores()
    {
        md = new Model();
    }

    public void requestWriteScore(int s1)
    {
        md.addScore(s1);
    }

    public int requestScoreAccum()
    {
        return md.getScoreAccum();
    }

    public int requestScoreCount()
    {
        return md.getScoreCount();
    }

    public String requestScoreEntries()
    {
        return md.getScoreEntries();
    }
}