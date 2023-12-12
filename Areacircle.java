import java.util.Scanner;

public class Areacircle
{
public static void main (String args[])
{
Scanner reader = new Scanner(System.in);
System.out.print("enter a number");
int radius = reader.nextInt();
double area = 3.14 * radius * radius;
System.out.print(area);
}
}