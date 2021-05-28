package application;

import java.util.Scanner;

import entities.Account;

public class Program {

	public static void main(String[] args) {
		
		//Account conta = new Account();
		Scanner sc = new Scanner(System.in);
		double value = 0.0;
		
		System.out.print("Enter account number: ");
		int number = sc.nextInt();
		sc.nextLine();
		
		System.out.print("Enter account holder: ");
		String holder = sc.nextLine();
		
		System.out.print("Is there an initial deposit (y/n)? ");
		char choice = sc.nextLine().charAt(0);
		
		if(choice == 'y') {
			System.out.print("Enter initial deposit value: $ ");
			value = sc.nextDouble();
		}
		
		Account conta = new Account(number, holder, value);
		
		System.out.println("\nAccount data: \n" + conta);
		
		System.out.print("\nEnter a deposit value: $ ");
		conta.depositValue(sc.nextDouble());
		
		System.out.println("Updated account data: \n" + conta);
		
		System.out.print("\nEnter a withdraw value: $ ");
		conta.withdrawalValue(sc.nextDouble());
		
		System.out.println("Updated account data: \n" + conta);
		
		
		sc.close();

	}

}
