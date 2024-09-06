@FunctionalInterface
public interface Sayable {
    String say(String msg);

    int hashCode();
    String toString();
    boolean equals(Object obj);

    default void defaultMethod(){
        System.out.println("Hi There! INSIDE DEFAULT METHOD");
    }
}
