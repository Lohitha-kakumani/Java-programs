import java.util.Scanner;
public class Pattern
{
public static void main(String args[])
{
System.out.print("enter the number: ");
Scanner reader = new Scanner(System.in);
int number = reader.nextInt();
for(int i =1 ; i< number ; i++)
	{
		for(int j =1 ; j<= i ;j++)
			{
				System.out.print(j + "\t");
				
			}
				System.out.println("\n");
	}
}
}