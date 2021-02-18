package week12;
import java.util.Scanner;
public class Switch {
	public static void main() {
		Scanner read = new Scanner(System.in);
		System.out.print("Enter any vaue: ");
		int num = read.nextInt();
		switch(num) 
		{
		case 1:
			System.out.println("FrISt block");
			break;
		case 2:
			System.out.println("Secobd block");
			break;
			
		default:
			System.out.println("dafault block");
			break;
		}
	}
}
