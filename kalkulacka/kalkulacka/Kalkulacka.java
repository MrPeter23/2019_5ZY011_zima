public class Kalkulacka {
    private double medzivysledok;
    private double pamat;
    
    public Kalkulacka(double prveCislo) {
        this.medzivysledok = prveCislo;
        this.pamat = 0;
    }
    
    public void scitaj(double operand) {
        this.medzivysledok += operand;
    }
    
    public void odpocitaj(double operand) {
        this.medzivysledok -= operand;
    }
    
    public void vynasob(double operand) {
        this.medzivysledok *= operand;
    }
    
    public void vydel(double operand) {
        this.medzivysledok /= operand;
    }
    
    public double getVysledok() {
        return this.medzivysledok;
    }
    
    public void mRC() {
        if (this.medzivysledok != this.pamat) {
            this.medzivysledok = this.pamat;
        } else {
            this.pamat = 0;
        }
    }
    
    public void mC() {
        this.pamat = 0;
    }
    
    public void mR() {
        this.medzivysledok = this.pamat;
    }
    
    public void mPlus() {
        this.pamat += this.medzivysledok;
    }
    
    public void mS() {
        this.pamat = this.medzivysledok;
    }
}
