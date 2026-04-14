package heritage.sealedclass.abstractclass.exercise.Ex1;

import java.util.Objects;

public non-sealed class Triangle extends Figure {
    private final double heigth;
    private final double base;

    public Triangle(double x, double y, double heigth, double base) {
        super(x, y);
        this.heigth = heigth;
        this.base = base;
    }

    @Override
    public double area() {
        return (base * heigth) / 2;
    }

    @Override
    public String toString() {
        return String.format("Triangle of height %.2f and base %.2f at %s with area of %.2f", heigth, base, super.toString(), area());
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Triangle triangle = (Triangle) o;
        return Double.compare(heigth, triangle.heigth) == 0 &&
                Double.compare(base, triangle.base) == 0 &&
                Double.compare(getX(), triangle.getX()) == 0 &&
                Double.compare(getY(), triangle.getY()) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(heigth, base);
    }

    public double getHeigth() {
        return heigth;
    }

    public double getBase() {
        return base;
    }
}
