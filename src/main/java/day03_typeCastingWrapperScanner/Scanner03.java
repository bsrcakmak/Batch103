package day03_typeCastingWrapperScanner;

import java.util.Scanner;

public class Scanner03 {
    public static void main(String[] args) {

        // Kullnicidan bir dikdortgenin en ve boyunu alip alan ve cevresini hesaplayan kodu yaziniz


        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen dikdortgenin en ve boy bilgisini giriniz");

        int en= input.nextInt();
        int boy= input.nextInt();

        System.out.println("Dikdortgenin alani= "+en*boy);
        System.out.println("Dikdortgenin cevresi= "+2*(en+boy));
    }
}
