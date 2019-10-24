public class Banka {
    private String nazov;
    
    public Banka(String nazov) {
        this.nazov = nazov;
    }
    
    public String getNazov() {
        return this.nazov;
    }
    
    public Ucet zalozUcet() {
        return new Ucet(this);
    }
}
