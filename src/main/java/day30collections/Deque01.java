package day30collections;

import java.util.Deque;
import java.util.LinkedList;

public class Deque01 {

    /*
       Deque: Double Ended Queue manasindadir yani iki uclu Queue demektir.
       Method'lar da first ve last olarak cift ucludur.
       FIFO(First In First Out) ve LIFO(Last In First Out) beraber gerektiğinde kullanılır.
     */
    public static void main(String[] args) {

        Deque<String> furnitureTruck = new LinkedList<>();

        furnitureTruck.add("Chair");
        furnitureTruck.add("Mirror");
        furnitureTruck.add("Sofa");
        furnitureTruck.add("Bed");
        furnitureTruck.add("Bed");
        furnitureTruck.add("Bed");
        furnitureTruck.add("Dining Table");
        System.out.println(furnitureTruck); // [Chair, Mirror, Sofa, Bed, Bed, Bed, Dining Table]

        /*
           Pushes an element onto the stack represented by this deque (in other words, at the head of this deque)
           if it is possible to do so immediately without violating(sinirlandirma) capacity restrictions, throwing an IllegalStateException if no space is currently available.
           This method is equivalent to addFirst. (addFirst methoduyla ayni isi yapar)
           Throws:
             i) IllegalStateException – if the element cannot be added at this time due to capacity restrictions
            ii) ClassCastException – if the class of the specified element prevents it from being added to this deque
           iii) NullPointerException – if the specified element is null and this deque does not permit null elements
            iv) IllegalArgumentException – if some property of the specified element prevents it from being added to this deque
         */

        furnitureTruck.push("Refrigerator");
        System.out.println(furnitureTruck); // [Refrigerator, Chair, Mirror, Sofa, Bed, Bed, Bed, Dining Table]
    }
}
