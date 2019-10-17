public class SSDDvojciferneCislo {
    private SSDCislica jednotky;
    private SSDCislica desiatky;
    
    public SSDDvojciferneCislo(int dlzkaSegmentu, int poziciaDisplejaX, int poziciaDisplejaY) {
        this.desiatky = new SSDCislica(dlzkaSegmentu, poziciaDisplejaX, poziciaDisplejaY);
        this.jednotky = new SSDCislica(dlzkaSegmentu, poziciaDisplejaX + 2 * dlzkaSegmentu, poziciaDisplejaY);
    }
    
    public void rozsviet(int cislo) {
        this.desiatky.rozsvietCislicu(cislo / 10);
        this.jednotky.rozsvietCislicu(cislo % 10);
    }
}
