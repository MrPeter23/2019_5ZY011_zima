import java.util.Random;

public class NahodnyPokus {
    private Hra hra;
    private boolean maHracMenit;
    
    public NahodnyPokus(boolean maHracMenit) {
        this.hra = new Hra();
        this.maHracMenit = maHracMenit;
    }
    
    public void vykonaj() {
        Random nahodneCisla = new Random();
        
        this.hra.vyberDvere(nahodneCisla.nextInt(3));
        
        int otvaraneDvere;
        do {
            otvaraneDvere = nahodneCisla.nextInt(3);
        } while (!this.hra.mozeOtvoritDvere(otvaraneDvere));
        
        this.hra.otvorDvere(otvaraneDvere);
        
        if (this.maHracMenit) {
            int vyberaneDvere;
            do {
                vyberaneDvere = nahodneCisla.nextInt(3);
            } while (!this.hra.mozeVybratDvere(vyberaneDvere));
            
            this.hra.vyberDvere(vyberaneDvere);
        }
    }
    
    public boolean jeVyhra() {
        return this.hra.jeVyhra();
    }
}
