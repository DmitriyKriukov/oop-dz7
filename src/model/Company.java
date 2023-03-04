package model;

import java.security.spec.ECPoint;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Company {

    private List<Employee> employeeList;
    private static int id;

    public Company() {

        employeeList = new ArrayList<>();
    }

    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    public void addEmployee(String firstName, String lastName, String position, int age) {
        employeeList.add(new Employee(++id, firstName, lastName, position, age));
        System.out.println("Сотрудник добавлен");
    }

    public void showEmployeeList() {
        StringBuilder res = new StringBuilder("Сотрудники компании " + ":\n");
        if (employeeList.isEmpty()) {
            System.out.println("Список сотрудников пуст");
            return;
        } else {
            for (Employee employee : employeeList) {
                res.append(employee).append("\n");
            }
        }
        System.out.println(res);
    }

    public Employee showEmployee(int id) {
        for (Employee employee : employeeList) {
            if (employee.getId() == id) {
                return employee;
            }
        }
        System.out.println("Сотрудник не найден");
        return null;
    }

    public void removeEmployee(int id) {
        if (showEmployee(id) != null) {
            employeeList.remove(showEmployee(id));
            System.out.println("Сотрудник удален");
        }
    }

    public void changeEmployeeFirstName(int id, String firstName) {
        Employee employee = showEmployee(id);
        employee.setFirstName(firstName);
        System.out.println("Имя изменено");
    }

    public void changeEmployeeLastName(int id, String lastName) {
        Employee employee = showEmployee(id);
        employee.setLastName(lastName);
        System.out.println("Фамилия изменена");
    }

    public void changeEmployeePosition(int id, String position) {
        Employee employee = showEmployee(id);
        employee.setPosition(position);
        System.out.println("Должность изменена");
    }

    public void changeEmployeeAge(int id, int age) {
        Employee employee = showEmployee(id);
        employee.setAge(age);
        System.out.println("Возраст изменен");
    }
}
