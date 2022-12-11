package day03_typeCastingWrapperScanner;

public class WrapperClass01 {

    public static void main(String[] args) {

     /*
         Note: Java primitive lere method'lar ekleyerek yeni bir yapi olusturdu
               bu yapiya "Wrapper Class" denir

              Primitive         Wrapper Class (Non-Primitive)
               byte      ==>     Byte
               short     ==>     Short
               ** int       ==>  Integer
               long      ==>     Long
               float     ==>     Float
               double    ==>     Double
               boolean   ==>     Boolean
               ** char      ==>  Character
      */

        byte primitiveByte=12;
        // primitiveByte yazip nokta koydugumuzda hic method göremeyiz,
        // cunku primitive'ler method icermez sadece deger icerir

        Byte wrapperByte=12;
        // wrapperByte yazip nokta koydugumuzda bircok method goruruz
        // cunku wrapper'lar method icerir

        // Example 1: byte data tipinin en kucuk ve en buyuk degerlerini ekrana yazdiriniz.

        System.out.println(Byte.MIN_VALUE);  // -128
        System.out.println(Byte.MAX_VALUE);  // 127


        System.out.println(Short.MAX_VALUE);
        System.out.println(Short.MIN_VALUE);

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

        System.out.println(Long.MAX_VALUE);
        System.out.println(Long.MIN_VALUE);


        // "primitive"ler nasil "wrapper"lara cevrilir(Autoboxing)
        float f1=13.99f;
        Float wrapperF1=f1;

        // "wrapper"lar nasil "primitive"lere cevrilir(Unboxing)
            Character w1= 's';
            char primitiveW1= w1;

        //Note: Autoboxing ve Unboxing Java tarafindan otomatik olarak yapilir
    }
}
