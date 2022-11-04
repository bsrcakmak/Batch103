package day20stringbuilderstringbuffer;

public class StringBuilder01 {

    /*
       1) "StringBuilder", Java'da bir Class'tir.
       2) "StringBuilder", String olusturmaya yarar.
       3) "String" Class varken nicin StrinBuilder'a ihtiyac duyariz?
          Cunku "String" Class "Immutable Class" dir, ama biz bazen "Mutable" String'lere ihtiyac duyariz.
          StringBuilder bize "Mutable" String verir.
       4) "Immutable Class" larda varolan deger degistirilemez. Siz varolan bir degeri degistirmek istediginizde
            i)Memory'de yeni bir variable yeni değerle oluşturulur
           ii)Eski variable'ın pointer'ı yeni variable'a döndürülür.
          iii)Eğer bir variable'ı hiç bir pointer göstermiyor ise o variable "Garbage Collector" tarafından silinir.

         "Mutable Class"larda var olan değer değiştirilebilir. Orijinal değer korunmaz.

       5) "String Class" larin Immutable yapisi security icin onemlidir.
          Ayni degere sahip birden fazla String oldygynda Java bir tane container olusturur ve
          ayni degere sahip String'lerin bu container'i kullanmasini temin eder.
          Bu memeory'i korumak icin iyidir ancak container'daki degeri bir variable icin degistirdigimizde
          tum variable'larin etkilenme tehlikesi vardir. Bu tehlikeden kurtulmak icin Java String'leri "immutable(degismez)" yapmistir.
          Fakat herhangi bir variable'in degerini degistirmek icin Java bir yol bulmustur.
          Degistirmek istedigimiz variable icin yeni bir container olusturur ve variable'in pointer'ini bu yeni variable'a yonlendirir.
          Boyleleikle hem degisim saglanmis hem de digerleri etkilenmemis olur.

     */

    public static void main(String[] args) {

        String str= "Java";  // Immutable
        str= "Super Java";
        System.out.println(str);


        // StringBuilder nasil olusturulur?
        // 1. yol:
        StringBuilder strb1= new StringBuilder("Java");  // Mutable
        System.out.println(strb1);

        // 2. yol:
        StringBuilder strb2= new StringBuilder();

           // yol a;
        strb2.append("Java");
        strb2.append(" is easy");
        strb2.append("!!!");
        System.out.println(strb2); /// Java is easy!!!

           // yol b;
        strb2.append(" Learn").append(" Java earn").append(" money"); // Method Chain
        System.out.println(strb2); // Java is easy!!! Learn Java earn money

        // StringBuilder'larda karakter sayisi nasil bulunur? ===> length() methodu ile bulunur.
        StringBuilder strb3= new StringBuilder();
        strb3.append("Cat");
        strb3.append("mmmmmmmmmmmmmmm");

        int numOfChar= strb3.length();
        System.out.println(numOfChar); // 3

        // Capacity asimlarinda capacity var olanin iki katinin iki fazlasina cikar.
        int capacity1= strb3.capacity();
        System.out.println(capacity1);

        strb3.append("mmmmmmmmmmmmmmmmmmmmmmmmmmmm");
        int capacity2= strb3.capacity();
        System.out.println(capacity2);

        // setCharAt(2, 'r'); ===> Index 2'deki character'i "r" ye cevirir.
        strb3.setCharAt(2,'r');
        System.out.println(strb3);


        //delete(3,18) index 3 dahil,index 18 haric olmak uzere arada ki characterleri siler(subString gibi)
        strb3.delete(3,18);
        System.out.println(strb3);


        // deketeCharAt() ===> Index 2 deki characteri siler
        strb3.deleteCharAt(2);
        System.out.println(strb3);


        // reverse() method'u StringBuilder'i ters cevirir. Ali ==> ilA
        // Mutable'larda sadece method kullanmak orjinal degeri degeistirmek icin yeterlidir.
        strb3.reverse();
        System.out.println(strb3);


        // "Immutable" larda orijinal degeri degistirmek icin methodu kullanmak yeterli olmaz, birde atama islemi yapmalisiniz.
        String abc= "Java";
        abc= abc.replace("a", "i"); // abc'ye atama yapmasaydik yeni degeri goremezdik.
        System.out.println(abc); // Jivi


        // toString() methodu StringBuilder'lari String'e cevirir.
        // Datayi degisime kapatmak istersek yada String classtaki bazi methodlari kullanmka icin bu donusumu yapabiliriz.
        String stringStrb3= strb3.toString();
        System.out.println(stringStrb3); // mmmmmmmmmmmmmmmmmmmmmmmmmmmmaC  ==> Bu bir String oldu


        // String'den de StringBuilder'a asagidaki yontemle donebiliriz.
        StringBuilder strb4 = new StringBuilder(stringStrb3);
        System.out.println(strb4); // mmmmmmmmmmmmmmmmmmmmmmmmmmmmaC


        // insert(3, "XXXX"); 3. karakterden sonra "XXXX" leri koyar
        strb4.insert(3,"XXXX");
        System.out.println(strb4);  // mmmXXXXmmmmmmmmmmmmmmmmmmmmmmmmmaC


        // inser(3,"KLMOPQRSTU",5,8); ==> "KLMOPQRSTU" String'inin index 5,6,7 deki characterlerini ilk 3 unden sonraya yerlestirir
        strb4.insert(3,"KLMOPQRSTU",5,8);
        System.out.println(strb4); // mmmQRSXXXXmmmmmmmmmmmmmmmmmmmmmmmmmaC



        // compareTo(); methodu   i) StringBuilder'lar tamami ile ayniysa 0 verir yani aralarinda fark yoktur
        //                       ii) a alfabetik sirada b'den sonra gelirse pozitif olarak aradaki alfabetik siralama farkini gosterir
        //                      iii) a alfabetik sirada b'den once gelirse negatif olarak aradaki alfabetik siralama farkini gosterir

        StringBuilder a= new StringBuilder("java");
        StringBuilder b= new StringBuilder("Java");
        int sonuc= a.compareTo(b);  //  ASCII degerlerle calistigi icin kucuk buyuk harfe duyarlidir
        System.out.println(sonuc); // 32



































    }
}
