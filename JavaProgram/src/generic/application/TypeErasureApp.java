package generic.application;

import generic.genericclass.MyData;

/*
Proses menghilangkan informasi type generic. Hal ini sangat berbahaya
karena dapat menjadi ambigu. error baru aan terlihat pada saat runtime
 */
public class TypeErasureApp {

    public static void main(String[] args) {

        MyData myData = new MyData("Lanang");

        MyData<Integer> integerMyData = myData;
        Integer integer = integerMyData.getData();
        System.out.println(integer);
    }
}
