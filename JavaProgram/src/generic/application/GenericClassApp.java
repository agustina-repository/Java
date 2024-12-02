package generic.application;

import generic.genericclass.MyData;

public class GenericClassApp {
    public static void main(String[] args) {

        MyData<String> stringMyData = new MyData<>("Lanang");
        MyData<Integer> integerMyData = new MyData<>(1000);
        MyData<Boolean> booleanMyData = new MyData<>(true);

        System.out.println(stringMyData.getData());
        System.out.println(integerMyData.getData());
        System.out.println(booleanMyData.getData());
    }
}
