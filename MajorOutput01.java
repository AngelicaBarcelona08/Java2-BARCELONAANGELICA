import java.io.*;
import java.util.Scanner;

public class MajorOutput01 
{
	public static void main(String[] args) throws Exception {
		
		Scanner sc = new Scanner (new InputStreamReader(System.in));
		System.out.println("Enter a number");
		int digit = 0;
		String x = "";
		int num = sc.nextInt();
		sc.nextLine();
		while(num>0) {
			digit = num % 2;
			x = digit + x;
			num = num/2;
		}
		System.out.println("Binary Number is:" +x);
	}
}
