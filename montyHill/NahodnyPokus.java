import java.util.Random;

public class NahodnyPokus {
    private Hra hra;
    private boolean maHracMenit;
    private Random nahodneCisla;
    
    public NahodnyPokus(Random nahodneCisla, boolean maHracMenit) {
        this.nahodneCisla = nahodneCisla;
        
        this.hra = new Hra(this.nahodneCisla);
        this.maHracMenit = maHracMenit;
    }
    
    public void vykonaj() {
        this.hra.vyberDvere(this.nahodneCisla.nextInt(3));
        
        int otvaraneDvere;
        do {
            otvaraneDvere = this.nahodneCisla.nextInt(3);
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
