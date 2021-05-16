package ExamQ7;

public class Student extends Person{
    float gpa;

    public Student(String firstName, String lastName, long phone, float gpa) {
        super(firstName, lastName, (int) phone);
        this.gpa = gpa;
    }

    public float getGpa() {
        return gpa;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", phone=" + phone +
                ", gpa=" + gpa +
                '}';
    }
}
