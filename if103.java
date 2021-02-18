package week12;
import java.util.Scanner;
public class if103 {
	public static void main(String[]args) {
		Scanner read = new Scanner(System.in);
		System.out.print("eNTER AnY vALuE:");
		int age = read.nextInt();
		if(age <= 13) {
			System.out.println("You ChIlD");
		}
		else if(age >13 && age <18  ) {
			System.out.println("You are Teenager");
		}
		else if(age >= 18) {
			if(age>=18 && age<=25) {
			System.out.println("You are Adult");
		} 
			else if(age>25) {
				System.out.println("YoU ArE AdUlT anD OlD MaN");
				}
			}
		
	}
}
