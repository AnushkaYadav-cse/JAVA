//To calculate and print the area of a rectangle.
import java.util.*;
class AreaRectangle
{
public static void main(String[] args)
{
Scanner in=new Scanner(System.in);
System.out.print("Enter the length of rectangle: ");
double length=in.nextDouble();
System.out.print("Enter the breadth of rectangle: ");
double breadth=in.nextDouble();
double area=length*breadth;
System.out.println("The length of rectangle is " +length+ " cm.");
System.out.println("The breadth of rectangle is " +breadth+ " cm.");
System.out.println("The area of rectangle is " +area+ " cm^2.");
in.close();    
}
}