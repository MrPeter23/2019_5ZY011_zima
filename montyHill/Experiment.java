public class Experiment {
    private int pocet;
    private int pocetVyhier;
    private boolean maHracMenit;
    
    public Experiment(int pocet, boolean maHracMenit) {
        this.pocet = pocet;
        this.maHracMenit = maHracMenit;
        this.pocetVyhier = 0;
    }
    
    public void vykonaj() {
        for (int i = 0; i < this.pocet; i++) {
            NahodnyPokus pokus = new NahodnyPokus(this.maHracMenit);
            pokus.vykonaj();
            if (pokus.jeVyhra()) {
                this.pocetVyhier++;
            }
        }
    }
    
    public double getPercentoVyhier() {
        return this.pocetVyhier * 100.0 / this.pocet;
    }
}
