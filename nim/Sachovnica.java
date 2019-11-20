
/**
 * Write a description of class Sachovnica here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Sachovnica {
    /**
     * Constructor for objects of class Sachovnica
     */
    public Sachovnica() {
        for (int y = 0; y < 8; y++) {
            for (int x = 0; x < 8; x++) {
                // if (x % 2 == y % 2) {
                if ((x + y) % 2 == 1) {
                    Stvorec policko = new Stvorec();
                    
                    policko.posunVodorovne(20 * x - 60);
                    policko.posunZvisle(20 * y - 50);
                    
                    policko.zmenStranu(20);
                    
                    policko.zobraz();
                }
            }
        }
    }
}
