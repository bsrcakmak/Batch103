package day12loops;

import java.util.Scanner;

public class WhileLoop01 {
    public static void main(String[] args) {


        //Example 1: 3 den 10 a kadar tamsayilari ayni satirda ekrana yazdiran kodu yaziniz

        // 1. yol;
        for (int i=3; i<11; i++){
            System.out.print(i+" ");
        }

        System.out.println();

        // 2. yol:
        int i=3;

        while (i<11){
            System.out.print(i+" ");
            i++;
        }


        System.out.println();

        //Example 2: 17 den 4 e kadar tum cift sayilari ekrana ayni satirda yazdiran kodu yaziniz

        int m=17;
        while (m>3){

            if (m%2==0 ){
                System.out.print(m+" ");
            }

            m--;
        }

        System.out.println();


        //Example 3: 12 den 14 e kadar sayıların toplamını veren kodu yazınız

        int sum=0;
        int k=12;
        while (k<15){

            sum=sum+k;
            k++;
        }
        System.out.println(sum);



        //Example-4: Size verilen bir tam sayının rakamlarının toplamını ekrana yazdıran kodu yazınız

        Scanner input=new Scanner(System.in);
        System.out.println("bir tamsayi giriniz");

        int sonuc=0;
        int sayi= input.nextInt();

        while(sayi>0){
            sonuc= sonuc+sayi%10;

            sayi=sayi/10;

        }
        System.out.println(sonuc);


        // Example 5: Kullanicidan aldiginiz bir sayinin carpim tablosunu ekrana yazdiriniz
        //           3 ==> 3x1=3   3x2=6  3x3=9  ...  3x10=30

        Scanner scan= new Scanner(System.in);
        System.out.println("bir sayi giriniz");
        int s= scan.nextInt();
        int n=1;

        while (n<11){

            System.out.println(s+ " * " +n+ " = "+s*n);
            n++;

        }










    }
}
