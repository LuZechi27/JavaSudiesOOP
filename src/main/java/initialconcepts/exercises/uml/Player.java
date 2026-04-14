package initialconcepts.exercises.uml;

public class Player {
    private String name;
    private int number;
    private String position;
    private boolean isFielded;

    public Player(String name, int number, String position, boolean isFielded) {
        this.name = name;
        this.number = number;
        this.position = position;
        this.isFielded = isFielded;
    }

    public String getStateAsString() {
        return "Nome: " + name +
                "\nNúmero: " + number +
                "\nPosição: " + position +
                "\nEsta em campo: " + isFielded;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    public String getPosition() {
        return position;
    }

    public boolean isFielded() {
        return isFielded;
    }

    public void setFielded(boolean fielded) {
        isFielded = fielded;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}
