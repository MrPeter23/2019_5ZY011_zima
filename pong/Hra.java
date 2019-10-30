public class Hra {
    private Lopticka lopticka;
    
    public Hra() {
        this.lopticka = new Lopticka();
    }
    
    public void tik() {
        this.lopticka.posun();
    }
}
