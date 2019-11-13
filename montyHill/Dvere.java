public class Dvere {
    private boolean jeAuto;
    private boolean suOtvorene;
    private boolean suVybrate;
    
    public Dvere(boolean jeAuto) {
        this.jeAuto = jeAuto;
        this.suOtvorene = false;
        this.suVybrate = false;
    }
    
    public void otvor() {
        if (this.suVybrate) {
            System.out.println("Nemozes otvorit vybrate dvere");
            return;
        }
        if (this.suOtvorene) {
            System.out.println("Tieto dvere su uz otvorene");
            return;
        }
        if (this.jeAuto) {
            System.out.println("A prezradil si hracovi, kde je auto");
            return;
        }
        this.suOtvorene = true;
    }
    
    public void vyber() {
        if (this.suVybrate) {
            System.out.println("Tieto dvere su uz vybrate");
            return;
        }
        if (this.suOtvorene) {
            System.out.println("Nemozes vybrat otvorene dvere");
            return;
        }
        this.suVybrate = true;
    }
    
    public void zrusVyberAkTreba() {
        this.suVybrate = false;
    }
    
    public boolean suVyherne() {
        return this.suVybrate && this.jeAuto;
    }
}
