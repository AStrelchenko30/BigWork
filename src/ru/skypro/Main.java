package ru.skypro;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Employee[] employees = new Employee[10];
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
        for (int i = 0; i <employees.length; i++) {
            System.out.println(employees[i]);
        }
        int sum = 0;
        int maxSalary = employees[0].getSalary();
        int minSalary = employees[0].getSalary();
        int middleSalary=0;
        String maxSalaryName=null;
        String minSalaryName=null;
        for(int i=0;i<employees.length;i++){
            sum += employees[i].getSalary();
            middleSalary=sum/employees.length;
            if (employees[i].getSalary()>maxSalary){
                maxSalary=employees[i].getSalary();
                maxSalaryName=employees[i].getName();
            }if (employees[i].getSalary()<minSalary){
                minSalary=employees[i].getSalary();
                minSalaryName=employees[i].getName();
            }
            System.out.println(employees[i].getName());
        }
        System.out.println("Общая сумма затрат за месяц:"+sum);
        System.out.println("Сотрудник с самой большой ЗП: "+maxSalaryName+":" + maxSalary);
        System.out.println("Сотрудник с самой низкой ЗП:"+minSalaryName+":"+minSalary);
        System.out.println("Средняя ЗП за месяц:"+middleSalary);


    }

}



