public class SSDCislica {
    private SSD displej;
    
    public SSDCislica(int dlzkaSegmentu, int hrubkaSegmentu, int poziciaDisplejaX, int poziciaDisplejaY) {
        this.displej = new SSD(dlzkaSegmentu, hrubkaSegmentu, poziciaDisplejaX, poziciaDisplejaY);
    }
    
    public void rozsvietCislicu(int cislica) {
        switch (cislica) {
            case 0:
                this.displej.rozsvietSegmenty(true, true, true, true, true, true, false);
                break;
            case 1:
                this.displej.rozsvietSegmenty(false, true, true, false, false, false, false);
                break;
            case 2:
                this.displej.rozsvietSegmenty(true, true, false, true, true, false, true);
                break;
            case 3:
                this.displej.rozsvietSegmenty(true, true, true, true, false, false, true);
                break;
            case 4:
                this.displej.rozsvietSegmenty(false, true, true, false, false, true, true);
                break;
            case 5:
                this.displej.rozsvietSegmenty(true, false, true, true, false, true, true);
                break;
            case 6:
                this.displej.rozsvietSegmenty(true, false, true, true, true, true, true);
                break;
            case 7:
                this.displej.rozsvietSegmenty(true, true, true, false, false, false, false);
                break;
            case 8:
                this.displej.rozsvietSegmenty(true, true, true, true, true, true, true);
                break;
            case 9:
                this.displej.rozsvietSegmenty(true, true, true, true, false, true, true);
                break;
        }
    }
}
