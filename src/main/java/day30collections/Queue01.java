package day30collections;

import java.util.LinkedList;
import java.util.Queue;

public class Queue01 {

    /*
       Ilk giren elemani ilk kullanmaniz(Firdt In First Out ==> FIFO) gerektiginde Queue en iyi secimdir.
       Queue da elemanlar "insertion order" a gore dizilirler.
       Queue da peek(), poll(), element(), remove() gibi ilk elemani ilgilendiren bircok method vardir
       offer() method'u capasity kontrolu yapildiktan sonra eleman ekleme durumlarinda kullanilir.


     */
    public static void main(String[] args) {

        Queue<String> wareHouse = new LinkedList<>();

        wareHouse.add("Milk");
        wareHouse.add("Meat");
        wareHouse.add("Bread");
        wareHouse.add("Honey");
        wareHouse.add("Tomatoes");

        System.out.println(wareHouse); // [Milk, Meat, Bread, Honey, Tomatoes]

        /*
        Inserts the specified element into this queue if it is possible to do so immediately without violating capacity restrictions.
        When using a capacity-restricted queue, this method is generally preferable to add, which can fail to insert an element only by throwing an exception.
        Returns: true if the element was added to this queue, else false
        Throws:
          i) ClassCastException – if the class of the specified element prevents it from being added to this queue
         ii) NullPointerException – if the specified element is null and this queue does not permit null elements
        iii) IllegalArgumentException – if some property of this element prevents it from being added to this queue
         */


        /*
         Kapasite kısıtlamalarını ihlal etmeden hemen yapmak mümkünse, belirtilen öğeyi bu kuyruğa ekler.
         Kapasite kısıtlamalı bir kuyruk kullanırken, bu yöntemin eklenmesi genellikle tercih edilir, bu yöntem yalnızca bir istisna atarak bir öğe eklemede başarısız olabilir.
         Döndürür: öğe bu kuyruğa eklendiyse true, aksi takdirde false
         Atar:
            i) ClassCastException – belirtilen öğenin sınıfı, onun bu kuyruğa eklenmesini engelliyorsa
           ii) NullPointerException – belirtilen öğe boşsa ve bu sıra boş öğelere izin vermiyorsa
          iii) IllegalArgumentException – bu öğenin bazı özellikleri onun bu kuyruğa eklenmesini engelliyorsa
         */

        wareHouse.offer("Potatoes"); // Kapasite uygunsa ekleme yapar.
        System.out.println(wareHouse);  // [Milk, Meat, Bread, Honey, Tomatoes, Potatoes]




    }
}
