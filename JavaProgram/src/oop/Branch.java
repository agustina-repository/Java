package oop;

public class Branch {
    public static void main(String[] args) {

        //SWITCH STATEMENT
        char value = 'f';
        switch (value){
            case 'A' :
                System.out.println("Terbaik");
            break;
            case 'B' :
            case 'C' :
                System.out.println("Baik");
                break;
            case 'D' :
                System.out.println("Kurang");
                break;
            default:
                System.out.println("Tidak Terdaftar");
        }

        //SWITCH LAMBDA
        switch (value){
            case 'A' -> System.out.println("Terbaik");
            case 'B', 'C' -> System.out.println("Baik");
            case 'D' -> System.out.println("Kurang");
            default -> {
            System.out.println("Tidak Terdaftar");
            System.out.println("Lambda");
            }

        }

        //YILD for return value
        String ucapan = switch (value){
            case 'A' : yield "Terbaik";
            case 'B', 'C' : yield "Baik";
            case 'D' : yield "Kurang";
            default : yield "Tidak Terdaftar";
        };
        System.out.println("with yield: " + ucapan);

        //Ternary Operator
        int nilai = 76;
        System.out.println(nilai > 75 ? "Lulus" : "Tidak Lulus");

    }
}
