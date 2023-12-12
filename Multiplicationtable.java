import java.util.Scanner;

public class Multiplicationtable
{
public static void main(String args[])
{
System.out.println("enter the number");
Scanner reader = new Scanner(System.in);
int number = reader.nextInt();
for(int i = 1 ; i<= 10 ; i++ )
	{
		System.out.println(number*i);
	}
}
}