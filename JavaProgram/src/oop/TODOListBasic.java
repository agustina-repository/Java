package oop;

import java.util.ArrayList;
import java.util.Scanner;

public class TODOListBasic {

    public static void main(String[] args) {

        System.out.println(menu(0,""));

        Scanner scanner = new Scanner(System.in);

        String s = scanner.nextLine();
        if(s.equals("99")){
            add();
        }else if(s.equals("00")){
            hapus();
        }else {
            System.out.println(menu(0,""));
        }
    }

    static ArrayList<String> menu(int option, String addMenu){

        System.out.println("Berikut TODO LIST HARIAN ANDA");
        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("TodoList");
        arrayList.add(arrayList.size() + ".  Membaca Buku");
        arrayList.add(arrayList.size() + ".  Membuat Course");
        arrayList.add(arrayList.size() + ".  Makan Siang");
        arrayList.add(arrayList.size() + ".  Lain-Lain");
        arrayList.add("99. Tambah");
        arrayList.add("00. Hapus");

        if(option == 1){
            if(!addMenu.isBlank()){
                arrayList.add(addMenu);
            }
        }else if(option == 99) {
            arrayList.remove(Integer.parseInt(addMenu));
            System.out.println("Berhasil Menghapus dari List");
        }
        return arrayList;
    }

    static void add(){

        System.out.println("Tambah");
        System.out.println("Kembali");

        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        ArrayList<String> arrayList = new ArrayList<>();

        if(s.equals("0")){
//            ArrayList<String> value  = menu();
//            for (var iteration : value){
//                arrayList.add(iteration);
//            }
            menu(0, "");
        }else {
            String input = menu(0, "").size() - 2 +". " + scanner.nextLine();
//            ArrayList<String> value  = menu();
//            for (var iteration : value){
//                arrayList.add(iteration);
//            }
//        arrayList.add(input);
            System.out.println(menu(1, input));
        }
//        return arrayList;
    }

    static void hapus(){
        System.out.println("Pilih nomor yang ingin di hapus");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        System.out.println(menu(99, s));


    }
}
