package day24statickeywordencapsulation;

public class CarRunner {

    public static void main(String[] args) {

        // 1) "static keyword"; class'a baglanmis class elemanlaridir, static variable ve static method class'a baglidir.
        // 2) static class elemanlari butun objelerin ortak elemanidir,"gokteki ay gibi".
        // 3) staticler uzerinde yapilan her degisiklik butun objeleri etkiler.
        // 4) static class elemanlarina class uzerinden ulasilir,
        //    objeler staticlere ulasmak icin kullanilmaz, kullanirsan hata vermez ama tavsiye edilmez.

        Car car1 = new Car();
        Car car2 = new Car();
        Car car3 = new Car();
        Car car4 = new Car();

        // static variable'lara objeleri kullanarak ulasmak mumkun ama tavsiye edilmez.
        System.out.println(car1.counter);  // 4
        // static variable'lara class ismi kullanarak ulasilmalidir.
        System.out.println(Car.counter);
        System.out.println(car1.price);  // 20001

        System.out.println(Car.counter);
        System.out.println(car2.price);

        System.out.println(Car.counter);
        System.out.println(car3.price);

        System.out.println(Car.counter);
        System.out.println(car4.price);
    }
}
