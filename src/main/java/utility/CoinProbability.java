package utility;

public class CoinProbability {
    public double probabilityOfHead;
    public double probabilityOfTails;

    public CoinProbability(double probabilityOfHead, double probabilityOfTails) {
        this.probabilityOfHead = probabilityOfHead;
        this.probabilityOfTails = probabilityOfTails;
    }

    @Override
    public boolean equals(Object obj) {
        CoinProbability coinProbability =(CoinProbability)obj;
        return this==obj && Double.compare(this.probabilityOfHead, coinProbability.probabilityOfTails)==0;
    }
}
