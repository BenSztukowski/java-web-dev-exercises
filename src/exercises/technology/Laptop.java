package exercises.technology;

public class Laptop extends Computer{
    private final int uniqueId;

    public Laptop() {
        uniqueId = generateId();
    }

    @Override
    public int generateId() {
        return super.generateId();
    }

    @Override
    public int getId() {
        return uniqueId;
    }
}
