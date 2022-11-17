package day30collections;

import java.util.HashSet;

public class HashSet01 {
    public static void main(String[] args) {

        /*
         "hash" bir tekniktir, hashing teknik denir birbirine benzemeyen kodlar uretir, bu kodlar datayi unique yapar.
         Set'lere, çoklu ama tekrarsız data depolamak istediğimizde ihtiyaç duyarız.(öğrenci numaraları gibi)

         HashSet'ler eklenen elemanlarin siralamasi ile ugrasmaz. Siralama yapsaydi zaman harcayacagi icin yavas calisirdi.
         Java hizli olsun diye rastgele koymasini ister, yani HashSet cok hizli calisir.

         HashSet'ler nerelerde kullanilir?
             i)tekrarsiz elemanlarda kullanilir
            ii)siralama onemli degilse kullanilir
           iii)hiz onemliyse kullanilir

         HashSet'ler index kullanmazlar, cunku siralama rastgele yapildigi icin index manali olmaz.



         */

        HashSet<String> emails= new HashSet<>();

        emails.add("Apple");
        emails.add("Mango");
        emails.add("Orange");
        emails.add("Apricot");
        emails.add("Fig");
        System.out.println(emails); // [Apple, Fig, Mango, Apricot, Orange]

        // Var olan elemani eklerseniz hata vermez, son ekleneni var olan datanin ustune yazar.
        // Dolayisiyla sette bir degisiklik olmaz
        emails.add("Mango");
        System.out.println(emails); // [Apple, Fig, Mango, Apricot, Orange]

        emails.add(null);
        emails.add(null);
        emails.add(null);
        System.out.println(emails); // [null, Apple, Fig, Mango, Apricot, Orange]













    }
}
