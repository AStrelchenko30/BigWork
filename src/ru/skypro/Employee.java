package ru.skypro;

public class Employee {
    private final String name;
    public int salary;
    public int workPlace;
    public int id;
    public static int counter = 0;

    public Employee(String name, int salary, int workPlace) {
        id = counter++;
        this.name = name;
        this.salary = salary;
        this.workPlace = workPlace;

    }

    public int getId() {
        return id;
    }


    public String getName() {
        return name;
    }

    public void setChangworkPlase(int workPlace) {

        this.workPlace = workPlace;
    }

    public void setChangeSalary(int salary) {
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public int getWorkPlace() {
        return workPlace;
    }

    @Override
    public String toString() {
        return "ID:" + " " + id + ";" + "Ф.И.О:" + name + "Зарплата:" + salary + ";" + "Отдел №: " + workPlace + ".";
    }
}
