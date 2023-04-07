public class Shape {
    void area() {

    }
}
class Triangle extends Shape {
    @Override
    void area() {
        System.out.println("Triangle area : 1/2 x base x height");
    }
}
class Circle extends Shape {
    @Override
    void area() {
        System.out.println("Circle area : 22 / 7 x radius x radius");
    }
}
class Run {
    public static void main(String[] args) {
        Shape t = new Triangle();
        Shape c = new Circle();
        t.area();
        c.area();
    }
}