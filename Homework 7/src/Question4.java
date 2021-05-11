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
        Collections.sort(students, Student.StuNameComparator);

        for(Student str: students){
            System.out.println(str);
        }

    }
}

//File: Student.java
//hint implement Comparable interface

class Student implements Comparable {

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
    /*Comparator for sorting the list by Student Name*/
    public static Comparator<Student> StuNameComparator = new Comparator<Student>() {

        public int compare(Student s1, Student s2) {
            String StudentName1 = s1.getFirstName().toUpperCase();
            String StudentName2 = s2.getFirstName().toUpperCase();

            //ascending order
            return StudentName1.compareTo(StudentName2);

            //descending order
            //return StudentName2.compareTo(StudentName1);
        }
    };


    @Override
    public int compareTo(Object o) {
        return 0;
    }
}


