public class Sachovnica {
    /**
     * Constructor for objects of class Sachovnica
     */
    public Sachovnica(int sirka, int vyska) {
        for (int y = 0; y < vyska; y++) {
            for (int x = 0; x < sirka; x++) {
                if ((x + y) % 2 != vyska % 2) {
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
