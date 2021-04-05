package utility;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
public class TestCoin {
    Coin coin = new Coin();
    @Test
    public void testProbabilityOfHeadIsEqualToThatOfTailsWhenACoinIsFlipped(){
        boolean actualValue=coin.toCheckHeadProbabilityIsEqualToTailProbability();
        boolean expectedValue = true;


    }
}
