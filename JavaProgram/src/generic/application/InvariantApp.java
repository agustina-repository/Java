package generic.application;

import generic.genericclass.MyData;

public class InvariantApp {
    /*
    Secara default generic merupakan invarian, yang artinya
    sebuah generic methode atau class tidak bisa di subsitut
    dengan kelas turunannya.
     */
    public static void main(String[] args) {
        MyData<Object> object = new MyData<>(1000);
//        doItInteger(object); //error
//        MyData<Integer> intgrData = object; //error

        MyData<String> valueString = new MyData<>("Lanang");
//        doIt(valueString);  //error
//        MyData<Object> objectMyData = valueString; //error
    }

    public static void doIt(MyData<Object> objectMyData){
        System.out.println("object my data");
    }

    public static void doItInteger(MyData<Integer> integerMyData){
        System.out.println("object integer");
    }
}
