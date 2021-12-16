package com.company;

public class Circle {
    private double radius = 1;
    public Circle(double radius){
        this.radius=radius;
    }

    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius){
        this.radius=radius;
    }
    public double getArea(){
        double area= this.radius*this.radius*Math.PI;
        return area;
    }
    public double getCircumference(){
        return this.radius*2*Math.PI;
    }
    public String toString(){
        return radius + " " +   "";
    }
}
