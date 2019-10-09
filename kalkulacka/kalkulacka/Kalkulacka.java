public class Kalkulacka {
    private double medzivysledok;
    private double pamat;
    private boolean mrcStlacene;
    
    public Kalkulacka(double prveCislo) {
        this.medzivysledok = prveCislo;
        this.pamat = 0;
        this.mrcStlacene = false;
    }
    
    public void scitaj(double operand) {
        this.medzivysledok += operand;
        this.mrcStlacene = false;
    }
    
    public void odpocitaj(double operand) {
        this.medzivysledok -= operand;
        this.mrcStlacene = false;
    }
    
    public void vynasob(double operand) {
        this.medzivysledok *= operand;
        this.mrcStlacene = false;
    }
    
    public void vydel(double operand) {
        this.medzivysledok /= operand;
        this.mrcStlacene = false;
    }
    
    public double getVysledok() {
        return this.medzivysledok;
    }
    
    public void mRC() {
        if (this.mrcStlacene) {
            this.pamat = 0;
            this.mrcStlacene = false;
        } else {
            this.medzivysledok = this.pamat;
            this.mrcStlacene = true;
        }
    }
    
    public void mC() {
        this.pamat = 0;
        this.mrcStlacene = false;
    }
    
    public void mR() {
        this.medzivysledok = this.pamat;
        this.mrcStlacene = false;
    }
    
    public void mPlus() {
        this.pamat += this.medzivysledok;
        this.mrcStlacene = false;
    }
    
    public void mS() {
        this.pamat = this.medzivysledok;
        this.mrcStlacene = false;
    }
}
