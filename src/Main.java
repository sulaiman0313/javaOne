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


        int arr[]={1,33,33,44,99};
        int array= arr[0];

        for (int i=0;i<arr.length;i++){

            if (array < arr[i]){
                array = arr[i];
            }
        }
        System.out.println(array);



        int array1[]={1,2,3,4};

        for (int i=array1.length-1;i>=0;i--){
            System.out.print(array1[i] + " ");
        }


    }
}