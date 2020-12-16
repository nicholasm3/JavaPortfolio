//Class that holds all the data
package miller_midtermapp;

/**
 *
 * @author Nick
 */

public class Model {
    private String scores = "";
    private int accum = 0;
    private int count = 0;

    public void addScore(int score) {
        scores += " " + score;
        accum += score;
        count += 1;
    }

    public String getScoreEntries() {
        return scores;
    }

    public int getScoreAccum() {
        return accum;
    }

    public int getScoreCount() {
        return count;
    }
}



