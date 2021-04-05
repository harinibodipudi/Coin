package utility;

public class Coin implements coininterface {
    public double probabilityOfHead = 0.5;
    public double probabilityOfTails = 0.5;


     public boolean toCheckHeadProbabilityIsEqualToTailProbability(){
         return probabilityOfHead==probabilityOfTails;
     }

}
