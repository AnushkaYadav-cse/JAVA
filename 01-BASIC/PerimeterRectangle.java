//To calculate and print the perimeter of a rectangle.
import java.util.*;
class PerimeterRectangle
{
public static void main(String[] args)
{
Scanner in=new Scanner(System.in);
System.out.print("Enter the length of rectangle: ");
double length=in.nextDouble();
System.out.print("Enter the breadth of rectangle: ");
double breadth=in.nextDouble();
double perimeter=2*(length+breadth);
System.out.println("The length of rectangle is " +length+ " cm.");
System.out.println("The breadth of rectangle is " +breadth+ " cm.");
System.out.println("The perimeter of rectangle is " +perimeter+ " cm.");
in.close();
}
}