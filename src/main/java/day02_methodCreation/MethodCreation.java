package day02_methodCreation;

public class MethodCreation {


    // main method icinde kullanacaginiz hersey "static" olmalidir

    public static void main(String[] args) {

        toplamaYap(1.2, 5);

        System.out.println(toplamaYap(1.2, 5));

        sayilariCarp(2, 1.5, 6);

        System.out.println(sayilariCarp(2, 1.5, 6));


        System.out.println(toplaCarp(2, 4, 6));


    }

    // Example 1: Toplama islemi yapan bir method olusturunuz.

    public static double toplamaYap(double a,double b){

        return a+b;
    }


    // Example 2: Uc sayiyi birbiri ile carpan bir method olusturunuz

    public static double sayilariCarp(double sayi1, double sayi2, double sayi3) {

        return sayi1*sayi2*sayi3;
    }


    // Example 3: Uc sayidan ilk ikisini toplayip ucuncu ile carpan method olusturup, sonucu ekrana yazdirin


    public static double toplaCarp(double x,double y,double z){

        return (x+y)*z;
    }



}
