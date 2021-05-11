import java.util.HashSet;
import java.util.Set;

public class Question2 {
    public static void main(String[] args) {
        // Set 1
        Set<Integer> set1 = new HashSet<Integer>();
        set1.add(3);
        set1.add(4);
        set1.add(5);
        set1.add(7);
        set1.add(8);
        set1.add(9);

        // Set 2
        Set<Integer> set2 = new HashSet<Integer>();
        set2.add(5);
        set2.add(2);
        set2.add(4);
        set2.add(6);
        set2.add(7);
        set2.add(11);

        set1.addAll(set2);
        System.out.println("Union "+ set1);
        set1.retainAll(set2);
        System.out.println("Intersection " + set2);


    }
}
