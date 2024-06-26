package com.shruthi.assignment.employees;
import com.shruthi.assignment.employees.Manager;
import com.shruthi.assignment.employees.Developer;
import com.shruthi.assignment.utilities.EmployeeUtilities;
public class AssignmentMain {
	public static void main(String[] args) {
        // Creating a Manager instance
        Manager manager = new Manager();
        manager.setName("Shruthi HS");
        manager.setEmployeeId(147);
        manager.setSalary(80000);
        manager.setDepartment("Sales");

        // Creating a Developer instance
        Developer developer = new Developer();
        developer.setName("Ramya");
        developer.setEmployeeId(017);
        developer.setSalary(70000);
        developer.setProgrammingLanguage("Java");

        // Using EmployeeUtilities methods or functions
        EmployeeUtilities.increaseSalary(manager, 10);  // Increasing salary by 10%
        EmployeeUtilities.increaseSalary(developer, 15);  // Increasing salary by 15%

        // Printing employee details by passing manager or developer instance 
        EmployeeUtilities.printEmployeeDetails(manager);
        EmployeeUtilities.printEmployeeDetails(developer);
	}
}
