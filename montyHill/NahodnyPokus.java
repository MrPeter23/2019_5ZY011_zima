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
    }
    
    public boolean jeVyhra() {
        return this.hra.jeVyhra();
    }
}
