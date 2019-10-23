
/**
 * Write a description of class Klient here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Klient {
    private Banka banka;
    private String meno;
    private long sumaNaUcte;
    
    public Klient(String meno, Banka banka) {
        this.sumaNaUcte = 0;
        this.meno = meno;
        this.banka = banka;
    }
}
