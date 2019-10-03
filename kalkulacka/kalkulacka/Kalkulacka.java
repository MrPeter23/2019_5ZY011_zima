public class Kalkulacka {
    private double medzivysledok;
    
    public Kalkulacka(double prveCislo) {
        this.medzivysledok = prveCislo;
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
}
