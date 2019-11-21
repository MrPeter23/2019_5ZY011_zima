public class Kamen {
    private Kruh kamen;
    public Kamen(Sachovnica sachovnica) {
        this.kamen = new Kruh();
        this.kamen.posunVodorovne(20 * (sachovnica.getSirka() - 1) - 20 + 1);
        this.kamen.posunZvisle(20 * 0 - 60 + 1);
        this.kamen.zmenPriemer(18);
        this.kamen.zmenFarbu("yellow");
        sachovnica.vlozKamen(this);
    }
    
    public void zobraz() {
        this.kamen.zobraz();
    }
    
    public void skry() {
        this.kamen.skry();
    }
}
