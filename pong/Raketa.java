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
        this.raketa.posunZvisle(1);
    }
    
    public void posunHore() {
        this.raketa.posunZvisle(-1);
    }
}
