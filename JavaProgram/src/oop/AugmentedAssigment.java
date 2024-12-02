package oop;

public class AugmentedAssigment {
    public static void main(String[] args){

        int a = 10;

        for(int i = 0; i < 5; i++){
            System.out.println("before augmented, loop: " + i + " is " + a );
            a += 10;
            System.out.println("add " + a);
            a -= 5;
            System.out.println("minus " + a);
            a *= 100;
            System.out.println("multiple " + a);
            a /= 10;
            System.out.println("division " + a);
            a %= 5;
            System.out.println("modulus  " + a);
        }
    }
}
