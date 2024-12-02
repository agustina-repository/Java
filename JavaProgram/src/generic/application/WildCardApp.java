package generic.application;

/*
    Jika ngin mengambil data pada generic class tanpa memperhatikan
    tipe data masa dapat menggunakan wildcard. methode ini tidak
    disarankan untuk di konversi
 */

import generic.bound.multiple.VicePresident;
import generic.genericclass.MyData;

public class WildCardApp {

    public static void main(String[] args) {
        printGreeting(new MyData<>("Lanang"));
        printGreeting(new MyData<>(1000));
        printGreeting(new MyData<>(true));
        printGreeting(new MyData<>(new VicePresident()));
    }

    public static void printGreeting(MyData<?> myData){
        System.out.println(myData.getData());
    }

}
