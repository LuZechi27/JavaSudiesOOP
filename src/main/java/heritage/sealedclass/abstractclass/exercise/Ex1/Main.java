package heritage.sealedclass.abstractclass.exercise.Ex1;

public class Main {
    static void main() {
        Figure[] figures = new Figure[100];

        for (int i = 0; i < 50; i++) {
            figures[i] = new Circle(i + 1, i + 1, i + 1);
            figures[50 + i] = new Rectangle(i + 1, i + 1, i + 1, i + 1);
        }

        double totalArea = 0;

        for (Figure figure : figures) {
            totalArea += figure.area();
        }

        System.out.printf("%.2f%n", totalArea);

        for (Figure figure : figures) {
            System.out.println(figure);
        }
    }
}
