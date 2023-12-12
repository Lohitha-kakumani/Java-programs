import java.util.Scanner;

public class Factorial
{
public static void main (String args[])
{
Scanner reader = new Scanner(System.in);
System.out.print("enter a number");
int number = reader.nextInt();
int fact = 1;
for(int i=1;i<=number;i++)
	{
		fact = fact*i;
	}
	System.out.print(fact);
}
}