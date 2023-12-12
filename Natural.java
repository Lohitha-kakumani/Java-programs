import java.util.Scanner;
public class Natural
{
public  static void main(String args[])
{
System.out.println("enter the number\n");
Scanner reader = new Scanner(System.in);
int number = reader.nextInt();
for(int i =1; i<=number; i++)	
	{
		System.out.println(i);
	}

}
}