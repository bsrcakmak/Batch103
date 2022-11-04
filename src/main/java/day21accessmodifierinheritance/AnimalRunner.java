package day21accessmodifierinheritance;

public class AnimalRunner {

    /*
         1) "Inheritance" sayesinda
               i) Code tekraralarindan kurtuluruz
              ii) Code tamiri(maintanence) kolay olur
             iii) Child Class'lari daha atomik yapmis oluruz

          2) Bir Class'ı başka bir class'ın Child Class'ı yapmak için
             "extends" keyword kullanılır. ilk yazılan Class Child, ikinci
             yazılan Class parent olur.

         3) Child Class object'leri Parent Class'dan method ve variable'ları kullanabilirler.

         4) Parent Class object'leri Child Class'dan methodv e variable'ları kullanamazlar

         5) Object Class her Class'ın Parent'ıdır.
            Java'da Object Class hariç her class'ın parent'ı vardır
            Java'da parent'ı olmayan tek class Object Class'dır.

         6) "private" method ve variable'lar Child Class'lar tarafindan kullanilamaz.(private'larda inheritance olmaz)
            "protected" method ve variable'lar Child Class'lar tarafindan kullanilabilir. (inherit edilebilir)
            "default" method ve variable'lar ayni package'deki Child Class'lar tarafindan kullanilabilir.
            "public" method ve variable'lar Child Class'lar tarafindan kullanilabilir.
             Note: "Child Class'lar tarafindan kullanilabilir" olmak "inherit" edilebilir demektir.

          7) 4 tip inheritance vardir.
               i) Multilevel Inheritance: Java bunu kabul eder.
              ii) Hierarchical Inhertitance: Bir parent icin coklu child, Java bunu kabul eder.
             iii) Multiple Inheritance: Bir Child'a coklu parent, Java bunu desteklemez.( Java doesn't support Multiple Inheritance0
              iv) Single Inheritance: Bir Child Class icin bir Parent Class demektir, Java bunu destekler.

     */
    public static void main(String[] args) {

     Cat c1= new Cat();

     c1.eat();
     c1.drink();
     c1.meow();

        System.out.println();

     Dog d1= new Dog();

     d1.bark();
     d1.drink();
     d1.eat();








    }
}
