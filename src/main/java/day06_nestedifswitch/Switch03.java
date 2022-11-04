package day06_nestedifswitch;

import java.util.Scanner;

public class Switch03 {
    public static void main(String[] args) {


        //Note: Switch'te sadece int, byte, shart, char, String data tipleri kullanilabilir
        //      Bunlar disinda kullanilirsa if kullanilmali
        //      Veya 3 ten fazla durum varsa switch() tercih edilmelidir

        // Kullanicidan islem ve iki tane sayi alarak islemin sonucunu ekrana yazdıran basit bir hesap makinesi yapiniz.

        Scanner input=new Scanner(System.in);
        System.out.println("Islemi giriniz...(+,-,*,/,%)");
        char islem=input.next().charAt(0);

        System.out.println("Ilk sayiyi giriniz...");
        double ilk=input.nextDouble();
        System.out.println("Ikinci sayiyi giriniz...");
        double ikinci= input.nextDouble();

        switch (islem){

            case '+':
                System.out.println(ilk+ikinci);
                break;
            case '-':
                System.out.println(ilk-ikinci);
                break;
            case '*':
                System.out.println(ilk*ikinci);
                break;
            case '/':
                System.out.println(ilk/ikinci);
                break;
            case '%':
                System.out.println(ilk*ikinci/100);
                break;
            default:
                System.out.println("Bu islem tanimlanmamistir, gecerli bir islem giriniz...");

        }





    }
}
