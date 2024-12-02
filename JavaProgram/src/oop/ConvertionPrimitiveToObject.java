package oop;

public class ConvertionPrimitiveToObject {

    public static void main(String[] args) {

        int age = 30;
        Integer ageObject = age;

        System.out.println( age
                + " to " +
                ageObject);

        int agePrimitiv = ageObject;

        System.out.println( ageObject
                + " to " +
                agePrimitiv);

        short convToShort = ageObject.shortValue();

        System.out.println( ageObject
                + " to " +
                convToShort);

        short convToShrt = (short) age;

        System.out.println( ageObject
                + " to " +
                convToShort);
    }
}
