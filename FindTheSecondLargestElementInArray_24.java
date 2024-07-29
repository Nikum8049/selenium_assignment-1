package JavaAssingment;

public class FindTheSecondLargestElementInArray_24 {
        public static void main(String[] args) {
            // Example array
            int[] array = {1000, 300, 40, 45, 990};

            int secondLargest = findSecondLargest(array);

            System.out.println("Second largest element: " + secondLargest);
        }
        public static int findSecondLargest(int[] array) {
            if (array.length < 2) {
                throw new IllegalArgumentException("Array must contain at least two elements.");
            }

            int largest = Integer.MIN_VALUE;
            int secondLargest = Integer.MIN_VALUE;

            for (int num : array) {
                if (num > largest) {
                    secondLargest = largest;
                    largest = num;
                } else if (num > secondLargest && num < largest) {
                    secondLargest = num;
                }
            }

            if (secondLargest == Integer.MIN_VALUE) {
                throw new IllegalArgumentException("There is no second largest element.");
            }

            return secondLargest;
    }
}
