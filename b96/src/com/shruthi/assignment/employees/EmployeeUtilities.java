package com.shruthi.assignment.employees;

import com.shruthi.assignment.employees.Employee;
import com.shruthi.assignment.employees.Manager;
import com.shruthi.assignment.employees.Developer;

public class EmployeeUtilities {


    public static void increaseSalary(Employee employee, double percentage) {
        double currentSalary = employee.getSalary();
        double increaseAmount = currentSalary * (percentage / 100);
        double newSalary = currentSalary + increaseAmount;
        employee.setSalary(newSalary);
    }

    public static void assignDepartment(Manager manager, String department) {
        manager.setDepartment(department);
    }

    public static void changeProgrammingLanguage(Developer developer, String language) {
        developer.setProgrammingLanguage(language);
    }
}


