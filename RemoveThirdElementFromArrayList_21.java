package JavaAssingment;

import java.util.ArrayList;
import java.util.Iterator;

public class RemoveThirdElementFromArrayList_21 {
    public static void main(String[] args) {
        ArrayList<String> carName= new ArrayList<String>();
        carName.add("AUDI");
        carName.add("BMW");
        carName.add("JAGUAR");
        carName.add("Ferrari");
        carName.add("KIA");

        System.out.println("Before Remove Third Element From the Array list  .......");

        Iterator itr = carName.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }

        System.out.println();
        System.out.println("After Remove Third Array  From The list  .......");

        carName.remove(3);

        Iterator itr1 = carName.iterator();
        while(itr1.hasNext())
        {
            System.out.println(itr1.next());
        }

    }
}
