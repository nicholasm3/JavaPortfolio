//Nicholas Miller
//ITDEV110-500
//Assignment 6
package miller_insertfunapp;

/**
 *
 * @author Nick
 */

//Main
public class Miller_InsertFunApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Admin ad = new Admin();
        ad.Intro();
        GameController control = new GameController();
        ad.Closing();
    }
    
}
