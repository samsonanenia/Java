import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.*;

public class Question1 {
    public static void main(String[] args) {
        //1.Given the list below, please find the sorted unique values, using the set interface
        // (‘A’,’F’,’A’,’D’, ‘F’,’C’, ‘B’)
      //  ArrayList<Character> letters = new ArrayList<Character>();
        SortedSet<Character> letters = new TreeSet<Character>();

        letters.add('A');
        letters.add('F');
        letters.add('A');
        letters.add('D');
        letters.add('F');
        letters.add('C');
        letters.add('B');

        System.out.println("The sorted unique values are");
        System.out.println(letters);

    }
}