package day29abstractioncollections;


/*
     ArrayList’ler index kullanir ama index kullanmak eleman ekleme ve eleman silme islemlerinde bize zaman kaybettirir.
     Cunku bircok elemanin re-index edilmesi gerekir.

     - Arraylist ler index kullanir. Ancak index kullanmak eleman ekleme ve eleman silme islemlerinde bize zaman kaybetirir.
     - Cunku bir cok elemanin re-index edilmesi gerekir. Java bu problemi LinkedList olusturarak cozmustur.
     - LinkedListte ki her eleman iki bolumden olusur. Bu elemanlarin ilk bolumunde deger(data) olur, ikinci bolumunde ise pointer vardir.
     - Iki bolumden olusan farkli bir yapi oldugu icin buna "Node" denilmektedir. Dolayisiyla LinkedList ler hakkinda konusurken List kelimesi
       yerine "Node" kelimesini kullanmak yerinde olacaktir.
     - Bu yapinin en son elemaninin pointer kismi, kendisinden sonra eleman olmadigi icin "null" gosterir. Son elemana ise "Tail" denilmektedir.
     - Her pointer bir elemani gostermeketdir. Ilk bastaki elemani gosteren yapiya "Head" denilir.

    LinkedList eleman ekleme ve eleman silmede cok basarilidir.
    Bu yuzden eleman ekleme ve eleman silme islemlerini cokca yapacaginiz durumlarda LinkedList kullanmalisiniz.


    Arraylist eleman bulma islemlerinde cok basarilidir.(search)
    Linkedlist ise eleman bulma islemlerinde basarisizdir.
    - Çoğunlukla arama yapılan bir çalışmaysa ArrayList kullAnılmalıdır.
    - Cok fazla ekleme cikarma yapmak gerekirse de Linkedlist kullanilmalidir.

   */

    /*
    Class oluştururken ismine Sadece LİnkedList yazarsak java hata verir çünkü bu java'nın Class'ıdır.
 Arraylist:
 >index kullanır
    i)dezavantajı:
       bir elemanı silmek istediğinizde silinen elemandan sonraki tüm elemanlar için Reındex yapmanız gerekir.
       bir eleman eklemek istediğinizde eklenen elemandan sonraki tüm elemanlar için Reındex yapmanız gerekir.
    ii)avantajı:ındex kullanmak adres gibidir java direk adrese gider.
       --Search(Eleman bulma) işlemlerinde çok başarılıdır,
        Ör:sözlük yapacaksak ArrayList kullanmalıyız
 >>Bu dezavantajları gidermek için Java LinkedList oluşturmuş.
   LinkedList eleman ekleme ve çıkarma işlemlerinde başarılı.
   linked listte her Nod iki bölümden oluşur:
      ilk bölüme data konulduğu için bunlara data bölümü derler.
      ikinci bölümler ise pointer bölümleri, tüm pointerler bir sonraki bölümü gösterir.
      vagon gibi bir yapı oluştu hepsi bir sonrakine(linked) bağlı.
      iki bölümden oluşan bu yapının ismi: Nod.
      bu yapının en son Nod'un pointer kısmı null gösterir.
      en son Nod'un özel ismi: Tail.
      ilk Nod'un ismi: Head, içinde sadece pointer kısmı var data kısmı yok.
      --Biz LinkedListte bir elemanı silince(elemanı silmek için elemanın sağ ve solundaki okları sileriz)
        Javanın çöp toplayıcısı garbage collector pointer ile işaret edilmeyen Nod'u imha eder.
        Sonra Java silinen Nod'un iki tarafını birbirine bağlamak için yeni bir pointer oluşturur.
      --Eleman ekleme: iki nod arasındaki pointer'ı silip, eklemek istediğimiz Null'u diğer iki
        Nod'a bağlayan iki yeni pointer oluştururuz.
      +Ne zaman çokça ekleme ve çıkarma yaparız Ör: müzeye giren çıkan insanlar.
      +Arraylist kullanınca çokça ekleme ve çıkarma yaptığımız zaman application donar bu yüzden az gelişmiş ülkelerin applicationları donar detayları düşünmeden application yazarlar.
    i) dezavantajı: ındex olmadığı için adres yok.Bir elemanı bulurken sırayla o elemana kadar olan tüm elemanlara
       senden sonrakı şu mu? diye sorar ve o elmanı bulana kadar eleman eleman ilerler.
       --Search(Eleman bulma) işlemlerinde başarısızdır.

 */

import java.util.LinkedList;

public class LinkedList01 {

    /*
        1) LinkedList'deki her eleman iki bolumden olusur. i)Data  ii)Pointer
        2) LinkedList'deki herbir eleman "Node" olarak adlandirilir.
        3) LinkedList'ler eleman ekleme ve eleman silme islemlerinde cok basarilidirlar.
        4) LinkedList'ler eleman arama islemlerinde basarisizdirlar.
        5) 3. ve 4. maddelerden dolayi eleman ekleme ve eleman silme islemlerinin cok yapilacagi durumlarda LinkedList kullanilmalidir.
        6) ArrayList'ler index kullanir, LinkedList'ler ise index kullanmaz.
        7) index kullanmak eleman bulma islemlerinde cok basarilidir.
           Bu yuzden eleman bulma islemlerini cok yapacaksaniz ArrayList kullanmalisiniz.

     */

    public static void main(String[] args) {

       LinkedList<String> visitors = new LinkedList<>();
       visitors.add("Tom");
       visitors.add("Hanks");
       visitors.add("Tom Hanks");
       visitors.add("Brad");
       visitors.add("Pitt");
       visitors.add("Brad Pitt");
       visitors.add(2,"Angelina Jolie");
       visitors.add("Brad Pitt");
        visitors.add("Tom Hanks");

        // visitors.add(2,"Angelina Julie");//normalde bu kod index kullanmiyor.
        // Java developer'lar rahat etsinler diye "buraya yazilan index'de nereye koymasini gerektigini gosteriyor.

        System.out.println(visitors);


        // LinkedList'ler ekleme vesilme islemlerinde cok basarili olduklarindan ekleme ve silme ile alakali cok fazla method icerir.
        visitors.addLast("Ajda Pekkan");
        visitors.addFirst("Cuneyt Arkin");
        System.out.println(visitors);

        visitors.removeLast();
        System.out.println(visitors);
        visitors.removeFirst();
        System.out.println(visitors);

        visitors.removeFirstOccurrence("Tom Hanks");  // Bu ismin ilk gorunumunu sil
        System.out.println(visitors);

        visitors.removeLastOccurrence("Brad Pitt");  // Bu ismin son gorunumunu siler
        System.out.println(visitors);


        /*
           Pops an element from the stack represented by this list.
           In other words, removes and returns the first element of this list.
           This method is equivalent to removeFirst().
           Throws:
           NoSuchElementException – if this list is empty (Eger List bossa)
         */
        String firstEl = visitors.pop(); // Cut + Paste ===> Ctrl + x
        System.out.println(firstEl); // Listedeki ilk elemani verir
        System.out.println(visitors); // Burda da pop ile verdigi elemani silmis olur.


        LinkedList<String> myList = new LinkedList<>();  // Bos LinkedList

        myList.pop();  // NoSuchElementException atti cunku LinkedList bos


    }



}
