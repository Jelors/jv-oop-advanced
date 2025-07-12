package models;

import interfaces.Area;

public class RightTriangle extends Figure
        implements Area
{
    private double sideA;
    private double sideB;


    public RightTriangle(double sideA, double sideB, String color) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.color = color;
    }

    @Override
    public double getArea() {
        return (sideA * sideB)/2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: rightTriangle, "
                + "area: "
                + getArea()
                + " sq.units, "
                + "sideA: "
                + sideA
                + ","
                + " sideB: "
                + sideB
                + " units, "
                + "color: "
                + color);
    }
}
