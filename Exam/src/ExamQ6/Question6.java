package ExamQ6;

public class Question6 {
    public static void main(String[] args) {
        //Write a java method which takes an array of integers as a parameter, and return “MagicArray”
        // if the array contains at least one element divisible by 3 otherwise return “non MagicArray”.
        //Example:
        //{4, 6, 5, 12} - is MagicArray because 6 and 12 are divisible by 3
        //{4, 7, 2, 8, 10} - is non MagicArray because none of the elements are divisible by 3.
        //{ 4, 7, 11, 6} - MagicArray
        int [] array = {4, 6, 5, 12};

        int count = 0;
        for(int i = 0; i < array.length; i++){
            if(array[i] % 3 == 0){
                count++;
            }
        }
        if(count > 0){
            System.out.println("MagicArray");
        }else{
            System.out.println("non MagicArray");
        }
    }
}
