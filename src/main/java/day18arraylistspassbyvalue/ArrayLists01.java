package day18arraylistspassbyvalue;

import java.util.ArrayList;
import java.util.List;

public class ArrayLists01 {
    public static void main(String[] args) {

        // Example 1: Bir Integer ArrayList'teki 7 haric
        //            tum elemanlari 2 arttiriniz

        List<Integer> ages= new ArrayList<>();

        ages.add(12);
        ages.add(7);
        ages.add(21);
        ages.add(78);
        ages.add(9);

        for (Integer w:ages){

            if (w==7){
                continue;
            }else {

               // w=w+2;  ==> List'ler boyle update edilemezler
                ages.set(ages.indexOf(w), w+2);
            }
        }

        System.out.println(ages); // [14, 7, 23, 80, 11]



        // Example 2: Size verilen ArrayList'te 8(inclusive) ve 8 den onceki tum
        //            elemanlari iki katina cikariniz

        List<Integer> nums= new ArrayList<>();

        nums.add(12);
        nums.add(7);
        nums.add(21);
        nums.add(8);
        nums.add(9);

        for (Integer w: nums){

            nums.set(nums.indexOf(w), w*2); // loop u kiran sayiyi update etmemiz gerekirse
                                            // bunu kontrolun ustune yazariz (8 inclusive oldugundan)

            if (w==8){
                break;
            }

            // nums.set(nums.indexOf(w), w*2);  ==> buraya koysaydik 8 de degismezdi
        }

        System.out.println(nums); // [24, 14, 42, 16, 9]











    }
}
