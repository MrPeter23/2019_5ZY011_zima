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
    
    public void vyberDvere(int cislo) {
        if (cislo < 0 || cislo >= this.dvere.length) {
            System.out.println("Dvere su len " + this.dvere.length);
            return;
        }
        
        for (Dvere dvere : this.dvere) {
            dvere.zrusVyberAkTreba();
        }
        
        this.dvere[cislo].vyber();
    }
}
