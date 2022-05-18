package oopsconcept;

public class MainClass {
    public static void main(String[] args) {
        BMW bmw= new BMW();
        bmw.setPrice(800000);
        System.out.println("Price of BMW 1000RR : "+bmw.getPrice());
        bmw.setCC("1000CC");
        System.out.println("CC of BMW Bike : "+bmw.getCC());
        bmw.bikeWeight();
        bmw.maxSpeed();
        Husqvarna husqvarna= new Husqvarna(260000,250);
        husqvarna.bikeWeight();
        husqvarna.maxSpeed();

    }
}
