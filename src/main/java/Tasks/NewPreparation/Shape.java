package Tasks.NewPreparation;

// определение интерфейса Shape
interface Shapes {
    public double getArea();
    public double getPerimeter();
}

// реализация интерфейса Shape для круга
class Circle implements Shapes {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}

// реализация интерфейса Shape для прямоугольника
class Rectangle implements Shapes {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getArea() {
        return length * width;
    }

    public double getPerimeter() {
        return 2 * (length + width);
    }
}

// использование интерфейса Shape в основном классе
class Main {
    public static void main(String[] args) {
        Shapes circle = new Circle(5);
        Shapes rectangle = new Rectangle(4, 6);

        System.out.println("Area of circle: " + circle.getArea());
        System.out.println("Perimeter of circle: " + circle.getPerimeter());

        System.out.println("Area of rectangle: " + rectangle.getArea());
        System.out.println("Perimeter of rectangle: " + rectangle.getPerimeter());
    }
}






