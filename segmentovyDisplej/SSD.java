public class SSD {
    private Segment segmentA;
    private Segment segmentB;
    private Segment segmentC;
    private Segment segmentD;
    private Segment segmentE;
    private Segment segmentF;
    private Segment segmentG;
    
    public SSD(int dlzkaSegmentu, int hrubkaSegmentu, int poziciaDisplejaX, int poziciaDisplejaY) {
        this.segmentA = new Segment(dlzkaSegmentu, hrubkaSegmentu, poziciaDisplejaX + hrubkaSegmentu, poziciaDisplejaY);
        this.segmentG = new Segment(dlzkaSegmentu, hrubkaSegmentu, poziciaDisplejaX + hrubkaSegmentu, poziciaDisplejaY + dlzkaSegmentu + hrubkaSegmentu);
        this.segmentD = new Segment(dlzkaSegmentu, hrubkaSegmentu, poziciaDisplejaX + hrubkaSegmentu, poziciaDisplejaY + 2 * dlzkaSegmentu + 2 * hrubkaSegmentu);
        this.segmentF = new Segment(hrubkaSegmentu, dlzkaSegmentu, poziciaDisplejaX, poziciaDisplejaY + hrubkaSegmentu);
        this.segmentE = new Segment(hrubkaSegmentu, dlzkaSegmentu, poziciaDisplejaX, poziciaDisplejaY + 2 * hrubkaSegmentu + dlzkaSegmentu);
        this.segmentB = new Segment(hrubkaSegmentu, dlzkaSegmentu, poziciaDisplejaX + hrubkaSegmentu + dlzkaSegmentu, poziciaDisplejaY + hrubkaSegmentu);
        this.segmentC = new Segment(hrubkaSegmentu, dlzkaSegmentu, poziciaDisplejaX + hrubkaSegmentu + dlzkaSegmentu, poziciaDisplejaY + 2 * hrubkaSegmentu + dlzkaSegmentu);
    }
}
