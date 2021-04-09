package utility;

import java.util.Objects;

public class Probability {
    public double probabilityOfHead;
    public double probabilityOfTails;



    public Probability(double probabilityOfHead, double probabilityOfTails) {
        this.probabilityOfHead = probabilityOfHead;
        this.probabilityOfTails = probabilityOfTails;
    }

    @Override
    public boolean equals(Object obj) {
        Probability probability =(Probability)obj;
        System.out.println(Objects.hash(probability.probabilityOfTails));
        System.out.println(Objects.hash(this.probabilityOfHead));

        return this==obj && Double.compare(this.probabilityOfHead, probability.probabilityOfTails)==0;

    }
    public static double add(double firstEvent, double secondEvent){

        return firstEvent*secondEvent;
    }


}
