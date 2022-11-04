package day04_ifStatement;

import java.util.Scanner;

public class Scanner01 {
    public static void main(String[] args) {

        /*
        Kullanicidan ilk, orta ve soy ismini aliniz ve asagidaki formatta ekrana yazdiriniz
       Ali Mert Can
       123456789
         */

        Scanner input=new Scanner(System.in);


        // 1. Yontem:








        // 2. Yontem:
        System.out.println("Lutfen ilk, orta ve soy isminizi ve tc nizi giriniz");

        String ilkiIsim=input.next();   // next() methodu kullanicidan String almak icin kullanilir
        String ikinciIsim=input.next();
        String soyIsim=input.next();
        String tc=input.next();

        System.out.println(ilkiIsim+" "+ikinciIsim+" "+soyIsim);
        System.out.println(tc);


        /*
           next() ile nextLine() in farki nedir?
           next() methodu kullanicidan gelen String'in sadece ilk kelimesini alir.
           nextLine() methodu kullanicidan gelen String'in tamamini alir.
         */



        // 3. Yontem:
        System.out.println("Lutfen ilk, orta ve soy isminizi giriniz");
        String tamIsim=input.nextLine();
        System.out.println(tamIsim);

        System.out.println("Lutfen kimlik numaranizi giriniz");
        String kimlikNumarasi=input.next();
        System.out.println(kimlikNumarasi);






    }
}
