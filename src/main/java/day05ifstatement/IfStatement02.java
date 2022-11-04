package day05ifstatement;

import java.util.Scanner;

public class IfStatement02 {
    public static void main(String[] args) {


        //Example 1: Kullanici gun numarasini girsin kod gun ismini yazsin
        //           2==>Pazartesi      5==>Persembe ...


        Scanner input=new Scanner(System.in);
        System.out.println("Lutfen gun numarasını girin");

        byte gun=input.nextByte();

        if (gun==1) {
            System.out.println("Pazar");
        }else if (gun==2){
            System.out.println("Pazartesi");
        }else if (gun==3){
            System.out.println("Sali");
        }else if (gun==4){
            System.out.println("Carsamba");
        }else if (gun==5){
            System.out.println("Persembe");
        } else if (gun==6) {
            System.out.println("Cuma");
        } else if(gun==7){
            System.out.println("Cumartesi");
        }else{
            System.out.println("Gecerli bir gun numarasi giriniz." +
                    "Geçerli gün numaralari 1, 2, 3, 4, 5, 6, 7 den birisidir.\"");
        }


    }
}
