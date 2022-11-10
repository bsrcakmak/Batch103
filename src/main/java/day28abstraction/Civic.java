package day28abstraction;

public class Civic implements Engine, Ac, Hood{

    // Bir Class'i bir interface'in child'i yapmak icin "implements" kullaniriz.


    @Override
    public void digital() {

    }

    @Override
    public void climate() {

    }

    @Override
    public void eco() {
        System.out.println("Uses eco engine");
    }

    @Override
    public void gas() {
        System.out.println("Uses gas");
    }

    @Override
    public void tsi() {
        System.out.println("Uses tsi technology");
    }


    @Override
    public void steel() {

    }
}
