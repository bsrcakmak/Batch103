package day03_typeCastingWrapperScanner;

public class TypeCasting01 {

    // Type Casting: Bir numeric data type'ini diger numeric data type'ina cevirmek demektir.
    //               byte < short < int < long < float < double

    // Note:


    public static void main(String[] args) {

        //Auto widening;
        byte age=23;
        int newAge=age;

        //Explicit Narrowing
        long population=1234;
        int newPopulation=(int)population;


        // Example-1: short'u double'a ceviren kodu yaziniz
        short x=34;
        double y=x;


        // Example-2: float'ı byte yapan kodu yaziniz'
        float z=67.3f;
        byte t=(byte)z;

        System.out.println(t);  //67 ==> Java ondalik sayiyi tam sayiya cevirirken yuvarlama islemi yapmaz
                                //       Java ondalik sayiyi tam sayiya cevirirken ondalik kismini siler.


        int number=515;
        byte newNumber=(byte)number;
        System.out.println(newNumber); // 3 ==> (515 % 256=3) (byte ta toplam 256 sayı olduğu için ona böler kalanı verir)

        int num=510;
        byte newNum=(byte)num;
        System.out.println(newNum); // -2 ==>





    }



}
