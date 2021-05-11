public class Question4 {
    public static void main(String[] args) {

        //Write a Java program to copy an array by iterating the array

        int[] num1 = {2,5,4,8,9,4};
        int[] num2 = new int[num1.length];

        for(int i = 0; i < num1.length; i++){
            num2[i] = num1[i];
            System.out.println(num2[i]);
        }
    }
}
