package JavaAssingment;

public class AverageValueOfAnArray_10 {
    public static void main(String[] args) {

        int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12,13,14,15,16 };
        int length = array.length;
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }

        double average = sum / length;

        System.out.println("Average of array is  : "+average);
    }
}
