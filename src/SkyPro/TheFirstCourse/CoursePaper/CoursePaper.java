package SkyPro.TheFirstCourse.CoursePaper;

import java.io.PrintStream;

public class CoursePaper {
    public static void main(String[] args) {
        Employee[] employee = new Employee[10];
        employee[0] = new Employee("Демидова Ольга Станиславовна", 1, 50000.0F);
        employee[1] = new Employee("Сорокин Андрей Владимирович", 2, 35000.0F);
        employee[2] = new Employee("Иванов Иван Иванович", 1, 35000.0F);
        employee[3] = new Employee("Булгакова Анастасия Станиславовна", 4, 70000.0F);
        employee[4] = new Employee("Васильев Станислав Павлович", 5, 56000.0F);

        int i;
        for (i = 0; i < employee.length; ++i) {
            if (employee[i] != null) {
                System.out.println(employee[i].toString());
            }
        }

        System.out.println("Сумма затрат на зарплату - " + amountSalary(employee) + " ₽");
        System.out.println("C минимальной зарплатой " + employee[getMin(employee)].toString());
        System.out.println("C максимальной зарплатой " + employee[getMax(employee)].toString());
        PrintStream var10000 = System.out;
        Object[] var10002 = new Object[]{averageValue(employee)};
        var10000.println("Среднее значение зарплат - " + String.format("%.2f", var10002) + " ₽");

        for (i = 0; i < employee.length; ++i) {
            if (employee[i] != null) {
                System.out.println(abbreviatedView(employee[i].getCompanyEmployeeName()));
            }
        }

    }

    public static int amountSalary(Employee[] employee) {
        int amountSalary = 0;

        for (int i = 0; i < employee.length; ++i) {
            if (employee[i] != null) {
                amountSalary = (int) ((float) amountSalary + employee[i].getSalary());
            }
        }

        return amountSalary;
    }

    public static int getMax(Employee[] employee) {
        float maxSalary = 0.0F;
        int codeEmployee = 0;

        for (int i = 0; i < employee.length; ++i) {
            if (employee[i] != null && maxSalary < employee[i].getSalary()) {
                maxSalary = employee[i].getSalary();
                codeEmployee = i;
            }
        }

        return codeEmployee;
    }

    public static int getMin(Employee[] employee) {
        float minSalary = 3.4E38F;
        int codeEmployee = 0;

        for (int i = 0; i < employee.length; ++i) {
            if (employee[i] != null && minSalary > employee[i].getSalary()) {
                minSalary = employee[i].getSalary();
                codeEmployee = i;
            }
        }

        return codeEmployee;
    }

    public static float averageValue(Employee[] employee) {
        float amountSalary = 0.0F;
        int numberOfElements = 0;

        for (int i = 0; i < employee.length; ++i) {
            if (employee[i] != null) {
                amountSalary += employee[i].getSalary();
                ++numberOfElements;
            }
        }

        return amountSalary / (float) numberOfElements;
    }

    public static String abbreviatedView(String Line) {
        String[] words = Line.split(" ");
        return words[0] + " " + words[1].charAt(0) + "." + words[2].charAt(0) + ".";
    }
}
