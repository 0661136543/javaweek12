package week12;
import java.util.Scanner;
public class while101 {
	public static void main(String[]args) {
		Scanner read = new Scanner(System.in);
		System.out.print("Enter any Value:  ");
		int m = read.nextInt();
		int i = 1;
		while(i <100) {
			System.out.println( m + " x" +i +" = " + i*m);
			i =i+1;
		}
	}
	
}
