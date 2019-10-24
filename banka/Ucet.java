public class Ucet {
    private Banka banka;
    private long suma;
    private Klient klient;
    
    public Ucet(Banka banka, Klient klient) {
        this.suma = 0;
        this.banka = banka;
        this.klient = klient;
    }
    
    public String getNazovBanky() {
        return this.banka.getNazov();
    }
    
    public void vloz(double suma) {
        if (suma <= 0) {
            System.out.println("Vkladat mozes len kladnu ciastku!");
            return;
        }
        
        this.suma += suma * 100;
    }
    
    public void vyber(double suma) {
        if (suma <= 0) {
            System.out.println("Vyberat mozes len kladnu ciastku!");
            return;
        }
        
        if (this.suma < suma * 100) {
            System.out.println("Na ucte nemas dost peniazov!");
            return;
        }
        
        this.suma -= suma * 100;
    }
    
    public double getStav() {
        return this.suma / 100.;
    }
}
