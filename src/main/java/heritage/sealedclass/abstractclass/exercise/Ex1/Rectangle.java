package heritage.sealedclass.abstractclass.exercise.Ex1;

import java.util.Objects;

public final class Rectangle extends Figure {
    private final double height;
    private final double width;

    public Rectangle(double x, double y, double height, double width) {
        super(x, y);
        this.height = height;
        this.width = width;
    }

    @Override
    public double area() {
        return height * width;
    }

    @Override
    public String toString() {
        return String.format("Rectange of height %.2f and width %.2f at %s with area %.2f", height, width, super.toString(), area());
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Rectangle rectangle = (Rectangle) o;
        return Double.compare(height, rectangle.height) == 0 &&
                Double.compare(width, rectangle.width) == 0 &&
                Double.compare(getX(), rectangle.getX()) == 0 &&
                Double.compare(getY(), rectangle.getY()) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(height, width);
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }
}
