package JavaAssingment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class UpdateSpecificArrayElementByGivenElement_20<array> {
    public static void main(String[] args) {
        ArrayList<String> laptopName = new ArrayList<String>();
        laptopName.add("lENOVO");
        laptopName.add("ACER");
        laptopName.add("ASUS");
        laptopName.add("XIAOMI");
        laptopName.add("DELL");

        System.out.println("Before update the Array list  .......");
        Iterator itr = laptopName.iterator();
        while (itr.hasNext())
        {
            System.out.println(itr.next());
        }

        laptopName.set(1,"samsung");
        laptopName.set(3,"compaq");
        laptopName.set(4,"hp");

        System.out.println();
        System.out.println(" After update the Array list ........");
        Iterator itr1 = laptopName.iterator();
        while (itr1.hasNext())
        {
            System.out.println(itr1.next());
        }
    }
}
