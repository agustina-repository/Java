package generic.application;

import generic.bound.NumberData;

public class ConstraintApp {

    /*
    Ini merupakan sebuah methode untuk membatasi tipe data generic
     */
    public static void main(String[] args) {

        NumberData<Integer> integerNumberData = new NumberData<>(1000);
        NumberData<Long> longNumberData = new NumberData<>(1000L);

        System.out.println(integerNumberData.getData());
        System.out.println(longNumberData.getData());
    }
}
