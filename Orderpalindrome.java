import java.util.Scanner;
public class Orderpalindrome
{
public static void main(String args[])
{
System.out.println("enter the number");
Scanner reader = new Scanner(System.in);
int number = reader.nextInt();
int reversenumber = 0;
while(number > 0)
	{
		reversenumber = reversenumber*10 + number%10;
		number = number/10;
	}
System.out.print(reversenumber);
}
}