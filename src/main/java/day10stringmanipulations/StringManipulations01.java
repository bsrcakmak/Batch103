package day10stringmanipulations;

public class StringManipulations01 {
    public static void main(String[] args) {


        String a= "Java kolaydir.";

        // startsWith("kola",5) kodu ilk 5 karakterden sonraki String'e bakar ve o String'in "kola" ile baslayip baslamadigini kontrol eder.
        // "kola" ile basliyorsa "true", baslamiyorsa "false" return eder.
        boolean b=a.startsWith("va",2);

        System.out.println(b); //true==>  bu stringin 2. karakterden sonra
                               //         ne ile basladigini bulur ve karsilastirir


        // replaceFirst("a","*") bu kod String'deki ilk "a" yi "*" e cevirir
        //replace("a","*") bu kod String'deki tum "a" lari "*" e cevirir
        String c=a.replaceFirst("a","*");
        System.out.println(c);  // J*va kolaydir.


        // concat() methodu iki tane String'i birbirine yapistirmaya yarar
        // Concatenation islemi iki turlu yapilabilir; i) + ile    ii) concat() ile yapilabilir
        // Java bir islem icin method uretmisse o methodu kullanmak "best practice" dir.
        String d=a.concat(" Anladin mi?");
        System.out.println(d); // Java kolaydir. Anladin mi?


        String e="    Tom Hanks   ";
        System.out.println("trim oncesi: "+e);

        // trim() methodu bir String'in bas ve sonundaki space characterlerini siler,
        // aradaki space characterlerine dokunmaz
        String f=e.trim();
        System.out.println("trim sonrasi: "+f);


        String h= "Java";
        String i= "Java";

        // h.compareTo(i) bu kod iki tane String'i alfabetik(lexicographic) olarak karsilastirir
        // buyuk harfe duyarlididr
        // buyuk kucuk fark etmesini istemiyorsak compareIgnoreCase(0 methodu kullanilir
        //  h.compareTo(i) bu kodda h nin alfabetik sirasindan i nin alfabetik sirasi cikarilir.
        int k=h.compareTo(i);
        System.out.println(k); //0


        // a.repeat(3) bu kod "a" String'ini 3 kere art arda tekrarlar, birbirine yapistirir
        // repeat(0); empty String return eder.
        //
        // Java Document'e ulasmak icin Windows ==> ctrl e basili tutun ve istediginiz methoda tiklayin
        String n=a.repeat(0);
        System.out.println(n);





    }
}
