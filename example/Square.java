package org.example;

public class Square extends Rectangle{


    //Constructors

    public Square(){
        super(1.0, 1.0);

    }

    public Square(double side){
        super(side, side);
    }

    public Square(double side,String color, boolean filled){

        super(side,side,color, filled);



    }


    //Setter

    public void setSide(double side){
        setWidth(side);
        setLength(side);
    }

    //Getter

    public double getSide(){
        return getLength();
    }


   //Additional methods

    @Override
    public double getArea(){

        return getSide() * getSide();
    }

    @Override
    public double getPerimeter(){

        double v = 4 * getSide();
        return v;
    }



    @Override
    public String toString(){
        return String.format("A Square with side = %f, color of %s, and %s ", getSide(), super.getColor(),  (super.getFilled() ? "filled" : "not filled"));
    }












}
