public class Raketa {
    private Obdlznik raketa;
    private Hra hra;
    private int poziciaY;
    
    public Raketa(Hra hra, boolean jeLavaRaketa) {
        this.hra = hra;
        
        this.poziciaY = this.hra.getVyskaPola() / 2;
        
        this.raketa = new Obdlznik();
        this.raketa.posunZvisle(this.poziciaY - 65);
        if (jeLavaRaketa) {
            this.raketa.posunVodorovne(-60);
        } else {
            this.raketa.posunVodorovne(this.hra.getSirkaPola() - 63);
        }
        this.raketa.zmenStrany(3, 30);
        this.raketa.zobraz();
    }
    
    public void posunDole() {
        if (this.poziciaY >= this.hra.getVyskaPola() - 15) {
            return;
        }
        
        this.raketa.posunZvisle(5);
        
        this.poziciaY += 5;
    }
    
    public void posunHore() {
        if (this.poziciaY <= 15) {
            return;
        }
        
        this.raketa.posunZvisle(-5);
        
        this.poziciaY -= 5;
    }
}
