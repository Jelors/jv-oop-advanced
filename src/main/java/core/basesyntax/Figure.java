package core.basesyntax;

public abstract class Figure {
    private String color;

    public abstract void draw();

    public abstract double getArea();

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
} 
