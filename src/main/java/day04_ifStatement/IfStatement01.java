package day04_ifStatement;

public class IfStatement01 {
    public static void main(String[] args) {

        //If it rains I will cancel the picnic
        // If statement belli kodlari belli sartlara bagli olarak calistirmaya yarar


        // Example 1: Sayi pozitif ise ekrana pozitif yazdirin
        int sayi=12;
        if (sayi>0){
            System.out.println("Sayi pozitiftir");
        }


        // Example 2: Verilen karakter buyuk harf ise ekrana buyuk harf yazdirin
        char x= 'A';
        if (x>='A' && x<='Z'){
            System.out.println("Karakter buyuk harf");
        }

        /*
            && islemi sadece boolean ile kullanilir
            true && true = true
            true && false = false

            && islemi mukemmeliyetcidir, true sonucunu alabilmek icin hersey true olmalidir
            Bir tane false varsa sonuc false demektir
         */

        // Example 3: Verilen bir sayi uc basamakli ise ekrana "Uc basamakli" yazdiriniz.
        int a=-123;

        a=Math.abs(a);

        if (a>99 &&a<1000){
            System.out.println("sayi uc basamakli");
        }


        // Example 4: Verilen bir
        int s= -18;

        // "=" isareti atama operatorudur, matematikteki esittir anlamina gelmez
        // Matematikteki esittir sembolu Java'da "==" seklindedir
        // 2+3 == 5

        if (s%2==0){
            System.out.println("sayi cift");
        }


        // Example 4: Verilen bir sayı
        int m= 3567;
         if (m<300 || m>1200){
            System.out.println("Harika sayi");
         }
         /*
           || islemi sadece boolean ile kullanilir.
              true || true = true
              true || false= true
              false || true= true
              false || false= false

           Not: || isleminde false alabilmek icin herseyin false olmasi gerekir.
                || isleminde sadece bir tane true sonucu true yapmaya yeter
         */
    }
}
