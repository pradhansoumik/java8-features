/**
 * A functional interface can extend another interface
 * only when it does not have any abstract method.
 * it will only give CTE when we declare @FunctionalInterface.
 * without @FunctionalInterface, it will give CTE when we implement this class &
 * try to access it though lambda expression. FYR, in FunctionalInterfaceExample class it has commented.
 */

//@FunctionalInterface
public interface Doable extends Sayable{
    void doIt();
}
