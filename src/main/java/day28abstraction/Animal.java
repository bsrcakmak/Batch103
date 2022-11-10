package day28abstraction;

public abstract class Animal {

    // body'si olmayan method'lar "abstract method" olarak adlandirilir.
    // Bir method'u abastract yapmak icin;
    //    1) method body silinir ve
    //    2) access modifier ile return type arasina abstract yazilir
    // abstract method'lar abstrack class icinde olmalidir.
    // bunun icinde access modifier ile class ifadesinin arasina abstract yazilir
    public abstract void eat();

    // "abstract class" larda hem "abstract"(soyut) method,
    // hemde "concrete"(non-abstract)(somut) method kullanilabilir.
    public void drink(){
        System.out.println("Animals drink");
    }

    public abstract void move();



}
