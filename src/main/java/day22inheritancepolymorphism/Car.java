package day22inheritancepolymorphism;

public class Car extends Vehicle{


    public String color;
    int km;


    public Car(){


    }

    public Car(String color, int km){

        super("Car");
        this.color= color;
        this.km= km;
        System.out.println("Car Constructor");

    }










    // BASKA SORUDAN

//    int y;
//    Car(){
//        super(10);
//
//    }
//
//
//    Car(int y){
//        super(y);
//        this.y=y;
//
//    }
//
//    public String toString(){
//
//        return super.x+ ":"+ this.y;
//    }








}
