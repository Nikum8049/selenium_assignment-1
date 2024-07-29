package JavaAssingment;

    abstract class Parent {

        abstract void message();
    }
    class FirstSubclass extends Parent {

        @Override
        void message() {
            System.out.println("This is first subclass");
        }
    }

    class SecondSubclass extends Parent {

        @Override
        void message() {
            System.out.println("This is second subclass");
        }
    }
    public class CreateAnAbstractClassParentWithaMethodMessage_25 {
        public static void main(String[] args) {

            Parent first = new FirstSubclass();
            first.message();

            Parent second = new SecondSubclass();
            second.message();
        }
    }


