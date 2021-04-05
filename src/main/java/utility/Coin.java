package utility;

public class Coin {
    public double probabilityOfHead = 0.5;
    public double probabilityOfTails = 0.5;


     public boolean toCheckHeadProbabilityIsEqualToTailProbability(){
         return probabilityOfHead==probabilityOfTails;
     }

}
