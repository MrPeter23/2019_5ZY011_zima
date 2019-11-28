public class NimKlikaci {
    private Nim nim;
    private int vyska;
    
    public NimKlikaci(int sirka, int vyska, String menoPrveho, String menoDruheho) {
        this.nim = new Nim(sirka, vyska, menoPrveho, menoDruheho);
        this.vyska = vyska;
    }
    
    public void spusti() {
        new Manazer().spravujObjekt(this);
    }
    
    public void vyberSuradnice(int x, int y) {
        int xPolicka = x / 20;
        int yPolicka = this.vyska - y / 20 - 1;
        
        int xKamena = this.nim.getX();
        int yKamena = this.nim.getY();
        
        if (yPolicka == yKamena) {
            this.nim.posunVlavo(xKamena - xPolicka);
        } else if (xPolicka == xKamena) {
            this.nim.posunDole(yKamena - yPolicka);
        }
        
        if (this.nim.getHracNaTahu() != null) {
            System.out.format("Na tahu je: %s%n", this.nim.getHracNaTahu());
        } else {
            System.out.format("Hru vyhral: %s.%nGRATULUJEME!%n", this.nim.getVyherca());
        }
    }
}
