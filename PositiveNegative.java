import java.util.Scanner;

public class PositiveNegative
{
public static void main(String args[])
	{
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = reader.nextInt();
		if(num > 0) {
			System.out.println("Entered number " + num + " is a positive number");
		}
		else{
			System.out.println("Entered number " + num + " is a negative number");
		}
	}
}