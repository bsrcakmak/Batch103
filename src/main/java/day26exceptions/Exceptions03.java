package day26exceptions;

public class Exceptions03 {

    // ==> 6. Exception= NullPointerException

    public static void main(String[] args) {

        double d= divideStringByTheNumOfTheChar("124");

        System.out.println(d);  // 41.0

        divideStringByTheNumOfTheChar(null);

    }

    // String'deki karakter sayisini bulunuz, String'i Integer'a ceviriniz
    // sonrada Integer'i karakter sayisina bolunuz.


    // 1.YOL:
    public static double divideStringByTheNumOfTheChar(String str){
        int length=0;
        int i= 0;
        double sonuc= 0;
       try{
           length= str.length(); // NullPointerException: "null" String ile "length()" kullanildiginda alinir.

            i= Integer.valueOf(str); // NumberFormatException: Icinde rakamdan farkli character olan String'ler valueOf() ile kullanilirsa.

           sonuc= i/length; // ArithmeticException: Bolen sayi sifir oldugunda alinir.

       }catch (NullPointerException e){
           System.out.println(e.getMessage());

       }catch (NumberFormatException e){
           System.out.println(e.getMessage());

       }catch (ArithmeticException e){
           System.out.println(e.getMessage());
       }
    return sonuc;
    }


    // 2. YOL:
    public static double divideStringByTheNumOfTheCharacter(String str){
        int length=0;
        int i= 0;
        double sonuc= 0;
        try{
            length= str.length(); // NullPointerException: "null" String ile "length()" kullanildiginda alinir.
            i= Integer.valueOf(str); // NumberFormatException: Icinde rakamdan farkli character olan String'ler valueOf() ile kullanilirsa.
            sonuc= i/length; // ArithmeticException: Bolen sayi sifir oldugunda alinir.

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return sonuc;
    }


    // 3. YOL:
    public static double divideStringByTheNumOfTheCharacters(String str){
        int length=0;
        int i= 0;
        double sonuc= 0;
        try{
            length= str.length(); // NullPointerException: "null" String ile "length()" kullanildiginda alinir.
            i= Integer.valueOf(str); // NumberFormatException: Icinde rakamdan farkli character olan String'ler valueOf() ile kullanilirsa.
            sonuc= i/length; // ArithmeticException: Bolen sayi sifir oldugunda alinir.

        }catch (NullPointerException e){
            System.out.println("NullPointer'a ozel...");
        } catch (Exception e){
            System.out.println("Diger tum Exception'lar icin...");
        }
        return sonuc;
    }

    /*
        NOTE: 1) Aralarinda "parent-child" relationship olan Exception Class'lari multiple catch'lerde kullanmak isterseniz
                 "child" olan once kullanilmalidir, aksi taktirde hata verir.
              2) Aralarında "parent-child" relationship olmayan Exception Class'ları multiple catch'lerde kullanmak isterseniz
                 sıralamanın bir önemi yoktur.

     */


}
