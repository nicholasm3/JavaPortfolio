
package miller_insertfunapp;

/**
 *
 * @author Nick
 */

public class InsertFunUI_View {
    
    private String gender;
    private String noun;
    private String food;
    private String adjective;
    private String adverb;

    public InsertFunUI_View(GameController myView){

    gender = myView.gender;
    noun = myView.noun;
    food = myView.food;
    adjective = myView.adjective;
    adverb = myView.adverb;
    
}
    //Getter and setter emthods are defined for each word

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getNoun() {
        return noun;
    }

    public void setNoun(String noun) {
        this.noun = noun;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getAdjective() {
        return adjective;
    }

    public void setAdjective(String adjective) {
        this.adjective = adjective;
    }

    public String getAdverb() {
        return adverb;
    }

    public void setAdverb(String adverb) {
        this.adverb = adverb;
    }

    }