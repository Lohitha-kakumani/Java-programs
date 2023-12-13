import java.util.Scanner;
public class Simpleinterest
{
public static void main(String args[])
{
System.out.println("enter the number");
Scanner reader = new Scanner(System.in);
int p = reader.nextInt();
int t = reader.nextInt();
int r = reader.nextInt();
int interest = (p*t*r)/100;
System.out.print(interest);
}
}