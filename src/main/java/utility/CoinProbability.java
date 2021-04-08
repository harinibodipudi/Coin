package utility;

import java.util.Objects;

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
        System.out.println(Objects.hash(coinProbability.probabilityOfTails));
        System.out.println(Objects.hash(this.probabilityOfHead));

        return this==obj && Double.compare(this.probabilityOfHead, coinProbability.probabilityOfTails)==0;

    }
    public double probability_eventOccurring_Together(double firstEventProbability, double secondEventProbability){
        return firstEventProbability*secondEventProbability;
    }


}
