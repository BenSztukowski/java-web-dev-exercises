package exercises.technology;

public class Smartphone extends Computer{
    private final int uniqueId;

    public Smartphone() {
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
