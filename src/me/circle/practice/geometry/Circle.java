package me.circle.practice.geometry;

public class Circle {
    private  double radius;

    public Circle(double radius) {
        if(radius <=0) {
            throw new IllegalArgumentException("The radius must be greater than 0");
        }else {
            this.radius = radius;
        }
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if(radius <= 0) {
            throw new IllegalArgumentException("The radius must be greater than 0");
        }else {
            this.radius = radius;
        }
    }
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }
}
