package ExamQ7;

public class Main {
    public static void main(String[] args) {
    Student student = new Student("S", "Anenia",666666666, 3 );

    System.out.println(student);

    Instructor instructor = new Instructor("Jhon", "Max", 555555555, 100000);

    System.out.println(instructor);

    instructor.calculateNetSalary(100000);




    }
}
