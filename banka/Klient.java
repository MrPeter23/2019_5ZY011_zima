
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
    
    public String getNazovBanky() {
        return this.banka.getNazov();
    }
    
    public void vlozNaUcet(double suma) {
        if (suma <= 0) {
            System.out.println("Vkladat mozes len kladnu ciastku!");
            return;
        }
        
        this.sumaNaUcte += suma * 100;
    }
    
    public void vyberZUctu(double suma) {
        if (suma <= 0) {
            System.out.println("Vyberat mozes len kladnu ciastku!");
            return;
        }
        
        if (this.sumaNaUcte < suma * 100) {
            System.out.println("Na ucte nemas dost peniazov!");
            return;
        }
        
        this.sumaNaUcte -= suma * 100;
    }
    
    public double getStavUctu() {
        return this.sumaNaUcte / 100.;
    }
}
