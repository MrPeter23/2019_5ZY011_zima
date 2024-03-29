public class Segment {
    private Obdlznik zobrazenie;
    
    public Segment(int dlzkaSegmentu, int hrubkaSegmentu, int poziciaX, int poziciaY) {
        this.zobrazenie = new Obdlznik();
        this.zobrazenie.zmenStrany(dlzkaSegmentu, hrubkaSegmentu);
        this.zobrazenie.posunVodorovne(poziciaX - 60);
        this.zobrazenie.posunZvisle(poziciaY - 50);
        this.zobrazenie.zmenFarbu("black");
        this.zobrazenie.zobraz();
    }
    
    public void rozsviet() {
        this.zobrazenie.zmenFarbu("yellow");
    }
    
    public void zhasni() {
        this.zobrazenie.zmenFarbu("black");
    }
    
    public void nastavSvietenie(boolean maSvietit) {
        if (maSvietit) {
            this.zobrazenie.zmenFarbu("yellow");
        } else {
            this.zobrazenie.zmenFarbu("black");
        }
    }
}
