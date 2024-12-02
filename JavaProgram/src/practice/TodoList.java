package practice;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;
import java.util.StringJoiner;

public class TodoList {

    public static String[] data = new String[10];

    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        viewTodoList();
    }

    /**
     * Menampilkan todo list
     */
    public static void showTodoList(){
        System.out.println("TODOLIST");
        String[] data2 = Arrays.stream(data).filter(Objects::nonNull).toArray(String[]::new);

        for(int i = 0; i<data2.length; i++){
            var todoData = data2[i];
            int number = i + 1;

               System.out.println(number + ". " + todoData);
        }
    }

    /**
     * Test Menampilkan todo list
     */
    public static void testShowTodoList(){
        data[0] = "Belajar";
        data[1] = "Belajar 2";
        data[2] = "Belajar 3";

        showTodoList();
    }

    /**
     * Menambah todo ke list
     */
    public static void addTodoList(String todo){
        boolean isFull = true;

        for(int i = 0; i < data.length; i++){
            if(data[i] == null){
                isFull = false;
                break;
            }
        }

        if(isFull){
            var dataTemp = data;
            data = new String[data.length * 2];

            for(int i = 0; i < dataTemp.length; i++){
                data[i] = dataTemp[i];
            }
        }

        // tambahkan ke posisi yang data array nya NULL
        for(int i = 0; i < data.length; i++){
            if(data[i] == null){
                data[i] = todo;
                break;
            }
        }
    }

    /**
     * Test Menambah todo ke list
     */
    public static void testAddTodoList(){
        for(int i = 0; i < 15; i++){
            addTodoList("Contoh Todo Ke." + i);
        }
        showTodoList();
    }

    /**
     * Mehapus todo dari list
     */

    public static boolean removeTodoList(Integer number){
        if(number - 1 > data.length){ //cek req number
            return false;
        }else if(data[number -1] == null){ //cek value
            return false;
        }else {
            data[number -1] = null;
               return true;
        }
    }

    /**
     * Test Mehapus todo dari list
     */
    public static void testRemoveTodoList(){
        addTodoList("1");
        addTodoList("2");
        addTodoList("3");
        addTodoList("4");
        addTodoList("5");
        System.out.println("BEFORE");
        showTodoList();

        var result = removeTodoList(2);
        System.out.println(result);


        result = removeTodoList(7);
        System.out.println(result);

        result = removeTodoList(2);
        System.out.println(result);

        showTodoList();
    }

    public static String input(String info){
        System.out.print(info + " : ");
        var dataInput = scanner.nextLine();
        return dataInput;
    }

    public static void testInput() {
        var name = input("Nama");
        System.out.println("Hi " + name);

        var channel = input("Channel");
        System.out.println(channel);
    }

    /**
     * Menampilkan view todo list
     */
    public static void viewTodoList(){
        while (true){
            showTodoList();

            System.out.println("MENU : ");
            System.out.println("1. Tambah");
            System.out.println("2. Hapus");
            System.out.println("x. Keluar");

            var input = input("Pilih");

            if(input.equals("1")){
                viewAddTodoList();
            }else if (input.equals("2")){
                viewRemoveTodoList();
            } else if (input.equals("x")) {
                break;
            }else {
                System.out.println("Input salah");
            }
        }
    }

    /**
     * Test Menampilkan view todo list
     */
    public static void testViewTodoList(){
        addTodoList("Satu");
        addTodoList("Dua");
        addTodoList("Tiga");
        addTodoList("Empat");
        addTodoList("Lima");

        viewTodoList();
    }

    /**
     * Menampilkan view add todo list
     */
    public static void viewAddTodoList(){
        System.out.println("MENAMBAHKAN TODOLIST");

        var todo = input("Todo (tekan x untuk membatalkan)");
        if(todo.equals("x")){
            viewTodoList();
        }else {
            addTodoList(todo);
        }
    }

    /**
     * Test Menampilkan view add todo list
     */
    public static void testViewAddTodoList(){
        addTodoList("Satu");
        addTodoList("Dua");

        showTodoList();
        viewAddTodoList();

        showTodoList();
    }

    /**
     * Menampilkan view remove todo list
     */

    public static void viewRemoveTodoList(){
        System.out.println("REMOVE TODOLIST");

        var inputSc = input("Masukkan nomor yang ingin di hapus (tekan x untuk membatalkan)");
        if(inputSc.equals("x")){
            viewTodoList();
        }else {
           var success = removeTodoList(Integer.valueOf(inputSc));
           if(!success){
               System.out.println("Gagal Menghapus");
           }else {
               System.out.println("Berhasil Menghapus");
               viewTodoList();
           }
        }
    }

    /**
     * Test Menampilkan view remove todo list
     */
    public static void testViewRemoveTodoList(){
        System.out.println("MENGHAPUS TODOLIST");

        addTodoList("Satu");
        addTodoList("Dua");
        addTodoList("Tiga");

        showTodoList();

        viewRemoveTodoList();

        showTodoList();
    }
}
