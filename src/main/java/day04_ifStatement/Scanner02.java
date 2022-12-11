package day04_ifStatement;

import java.util.Scanner;

public class Scanner02 {

    /*
        Not: char variable'lari matematiksel islemlerde kullanirsaniz
             Java onlarin ASCII degerlerini kullanir.
             Orn; System.out.println('A'+'C'); ekrana AC yerine 132 yazdirir.

        Note2: Java'da "+" sembolunun iki anlami vardir.
               i) Toplama islemi     ii) Birlestirme islemi(Concatination)
               Java "+" sembolu gorunce once toplama yapmaya calısır,
               yapamazsa birlestirme islemi yapmaya calisir, o da olmazsa hata verir.
     */

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        //1.Yontem;
      /*  System.out.println("Lutfen ilk ve soy isminizi giriniz");
        char name=input.next().charAt(0);
        char surname=input.next().charAt(0);

        System.out.println(""+name+surname);
*/

        // 2.Yontem;
        System.out.println("Tam isminizi giriniz");
        String tamIsim=input.nextLine();  // Ali Can

        char ilkHarf=tamIsim.charAt(0);
        System.out.print(ilkHarf); // A

        char soyIsminIlkHarfi=tamIsim.split(" ")[1].charAt(0);
        System.out.println(soyIsminIlkHarfi);
    }
}
