package day32maps;

import java.util.HashMap;
import java.util.Hashtable;

public class HashTable01 {

    /*
        1) HashTable bir map'tir.
        2) HashTable entrySet'leri herhangi bir siralamaya tabi tutmaz.
        3) HashTable, HashMap'lerden daha yavastir. Cunku HashTable'lar thread-safe(ayni anda birden fazla is yapabilme becerisi)
           ve synchrozed'dir.
        4) HashTable'larda key null olamaz. Key'i null yaparsaniz NullPointerException atar.
        5) HashTable'larda value null olamaz. Value'yu null yaparsaniz NullPointerException atar.

        Note: toString() methodu objeleri console'da detaylari ile gorebilmek icin class'larin icinde olusturulur.
              toString() methodu'nu olusturmadan objeyi console'a yazdirirsaniz Java o objenin adresini yazdirir.
     */

    public static void main(String[] args) {

        Hashtable<String, Integer> countryPopulations = new Hashtable<>();
        countryPopulations.put("USA", 400000000);
        countryPopulations.put("Germany", 830000000);
        countryPopulations.put("Turkey", 900000000);
        System.out.println(countryPopulations); // {USA=400000000, Germany=830000000, Turkey=900000000}

        // countryPopulations.put(null, 90000000);  // HashTable'larda key null olamaz.  NullPointerException
        // countryPopulations.put("France", null); // HashTable'larda value null olamaz.  NullPointerException

        // Hashtable da kendi olusturdugumuz Student class'ini data tipi olarak kullanabiliyoruz.
        // List, Map, Queue hepsini olustururkende kullanabiliriz bizim claas'i data tipi olarak
        // kendi olusturdumuz ogrenci objesini Hashtable'in icine yazdik

        Hashtable<String, Students> myStudents = new Hashtable<>();
        myStudents.put("Math", new Students("Tom Hanks","th@gmail.com", 21, true));
        myStudents.put("Science", new Students("Tom Hanks","th@gmail.com", 21, true));
        System.out.println(myStudents);

        // Data tipi olarak kullandigimiz class'imizda toString methodu olmali objeye ait gerekli bilgileri gormek icin,
        // eger class'ta toString methodu olmazsa objenin steak memory'deki adresini goruruz

        // Hashtable'a yerlestirdigimiz datalari istersek tek tek de alabiliriz.
        String  name = myStudents.get("Math").name;
        System.out.println(name);  // Tom Hanks

        int age = myStudents.get("Math").age;
        System.out.println(age);  // 21

    }
}
