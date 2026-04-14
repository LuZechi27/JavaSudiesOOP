package heritage.sealedclass.abstractclass.exercise.Ex1;

public sealed abstract class Figure permits Triangle, Circle, Rectangle {
    private final double x;
    private final double y;

    public Figure(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public abstract double area();

    @Override
    public String toString() {
        return String.format("(%.2f , %.2f)", x, y);
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
}
