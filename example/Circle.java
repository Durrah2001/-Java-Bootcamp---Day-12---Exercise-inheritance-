package org.example;

public class Circle extends Shape {

    private double radius;


    //Constructors

    public Circle() {

        this.radius = 1.0;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {

        super(color, filled);
        this.radius = radius;
    }



    //Setter
    public void setRadius(double radius){
        this.radius = radius;
    }

    //Getter
    public double getRadius(){
        return radius;
    }



    //Additional methods

    public double getArea(){

        return ((radius * radius) * 3.14);
    }

    public double getPerimeter(){

        return (2 * radius * 3.14);
    }


    @Override
    public String toString(){
        return String.format("A Circle with radius = %f, color of %s, and %s ", radius, super.getColor(), (super.getFilled() ? "filled" : "not filled"));
    }






}
