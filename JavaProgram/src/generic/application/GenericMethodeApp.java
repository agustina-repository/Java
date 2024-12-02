package generic.application;

import generic.genericmethode.Additional;
import generic.genericmethode.ArrayHelper;

public class GenericMethodeApp {
    public static void main(String[] args) {

        String[] stringArray = {"Lanang", "Nandur", "Islam"};
        Integer[] integerArray = {1, 2, 3, 4, 5};

        System.out.println(ArrayHelper.count(stringArray));
        System.out.println(ArrayHelper.count(integerArray));

//        Exmpl 2
        Additional add = new Additional("agus", "101");
        System.out.println(ArrayHelper.value(add));
    }
}
