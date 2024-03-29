public class Hra {
    private Raketa hrac1;
    private Raketa hrac2;
    
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
        
        this.hrac1 = new Raketa(this, true);
        this.hrac2 = new Raketa(this, false);
    }
    
    public void tik() {
        this.lopticka.posun();
        
        switch (this.lopticka.getPozicia()) {
            case "vlavo":
                if (!this.hrac1.koliduje(this.lopticka)) {
                    System.out.println("Lavy prehral");
                    this.lopticka.zrus();
                    this.lopticka = new Lopticka(this);
                }
                break;
            case "vpravo":
                if (!this.hrac2.koliduje(this.lopticka)) {
                    System.out.println("Pravy prehral");
                    this.lopticka.zrus();
                    this.lopticka = new Lopticka(this);
                }
                break;
        }
    }
    
    public void zrus() {
        System.exit(0);
    }
    
    public int getVyskaPola() {
        return this.vyskaPola;
    }
    
    public int getSirkaPola() {
        return this.sirkaPola;
    }
    
    public void posunDole() {
        this.hrac1.posunDole();
    }
    
    public void posunHore() {
        this.hrac1.posunHore();
    }
    
    public void posunVlavo() {
        this.hrac2.posunDole();
    }
    
    public void posunVpravo() {
        this.hrac2.posunHore();
    }
    
    public void spusti() {
        new Manazer()
            .spravujObjekt(this);
    }
}
