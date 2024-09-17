import java.util.function.Consumer;
import java.util.function.Function;

/**
 * ClassName::instanceMethodName
 * The first parameter of the functional interface is treated as the instance (receiver),
 * and the method parameters are treated as the rest.
 */
public class InstanceMethodOfAnArbitraryObject {

    public void testMethod(){
        System.out.println("Instance Method Of An Arbitrary Object!");
    }

    public static void main(String[] args) {
        ArbitraryClass arbitraryClassObj = InstanceMethodOfAnArbitraryObject::testMethod;
        arbitraryClassObj.testMethod(new InstanceMethodOfAnArbitraryObject());
    }
}
