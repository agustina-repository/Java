import java.util.Scanner;

public class StaticInitializer {

    static int a;
    static int b;
    static boolean isValue = true;
    static {
            Scanner scanner = new Scanner(System.in);
             a = scanner.nextInt();
             b = scanner.nextInt();
        try{
            if(a < 0 || b < 0 ){
                isValue = false;
                throw new Exception("Breadth and height must be positive");
            }
        }catch (Exception e){
            System.out.println(e);
        }
    }
    public static void main(String[] args) {
        if(isValue) System.out.println(a*b);
    }
}
