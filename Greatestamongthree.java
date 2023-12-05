import java.util.Scanner;
public class Greatestamongthree
{
public static void main(String args[])
{
System.out.println("Enter the number");
Scanner reader = new Scanner(System.in);
int n1 = reader.nextInt();
int n2 = reader.nextInt();
int n3 = reader.nextInt();
reader.close();
if(n1>n2)
	{
		if(n1>n3)
			{
				System.out.println("The greatest number is " + n1+ " " );
			}
		else
			{
				System.out.println("The greatest number is " + n3+ " ");
			}
	}
else
	{
		if(n2>n3)
			{
				System.out.println("The greatest number is " + n2+ " ");
			}
		else
			{
				System.out.println("The greatest number is " + n3+ " " );
			}
	}
}
}








