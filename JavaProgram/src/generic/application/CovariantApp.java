package generic.application;

import generic.genericclass.MyData;

public class CovariantApp {
    /*
    Sebuah generic methode adalah invariant(tidak bisa diakses
    dengan kelas parent atau kelas childnya).
    Convariant ini bisa digunakan untuk mengakses atau mengambil
    kelas parentnya.
    ingat hanya mengakses(get data) bukan meng set data.
     */
    public static void main(String[] args) {

        MyData<String> data = new MyData<>("Lanang Covariant");
        MyData<? extends Object> myDataObj = data;
        System.out.println(myDataObj.getData());

        process(data);

    }

    public static void process(MyData<? extends Object> myDataParam){
        System.out.println("Methode process " +myDataParam.getData());

//        myDataParam.setData("Jana"); //error tidak dapat diubah
    }
}
