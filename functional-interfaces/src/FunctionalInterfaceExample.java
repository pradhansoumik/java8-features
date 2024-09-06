public class FunctionalInterfaceExample implements Doable{
    public static void main(String[] args) {
        FunctionalInterfaceExample fie = new FunctionalInterfaceExample();
        fie.say("Functional Interface Example");

        fie.defaultMethod();
        System.out.println(fie.hashCode());

        fie.doIt();

        /**
         * it is working as it has implemented child interface Sayable, but
         * in case of Doable it will give CTE below.
         */
        /*Sayable obj = msg -> {
            String s = msg +" lambda test";
            return s;
        };*/
        //System.out.println(obj.say("Issue"));
        /**
         * compilation error.
         * Multiple non-overriding abstract methods found in interface Doable.
         * (A functional interface can extend another interface
         * only when it does not have any abstract method),
         * as it is creating ambiguity of implementing multiple Abstract methods.
         */
        //Doable doable = ()->{System.out.println("lambda test extends");};
    }

    @Override
    public String say(String msg) {
        return msg;
    }

    @Override
    public int hashCode() {
        System.out.print("PRINTING HASHCODE: ");
        return super.hashCode();
    }

    @Override
    public void doIt() {
        System.out.println("INSIDE doIt METHOD()");
    }
    @Override
    public void defaultMethod() {
        System.out.println("HI THERE! OVERRIDE DEFAULT METHOD()");
    }
}