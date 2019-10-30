public class Lopticka {
    private int poziciaX;
    private int poziciaY;
    private Kruh lopta;
    
    public Lopticka() {
        this.poziciaX = 150;
        this.poziciaY = 150;
        this.lopta = new Kruh();
        this.lopta.posunVodorovne(120);
        this.lopta.posunZvisle(80);
        this.lopta.zmenPriemer(20);
        this.lopta.zobraz();
    }
}
