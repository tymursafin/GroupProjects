class shapeTester {
    public static void main(String[] args) {
        Shape circle = new Circle();
        System.out.println(circle.calculateArea(5.5));
        System.out.println(circle.calculatePerimiter(5.5));

        Shape square = new Sqare();
        System.out.println(square.calculatePerimiter(5.5));
        System.out.println(square.calculateArea(5.5));
    }
}

public interface Shape {
    double calculateArea(double radius);

    double calculatePerimiter(double radius);
}

class Circle implements Shape {
    @Override
    public double calculateArea(double radius) {
        return Math.PI * (radius * radius);
    }

    @Override
    public double calculatePerimiter(double radius) {
        return 2 * Math.PI * radius;
    }
}

class Sqare implements Shape {
    @Override
    public double calculateArea(double sideA) {
        return sideA * sideA;
    }

    @Override
    public double calculatePerimiter(double sideA) {
        return sideA * 2 * 2;
    }
}


