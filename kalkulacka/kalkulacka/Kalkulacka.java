public class Kalkulacka {
    private double medzivysledok;
    private double pamat;
    private boolean mrcStlacene;
    private double operand;
    private char poslednyOperator;
    
    public Kalkulacka() {
        this.medzivysledok = 0;
        this.pamat = 0;
        this.mrcStlacene = false;
        this.operand = 0;
        this.poslednyOperator = '+';
    }
    
    public void setOperand(double operand) {
        this.operand = operand;
    }
    
    public void vypocitaj(char operator) {
        switch (this.poslednyOperator) {
            case '+':
                this.medzivysledok += this.operand;
                break;
            case '-':
                this.medzivysledok -= this.operand;
                break;
            case '*':
                this.medzivysledok *= this.operand;
                break;
            case '/':
                this.medzivysledok /= this.operand;
                break;
        }
        this.mrcStlacene = false;
        if (operator != '=') {
            this.poslednyOperator = operator;
        }
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
