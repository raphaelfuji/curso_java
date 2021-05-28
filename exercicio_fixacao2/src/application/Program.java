package application;

import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		
		Employee func = new Employee();
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Name: ");
		func.name = sc.nextLine();
		
		System.out.print("Gross Salary: ");
		func.grossSalary = sc.nextDouble();
		
		System.out.print("Tax: ");
		func.tax = sc.nextDouble();
		
		System.out.println(func);
		
		System.out.print("Wich percentage to increase salary: ");
		double percentage = sc.nextDouble();
		func.increaseSalary(percentage);
		
		System.out.println(func);
		
		sc.close();

	}

}
