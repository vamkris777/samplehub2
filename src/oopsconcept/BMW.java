package oopsconcept;

public class BMW extends Bike{
     private int price;
    private String CC;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getCC() {
        return CC;
    }

    public void setCC(String CC) {
        this.CC = CC;
    }

    @Override
    void bikeWeight() {
        System.out.println("BMW bike is about 180kg");

    }

    @Override
    void maxSpeed() {
        System.out.println("BMW  bike speed is about 390 ");

    }
}
