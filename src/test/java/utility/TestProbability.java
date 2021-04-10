package utility;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import static utility.Probability.add;

public class TestProbability {

    @Test
    public void testProbabilityOfHeadIsEqualToThatOfTailsWhenACoinIsFlipped(){
        double probability_Head = 0.5;
        double probability_Tail = 0.5;
        Probability probability = new Probability(probability_Head,probability_Tail);

        Assertions.assertTrue(probability.equals(probability));
    }
    @Test
    public void testProbabilityForEventToOccurTogetherForHeadAndHeadProbability(){
         Probability HeadsForFirstCoinToss = new Probability(0.5, 0.5);
         Probability HeadsForSecondCoinToss = new Probability(0.5,0.5);

         double actualValue = add(HeadsForFirstCoinToss.probabilityOfHead, HeadsForSecondCoinToss.probabilityOfHead);

         Assertions.assertEquals(0.25, actualValue);
    }
    @Test
    public void testProbabilityForEventToOccurTogetherForHeadAndTailProbability(){
        Probability HeadForFirstCoinToss = new Probability(0.5, 0.5);
        Probability TailsForSecondCoinToss = new Probability(0.5,0.5);

        double actualValue = add(HeadForFirstCoinToss.probabilityOfHead, TailsForSecondCoinToss.probabilityOfTails);

        Assertions.assertEquals(0.25, actualValue);
    }
    @Test
    public void testProbabilityForEventToOccurTogetherForTailAndHeadProbability(){
        Probability TailsForFirstCoinToss = new Probability(0.5, 0.5);
        Probability HeadsForFirstCoinToss = new Probability(0.5,0.5);

        double actualValue = add(TailsForFirstCoinToss.probabilityOfTails, HeadsForFirstCoinToss.probabilityOfHead);

        Assertions.assertEquals(0.25, actualValue);
    }
    @Test
    public void testProbabilityForEventToOccurTogetherForTailAndTailProbability(){
        Probability TailsForFirstCoinToss = new Probability(0.5, 0.5);
        Probability TailsForSecondCoinToss = new Probability(0.5,0.5);

        double actualValue = add(TailsForFirstCoinToss.probabilityOfTails, TailsForSecondCoinToss.probabilityOfTails);

        Assertions.assertEquals(0.25, actualValue);
    }
    @Test
    public void testProbabilityOfEventNotOccurring(){
        Probability probability = new Probability(0.5,0.5);
        double actualValue = probability.not(0.7);

        Assertions.assertEquals(0.3, actualValue);
    }

    @Test
    public void testProbabilityOfHeadsNotOccurring(){
        Probability probability = new Probability(0.5,0.5);
        double actualValue = probability.not(probability.probabilityOfHead);

        Assertions.assertEquals(probability.probabilityOfTails, actualValue);
    }
    @Test
    public void testProbabilityOfTailsNotOccurring(){
        Probability probability = new Probability(0.5,0.5);
        double actualValue = probability.not(probability.probabilityOfTails);

        Assertions.assertEquals(probability.probabilityOfHead, actualValue);
    }
}
