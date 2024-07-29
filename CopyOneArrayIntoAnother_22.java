package JavaAssingment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CopyOneArrayIntoAnother_22 {
    public static void main(String[] args) {

        System.out.println("Orignal Array ........");
        Integer [] sourceArray = {10,20,30,40,50};

        List<Integer> list = new ArrayList<>(Arrays.asList(sourceArray));

        Integer[] destinationArray = list.toArray(new Integer[0]);
        System.out.println("Destination Array .......");
        for(int num : destinationArray)
        {
            System.out.println(num + " ");
        }

    }
}
