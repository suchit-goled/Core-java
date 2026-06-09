package inner;

public interface Spacecraft {

    int people = 10;

    void launch();

    default void communicationStatus() {
        System.out.println("Communication Active");
    }
}
