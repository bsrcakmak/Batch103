package day27exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Exceptions02 {

    /*
        1)  FileInputStream fis= new FileInputStream("src\\main\\java\\day27exceptions\\File1.txt");
           "new" den sonraki "FileInputStream" hata verir. Cunku; biz Java'ya verilen adresteki dosyaya git dedik'
           Java iki endiseye kapildi. i) Ya adres yanlissa  ii) Ya verilen adreste dosya yoksa
           Biz "method ismi" nden sonra, "throws FilNotFoundException" yazarak, Java'ya bu iki endise duydugun durum
           olusursa "Exception At" dedik.

        2) while ((k=fis.read()) != -1){} yazdigimizda "read()" method'u hata verir. Cunku biz Java'ya dosya'daki
           karakterleri oku dedik. Java bir endiseye kapildi i) Ya okumasi gereken karakterler Java'nin bilmedigi karakterlerse
           biz method isminden sonra "throws IOException" yazarak, Java'ya bu durumla karsilastiginda "Exception At" dedik.

        3) Method isminden sonra "throws IOException" yazarsaniz Java "throws FilNotFoundException" i siler.
           Cunku; "IOException", "FilNotFoundException" i kapsar. "IOException", "FilNotFoundException" in parent'idir.
           Onun yaptigi herseyi yapabilir o yuzden "IOException" varken "FilNotFoundException"a gerek yoktur.

           "IOException", 'Input Output Exception" demektir.

        4) Gordugunuz gibi "IOException" ve "FilNotFoundException" biz kod yazarken, daha "Run" butonuna basmadan ortaya cikti.
           Bu tarz Exception'lara "Compile Time Exception" denir, diger adlari "Checked Exception"dir.

           "Compile Time Exception" lar kesinlikle halledilmelidir(Exception Handling), halletmeden code yazmaya devam etmeyiniz.

     */

    public static void main(String[] args) throws IOException {

        readTheTextFromTheFile();
        System.out.println("\n===========================");
        readTheText();

    }

    // Bir text file'daki text'i okuyan kodu yaziniz.
    // 1. Way;  cogunlukla bu kullanilir.
    public static void readTheTextFromTheFile() throws IOException {   // IO,  FileNotFound un parent'idir
                                                        // Absolute path
        FileInputStream fis= new FileInputStream("src\\main\\java\\day27exceptions\\File1.txt");

        int k= 0;
        while ((k=fis.read()) != -1){          // read() methodu baska karakter kalmadiginda -1 verir.
            System.out.print((char)k);       // read() method'u karakter karakter okur.

        }
    }


    // 2. Way;

    public static void readTheText(){

        try {
            FileInputStream fis= new FileInputStream("src\\main\\java\\day27exceptions\\File1.txt");

            int k= 0;
            while ((k=fis.read()) != -1){          // read() methodu baska karakter kalmadiginda -1 verir.
                System.out.print((char)k);       // read() method'u karakter karakter okur.

            }

        } catch (FileNotFoundException e) {
            System.out.println("Dosya'nin adresi veya varligi ile ilgili bir problem var");
        } catch (IOException e) {
            System.out.println("Dosya'da okunamayan bir karakter var.");
        }


    }






}
