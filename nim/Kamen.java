public class Kamen {
    private Kruh kamen;
    private int stareX;
    private int stareY;
    private Sachovnica sachovnica;
    
    public Kamen(Sachovnica sachovnica) {
        this.sachovnica = sachovnica;
        
        this.kamen = new Kruh();
        this.kamen.posunVodorovne(20 * (sachovnica.getSirka() - 1) - 20 + 1);
        this.kamen.posunZvisle(20 * 0 - 60 + 1);
        this.kamen.zmenPriemer(18);
        this.kamen.zmenFarbu("yellow");
        
        this.stareX = sachovnica.getSirka() - 1;
        this.stareY = sachovnica.getVyska() - 1;
    }
    
    public void zobraz() {
        this.kamen.zobraz();
    }
    
    public void skry() {
        this.kamen.skry();
    }
    
    public void posunKamen(int x, int y) {
        if (x < 0 || x >= this.sachovnica.getSirka()) {
            return;
        }
        if (y < 0 || y >= this.sachovnica.getVyska()) {
            return;
        }
        int posunX = x - this.stareX;
        int posunY = y - this.stareY;
        
        this.kamen.skry();
        this.kamen.posunVodorovne(posunX * 20);
        this.kamen.posunZvisle(-posunY * 20);
        this.kamen.zobraz();
        
        this.stareX = x;
        this.stareY = y;
    }
}
