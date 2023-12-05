import java.util.Scanner;

public class EvenOdd
{
public static void main(String args[])
{
System.out.println("Enter the number");
Scanner reader = new Scanner(System.in);
int num = reader.nextInt();
reader.close();
if(num%2 == 0)
	{
		System.out.println("The given num" + num + "is a even number");
	}
else
	{
		System.out.println("The given num" + num + "is a odd number");
	}
}
} 