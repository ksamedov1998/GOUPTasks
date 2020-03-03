package Q2;

import java.util.Random;

public class RandomArrayGenerator {
    public static int[] createArray(int size){
        int[] generatedArray= new int[size];
        for(int i=0;i<size;i++){
            generatedArray[i]= ( new Random().nextInt(100000));
        }
        return generatedArray;
    }
}
