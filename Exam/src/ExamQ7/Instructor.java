package ExamQ7;

public class Instructor extends Person{
    int grossSalary;

    public Instructor(String firstName, String lastName, long phone, int grossSalary) {
        super(firstName, lastName, (int) phone);
        this.grossSalary = grossSalary;
    }

    public int getGrossSalary() {
        return grossSalary;
    }

    public void setGrossSalary(int grossSalary) {
        this.grossSalary = grossSalary;
    }

    @Override
    public String toString() {
        return "Instructor{" +
                "grossSalary=" + grossSalary +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", phone=" + phone +
                '}';
    }
}
