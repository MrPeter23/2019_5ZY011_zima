import java.util.Random;

public class Nim {
    private Kamen kamen;
    private String[] menaHracov;
    private boolean prvyNaTahu;
    private String menoVyhercu;
    private Random nahodneCisla;
    
    public Nim(int sirka, int vyska, String menoPrveho, String menoDruheho) {
        Sachovnica sachovnica = new Sachovnica(sirka, vyska);
        this.kamen = sachovnica.vlozKamen();
        sachovnica.zobraz();
        this.menaHracov = new String[] {menoPrveho, menoDruheho};
        this.prvyNaTahu = true;
        this.menoVyhercu = null;
        this.nahodneCisla = new Random();
        if (this.getHracNaTahu() != null && this.getHracNaTahu().equals("PC")) {
            this.tahPC();
        }
    }
    
    public int getX() {
        return this.kamen.getX();
    }
    
    public int getY() {
        return this.kamen.getY();
    }
    
    public String getVyherca() {
        return this.menoVyhercu;
    }
    
    public String getHracNaTahu() {
        if (this.menoVyhercu != null) {
            return null;
        } else if (this.prvyNaTahu) {
            return this.menaHracov[0];
        } else {
            return this.menaHracov[1];
        }
    }
    
    public void posunDole(int oKolko) {
        this.posun(true, oKolko);
    }
    
    public void posunVlavo(int oKolko) {
        this.posun(false, oKolko);
    }
    
    private void posun(boolean tahDole, int oKolko) {
        if (oKolko <= 0) {
            System.out.println("Musis tahat o kladny pocet policok");
            return;
        }
        
        int x;
        int y;
        
        if (tahDole) {
            x = this.kamen.getX();
            y = this.kamen.getY() - oKolko;
        } else {
            x = this.kamen.getX() - oKolko;
            y = this.kamen.getY();
        }
        
        if (y < 0) {
            System.out.println("Snazis sa vybehnut zo sachovnice");
            return;
        }
        
        if (x < 0) {
            System.out.println("Snazis sa vybehnut zo sachovnice");
            return;
        }
        
        if (x == 0 && y == 0) {
            this.menoVyhercu = this.getHracNaTahu();
        }
        
        this.kamen.posunKamen(x, y);
        this.prvyNaTahu = !this.prvyNaTahu;
        
        if (this.getHracNaTahu() != null && this.getHracNaTahu().equals("PC")) {
            this.tahPC();
        }
    }
    
    private void tahPC() {
        int x = this.kamen.getX();
        int y = this.kamen.getY();
        
        if (x > y) {
            this.posunVlavo(x - y);
        } else if (x < y) {
            this.posunDole(y - x);
        } else {
            if (this.nahodneCisla.nextBoolean()) {
                this.posunVlavo(this.nahodneCisla.nextInt(x) + 1);
            } else {
                this.posunDole(this.nahodneCisla.nextInt(x) + 1);
            }
        }
    }
}
