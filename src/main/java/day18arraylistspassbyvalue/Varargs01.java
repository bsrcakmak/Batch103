package day18arraylistspassbyvalue;

public class Varargs01 {    // variable argument


    /*
       1) Farkli sayilardaki parametrelerle calisabilen bir method olusturmak
          isterseniz "varargs" kullanmalisiniz
       2) "varargs" arka tarafta "array" kullanir, bu yuzden "varargs"larla calisirken
          "Array" lerle calisiyormus gibi davranabilirsiniz
       3) "varargs" olusturmak icin "<data type>...    <varargs ismi>"
           veya "<data type>     ...<varargs ismi>"
       4) Bir method'da "varargs" in yaninda baska bir parametre kullanilabilir mi?
          "varargs" en sonda olmak sartiyla kullanilabilir.
       5) Bir method'da birden fazla "varargs" kullanilabilir mi?
          "varargs" en sonda olmak zorunda oldugundan birden fazla
          kullanirsaniz en az biri en sonda olmayacaktir. Bu da 4. kural ile celisir.

     */


    public static void main(String[] args) {


//        // Iki sayinin toplamini return eden bir method
//        add(3,5);
//        System.out.println(add(3,5));


        int r1=add(2,3);
        System.out.println(r1); // 5

         int r2=add(2,3,4);
        System.out.println(r2); // 9

         int r3=add(2,3,4,5,6,7,8,9);
        System.out.println(r3); // 44




    }


//    public static int add(int x, int y){
//
//        return x+y;
//    }
//
//    public static int add(int a, int b, int c){
//
//        return a+b+c;
//    }
//
//    public static int add(int a, int b, int c, int d){
//
//        return a+b+c+d;
//    }


    // Istedigimiz kadar sayiyi toplayabilecegimiz bir method olusturalim

    public static int add(int... a){

        int sum=0;

        for (int w:a){
            sum=sum+w;
        }

        return sum;

    }









}
