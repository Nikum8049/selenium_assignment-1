package JavaAssingment;
import java.util.ArrayList;
import java.util.Iterator;

public class IterateThroughAllElementInArrayList_19 {
    public static void main(String[] args) {

                ArrayList<String> list = new ArrayList<>();
                list.add("Iphone");
                list.add("Oneplus");
                list.add("Blackberry");
                list.add("Samsung");
                list.add("Nokia");

                // 1. Using a for-each loop
                System.out.println("Using for-each loop:");
                for (String item : list) {
                    System.out.println(item);
                }

                // 2. Using a traditional for loop
                System.out.println("\nUsing traditional for loop:");
                for (int i = 0; i < list.size(); i++) {
                    System.out.println(list.get(i));
                }

                // 3. Using an Iterator
                System.out.println("\nUsing Iterator:");
                Iterator<String> iterator = list.iterator();
                while (iterator.hasNext()) {
                    System.out.println(iterator.next());
                }
    }
}
