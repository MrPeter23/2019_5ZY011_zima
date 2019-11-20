public class Kamen {
    public Kamen(Sachovnica sachovnica) {
        Kruh kamen = new Kruh();
        kamen.posunVodorovne(20 * (sachovnica.getSirka() - 1) - 20 + 1);
        kamen.posunZvisle(20 * 0 - 60 + 1);
        kamen.zmenPriemer(18);
        kamen.zmenFarbu("yellow");
        kamen.zobraz();
    }
}
