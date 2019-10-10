public class Kalkulacka {
    private double medzivysledok;
    private double pamat;
    private boolean mrcStlacene;
    private double operand;
    private char poslednyOperator;
    
    public Kalkulacka(double prveCislo) {
        this.medzivysledok = prveCislo;
        this.pamat = 0;
        this.mrcStlacene = false;
        this.operand = 0;
        this.poslednyOperator = '=';
    }
    
    public void setOperand(double operand) {
        this.operand = operand;
    }
    
    public void scitaj() {
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
        this.poslednyOperator = '+';
    }
    
    public void odpocitaj() {
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
        this.poslednyOperator = '-';
    }
    
    public void vynasob() {
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
        this.poslednyOperator = '*';
    }
    
    public void vydel() {
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
        this.poslednyOperator = '/';
    }

    public void vypocitaj() {
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
        this.poslednyOperator = '=';
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
