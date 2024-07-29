package JavaAssingment;

public class MultipleCatchExample_16 {
    public static void main(String[] args) {

                try {
                    // Example code that can throw multiple types of exceptions
                    int[] numbers = {1, 2, 3};
                    int result = numbers[3]; // This will throw ArrayIndexOutOfBoundsException

                    String text = null;
                    int length = text.length(); // This will throw NullPointerException

                    int divisionResult = 10 / 0; // This will throw ArithmeticException

                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("Caught an ArrayIndexOutOfBoundsException: " + e.getMessage());

                } catch (NullPointerException e) {
                    System.out.println("Caught a NullPointerException: " + e.getMessage());

                } catch (ArithmeticException e) {
                    System.out.println("Caught an ArithmeticException: " + e.getMessage());

                } catch (Exception e) {
                    System.out.println("Caught a general Exception: " + e.getMessage());
                }

                System.out.println("Program continues after exception handling.");

    }
}
