/*Create a Class Car that would have the
following fields: carPrice and color and method
calculateSalePrice() which should be returning
a price of the car.
Create 2 sub classes: Sedan and Truck. The Truck
class has a field as weight and has its own
implementation of calculateSalePrice() method
in which returned price is calculated as
following: if weight>2000 then returned price
car should include 10% discount, otherwise 20%
discount.
The Sedan class has field as length and also
does it is own implementation of
calculateSalePrice(): if length of sedan is >20
feet then returned car price should include 5%
discount, otherwise 10% discount*/

class carTester {
    public static void main(String[] args) {
        Car truck = new Truck(15000, "black", 3000);
        System.out.println(truck.calculateSalePrice());

        Car sedan = new Sedan(7000, "white", 3);
        System.out.println(sedan.calculateSalePrice());
    }
}


public abstract class Car {
    double carPrice;
    String color;

    Car(double carPrice, String color) {
        this.carPrice = carPrice;
        this.color = color;
    }

    abstract double calculateSalePrice();
}

class Truck extends Car {
    double weight;

    public Truck(double carPrice, String color, double weight) {
        super(carPrice, color);
        this.weight = weight;
    }

    @Override
    double calculateSalePrice() {
        if (weight > 2000) return carPrice - (carPrice * 0.1);
        else return carPrice - (carPrice * 0.2);
    }
}

class Sedan extends Car {
    double lenght;

    public Sedan(double carPrice, String color, double lenght) {
        super(carPrice, color);
        this.lenght = lenght;
    }

    @Override
    double calculateSalePrice() {
        if (lenght > 20) return carPrice - (carPrice * 0.05);
        else return carPrice - (carPrice * 0.1);
    }
}
