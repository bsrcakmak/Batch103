package day09stringmanipulations;

import java.util.Scanner;

public class StringManipulations01 {
    public static void main(String[] args) {

        String str = "Kara kara düşünme Ankara";

        //indexOf() method'u verilen character veya character'lerin "ilk görünümünün" index'ini verir.
        int idxA = str.indexOf("kara");
        System.out.println(idxA);//5

        //lastIndexOf() method'u verilen character veya character'lerin "son görünümün" index'ini verir.
        int lastIdxOf = str.lastIndexOf("kara");
        System.out.println(lastIdxOf);//20

        String s = "Mississippi";
        int idxI = s.indexOf("i");//indexOf() hem String hem de char ile kullanılabilir.
        System.out.println(idxI);//
        int idxIss1 = s.indexOf("iss");//İlk görünümün ilk karakterinin index'ini verir.
        System.out.println(idxIss1);
        int idxIss2 = s.lastIndexOf("iss");//Son görünümün ilk karakterinin index'ini verir.
        System.out.println(idxIss2);


        //Example 1: Bir String'deki bir character'in tekrarli veya
        //           tekrarsiz olup olmadigini gosteren kodu yaziniz
        //          "Helloooo"==>  H --> Tekrarsiz   e --> Tekrarsiz  l --> Tekrarli  o --> Tekrarli
        String t="Helloooo";
        char c='H';

        if (t.indexOf(c)==t.lastIndexOf(c)) {
            System.out.println("Tekrarsiz");
        }else {
            System.out.println("Tekrarli");
        }


        // indexOf() iki parametre ile kullanilirsa ikinci parametrede verilen sayi kadar character'i gectikten sonra
        // istenen character'in ilk gorunumunun indexini return eder.
        String  u= "Learn Java earn money";
        int sonuc=u.indexOf("e",4);
        System.out.println("say:"+sonuc); //11


        //lastIndexOf() iki parametre ile kullanilirsa ikinci parametrede verilen sayiyi "index" olarak kabul edip en bastan
        // bu indexe kadar olan karakterleri bir kutu icine aliniz ve lastIndexOf() method'unu sadece bu kutu icindeki String icin kullaniniz.
        String m="Hello everyone!";
        int e = m.lastIndexOf("e", 10);
        System.out.println(e);//8

        int snc=u.lastIndexOf("a",5);
        System.out.println(snc);
        int snc2=u.lastIndexOf("r",7);
        System.out.println(snc2);




        // isEmpty() methodu bir String'in bos olup olmadigini kontrol eder
        // Eger String'de hic character yoksa isEmpty() methodu "true" return eder, herhangi bir character varsa "false" return eder
        // length()==0 demek isEmpty() true demektir.
        // Bir String'in bos olup olmadigini anlamak icin "length()==0" kullanmak yerine "isEmpty()" kullanmak daha iyidir
        String v= "Java is Java";
        boolean bosMu=v.isEmpty();  // bos mu diye sorar, space bile olsa dolu kabul eder
        System.out.println(bosMu);  // False


        // isBlank() hem "bos String" icin hem de "sadece space" iceren String'ler icin true return eder
        String x="     ";
        boolean blankMi=x.isBlank();
        System.out.println(blankMi); //

        // Example 2: Kullanicidan alinan isim mutlaka space'den farkli en az 1 character icermelidir.

        Scanner input=new Scanner(System.in);
        System.out.println("Lutfen ilk isminizi giriniz...");
        String ilk= input.nextLine();

        if (ilk.isBlank()) {
            System.out.println("Sana ismini gir dedim...");
        }else {
            System.out.println(ilk);
        }









    }
}
