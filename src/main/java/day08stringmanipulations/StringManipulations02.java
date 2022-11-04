package day08stringmanipulations;

import java.util.Scanner;

public class StringManipulations02 {
    public static void main(String[] args) {

        // Example 1: Bir String'deki space haric kac tane character kullanildigini gosteren kodu yaziniz

        String str= "Ali okula gitti.";
        int num=str.replace(" ","").length();
        System.out.println(num);


        // Example 2: Bir String'deki tum 'a' harflerini 'A' ya ceviriniz

        String s= "Ankara'nin tasina gozlerimin yasina bak.";
        String sa=s.replace("a","A");
        System.out.println(sa);


        // Example 3: Bir String'deki "kara" kelimelerinin yerine "*" koyunuz

        String t= "Kara kara dusunme Ankara";
        String yeniT=t.replace("kara","*");
        System.out.println(yeniT); // Kara * dusunme An*


        // Example 4: Bir String'deki tum sayilari "*" a ceviriniz
        //            "AC*********"

        String stdtId= "AC202117004";
        String yeniStdId=stdtId.replaceAll("[0-9]", "*");
        System.out.println(yeniStdId);


        /*
            Bir grup datayi ifade eden kodlara "Regex" denir.
            "Regex" Regular Expressions in kisaltilmis halidir.

            1) Tum rakamlar ==> [0-9]
            2) Tum kucuk harfler ==> [a-z]
            3) Tum buyuk harfler ==> [A-Z]
            4) Tum harfler ==> [a-zA-Z]
            5) Tum sesli harfler ==> [aeiouAEIOU]
            6) Space ==> [ ]
            7) Tum rakamlar ve tum harfler ==> [0-9a-bA-Z]
            8) Tum noktalama isaretleri ==> \\p{Punct}


            1) Rakamlar haric tum characterler ==> [^0-9]
            2) Kucuk harfler haric tum karakterler ==> [^a-z]
            3) Buyuk harfler haric tum karakterler ==> [^A-Z]
            4) Tum harfler haric tum karakterler ==> [^a-zA-Z]
            5) sPACE HARIC TUM KARAKTERLER ==> [^ ]


         */

        // Example 5: Verilen bir String'de kullanilan noktalama isareti ve
        // rakamlar ve space karaktei haric tum karakterlerin sayiisni bulan kodu yaziniz


        String u= "Ali 13 yasinda, dersem inanma!...";

        int sonuc =u.
                replaceAll("[0-9]","").
                replace(" ","").
                replaceAll("\\p{Punct}","").
                length();

        System.out.println(sonuc);  // 22



        // Example 6: Bir password'un gecerli olup olmadigini asagidaki kurallara gore test eden kodu yaziniz
        //            i) Space haric en az sekiz karakter olmali
        //            ii) En az bir sembol icermeli
        //            iii) En az bir rakam icermeli
        //            iv)En az 1 buyuk harf icermeli
        //            v)En az 1 kucuk harf icermeli

        String  pwd= "B78c? K!m";

        // i) Space haric en az sekiz karakter olmali
        boolean first=pwd.replace(" ","").length()>7;

        // ii) En az bir sembol icermeli
        boolean second=pwd.replaceAll("[0-9a-zA-Z ]","").length()>0; // sondaki bosluk space i siler

        // iii) En az bir rakam icermeli
        boolean third= pwd.replaceAll("[^0-9]","").length()>0;

        // iv)En az 1 buyuk harf icermeli
        boolean fourth=pwd.replaceAll("[^A-Z]","").length()>0;

        // v)En az 1 kucuk harf icermeli
        boolean fifth=pwd.replaceAll("[^a-z]","").length()>0;

        boolean pwdGecerli=fifth && second && third && fourth && fifth;

        if (pwdGecerli){
            System.out.println("Password'unuz gecerli...");
        } else {
            System.out.println("Password'unuz gecerli degil...");
        }


        // Example 7: Bir String'deki noktalama isaretlerinin sayisini gosteren kodu yaziniz

        String cumle= "Sen yapmazsan, ben yapmazsam, o yapmazsa kim yapacak?...";

        int number=cumle.replaceAll("[^\\p{Punct}]","").length();

        System.out.println(number);


        // Example 8: Verilen bir String "Al" ile basliyor ve "x" ile bitiyorsa ekrana "Harika" yazdirin
        //            aksi halde "normal" yazdirin.

        String v="Alex";
        boolean baslangic=v.startsWith("Al");
        boolean bitis=v.endsWith("x");

        String result=baslangic && bitis ? "Harika" : "Normal";
        System.out.println(result);






    }
}
