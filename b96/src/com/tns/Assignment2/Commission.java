package com.tns.Assignment2;
import java.util.Scanner;

	public class Commission {
	    // Data Members
	    private String name;
	    private String address;
	    private String phone;
	    private double salesAmount;

	    // Method to accept details of the sales employee
	    public void acceptDetails() {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter name: ");
	        name = scanner.nextLine();

	        System.out.print("Enter address: ");
	        address = scanner.nextLine();

	        System.out.print("Enter phone: ");
	        phone = scanner.nextLine();

	        System.out.print("Enter sales amount: ");
	        salesAmount = scanner.nextDouble();

	        scanner.close();
	    }

	    // Method to calculate and print the commission
	    public void calculateCommission() {
	        double commission = 0.0;

	        if (salesAmount >= 100000) {
	            commission = salesAmount * 0.10;
	        } else if (salesAmount >= 50000) {
	            commission = salesAmount * 0.05;
	        } else if (salesAmount >= 30000) {
	            commission = salesAmount * 0.03;
	        } else {
	            commission = 0.0;
	        }

	        System.out.println("Commission for " + name + " is: $" + commission);
	    }

	    public static void main(String[] args) {
	        // Creating an instance of Commission and invoking methods
	        Commission employee = new Commission();
	        employee.acceptDetails();
	        employee.calculateCommission();
	    }
	}
