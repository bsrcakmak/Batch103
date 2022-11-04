package day25exception;

public class E02 {

    public static void main(String[] args) {

        String arr[] = {"Ali", "Can", "Veli", "Han"};

        getElemanFromArray(arr,2);
        getElemanFromArray(arr,0);
        getElemanFromArray(arr,4); // ArrayIndexOutOfBoundsException


    }

    // Bir String Array'den index girerek eleman elde etmek icin method olusturun.
    public static void getElemanFromArray(String arr[], int idx){

       try {
           System.out.println(arr[idx]);
       }catch (ArrayIndexOutOfBoundsException e){
           // Bu benim teknik olmayan aciklamam.
           System.out.println("Array index'te bir problem meydana geldi==> " + e.getMessage());

           // Exception ile ilgili detayli teknik mesaj verir.
           e.printStackTrace();

           // Hata mesajini diger mesajlardan ayirmak icin kullaniriz.
           System.err.println("Array index te bir problem yasandi.");
       }


    }

}
