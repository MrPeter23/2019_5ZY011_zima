import java.util.Random;

public class Lopticka {
    private int poziciaX;
    private int poziciaY;
    private Kruh lopta;
    private int smerX;
    private int smerY;
    
    public Lopticka() {
        Random nahodneCisla = new Random();
        
        this.poziciaX = 150;
        this.poziciaY = 150;
        this.lopta = new Kruh();
        this.lopta.posunVodorovne(120);
        this.lopta.posunZvisle(80);
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
    }
}
