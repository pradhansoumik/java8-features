@FunctionalInterface
public interface NewFunctionalInterfaceExample {
    //SAM (Single Abstract Method)
    void doTest();

    //we can add inherited method from Object class
    String toString();
    int hashCode();

    //void methodNotAllowed();
}
