package day05ifstatement;

import java.util.Scanner;

public class IfStatement03 {

    /*
       Iki tane String in esit olup olmadigini anlamak icin "==" degil "equals()" kullaniniz
       Iki tane String in birbirirne esit olup olmadıgını kontrol etmek icin iki tane method kullanilabilir
           i) equals()==> Buyuk ve kucuk harfi onemser. "A" ile "a" farklidir.
           ii) equalsIgnoreCase ==> Buyuk ve kucuk harfi onemsemez."A" ile "a" aynidir.
     */


    public static void main(String[] args) {

        //Example 1: Kullanicidan gun isimlerini aliniz, o gunu hafta sonu mu hafta ici mi oldugunu kullaniciya soyleyiniz
        //           Pazartesi==>Hafta ici        Pazar==>Hafta sonu

        Scanner input=new Scanner(System.in);
        System.out.println("Lutfen gun ismini giriniz");

        String gunIsmi=input.next();

        // 1. yol:
        if (gunIsmi.equalsIgnoreCase("Pazar") ){
            System.out.println("Haftasonu");
        }else if (gunIsmi.equalsIgnoreCase("Pazartesi")) {
            System.out.println("Haftaici");
        }else if (gunIsmi.equalsIgnoreCase("Sali")) {
            System.out.println("Haftaici");
        }else if (gunIsmi.equalsIgnoreCase("Carsamba")) {
            System.out.println("Haftaici");
        }else if (gunIsmi.equalsIgnoreCase("Persembe")) {
            System.out.println("Haftaici");
        }else if (gunIsmi.equalsIgnoreCase("Cuma")) {
            System.out.println("Haftaici");
        }else if (gunIsmi.equalsIgnoreCase("Cumartesi")) {
            System.out.println("Haftasonu");
        }else{
            System.out.println("Gecerli bir gun ismi giriniz");
        }


        // 2. yol:
        if(gunIsmi.equalsIgnoreCase("Pazar") || gunIsmi.equalsIgnoreCase("Cumartesi")){
            System.out.println("Hafta sonu...");
        }else if(gunIsmi.equalsIgnoreCase("Pazartesi") ||
                gunIsmi.equalsIgnoreCase("Sali") ||
                gunIsmi.equalsIgnoreCase("Carsamba") ||
                gunIsmi.equalsIgnoreCase("Persembe") ||
                gunIsmi.equalsIgnoreCase("Cuma")){
            System.out.println("Hafta ici...");
        }else{
            System.out.println("Gecerli bir gun ismi giriniz...");
        }


        // 3. yol (Standart yol; tekrar yok ve parantez icleri sade)

        boolean haftaSonu=gunIsmi.equalsIgnoreCase("Pazar") || gunIsmi.equalsIgnoreCase("Cumartesi");

        boolean haftaIci=gunIsmi.equalsIgnoreCase("Pazartesi") ||
                gunIsmi.equalsIgnoreCase("Sali") ||
                gunIsmi.equalsIgnoreCase("Carsamba") ||
                gunIsmi.equalsIgnoreCase("Persembe") ||
                gunIsmi.equalsIgnoreCase("Cuma");

        if(haftaSonu){
            System.out.println("Hafta sonu...");
        }else if(haftaIci){
            System.out.println("Hafta ici...");
        }else{
            System.out.println("Gecerli bir gun ismi giriniz...");
        }






    }
}