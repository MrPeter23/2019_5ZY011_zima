import java.util.Random;

public class Hra {
    private Dvere[] dvere;
    
    public Hra(Random nahodneCisla) {
        this.dvere = new Dvere[3];
        
        int vyherneDvere = nahodneCisla.nextInt(this.dvere.length);
        
        for (int i = 0; i < this.dvere.length; i++) {
            this.dvere[i] = new Dvere(vyherneDvere == i);
        }
    }
    
    public boolean mozeVybratDvere(int cislo) {
        if (cislo < 0 || cislo >= this.dvere.length) {
            return false;
        }
        
        return this.dvere[cislo].mozeVybrat();
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
    
    public boolean mozeOtvoritDvere(int cislo) {
        if (cislo < 0 || cislo >= this.dvere.length) {
            return false;
        }
        
        return this.dvere[cislo].mozeOtvorit();
    }
    
    public void otvorDvere(int cislo) {
        if (cislo < 0 || cislo >= this.dvere.length) {
            System.out.println("Dvere su len " + this.dvere.length);
            return;
        }
        
        this.dvere[cislo].otvor();
    }
    
    public boolean jeVyhra() {
        for (Dvere dvere : this.dvere) {
            if (dvere.suVyherne()) {
                return true;
            }
        }
        
        return false;
    }
}
