package models;

import interfaces.Area;

public class Circle extends Figure
        implements Area
{
    private double radius;

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    @Override
    public double getArea() {
        return 2 * Math.PI * radius;
    }

    @Override
    public void draw() {
        System.out.println("Figure: circle, "
                + "area: "
                + getArea()
                + " sq.units, "
                + "radius: "
                + radius
                + " units, "
                + "color: "
                + color);
    }
}
