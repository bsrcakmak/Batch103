package day22inheritancepolymorphism;

public class HondaAccort extends Honda{

    /*
        1) Siz Class olusturdugunuzda Java otomatik olarak size gorunmez bir constructor verir,
           cunku Java Class'in bir kalip oldugunu ve Object olusturmaj icin yapildigini ve
           Object olusturmak icin constructor'in sart oldugunu bilir
        2) Java'nin otomatik olarak olusturdugu bu gorunmez constructor'a "default constructor" denir.
        3) Siz kendiniz herhangi bir constructor olusturdugunuzda Java "default constructor" i siler.
        4) Bir Class'ta birden fazla constuctor olabilir. Fakat bu constructor'larin parametreleri farkli olmalidir.
        5) "this"  keyword "Bu Class" anlamindadir. "this.price" demek bu Class'taki "price" isimli variable demektir.
           "this.price" syntax'i constructor'larin icinde kullanilir.

     */

    public int price;
    public int year;
    public String make;
    public String model;


    public HondaAccort(){      // Gorunmez Constructor'in gorunur hali
                               // Kritersiz, sartsiz constructor

    }

    public HondaAccort(int price){

        this.price= price;

    }


    public HondaAccort(int price, int year){

        this.price= price;
        this.year= year;
        System.out.println("HondaAccond Constructor");

    }


    public HondaAccort(int price, int year, String make, String model){

        this.price= price;
        this.year= year;
        this.make= make;
        this.model= model;

    }









}
