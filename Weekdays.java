import java.util.Scanner;
public class Weekdays
{
public static void main(String args[])
{
System.out.println("enter a number");
Scanner reader = new Scanner(System.in);
int number = reader.nextInt();
if(number == 1)
{
System.out.println("The given day is Monday");
}
if(number == 2)
{
System.out.println("The given day is Tuesday");
}
if(number == 3)
{
System.out.println("The given day is Wednesday");
}
if(number == 4)
{
System.out.println("The given day is Thursday");
}
if(number == 5)
{
System.out.println("The given day is Friday");
}
if(number == 6)
{
System.out.println("The given day is Saturday");
}
if(number == 7)
{
System.out.println("The given day is Sunday");
}
}
}