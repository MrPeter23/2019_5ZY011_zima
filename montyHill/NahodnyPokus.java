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
            for (int i = 0; i < 3; i++) {
                if (this.hra.mozeVybratDvere(i)) {
                    this.hra.vyberDvere(i);
                    return;
                }
            }
            
            /*
            int vyberaneDvere = 0;
            while (!this.hra.mozeVybratDvere(vyberaneDvere)) {
                vyberaneDvere++;
            }
            this.hra.vyberDvere(vyberaneDvere);
            */
        }
    }
    
    public boolean jeVyhra() {
        return this.hra.jeVyhra();
    }
}
