// To calculate and display the circumference of a circle.
import java.util.*;
class CircumferenceCircle
{
public static void main(String[] args)
{
Scanner in=new Scanner(System.in);
System.out.print("Enter the radius of the circle: ");
double radius=in.nextDouble();
double circumference=2*Math.PI*radius;
System.out.println("The radius of the circle is " +radius+ " cm.");
System.out.println("The circumference of the circle is " +circumference+ " cm");
in.close();
}
}