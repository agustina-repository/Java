package generic.introduce;

public class GenericIntroduce {
    public static void main(String[] args) {
        /* bila ingin mengini siasi suatu program yang dapat menerima semua
        jenis tipe data biasanya kita menggunakan Object,
        yang menjadi concern adalah ketika kita memanggil sebuah data pada
        tipe data object. kita harus mengconversi atau cast data tersebut untuk mengubah
        dari tipe data object menjadi tipe data yang ingin kita gunakan. yang mana jika
        ada kesalahan code, kita baru tau ketika aplikasi sedang di jalankan
        * */
        Data data = new Data();
        data.setData("Lanang");
        String dataString = (String) data.getData(); //membutuhkan (String)
        System.out.println("Data String: " + dataString);
        data.setData(1000);
        Integer dataInteger = (Integer) data.getData();
        System.out.println("Data Integer: " + dataInteger);

//        Generic adalah solusinya
        DataGeneric<String> dataGeneric = new DataGeneric<>();
        dataGeneric.setData("Generic");
        System.out.println(dataGeneric.getData());
    }

    public static class Data{ //basic
        private Object data;

        public Object getData() {
            return data;
        }

        public void setData(Object data) {
            this.data = data;
        }
    }

    public static class DataGeneric<T>{

        private T data;

        public T getData() {
            return data;
        }

        public void setData(T data) {
            this.data = data;
        }
    }
}
