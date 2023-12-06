import java.util.Scanner;
import java.lang.Math;
public class Float
{
public static void main (String args[])
	{
		System.out.println("Enter the numbers");
		Scanner reader = new Scanner(System.in);
		double n1 = reader.nextDouble();
		double n2 = reader.nextDouble();
		if(Math.abs(n1-n2) <= 0.001)
			{
				System.out.println("The first three digitis of the number is same");
			}
		else
			{
				System.out.println("not a same number");
			}
	}
}