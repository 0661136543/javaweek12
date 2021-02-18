package week12;
import java.util.Scanner;
public class dowhile101 {
	
	public static void main(String[]args) {
		Scanner read = new Scanner(System.in);
		System.out.print("Enter any number");
		
		int m = read.nextInt();
		int  i =1; 
		do {
		System.out.println(m+ " x " + i + " = " + i*m );
		i = i+1 ;
		}while(i<12);
	}
}
