package org.example;

public class Shape {

    private String color;
    private boolean filled;

    //Constructors

    public Shape(){
        this.color = "green";
        this.filled = true;
    }

    public Shape(String color, boolean filled){
        this.color = color;
        this.filled = filled;
    }



    //Setters

    public void setColor(String color){
        this.color = color;
    }

    public void setFilled(boolean filled){
        this.filled = filled;
    }

    //Getters

    public String getColor(){
        return color;
    }

    public boolean getFilled(){
        return filled;
    }



    public String toString(){
        return String.format("A Shape with color of %s and %s " ,color, (filled ? "filled" : "not filled"));
    }










}
