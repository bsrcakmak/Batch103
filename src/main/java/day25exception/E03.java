package day25exception;

public class E03 {

    // ==> 3. Exception= NullPointerException
    public static void main(String[] args) {

        String str= "Ali";
        getNumOfChars(str); // 3


        String s= "";
        getNumOfChars(s);

        String t=null;
        getNumOfChars(t); // NullPointerException

        // Eger "length()" methodunda "null" kullanirsaniz bu exception'i alirsiniz


    }


    // Bir String'te bulunan karakterlerin sayisini bulabilmek icin bir method olusturun.

    public static void getNumOfChars(String str){

        try {
            System.out.println(str.length());
        }catch (NullPointerException e){
            System.out.println("length() methodu'nda bir problem olustu");
            e.printStackTrace();
            System.err.println("length() methodu'nda bir problem olustu");
        }

    }


}
