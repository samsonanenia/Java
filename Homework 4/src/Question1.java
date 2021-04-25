public class Question1 {
    public static void main(String[] args) {
        int [] array = {2,4,6,7,8,9,5,4,3};
        int counter = 0;
        for(int i =0; i < array.length; i++){
            counter = counter + array[i];

        }
        double avg = counter / array.length;
        System.out.println(avg);

    }
}
