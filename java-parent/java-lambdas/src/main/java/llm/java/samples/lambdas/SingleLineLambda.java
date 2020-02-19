package llm.java.samples.lambdas;

import static java.lang.Math.random;
import static java.lang.System.out;
import static java.util.stream.IntStream.range;

public class SingleLineLambda {

    // Determining the return type of a method is easy.
    // But how would you determine the type of an expression?
    // Use commande : SHIT + Ctrl + P

    public static void main(String[] args){
        //1. Find type of random()            >> Select "random()"                  => double
        //2. Find type of random() < 0.2      >> Select "random() < 0.2"            => boolean
        //3. Find type of i -> random() < 0.2 >> Select "i -> random() < 0.2"       => IntPredicate
        //4. Find type of range(-128, 127)    >> Select "range(-128, 127)           => IntStream
        //5. Find type of methode             >> Select "range(-128, ... average()" => OptionalDouble
        out.println( range(-128, 127)
                    .filter(i -> random()< 0.2)
                    .average());
    }
}
