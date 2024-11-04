package org.example;

public class Main {
    public static void main(String[] args) {

        Shape s1 = new Shape();
        Shape s2 = new Shape("pink", false);

        System.out.println("** Shapes **");
        System.out.println("Shape 1 information: " + s1.toString());
        System.out.println("Shape 1 information: " + s2.toString());

        System.out.println("----------------------------");

        Circle c1 = new Circle();
        Circle c2 = new Circle(2.2);
        Circle c3 = new Circle(8.0, "White", false);

        System.out.println("** Circles **");
        System.out.println("Circle 1 information: " + c1);
        System.out.println("Circle 2 information: " + c2);
        System.out.println("Circle 3 information: " + c3 +"\n");

        System.out.println("Circle.3 Area = " + c3.getArea());
        System.out.println("Circle.3 Perimeter = " + c3.getPerimeter());

        System.out.println("----------------------------");

        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle(9.5, 3.0);
        Rectangle r3 = new Rectangle(2.5, 6.0, "Blue", true);

        System.out.println("** Rectangles **");
        System.out.println("Rectangle 1 information: " + r1);
        System.out.println("Rectangle 2 information: " + r2);
        System.out.println("Rectangle 3 information: " + r3 +"\n");

        System.out.println("Rectangle.3 Area = " + r3.getArea());
        System.out.println("Rectangle.3 Perimeter = " + r3.getPerimeter());

        System.out.println("----------------------------");

        Square sq1 = new Square();
        Square sq2 = new Square(7.0, "Black", false);

        System.out.println("** Squares **");
        System.out.println("Square 1 information: " + sq1);
        System.out.println("Square 2 information: " + sq2 +"\n");

        System.out.println("Square.2 Area = " + sq2.getArea());
        System.out.println("Square.2 Perimeter = " + sq2.getPerimeter());

        System.out.println("----------------------------");




















    }
}