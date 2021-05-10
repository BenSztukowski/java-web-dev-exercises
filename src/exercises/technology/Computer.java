package exercises.technology;

public class Computer extends AbstractEntity {
    public static int Id= 0;
    private int uniqueId;

    public Computer() {
        uniqueId = Id;
        Id ++;
    }

    @Override
    public int generateId() {
        return Id;
    }

    public int getId() {
        return Id;
    }
}
