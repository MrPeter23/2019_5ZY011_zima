public class Nim {
    private Kamen kamen;
    
    public Nim(int sirka, int vyska) {
        Sachovnica sachovnica = new Sachovnica(sirka, vyska);
        this.kamen = sachovnica.vlozKamen();
        sachovnica.zobraz();
    }
    
    public void posunDole(int oKolko) {
        int x = this.kamen.getX();
        int y = this.kamen.getY() - oKolko;
        this.kamen.posunKamen(x, y);
    }
    
    public void posunVlavo(int oKolko) {
        int x = this.kamen.getX() - oKolko;
        int y = this.kamen.getY();
        this.kamen.posunKamen(x, y);
    }
}
