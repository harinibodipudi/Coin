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
}
