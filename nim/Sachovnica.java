import java.util.ArrayList;

public class Sachovnica {
    private ArrayList<Stvorec> policka;
    
    public Sachovnica(int sirka, int vyska) {
        this.policka = new ArrayList<Stvorec>();
        
        for (int y = 0; y < vyska; y++) {
            for (int x = 0; x < sirka; x++) {
                if ((x + y) % 2 != vyska % 2) {
                    Stvorec policko = new Stvorec();
                    
                    policko.posunVodorovne(20 * x - 60);
                    policko.posunZvisle(20 * y - 50);
                    
                    policko.zmenStranu(20);
                    
                    this.policka.add(policko);
                }
            }
        }
    }
    
    public void zobraz() {
        for (Stvorec policko : this.policka) {
            policko.zobraz();
        }
    }
    
    public void skry() {
        for (Stvorec policko : this.policka) {
            policko.skry();
        }
    }
}
