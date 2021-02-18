package week12;

import java.util.Scanner;

public class if101 {
	public static void main(String[]args) {
	Scanner read = new Scanner(System.in);
	System.out.print("Enter any number");
	int num = read.nextInt();
		if(num % 5 == 0) 
		{
			System.out.print("wE ArE iNsIdE ThE iF-BlOcK");
		}
		
		else {
		System.out.println("wE ArE OuTsIdE ThE If-BlOcK");
	}
		System.out.println("End - Loop");
	}
}
