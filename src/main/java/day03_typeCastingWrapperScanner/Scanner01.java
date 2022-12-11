package day03_typeCastingWrapperScanner;

import java.util.Scanner;

public class Scanner01 {

    // Scanner kulanicidan data almaya yarar
    // Scanner kullanici ile etkileşim kurmamızı sağlar
    // Scanner bir Java class'idir, bu class'ı kullanabilmek icin "import" etmek gerekir
    // Scanner class'ı Java'nın util kutuphanesindedir
    public static void main(String[] args) {

        //Kullanicidan data almak icin yapilmasi gerekenler

        // 1. Adim: Scanner Class'indan object olusturun
        Scanner input=new Scanner(System.in);

        //2.Adim:Kullaniciya ne yapacagini soyle
        System.out.println("Hey kullanici yasini gir...");

        //3.Adim: Kullanicidan aldiginiz data'yi bir variable'in icine koyun

        byte age = input.nextByte();
        System.out.println("Hey kullanici senin yasin " + age);
    }
}
