public class Hra {
    private Lopticka lopticka;
    private int sirkaPola;
    private int vyskaPola;
    
    public Hra(int sirkaPola, int vyskaPola) {
        this.vyskaPola = vyskaPola;
        this.sirkaPola = sirkaPola;
        
        Obdlznik pozadie = new Obdlznik();
        pozadie.posunVodorovne(-60);
        pozadie.posunZvisle(-50);
        pozadie.zmenFarbu("yellow");
        pozadie.zmenStrany(sirkaPola, vyskaPola);
        pozadie.zobraz();
        
        this.lopticka = new Lopticka(this);
    }
    
    public void tik() {
        this.lopticka.posun();
    }
    
    public int getVyskaPola() {
        return this.vyskaPola;
    }
    
    public int getSirkaPola() {
        return this.sirkaPola;
    }
}
