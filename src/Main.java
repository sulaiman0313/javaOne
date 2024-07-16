public class Main {

    static void evenOdd(int number){
        if (number%2==0){
            System.out.println("even");
        }
        else{
            System.out.println("odd");
        }

    }

    static void numbersum(int num){
        int sum=0;

        while (num !=0 ){

            sum = sum + num % 10;

            num = num /10;
        }
        System.out.println(sum);
    }

    static void areaOfRectrangle(int length, int width){
        System.out.println("Area of rectrangle = " + length * width);
    }

    static void largest(int num1, int num2){
        if (num1 > num2){
            System.out.println( num1 + " is largest");
        }
        else if(num1==num2){
            System.out.println( "both are equal");
        }
        else {
            System.out.println(num2 + " is largest");
        }
    }
    public static void main(String[] args) {

        evenOdd(2);

        numbersum(123);

        areaOfRectrangle(18 ,20);

        largest(2,12);
    }
}