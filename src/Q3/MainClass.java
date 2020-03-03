package Q3;
import Q1.RandomPositiveGenerator;
import Q2.RandomArrayGenerator;

import java.util.Arrays;

public class MainClass {
    public static void main(String[] args) {
        printNumbersWithOddNum(RandomArrayGenerator.createArray(100));

    }
    public static void printNumbersWithOddNum(int[] array){
        Arrays.stream(array).forEach(a-> System.out.print(" "+a+""));
        System.out.println();

        for(int i=0;i<array.length;i++){
            if(isOdd(array[i])){
                System.out.println(array[i]+" is Odd");
            }
        }
    }
    public static boolean isOdd(int number){
        boolean isOdd;
        int count=0;
        while (number!=0){
            number-=(number%10);
            number/=10;
            count++;
        }

        if(count%2==0){
            isOdd=true;
        }else{
            isOdd=false;
        }
        return isOdd;
    }
}
