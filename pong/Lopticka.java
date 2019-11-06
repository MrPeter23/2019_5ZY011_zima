import java.util.Random;

public class Lopticka {
    private int poziciaX;
    private int poziciaY;
    private Kruh lopta;
    private int smerX;
    private int smerY;
    private Hra hra;
    
    public Lopticka(Hra hra) {
        Random nahodneCisla = new Random();
        
        this.hra = hra;
        
        this.poziciaX = this.hra.getSirkaPola() / 2;
        this.poziciaY = this.hra.getVyskaPola() / 2;
        
        this.lopta = new Kruh();
        this.lopta.posunVodorovne(this.poziciaX - 30);
        this.lopta.posunZvisle(this.poziciaY - 70);
        this.lopta.zmenPriemer(20);
        this.lopta.zobraz();
        
        this.smerX = (int) Math.pow(-1, nahodneCisla.nextInt());
        this.smerY = (int) Math.pow(-1, nahodneCisla.nextInt());
    }
    
    public void posun() {
        this.poziciaX += this.smerX * 10;
        this.poziciaY += this.smerY * 10;
        
        this.lopta.skry();
        this.lopta.posunVodorovne(this.smerX * 10);
        this.lopta.posunZvisle(this.smerY * 10);
        this.lopta.zobraz();
        
        if (this.poziciaX <= 10 || this.poziciaX >= this.hra.getSirkaPola() - 10) {
            this.smerX *= -1;
        }
        
        if (this.poziciaY <= 10 || this.poziciaY >= this.hra.getVyskaPola() - 10) {
            this.smerY *= -1;
        }
    }
    
    public int getPoziciaStreduX() {
        return this.poziciaX;
    }
    
    public int getPoziciaStreduY() {
        return this.poziciaY;
    }
    
    /**
     * Vrati "vlavo" - ak na lavom okraji, "vpravo" - na pravom okraji, "stred" - inak
     */
    public String getPozicia() {
        if (this.poziciaX <= 10) {
            return "vlavo";
        } else { 
            if (this.poziciaX >= this.hra.getSirkaPola() - 10) {
                return "vpravo";
            } else {
                return "stred";
            }
        }
    }
}
