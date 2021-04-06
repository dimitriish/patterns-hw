package person;

public class Eye {
    private final String color;

    public Eye(final String color) {
        this.color = color;
    }

    public final String toString() {
        return "Глаза:\t\t" + color;
    }
}
