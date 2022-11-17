package day25exception;

    // ==> 1. Exception= ArithmeticException

public class E01 {

    /*
       1) "Exception" (istisnai hata) Java'da kodlarimizi yazarken ve calistirirken
           meydana gelen beklenmedik durumlardir.
       2) Exception'lar ile calismanin iki yolu vardir;
           i) "try-catch" block kullanma ve exception olussa bile calismayi devam ettirme
          ii) "throw exception" kullanarak calismayi durdurma;
             (mesela yazdığımız kod gereği bir dosya üzerinden okuma yapmamız gerekiyor ise
             bu dosyamız eğer silinmiş ise java dosyayı bulamaz ve uygulamanın devam etmesi gerekmez)
       3) Eğer exception'ı handle etmez isek (sorunu halletmezsek) java çalışmayı durdurur.
       4) try-catch kullanırken try kodunu bir yada birden fazla catch ile birlikte kullanabiliriz.
       5) try catch olmaksızın yanlız kullanılamaz.
       6) Eger yazmis oldugunuz herhangi bir kod satirinda problem olabilecegini dusunuyorsaniz try-catch blok icine koymaliisniz
       7) catch blok parantezi icerisine olmasi muhtemel exception class ismi yazilir.
       8) e.getmessage(),  methodunu kullanarak teknik mesajlar elde edebiliriz.
         ==> System.out.println(); burada yazmis oldugum mesajlar benim teknik olmayan aciklamalarimdir
         ==> e.printStackTrace(); methodu Exception ile ilgili detaylica teknik mesaj verir, kod calismaya devam eder
         ==> System.err.println(); hata mesajini renkli olarak verir bu sayede cansolda diger mesajlardan ayırmak icin kullaniriz
       9)Eger try body icindeki kod sorunusuz calisirsa catch block devreye girmez.

     */
    public static void main(String[] args) {

      divide(6,2); // 3
      divide(0,2); // 0
      divide(6,0); //

        divide2(5,0);
        divide2(12,3);

    }

    // Bir developer icin tum mat kuralarini ezbere bilmek mumkun degildir.
    // Bu nedenle 1. yol tavsiye edilmez
    public static void divide(int a, int b){

        if (b==0){
            System.out.println("Bir sayi 0 ile bolunemez");
        }else {
            System.out.println(a/b);
        }

    }

    // 2. yol; try-catch kullanarak exception'i handle etmek tavsiye edilir
    public static void divide2(int a, int b){

       try{
           System.out.println(a/b);
           System.out.println("hi exceptions");
           System.out.println("by exceptions");
       }catch (ArithmeticException e){
           System.out.println("Bolme isleminde bir problem olustu==>"+ e.getMessage());
           e.printStackTrace();   // calisma durmadan hata raporunu veriyor.
           System.err.println("Bolme isleminde bir problem olustu");  // Notu kirmizi rekli veriyor. (err)
       }

     // Java matematik ile ilgili karsilasilmasi muhtemel tum isnisnalari, hatalari
     // ArithmeticException class'ina koymustur.
     // Matematikteki tum istisnalari detayli bilmek zorunda degiliz.







    }



}
