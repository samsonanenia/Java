public class Question3 {
    public static void main(String[] args) {
        int [] numbers = {3,2,5,8,1,9,4};
        int found = 8;
        for(int i=0; i< numbers.length; i++){
            if(numbers[i] == found){
                System.out.println(found + " is found on index " + i);
            }
        }
    }
}
