package oopsconcept;
public class Husqvarna extends Bike {
    private int price;
    private int CC;
    Husqvarna(int price,int CC){
        System.out.println("bike price is"+price);
        System.out.println("bike cc is "+CC);
    }

    @Override
    void bikeWeight() {
        System.out.println("Husqvarna weight is about 200kg");

    }

    @Override
    void maxSpeed() {
        System.out.println("good night");

    }
}
