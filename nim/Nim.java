public class Nim {
    private Kamen kamen;
    private String[] menaHracov;
    private boolean prvyNaTahu;
    
    public Nim(int sirka, int vyska, String menoPrveho, String menoDruheho) {
        Sachovnica sachovnica = new Sachovnica(sirka, vyska);
        this.kamen = sachovnica.vlozKamen();
        sachovnica.zobraz();
        this.menaHracov = new String[] {menoPrveho, menoDruheho};
        this.prvyNaTahu = true;
    }
    
    public String getHracNaTahu() {
        if (this.prvyNaTahu) {
            return this.menaHracov[0];
        } else {
            return this.menaHracov[1];
        }
    }
    
    public void posunDole(int oKolko) {
        int x = this.kamen.getX();
        int y = this.kamen.getY() - oKolko;
        this.kamen.posunKamen(x, y);
        this.prvyNaTahu = !this.prvyNaTahu;
    }
    
    public void posunVlavo(int oKolko) {
        int x = this.kamen.getX() - oKolko;
        int y = this.kamen.getY();
        this.kamen.posunKamen(x, y);
        this.prvyNaTahu = !this.prvyNaTahu;
    }
}
