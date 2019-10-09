public class Kalkulacka {
    private double medzivysledok;
    private double pamat;
    private boolean mrcStlacene;
    private double operand;
    
    public Kalkulacka(double prveCislo) {
        this.medzivysledok = prveCislo;
        this.pamat = 0;
        this.mrcStlacene = false;
        this.operand = 0;
    }
    
    public void setOperand(double operand) {
        this.operand = operand;
    }
    
    public void scitaj() {
        this.medzivysledok += this.operand;
        this.mrcStlacene = false;
    }
    
    public void odpocitaj() {
        this.medzivysledok -= this.operand;
        this.mrcStlacene = false;
    }
    
    public void vynasob() {
        this.medzivysledok *= this.operand;
        this.mrcStlacene = false;
    }
    
    public void vydel() {
        this.medzivysledok /= this.operand;
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
            this.operand = this.pamat;
            this.mrcStlacene = true;
        }
    }
    
    public void mC() {
        this.pamat = 0;
        this.mrcStlacene = false;
    }
    
    public void mR() {
        this.operand = this.pamat;
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
