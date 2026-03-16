package ConceitosIniciaisOOP.Exercicios.ExercicioUML;

public class Player {
    private final String name;
    private final int number;
    private final String position;
    private final boolean isFielded;

    public Player(String name, int number, String position, boolean isFielded) {
        this.name = name;
        this. number = number;
        this.position = position;
        this.isFielded = isFielded;
    }

    public String getStateAsString() {
        return "Nome: " + name +
                "\nNúmero: " + number +
                "\nPosição: " + position +
                "\nEsta em campo: " + isFielded;
    }
}
