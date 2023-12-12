import java.util.Scanner;

public class Leapyear
{
public static void main(String args[])
{
System.out.println("Enter the number");
Scanner reader = new Scanner(System.in);
int number = reader.nextInt();
if(number % 400 == 0)
	{
		System.out.println("it is a leap year");
	}
else if(number %4 == 0 && number %100 != 0 )
	{
		System.out.println("It is a leap year");
	}
else
	{
		System.out.println("it is not a leap year");
	}
}
}