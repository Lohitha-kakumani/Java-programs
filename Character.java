import java.util.Scanner;
public class Character
{
public static void main(String args[])
{
System.out.println("enter the number");
Scanner reader = new Scanner(System.in);
char number = reader.next().charAt(0);
if(number >= 65 && number <=90)
	{
		System.out.print("it is a character");
	}
if(number >= 97 && number <= 122)
	{
		System.out.print("it is a character");
	}
}
}