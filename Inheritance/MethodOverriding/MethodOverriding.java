public class MethodOverriding {
    public static void main(String[] args) {
        Shape shape = new Shape();
        Shape rectangle = new Rectangle(5,4);
        Shape circle = new Circle(5);

        System.out.println(shape.calculateArea());
        System.out.println(rectangle.calculateArea());
        System.out.println(circle.calculateArea());
    }
}

class Shape {
    public long calculateArea() {
        return 0;
    }
}

class Rectangle extends Shape {
    public int height;
    public int width;

    Rectangle(int height, int width) {
        this.height = height;
        this.width = width;
    }

    public long calculateArea() {
        return height * width;
    }
}

class Circle extends Shape {
    public int radius;

    Circle(int radius) {
        this.radius = radius;
    }

    public long calculateArea() {
        return Math.round(Math.PI * Math.pow(radius, 2));
    }
}