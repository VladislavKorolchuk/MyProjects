package SkyPro.TheFirstCourse.CoursePaperOfIncreasedComplexity;

public class Employee {
    private String companyEmployeeName;
    private int Department;
    private float Salary;
    private static int counter = 1;
    int id = 1;

    public Employee(String companyEmployeeName, int Department, float Salary) {
        this.companyEmployeeName = companyEmployeeName;
        this.Department = Department;
        this.Salary = Salary;
        this.id = counter++;
    }

    public String getCompanyEmployeeName() {
        return this.companyEmployeeName;
    }

    public int getDepartment() {
        return this.Department;
    }

    public float getSalary() {
        return this.Salary;
    }

    public int getId() {
        return this.id;
    }

    public void setDepartment(int department) {
        this.Department = department;
    }

    public void setSalary(float salary) {
        this.Salary = salary;
    }

    public String toString() {
        String var10000 = this.companyEmployeeName;
        return "Сотрудник - " + var10000 + ", Отдел - " + this.Department + ", Зарплата - " + String.format("%.2f", this.Salary) + " ₽ , id=" + this.id;
    }

    public String toStringNoDepartment() {
        String var10000 = this.companyEmployeeName;
        return "Сотрудник - " + var10000 + ", Зарплата - " + String.format("%.2f", this.Salary) + " ₽ , id=" + this.id;
    }
}
