import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class Question2 {
    public static void main(String[] args) {

        //2.Given Two sets below two setsSet1: [3,4,5,7,8,9]Set2 [5,2,4,6,7,11]
        //a. Find the intersection in those sets
        // b. Find the union in those sets
        // c. Find the only unique elements in set2


        // Set 1
        Set<Integer> set1 = new HashSet<>();
        set1.add(3);
        set1.add(4);
        set1.add(5);
        set1.add(7);
        set1.add(8);
        set1.add(9);

        // Set 2
        Set<Integer> set2 = new HashSet<>();
        set2.add(5);
        set2.add(2);
        set2.add(4);
        set2.add(6);
        set2.add(7);
        set2.add(11);


        set2.retainAll(set1);
        System.out.println("Intersection " + set2);
        set2.addAll(set1);
        System.out.println("Union "+ set1);



    }
}
