import java.util.Random;

public class Hra {
    private Dvere[] dvere;
    
    public Hra() {
        this.dvere = new Dvere[3];
        
        Random nahodneCisla = new Random();
        
        int vyherneDvere = nahodneCisla.nextInt(this.dvere.length);
        
        for (int i = 0; i < this.dvere.length; i++) {
            this.dvere[i] = new Dvere(vyherneDvere == i);
        }
    }
}
