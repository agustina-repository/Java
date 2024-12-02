package oop;

public class Array {
    public static void main(String[] args) {

        String[] arrayString = new String[3];
        arrayString[0] = "Lanang";
        arrayString[1] = "Nandur";
        arrayString[2] = "Islam";

        System.out.println("Call with index: " );
        System.out.println(arrayString[0]);
        System.out.println(arrayString[1]);
        System.out.println(arrayString[2]);

        System.out.println("Call with for each");
        for(String arrayCall : arrayString){
            System.out.println(arrayCall);
        }

        System.out.println("Call with for loop");
        for(int i = 0; i < arrayString.length; i++){
            System.out.println(arrayString[i]);
        }

        //OOP.Array in array
        String[][] members = {
                {"Lanang ", "nandur "},
                {"Nandur ", "Islam "}
        };

        //Call value array in array
        System.out.println(members[0][0] + members[0][1] + members[1][1]);
    }

}
