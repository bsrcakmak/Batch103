package day32maps;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Iterators02 {
    public static void main(String[] args) {

        List<String> myList = new ArrayList<>();
        myList.add("Z");
        myList.add("K");
        myList.add("A");
        myList.add("J");
        myList.add("M");

        // Example1: Iterators kullanarak List elemanlarini tersten konsola yazdiriniz.

        ListIterator<String> itr = myList.listIterator();

        // HasNext() method'u pointer dan sonra eleman varsa "true", yoksa "false" return eder
        // next() method'u pointer'i bir sonraki elemanin onune koyar ve ustunden atladigi elemani return eder
        while (itr.hasNext()){
            itr.next();
        }

        // hasPrevious() method'u pointer dan once eleman varsa "true", yoksa "false" return eder.
        // previous() method'u pointeri bir onceki elemanin sonuna koyar ve ustunden atladigi elemani return eder
        while (itr.hasPrevious()){
            String el = itr.previous();
            System.out.println(el+" ");
        }

        // Exampole 2: List'deki tum elemanlari siliniz.

        while (itr.hasNext()){
            itr.next();
            itr.remove();
        }
        System.out.print(myList);

        /*
            1) ListIterator da i)hasNext() ii)next() iii)set() iv)hasPrevious() v)previous vi)remove() method'lari vardir
            2) Iterator'da i)hasNext(0 ii)next() iii)remove() method'lari vardir
         */

        List<String> yourList = new ArrayList<>();
        yourList.add("Z");
        yourList.add("K");
        yourList.add("A");
        yourList.add("J");
        yourList.add("M");

        Iterator<String> iterator = yourList.iterator();

        //Eger iki tarafli haraket etmek istemiyorsan Iterator
        //Eger list elemanlarinin degistirilmesini istemiyorsak Iter
        //Eger sadece silmek istemiyorsani Iterator
        while (iterator.hasNext()){
            String el= iterator.next();
            System.out.print(el);

        }





    }
}
