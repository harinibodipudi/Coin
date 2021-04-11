package utility;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import static utility.Probability.and;
import static utility.Probability.or;

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

         double actualValue = and(HeadsForFirstCoinToss.probabilityOfHead, HeadsForSecondCoinToss.probabilityOfHead);

         Assertions.assertEquals(0.25, actualValue);
    }
    @Test
    public void testProbabilityForEventToOccurTogetherForHeadAndTailProbability(){
        Probability HeadForFirstCoinToss = new Probability(0.5, 0.5);
        Probability TailsForSecondCoinToss = new Probability(0.5,0.5);

        double actualValue = and(HeadForFirstCoinToss.probabilityOfHead, TailsForSecondCoinToss.probabilityOfTails);

        Assertions.assertEquals(0.25, actualValue);
    }
    @Test
    public void testProbabilityForEventToOccurTogetherForTailAndHeadProbability(){
        Probability TailsForFirstCoinToss = new Probability(0.5, 0.5);
        Probability HeadsForFirstCoinToss = new Probability(0.5,0.5);

        double actualValue = and(TailsForFirstCoinToss.probabilityOfTails, HeadsForFirstCoinToss.probabilityOfHead);

        Assertions.assertEquals(0.25, actualValue);
    }
    @Test
    public void testProbabilityForEventToOccurTogetherForTailAndTailProbability(){
        Probability TailsForFirstCoinToss = new Probability(0.5, 0.5);
        Probability TailsForSecondCoinToss = new Probability(0.5,0.5);

        double actualValue = and(TailsForFirstCoinToss.probabilityOfTails, TailsForSecondCoinToss.probabilityOfTails);

        Assertions.assertEquals(0.25, actualValue);
    }
    @Test
    public void testProbabilityOfEventNotOccurring(){
        double actualValue = Probability.not(0.7);

        Assertions.assertEquals(0.3, actualValue);
    }

    @Test
    public void testProbabilityForEitherHeadsToOccur(){
        Probability headsOnFirstCoinToss = new Probability(0.5,0.5);
        Probability headsOnSecondCoinToss = new Probability(0.5,0.5);

        double actualValue = or(headsOnFirstCoinToss.probabilityOfHead,headsOnSecondCoinToss.probabilityOfHead);

        Assertions.assertEquals(0.75,actualValue);
    }

    @Test
    public void testProbabilityForEitherHeadsOrTailsToOccur(){
        Probability headsOnFirstCoinToss = new Probability(0.5,0.5);
        Probability tailsOnSecondCoinToss = new Probability(0.5,0.5);

        double actualValue = or(headsOnFirstCoinToss.probabilityOfHead,tailsOnSecondCoinToss.probabilityOfTails);

        Assertions.assertEquals(0.75,actualValue);
    }
    @Test
    public void testProbabilityForEitherTailsToOccur(){
        Probability tailsOnFirstCoinToss = new Probability(0.5,0.5);
        Probability tailsOnSecondCoinToss = new Probability(0.5,0.5);

        double actualValue = or(tailsOnFirstCoinToss.probabilityOfTails,tailsOnSecondCoinToss.probabilityOfTails);

        Assertions.assertEquals(0.75,actualValue);
    }

}
