package org.example;

public class Rectangle extends Shape{

    private double width;
    private double length;


    //Constructors

    public Rectangle(){
        this.width = 1.0;
        this.length = 1.0;
    }

    public Rectangle(double width, double length){
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length, String color, boolean filled){

        super(color, filled);
        this.width = width;
        this.length = length;
    }





    //Setters

    public void setWidth(double width){
        this.width = width;
    }

    public void setLength(double length){
        this.length = length;
    }

    //Getters

    public double getWidth(){
        return width;
    }

    public double getLength(){
        return length;
    }


    //Additional methods


    public double getArea(){

        return (length * width);
    }


    public double getPerimeter(){          // P = (L + W) × 2

        return ((length + width) * 2);
    }

    @Override
    public String toString(){

        return String.format("A Rectangle with width = %f, length = %f, color of %s, and %s ", width, length, super.getColor(), (super.getFilled() ? "filled" : "not filled") );
    }



}
