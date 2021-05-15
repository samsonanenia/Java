import java.util.*;
public class Question3 {
    public static void main(String[] args) {
        // 3. Given the list below
        // a.Try to remove the even elements using normal for loop
        // b. Remove even elements using iterators

            List<Integer> list = new ArrayList<>();
            list.add(4);
            list.add(1);
            list.add(2);
            list.add(5);
            list.add(4);
            list.add(5);
            list.add(8);
        System.out.println("Original: " + list);

        for (int i=0; i<list.size(); i++) {
            int even= list.get(i)%2;
            if (even == 0) {
                list.remove(i);
            }

        }
        System.out.println("Normal for loop: " + list);


       // List<Integer> itr = new ArrayList<>(myList);

        Iterator<Integer> itr= list.iterator();

        while (itr.hasNext()) {
            if (itr.next() % 2 == 0){
                itr.remove();
            }
           // break;
        }
        System.out.print("Iterator: " + list);

    }

}