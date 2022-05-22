package ru.skypro;

import java.util.Arrays;

public class Main {
    private static Employee[] employees = new Employee[10];


    public static int sum() {
        int sum = 0;
        for (int i = 0; i < employees.length; i++) {
            sum = sum + employees[i].getSalary();
        }
        return sum;
    }

    public static int minSalary() {
        int minSalary = employees[0].getSalary();
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() <= minSalary) {
                minSalary = employees[i].getSalary();
            }
        }
        return minSalary;
    }

    public static int maxSalary() {
        int maxSalary = employees[0].getSalary();
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() > maxSalary) {
                maxSalary = employees[i].getSalary();
            }
        }
        return maxSalary;
    }

    public static String minSalaryName() {
        String minSalaryName = null;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() <= minSalary()) {
                minSalaryName = employees[i].getName();
            }
        }
        return minSalaryName;
    }

    public static String maxSalaryName() {
        String maxSalaryName = null;
        for (int i = 0; i < employees.length; i++) {
            Employee employee = employees[i];
            if (employees[i].getSalary() >= maxSalary()) {
                maxSalaryName = employees[i].getName();
            }

        }
        return maxSalaryName;
    }

    public static int middleSalary() {
        int middleSalary = 0;
        for (int i = 0; i < employees.length; i++) {
            middleSalary = sum() / employees.length;
        }
        return middleSalary;
    }

    public static void printNames(String names) {
        System.out.println(names);

    }


    public static void main(String[] args) {
        employees[0] = new Employee("Иванов Иван Иванович", 50_000, 1);
        employees[1] = new Employee("Петров Сергей Александрович", 85_000, 3);
        employees[2] = new Employee("Стрельченко Анна Олеговна", 100_000, 3);
        employees[3] = new Employee("Петрова Гадич Хренова", 22_000, 2);
        employees[4] = new Employee("Сазанова Иллиада Мартеновна", 75_000, 4);
        employees[5] = new Employee("Киркоров Филлипп Педросович", 56_000, 5);
        employees[6] = new Employee("Сазыкин Дмитрий Владимирович", 124_000, 1);
        employees[7] = new Employee("Медведев Кирилл Ивановнич", 17_000, 5);
        employees[8] = new Employee("Кирова Елизавета Олеговна", 65_000, 4);
        employees[9] = new Employee("Самойлова Дарья Аретмовна", 82_000, 2);
        System.out.println("Общая сумма затрат за месяц:" + sum());
        System.out.println("Сотрудник с самой большой ЗП: " + maxSalaryName() + ":" + maxSalary());
        System.out.println("Сотрудник с самой низкой ЗП:" + minSalaryName() + ":" + minSalary());
        System.out.println("Средняя ЗП за месяц:" + middleSalary());
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i]);
        }
        for (int i = 0; i < employees.length; i++) {
            printNames(employees[i].getName());
        }
    }
}










