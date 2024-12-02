package oop;

public class Faktorial {
    public static void main(String[] args) {
        factorial(5);
        System.out.println(factorialRecrusive(5));
    }

    static void factorial(int value){
        int result = 1;
        for(int counter = 1; counter <= value; counter++){

            result *= counter;
        }
        System.out.println(result);
    }

    static int factorialRecrusive(int value){
        int result;
        if(value == 1){
            return 1;
        }else {
            return value * factorialRecrusive(value - 1);
        }
    }
}
