package generic.application;

import generic.genericclass.MyData;

public class Contravariant {

    /*
    Kebalikan dengan covariant, pada bagian ini, kita dapat
    meng set data namun sangat riskan jika kita melakukan getdata.
    contravariant adlah methode untuk mengambil data dari kelas turunannya
     */
    public static void main(String[] args) {

        MyData<Object> objectMyData = new MyData<>("Lanang");
        MyData<? super String> dataString = objectMyData;
        System.out.println(dataString.getData());
        process(objectMyData);

    }

    public static void process(MyData<? super String> myData){
        System.out.println("Methode process " + myData.getData());// tidak disarankan
    }
}
