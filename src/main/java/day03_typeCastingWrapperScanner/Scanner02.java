package day03_typeCastingWrapperScanner;

import java.util.Scanner;

public class Scanner02 {

    public static void main(String[] args) {

      //Example 1: Sayilari kullanicidan alan ve toplama islemi yapan kodu yaziniz.

        Scanner input=new Scanner(System.in);

        System.out.println("Lütfen ilk sayiyi giriniz");
        double sayi1=input.nextDouble();

        System.out.println("Lütfen ikinci sayiyi giriniz");
        double sayi2= input.nextDouble();

        System.out.println("Girilen iki sayi toplami= "+(sayi1+sayi2));


//        int a=5;
//        double b=2;
//        double sonuc=b;
//        System.out.println(sonuc); // 2.0
//
//
//        double x=5;
//        int t=(int)x;





    }
}
