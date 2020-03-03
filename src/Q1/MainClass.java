package Q1;

public class MainClass {
    public static void main(String[] args) {
        reducerNumber(RandomPositiveGenerator.createNumber());
    }

    public static void reducerNumber(int number){
            while(number!=0){
                if(number%2==0){
                    System.out.print(number + " is even ; divide by 2 and obtain ");
                    number/=2;
                    System.out.println(number);
                }else if(number%2==1){
                    System.out.print(number + " is odd ; subtract 1 and obtain ");
                    number=number-1;
                    System.out.println(number);
                }else{
                    System.out.println("Number is zero");
                }
            }
    }
}


