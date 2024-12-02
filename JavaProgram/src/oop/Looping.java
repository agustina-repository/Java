package oop;

public class Looping {
    public static void main(String[] args) {

        //FOR LOOP
//        for(int counter = 0; counter <= 10; counter++){
//            System.out.println("Loop: " + counter);
//        }

        //WHILE LOOP
//        int counter = 1;
//        while (counter <= 10){
//            System.out.println("Loop: " + counter);
//            counter++;
//        }

        //Do While LOOP
//        int counter2 = 117;
//        do{
//            System.out.println("Do Loop: " + counter2);
//        }while (counter2 <= 10);

        //Continue ganjil/genap
        for (int i = 0; i <= 10; i++){

            if(i%2 == 1){ //kalo ganjil continue
                continue;
            }
            System.out.print(i + " ");
        }

        System.out.println();
        for (int i = 1; i <= 10; i +=2){

            System.out.print(i + " ");
        }
    }
}
