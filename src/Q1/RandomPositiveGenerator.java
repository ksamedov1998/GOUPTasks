package Q1;

import java.util.Random;

public class RandomPositiveGenerator {
    public static int createNumber(){
        return new Random().nextInt(Integer.MAX_VALUE);
    }
}
