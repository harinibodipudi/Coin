package utility;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
public class TestCoinProbability {

    @Test
    public void testProbabilityOfHeadIsEqualToThatOfTailsWhenACoinIsFlipped(){
        double probability_Head = 0.5;
        double probability_Tail = 0.5;
        CoinProbability coinProbability = new CoinProbability(probability_Head,probability_Tail);

        Assertions.assertTrue(coinProbability.equals(coinProbability));
    }
    @Test
    public void testProbabilityForEventToOccurTogetherForHeadAndHeadProbability(){
         CoinProbability coin1 = new CoinProbability(0.5, 0.5);
         CoinProbability coin2 = new CoinProbability(0.5,0.5);

         double actualValue = coin1.probability_eventOccurring_Together(coin1.probabilityOfHead, coin2.probabilityOfHead);

         Assertions.assertEquals(0.25, actualValue);
    }
    @Test
    public void testProbabilityForEventToOccurTogetherForHeadAndTailProbability(){
        CoinProbability coin1 = new CoinProbability(0.5, 0.5);
        CoinProbability coin2 = new CoinProbability(0.5,0.5);

        double actualValue = coin1.probability_eventOccurring_Together(coin1.probabilityOfHead, coin2.probabilityOfTails);

        Assertions.assertEquals(0.25, actualValue);
    }
    @Test
    public void testProbabilityForEventToOccurTogetherForTailAndHeadProbability(){
        CoinProbability coin1 = new CoinProbability(0.5, 0.5);
        CoinProbability coin2 = new CoinProbability(0.5,0.5);

        double actualValue = coin1.probability_eventOccurring_Together(coin1.probabilityOfTails, coin2.probabilityOfHead);

        Assertions.assertEquals(0.25, actualValue);
    }
    @Test
    public void testProbabilityForEventToOccurTogetherForTailAndTailProbability(){
        CoinProbability coin1 = new CoinProbability(0.5, 0.5);
        CoinProbability coin2 = new CoinProbability(0.5,0.5);

        double actualValue = coin1.probability_eventOccurring_Together(coin1.probabilityOfTails, coin2.probabilityOfTails);

        Assertions.assertEquals(0.25, actualValue);
    }
}
