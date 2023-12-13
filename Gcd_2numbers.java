import java.util.Scanner;
public class Gcd_2numbers
{
public static void main(String args[])
{
System.out.println("enter the number");
Scanner reader = new Scanner(System.in);
int num1= reader.nextInt();;
int num2= reader.nextInt();;
int gcd=0;
for(int i=2;i<=num1 && i<=num2 ; i++)
	{
		if(num1%i == 0 && num2%i==0)
			{
				System.out.print(i);
			}
	}
}
}