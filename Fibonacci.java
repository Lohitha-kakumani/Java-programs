import java.util.Scanner;
public class Fibonacci
{
public static void main(String args[])
{
System.out.println("enter the number");
Scanner reader = new Scanner(System.in);
int number = reader.nextInt();
int firstterm = 0;
int secondterm = 1;
int temp = 0;
System.out.print(firstterm + " " + secondterm + " ");
for(int i=0;i<number-2;i++)
	{
		temp = firstterm+secondterm;
		firstterm = secondterm;
		secondterm = temp;
		System.out.print(temp + " " );
	}
}
}