package day26exceptions;

public class Exceptions02 {



    // ==> 5. Exception= StringIndexOutOfBoundsException
    public static void main(String[] args) {

        char ch1= getCharFromString("Java",2);
        System.out.println(ch1);  // v

        char ch2= getCharFromString("Selenium", 8);
        System.out.println(ch2); // StringIndexOutOfBoundsException

        // StringIndexOutOfBoundsException : Eger bir String'den character/ler alinirken
        // olmayan bir index kullanilirsa StringIndexOutOfBoundsException alinir.

    }


    public static char getCharFromString(String str, int idx){

        char c= ' ';

        try {
            c= str.charAt(idx);
        }catch (StringIndexOutOfBoundsException e){
            System.out.println("Index ile ilgili bir problem olustu." + e.getMessage());
            e.printStackTrace(); // Detayli "log(application'in adim adim neler yaptigini gosterir)" icin
        }

        return c;
/*
      Interwiev sorusu: Kod yazarken hata aldiginizda ne yaparsiniz?
                    ==> Log kayitlarina bakarim

 */


    }







}
