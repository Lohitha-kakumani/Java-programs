import java.util.Scanner;
public class Palindrome
{
public static void main(String args[])
{
System.out.println("enter the number");
Scanner reader = new Scanner(System.in);
int number = reader.nextInt();
int reversenumber = 0;
int num = number;
while(number > 0)
	{
		reversenumber = reversenumber*10 + number%10;
		number = number/10;
	}
if(num == reversenumber)
	{
		System.out.println("the given number is a palindrome");
	}
else
	{
		System.out.println("the given numver is not a palindrome");
	}
}
}