package day18arraylistspassbyvalue;

public class PassByValue01 {

    /*
        1) Java variable'larin orjinal degerlerini korumak ister
        2) Variable method'lar icinde kullanildiginda, Java method'un icine orjinal degeri koymaz,
           o degerin kopyasini uretir ve method'a o kopyayi yollar. Method kopya uzerinde degisiklik yapar
           dolayisiyla variable'in orjinal degeri korunmus olur.
           Bu sisteme "Pass By Value" denir.
           Note: Java "Pass By Value" kullanir.
           Note: Bazi programlama dilleri orjinal degeri koruma altina almamistir.
                 Bu isi developer'lara birakmistir.
                 Bu tarz diller "Pass By Reference" kullanir.


     */


    public static void main(String[] args) {

        int x=5;
        System.out.println(x); // 5
        // static method olan "main method" un icindeki hersey static olmali
        change(x);  // 15          // methodun static oldugunu bildirmek icin italik yaziyor Java
        System.out.println(x); // 5


        int ucret=100;
        int kopya=indirim(ucret);
        System.out.println(ucret); // 100
        System.out.println(kopya); // 90


        /*
          ===> Eger indirimli hali uzerinden tekrar indirim olsun istiyorsak

        ucret= indirim(ucret);        ==> yeni bir variable'a degil ilk hali oloan ucrete atariz
        System.out.println(ucret);

         */

    }

    public static void change(int a){  // void varsa birsey uretmez

        System.out.println(a*3);


    }


    // void disindaki return type larda method body si icinde
    //return keyword kullanilmalidir

    public static int indirim(int gomlekUcreti){

        return gomlekUcreti-10;



    }







}
