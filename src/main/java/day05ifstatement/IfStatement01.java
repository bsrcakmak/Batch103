package day05ifstatement;

import java.util.Scanner;

public class IfStatement01 {
    public static void main(String[] args) {


        //Example 1: Kullanicidan alinan sayinin tek mi cift mi oldugunu
        // ekrana yazan kodu yaziniz.

        Scanner input=new Scanner(System.in);
        System.out.println("Bir sayi giriniz");
        int sayi= input.nextInt();

        //1. yol:
        if (sayi%2==0){
            System.out.println("sayi cifttir");
        }
        if (sayi%2!=0){
            System.out.println("sayi tektir");
        }


        // 2. yol:
        if (sayi%2==0){
            System.out.println("sayi cifttir");
        }else{
            System.out.println("sayi tektir");
        }




        //Example 2: Kullanicidan alinan sayinin
        // negatif, pozitif veya negatif oldugunu soyleyen kodu yazin

        System.out.println("bir sayi giriniz");
        double d=input.nextDouble();

        if (d>0){
            System.out.println("Pozitiftir");
        }else if(d==0){
            System.out.println("Notr");
        }else{
            System.out.println("Negatif");
        }





















    }
}
