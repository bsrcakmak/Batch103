package day08stringmanipulations;

import java.util.Scanner;

public class StringManipulations01 {
    public static void main(String[] args) {

        //Example 1: Kullanicidan aldiginiz ismin ilk ve son harfini ekrana yazdiriniz

       Scanner input=new Scanner(System.in);
       System.out.println("Lutfen isminizi giriniz...");
       String isim=input.next();

       // 1. yol;
       char ilkHarf= isim.charAt(0);
       char sonHarf= isim.charAt(isim.length()-1);

       System.out.println(""+ilkHarf+sonHarf);

       // 2. yol;
        String ilk=isim.substring(0,1);
        String son=isim.substring(isim.length()-1);
        String sonIki=isim.substring(isim.length()-2);
        System.out.println("soniki: "+sonIki);
        System.out.println(ilk+son);


//         Example 2: Verilen String'deki sadece hayvan isimlerini ekrana yazdiriniz.
//                    "Ben kedi esim tavuk oglum inek sever"


        String str="Ben kedi, esim tavuk, oglum sever inek";

//         substring() in iki kullanimi vardir
//         1) substring(baslangic indexi, bitis indeksi) String'in ortasindan bir parca almaya yarar
//         2) substring(baslangic indexi) String'in verilen indexten sonuna kadar almaya yarar.

        String kedi=str.substring(4,8);
        String tavuk=str.substring(15,20);
        String  inek=str.substring(34);

        System.out.println(kedi+" "+tavuk+" "+inek);

        // Example 3: Ilk isim ve soy ismi iceren isimlerden ilk ve soyisimlerin bas harflerini ekrana yazdiriniz

        System.out.println("Ilk ve soy isminizi giriniz...");
        String tamIsim=input.nextLine();

        String a=tamIsim.substring(0,1);
        String b = tamIsim.split(" ")[1].substring(0, 1);
        System.out.println(a + b);









    }
}
