import java.util.Scanner;
public class SumAverage
{
	public static void main (String args[])
		{
			System.out.println("Enter the numbers");
			Scanner reader = new Scanner(System.in);
			int n1 = reader.nextInt();
			int n2 = reader.nextInt();
			int n3 = reader.nextInt();
			int n4 = reader.nextInt();
			int n5 = reader.nextInt();
			int sum = (n1+n2+n3+n4+n5);
			float average = (n1+n2+n3+n4+n5)/5;
			System.out.println("The sum is " + sum + " " );
			System.out.println("The average is " + average + " " );
		}
}