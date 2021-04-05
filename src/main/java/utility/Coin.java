package utility;

public class Coin {
    double probabilityOfHead = 0.5;
    double probabilityOfTails = 0.5;
     public boolean toCheckHeadProbabilityIsEqualToTailProbability(){
         return probabilityOfHead==probabilityOfTails;
     }
}
