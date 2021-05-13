import java.util.*;

public class Question4 {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Hagos", 20));
        students.add(new Student("Zeray", 18));
        students.add(new Student("Tirhas", 25));
        students.add(new Student("Seble", 23));




        //Sort the students list with firstName
        ////hint use Collections.sort()
        System.out.println("Student Name Sorting:");
        Collections.sort(students);

        for(Student str: students){
            System.out.println(str);
        }


    }
}



//File: Student.java
//hint implement Comparable interface

class Student implements Comparable<Student> {

    private String firstName;
    private int age;

    //constructor here
    //getter and setters here
    //add toString methode here

    public Student(String firstName, int age) {
        this.firstName = firstName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public int getAge() {
        return age;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", age=" + age +
                '}';
    }


    @Override
    public int compareTo(Student name) {
        int compareInt = this.firstName.compareTo(name.firstName);
        if (compareInt < 0) return -1;
        if (compareInt > 0) return 1;
        return 0;
    }


}


