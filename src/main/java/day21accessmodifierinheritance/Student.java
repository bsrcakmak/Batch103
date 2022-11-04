package day21accessmodifierinheritance;

public class Student {

    /*
            Access Modifier
       1)public
       2)protected
       3)default (Access Modifier'i default yapmak icin access modifier yazmayiz
       4)private

       Note: Access Modifier'lari genisten dara dogru siralayiniz.
             public > protected > default > protected

       Note: Access Modifier'lari birer birer aciklayiniz.
             public olanlar her class'tan kullanilabilir
             protected olanlar baska package'lardan kullanilamaz ancak baska package'dan "child class" icinden kullanilabilir.
             default olanlar baska package'den kullanilamazlar.
             private olanlar sadece olusturulduklari class icinde kullanilabilirler.

       Note: "protected" ile "default" un farkini soyleyiniz.
              protected olanlar baska package'lerden kullanilamaz ancak baska package'de "child class" icinden kullanilabilir
              default olanlar baska package'den kullanilamazlar

       Note: Class'lar icin hangi Access Modifier'lar kullanilabilir.
             public, default kullanilir ama protected ve private kullanilamaz.

   */

    // public her class'tan kullanilabilir
    public String stdName= "Tom Hanks";

    // protected olanlar baska package'lardan kullanilamaz ancak baska package'dan "child class" icinden kullanilabilir.
    protected String address= "Miami";

    // default olanlar baska package'den kullanilamazlar. (package private)
    String email= "th@gmail.com";

    // private olanlar sadece olusturulduklari class icinde kullanilabilirler.
    private String stdId= "20206517004";




















}
