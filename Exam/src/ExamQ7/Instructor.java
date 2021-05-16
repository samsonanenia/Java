package ExamQ7;

public class Instructor<statc> extends Person{
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
    //calculateNetSalary - this method takes gross salary and returns net salary assuming tax as 20%.
    public int calculateNetSalary(int gross){
        int cacl = (int) (gross * 0.8);
        System.out.println("The Net Salary is " + cacl);
        return cacl;
    }
}
