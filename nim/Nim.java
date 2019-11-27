public class Nim {
    private Kamen kamen;
    private String[] menaHracov;
    private boolean prvyNaTahu;
    private String menoVyhercu;
    
    public Nim(int sirka, int vyska, String menoPrveho, String menoDruheho) {
        Sachovnica sachovnica = new Sachovnica(sirka, vyska);
        this.kamen = sachovnica.vlozKamen();
        sachovnica.zobraz();
        this.menaHracov = new String[] {menoPrveho, menoDruheho};
        this.prvyNaTahu = true;
        this.menoVyhercu = null;
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
        if (oKolko <= 0) {
            System.out.println("Musis tahat o kladny pocet policok");
            return;
        }
        
        int x = this.kamen.getX();
        int y = this.kamen.getY() - oKolko;
        
        if (y < 0) {
            System.out.println("Snazis sa vybehnut zo sachovnice");
            return;
        }
        
        if (x == 0 && y == 0) {
            this.menoVyhercu = this.getHracNaTahu();
        }
        
        this.kamen.posunKamen(x, y);
        this.prvyNaTahu = !this.prvyNaTahu;
    }
    
    public void posunVlavo(int oKolko) {
        if (oKolko <= 0) {
            System.out.println("Musis tahat o kladny pocet policok");
            return;
        }
        
        int x = this.kamen.getX() - oKolko;
        int y = this.kamen.getY();
        
        if (x < 0) {
            System.out.println("Snazis sa vybehnut zo sachovnice");
            return;
        }
        
        if (x == 0 && y == 0) {
            this.menoVyhercu = this.getHracNaTahu();
        }
        
        this.kamen.posunKamen(x, y);
        this.prvyNaTahu = !this.prvyNaTahu;
    }
}
