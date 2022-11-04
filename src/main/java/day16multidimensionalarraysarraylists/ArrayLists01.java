package day16multidimensionalarraysarraylists;

import java.util.ArrayList;
import java.util.List;

public class ArrayLists01 {

    /*   Interwiev Sorusu: (!!!Array'lerin sinirliliklari!!!)
        ArrayList'ler ayni data tipine sahip birden fazla datayi depolamak icin kullanilir.
        Array ile ArrayList'in farki nedir?
          1) Array olustururken Array'in icine kac tane eleman koymamiz gerektigini soylemeliyiz
             ve soyledigimiz eleman sayisindan fazla eleman koyamayiz.
             Array'ler eleman sayisinda "fixed" dirler.
             ArrayList'leri olustururken eleman sayisi soylemeye gerek yok,
             cunku ArrayList'ler eleman sayisinda "flexible" dirlar.

         2) Array'lerin icine "primitive" ve "referance" lar konulabilir.
            ArrayList'lerin icine ise sadece "non-primitive" ler konulur.

         3) Array'ler super fast, cok hizli ve mwmory'i cok az kullanir.
            Note: Eleman sayisi kesin belli olan coklu datalari depolamak icin Array kullaniriz.
                  Ama eleman sayisi degisken olan coklu datalar icin Array riskini almayin.


     */


    public static void main(String[] args) {

        // ArrayList nasil olusturulur?
        // 1. yol;
        ArrayList<Integer> ages=new ArrayList<Integer>();

        // 2. yol;
        ArrayList<Integer> heights= new ArrayList<>();  // daha ozel bir tanimlama

        // 3. yol;
        List<Integer> nums= new ArrayList<>();  // daha genel tanimlama


        // ArrayList'ler nasil yazdirirlir?
        System.out.println(nums);  // []

        // ArrayList'lere nasil eleman eklenir?
        // add() her zaman elemani en sona ekler (insertion order)
        nums.add(21);
        nums.add(18);
        nums.add(20);
        System.out.println(nums); // [21, 18, 20]

        nums.add(1,50);
        System.out.println(nums); // [21, 50, 18, 20]

        List<Integer> prices= new ArrayList<>();
        prices.add(23);
        prices.add(185);

        nums.addAll(prices);
        System.out.println(nums);   // [21, 50, 18, 20, 23, 185]
        System.out.println(prices); // [23, 185]

        nums.addAll(2,prices);
        System.out.println(nums);   // [21, 50, 23, 185, 18, 20, 23, 185]


        // ArraList'lerin eleman sayisi nasil bulunur? (size())
        int elemanSayisi=nums.size();
        System.out.println(elemanSayisi);  // 8


        // ArrayList'lerde herhangi bir eleman nasil secilir?
        // get() methodu istenen bir index'teki elemani verir
        int el1= nums.get(3);
        System.out.println(el1);  // 185


        // ArraList'in bos olup olmadigini nasil anlariz?
        boolean bos1= nums.isEmpty();
        System.out.println(bos1);  // false

        boolean bos2= ages.isEmpty();
        System.out.println(bos2);  // true


        // ArrayList'lerde  bir eleman nasil degistirilir
        nums.set(3,200);
        System.out.println(nums);  // [21, 50, 23, 200, 18, 20, 23, 185]



        // Example 1: nums ArrayList'indeki tum tek sayilari 11 artirdiktan sonra ekrana yazdiriniz

        for (int w: nums){

            if (w%2!=0){
                nums.set(nums.indexOf(w),w+11);
            }
        }
        System.out.println(nums);  // [32, 50, 34, 200, 18, 20, 34, 196]


        // ===> remove() methodu'nun icine tamsayi koyarsanixz Java onu index olarak kabul eder

        // Example 2: ArrayList'ten 34 elemaninin ilk gorunumunu siliniz
        // Note 1: Tum tamsayilar Java icin aksi soylenmedikce primitive'dir yani "int"dir
        // Note 2: "primitive"ler ArrayList'lerin elemani olamazlar
        // Note 3: "primitive" i "Wrapper Class" a cevirirseniz, non-primitive olur ve non-primitive'ler ArrayList'lerin elemani olur, index olmaz

        Integer sayi=34;
        nums.remove(sayi);
        System.out.println(nums); // [32, 50, 200, 18, 20, 34, 196]




    }
}
