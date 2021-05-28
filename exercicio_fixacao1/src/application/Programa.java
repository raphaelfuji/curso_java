package application;

import java.util.Scanner;

import entities.Retangle;

public class Programa {

	public static void main(String[] args) {
		
		Retangle ret = new Retangle(); //ret de retangulo
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter rectangle width and height: ");
		ret.width = sc.nextDouble();
		ret.height = sc.nextDouble();
		
		System.out.println(ret);
		
		sc.close();
	}

}
