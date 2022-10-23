package SkyPro.TheFirstCourse.CoursePaperOfIncreasedComplexity;

import java.io.PrintStream;

public class CoursePaperOfIncreasedComplexity {
    public static void main(String[] args) {
        Employee[] employee = new Employee[10];
        employee[0] = new Employee("Демидова Ольга Станиславовна", 1, 50000.0F);
        employee[1] = new Employee("Сорокин Андрей Владимирович", 2, 35000.0F);
        employee[2] = new Employee("Иванов Иван Иванович", 1, 35000.0F);
        employee[3] = new Employee("Булгакова Анастасия Станиславовна", 4, 70000.0F);
        employee[4] = new Employee("Васильев Станислав Павлович", 5, 56000.0F);

        int i;
        for(i = 0; i < employee.length; ++i) {
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

        for(i = 0; i < employee.length; ++i) {
            if (employee[i] != null) {
                System.out.println(abbreviatedView(employee[i].getCompanyEmployeeName()));
            }
        }

        System.out.println("---------------------------------------");
        System.out.println(" --   Задача повышенной сложности   -- ");
        System.out.println("---------------------------------------");
        System.out.println("\n----------------Индексирование зарплат на 20%---------------------------\n");
        salaryIndexing(employee, 20);

        for(i = 0; i < employee.length; ++i) {
            if (employee[i] != null) {
                System.out.println(employee[i].toString());
            }
        }

        System.out.println("\n-----------------------------------------------------------------------------------\n");
        System.out.println("C минимальной зарплатой 2 отдел - " + employee[getMaxSalaryDepartment(employee, 2)].getCompanyEmployeeName());
        System.out.println("C максимальной зарплатой 2 отдел - " + employee[getMinSalaryDepartment(employee, 2)].getCompanyEmployeeName());
        System.out.println("Сумма затрат на зарплату 2 отдел - " + amountSalaryDepartment(employee, 2) + " ₽");
        var10000 = System.out;
        var10002 = new Object[]{averageValueDepartment(employee, 2)};
        var10000.println("Среднее значение зарплат 2 отдел - " + String.format("%.2f", var10002) + " ₽");
        salaryIndexingDepartment(employee, 20, 2);
        System.out.println("\n-------------Распечатка всех сотрудников 2 отдела--------------------\n");

        for(i = 0; i < employee.length; ++i) {
            if (employee[i] != null && employee[i].getDepartment() == 2) {
                System.out.println(employee[i].toStringNoDepartment());
            }
        }

        System.out.println("\n----------------Сотрудники с зарплатой меньше 45_000---------------------------\n");

        for(i = 0; i < employee.length; ++i) {
            if (employee[i] != null && employee[i].getSalary() < 45000.0F) {
                System.out.format("%d %s %.2f ₽ \n", employee[i].getId(), employee[i].getCompanyEmployeeName(), employee[i].getSalary());
            }
        }

        System.out.println("\n------------------Сотрудники с зарплатой больше или равно 50_000---------------\n");

        for(i = 0; i < employee.length; ++i) {
            if (employee[i] != null && employee[i].getSalary() >= 50000.0F) {
                System.out.format("%d %s %.2f ₽ \n", employee[i].getId(), employee[i].getCompanyEmployeeName(), employee[i].getSalary());
            }
        }

    }

    public static Integer amountSalary(Employee[] employee) {
        int amountSalary = 0;

        for(int i = 0; i < employee.length; ++i) {
            if (employee[i] != null) {
                amountSalary = (int)((float)amountSalary + employee[i].getSalary());
            }
        }

        return amountSalary;
    }

    public static int getMax(Employee[] employee) {
        float maxSalary = 0.0F;
        int codeEmployee = 0;

        for(int i = 0; i < employee.length; ++i) {
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

        for(int i = 0; i < employee.length; ++i) {
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

        for(int i = 0; i < employee.length; ++i) {
            if (employee[i] != null) {
                amountSalary += employee[i].getSalary();
                ++numberOfElements;
            }
        }

        return amountSalary / (float)numberOfElements;
    }

    public static String abbreviatedView(String Line) {
        String[] words = Line.split(" ");
        return words[0] + " " + words[1].charAt(0) + "." + words[2].charAt(0) + ".";
    }

    public static void salaryIndexing(Employee[] employee, int theValueOfIndexing) {
        for(int i = 0; i < employee.length; ++i) {
            if (employee[i] != null) {
                employee[i].setSalary(employee[i].getSalary() + employee[i].getSalary() / 100.0F * (float)theValueOfIndexing);
            }
        }

    }

    public static int getMaxSalaryDepartment(Employee[] employee, int Department) {
        float maxSalary = 0.0F;
        int codeEmployee = 0;

        for(int i = 0; i < employee.length; ++i) {
            if (employee[i] != null && Department == employee[i].getDepartment() && maxSalary < employee[i].getSalary()) {
                maxSalary = employee[i].getSalary();
                codeEmployee = i;
            }
        }

        return codeEmployee;
    }

    public static int getMinSalaryDepartment(Employee[] employee, int Department) {
        float minSalary = 3.4E38F;
        int codeEmployee = 0;

        for(int i = 0; i < employee.length; ++i) {
            if (employee[i] != null && Department == employee[i].getDepartment() && minSalary > employee[i].getSalary()) {
                minSalary = employee[i].getSalary();
                codeEmployee = i;
            }
        }

        return codeEmployee;
    }

    public static Integer amountSalaryDepartment(Employee[] employee, int Department) {
        int amountSalary = 0;

        for(int i = 0; i < employee.length; ++i) {
            if (employee[i] != null && Department == employee[i].getDepartment()) {
                amountSalary = (int)((float)amountSalary + employee[i].getSalary());
            }
        }

        return amountSalary;
    }

    public static float averageValueDepartment(Employee[] employee, int Department) {
        float amountSalary = 0.0F;
        int numberOfElements = 0;

        for(int i = 0; i < employee.length; ++i) {
            if (employee[i] != null && Department == employee[i].getDepartment()) {
                amountSalary += employee[i].getSalary();
                ++numberOfElements;
            }
        }

        return amountSalary / (float)numberOfElements;
    }

    public static void salaryIndexingDepartment(Employee[] employee, int theValueOfIndexing, int Department) {
        for(int i = 0; i < employee.length; ++i) {
            if (employee[i] != null && Department == employee[i].getDepartment()) {
                employee[i].setSalary(employee[i].getSalary() + employee[i].getSalary() / 100.0F * (float)theValueOfIndexing);
            }
        }

    }
}
