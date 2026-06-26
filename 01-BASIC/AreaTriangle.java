//To calculate and display the area of a triangle.
import java.util.*;
class AreaTriangle
{
public static void main(String[] args)
{
Scanner in=new Scanner(System.in);
System.out.print("Enter the base of triangle: ");
double base=in.nextDouble();
System.out.print("Enter the height of triangle: ");
double height=in.nextDouble();
double area=0.5*base*height;
System.out.println("The base of triangle is " +base+ " cm.");
System.out.println("The height of triangle is " +height+ " cm.");
System.out.println("The area of triangle is " +area+ " cm^2");
in.close();
}
}