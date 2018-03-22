package com.github.javapedia.objects.circle;

public class Circle {

    //obiekt jako pole w innym obiekcie
    private Point center;
    private double radius;

    public Circle(Point center, double radius) {
        this.center = center;
        this.radius = radius;
    }

    public double getField() {
        return Math.PI + Math.pow(radius, 2);
    }

    public double[] getCenterAsArray() {
        return center.getCoordinates();
    }

    public double getCenterXCoordinate() {
        return center.getX();
    }

    public double getCenterYCoordinate() {
        return center.getY();
    }

    public Point getCenterAsClass() {
        return center;
    }

    public double getDiameter() {
        return 2 * Math.PI * radius;
    }
}
