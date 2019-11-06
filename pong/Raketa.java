public class Raketa {
    private Obdlznik raketa;
    private Hra hra;
    private int poziciaY;
    private boolean jeLavaRaketa;
    
    public Raketa(Hra hra, boolean jeLavaRaketa) {
        this.hra = hra;
        
        this.jeLavaRaketa = jeLavaRaketa;
        
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
    
    public boolean koliduje(Lopticka lopticka) {
        int loptickaX = lopticka.getPoziciaStreduX();
        int loptickaY = lopticka.getPoziciaStreduY();
        
        int raketaMinY = this.poziciaY - 15;
        int raketaMaxY = this.poziciaY + 15;
        
        int raketaMinX;
        int raketaMaxX;
        
        if (this.jeLavaRaketa) {
            raketaMinX = 0;
            raketaMaxX = 10;
        } else {
            raketaMinX = this.hra.getSirkaPola() - 10;
            raketaMaxX = this.hra.getSirkaPola();
        }
        
        if (loptickaX >= raketaMinX && loptickaX <= raketaMaxX && loptickaY >= raketaMinY && loptickaY <= raketaMaxY) {
            return true;
        } else {
            return false;
        }
    }
}
