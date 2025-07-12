package models;

import interfaces.Area;

public class IsoscelesTrapezoid extends Figure
    implements Area
{
    private double sideA;
    private double sideB;
    private double height;

    public IsoscelesTrapezoid(double sideA, double sideB, double height, String color) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.height = height;
        this.color = color;
    }

    @Override
    public double getArea() {
        return ((sideA + sideB) * height) / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isoscelesTrapezoid, "
                + "area: "
                + getArea()
                + " sq.units, "
                + "sideA: "
                + sideA
                + ","
                + " sideB: "
                + sideB
                + " height: "
                + height
                + " units, "
                + "color: "
                + color);
    }
}
