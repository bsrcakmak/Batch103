package day01variables;

public class Variables01 {

    // 1)access modifier   2)data type   3)variable name   4)=   5)value   6);
    // Java'da ";" ingilizcedeki "." gibidir.
    // Ingilizce'de "cumle" deriz, Java'da "statement" deriz.
    // "=" sembolu "Assignment (atama) Operator" olarak adlandırılır.
    // "Assignment Operator" sağdaki değeri alır soldaki variable'in içine koyar.
    public int age=13;
    public int height=183;

    // Java'da data tipleri; memory'i verimli ve akıllıca kullanmak için idealdir

                        // Primitive Data Types:
    /*
    1-)int: tamsayılar için kullanılır. 32 bit kullanır.
           Matematikte tamsayıların başı ve sonu yoktur fakat Java'da tamsayıların başı ve sou vardır
           En küçük int= -2,147,483,648
           En büyük int= 2,147,483,647

    2-)byte: tamsayılar için kullanılır. 8 bit kullanır.
            En küçük byte= -128
            En büyük byte= 127

    3-)short: tamsayılar için kullanılır. 16 bit kullanır.
            En küçük short= -32768
            En büyük short= 32767

    4-)long: tamsayılar için kullanılır. 64 bit kullanır.
            En küçük long= -9,223,372,036,854,755,808
            En büyük long= 9,223,372,036,854,755,807

    5-)float: ondalıklı sayılar için kullanılır. 32 bit kullanır.
             Virgülden sonra 7 basamak içerir.
             "float" değerlerinde sonuna "f" veya "F" koymanız gerekir

    6-)double: ondalıklı sayılar içindir. 64 bit kullanır.
             Virgülden sonra 16 basamak içerir. hassas veriler için kullanmak tavsiye edilir.

    7-)boolean: "true" veya "false" degerleri icin kullanilir. 1 bit kullanir.

    8-)char: tek karakterler icin kullanılır. 16 bit kullanır.
           A, c, 2, ?, ...,
           Note: "char" lara deger verirken , degeri tek tirnak arasina koyunuz, yoksa hata verir.


    Note: Numerik Data Types: byte < short < int < long < float < double
          Numerik Olmayan Data Types: boolean, char

     */


                       // Non-Primitive Data Types: Degerlerle birlikte aksiyonlarda var
    /*
     String; isim, adres, kimlik numarası gibi bir veya birden fazla karakter iceren degerlerde kullanilir.
            String degerleri mutlaka cift tirnak arasina konulmalidir.
            String non-primitive dir. Yani bir String olusturdugunuzda Java size bir suru method verir.
    */


    /*

            Primitive ile Non-Primitive lerin farki nedir?
            1) Non-Primitive data type'larında degerin yaninda method'lar vardir.
               Primitive data type'larinda ise sadece deger vardir, method yoktur.
            2) Primitive data type'lari Java tarafindan olusturulmustur, toplam 8 tanedir ve biz Primitive data olusturamayiz.
               Non-Primitive data type'larında Java tarafindan olusturulmustur, bizde olusturabiliriz.
               Non-Primitive sayilamayacak kadar coktur,  cunku her developer Non-Primitive data type olusturabilir.
               Olusturulan classlar bir non-primitive data type dır.
            3) Primitive data type isimleri kucuk harfle baslar.
               Non-Primitive data type isimleri buyuk harfle baslar.
            4) Primitive data type'lar memoryde farkli buyuklukte yerler kullanır.
               Non-Primitive'lerin hepri memory'de ayni buyuklukte yer kullanirlar.

     */


    public byte price=12;
    public short populationOfVillage=23000;
    public float priceOfShirt=13.99f;
    public double weightOfCell= 0.000012045;

    // siz "long" demenize ragmen Java verilen sayıyı "int" kabul eder
    // Bu yuzden, Long bir variable'a "int" araliginin disinda bir sayi verirseniz mutlaka sonuna "L" veya "l" koyunuz
    public long populationOfWorld=70000000000L;

    // Burada "L" koymadigimiz halde problem yok cunku "1234" int araligina uyar.
    // long bir variable'a "int" aralıgının disinda bir sayi verirsek mutlaka sonuna "L" veya "l" koymamız gerekir.
    public long x=1234;

    public boolean isOld=true;
    public boolean isRich=false;

    public char initial= 'S';

    public String name="Tom Hanks";


    // "main method" arabanın motoru gibidir, o çalışmadan hiçbirşey çalışmaz

    public static void main(String[] args) {









    }

}
