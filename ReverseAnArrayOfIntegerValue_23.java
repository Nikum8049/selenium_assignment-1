package JavaAssingment;

public class ReverseAnArrayOfIntegerValue_23 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};

        // Print the original array
        System.out.println("Original Array:");
        printArray(array);

        // Reverse the array
        reverseArray(array);

        // Print the reversed array
        System.out.println("Reversed Array:");
        printArray(array);
    }

    // Method to reverse the array
    public static void reverseArray(int[] array) {
        int start = 0;
        int end = array.length - 1;

        while (start < end) {
            // Swap elements at start and end
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;

            // Move towards the middle
            start++;
            end--;
        }
    }

    // Method to print array elements
    public static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println(); // For new line

    }


}
