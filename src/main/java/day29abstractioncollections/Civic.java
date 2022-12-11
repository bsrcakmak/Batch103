package day29abstractioncollections;

/*
     Abstract methodlar sadece NE yapilacagini soyler (what to do),
     NASIL yapilacagini soylemez (how to do)
     "concrete method"lar NE yapilacagi ile birlikte NASIL yapilacagini da soyler.

     "interface"ler bir yapilacak isler listesidir.(To do list)
     "child class"in ne yapacagini soylemek icin olustururuz interface'leri.

     "multiple parent interface" kulandiginizda ayni method ismi ile birden fazla method olusturursaniz
     bu method'larin return type'lari ayni olmalidir, aksi taktirde hata verir.

     "interface"lerde constructor olmadigi icin interface'lerden object olusturulmaz.
     "abstract class"larda class olduklari icin constructor vardir.
     Ama constructor'lar abstract class'larda object olusturamazlar.

     ***** Interview Sorusu: "Abstract Class ile Interface'in farklari nelerdir? *****

           1) Method;
              "Abstract Class" hem abstract hemde concrete method'lar icerebilir.
              "Interface"ler ise sadece abstract method'lar icerir.
              Ama istersek intrface'ler icinde de "default" ve "static" keyword'ler kullanarak concrete method'lar olusturabilirz.

           2) Variable;
              "Abstract Class"larda normal Class'lardaki gibi her turlu variable olusturabiliriz.
              "Interface"lerde ise variable'lar public, static ve final olmak zorundadir.

           3) Inheritance;
              "Abstract Class"lar Class olduklari icin multiple inheritance'a musaade etmezler.
              "Interface"ler ise multiple inheritance'i desteklerler.

           4) Object Creation;
              "Abstract Class" larda constructor vardir ama object olusturmada kullanilmazlar.
              "Interface" lerde ise constructor olmadigindan object olusturulamaz.


     ***** Soru : Object Oriented Programming Language prensipleri nelerdir?

              i) Inheritance
             ii) Polymorphism
            iii) Encapsulation
             iv) Abstraction
 */




public class Civic implements Engine, Ac {


    @Override
    public void run() {
        System.out.println("Civic runs well");
    }


}
