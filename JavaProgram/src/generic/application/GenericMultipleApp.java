package generic.application;

import generic.genericclass.MultipleGeneric;

public class GenericMultipleApp {
    public static void main(String[] args) {

        MultipleGeneric<String, Integer> multipleGeneric = new MultipleGeneric<>("Lanang", 4);
        MultipleGeneric<String, Boolean> multipleGeneric2 = new MultipleGeneric<>("Lanang", true);

        System.out.println(multipleGeneric.getFirst() + "|"+multipleGeneric.getSecond());
        System.out.println(multipleGeneric2.getFirst()+ "|"+multipleGeneric2.getSecond());
    }
}
