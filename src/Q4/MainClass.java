package Q4;

import Q1.RandomPositiveGenerator;

public class MainClass {

    public static void main(String[] args) {
        int number=15962;
        System.out.println("Result = " + subtract(productDigits(number,1),sumDigits(number,0)));
    }

    private static int sumDigits(int number,int result) {
        int remainder;
        while(number!=0){
            remainder=number%10;
            result+=remainder;
            number/=10;
        }
        System.out.println("Sum is "+ result);
        return result;
    }

    private static int productDigits(int number,int result) {
        System.out.println("Number = " + number);
        int remainder;
        while(number!=0){
            remainder=number%10;
            if(remainder==0){
                result=0;
                break;
            }
            result*=remainder;
            number/=10;
        }
        System.out.println("Product is "+ result);
        return result;
    }

    public static int subtract(int product,int subtract){
        return product-subtract;
    }
}
