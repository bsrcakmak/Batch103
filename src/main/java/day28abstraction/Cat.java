package day28abstraction;

public class Cat extends Mammal{

    /*
        Bir method "parent class"ta abstract ise;
        "child class" o method'u "override" edip kullanmak zorundadir.
        Bu yuzden herhangi bir fonksiyonu "child class" icin mecburi yapmak isterseniz
        o method'u abstract yapmalisiniz


     */
    @Override
    public void eat() {
        System.out.println("Cats eat");
    }

    @Override
    public void move() {
        System.out.println("Cats move");
    }
}
