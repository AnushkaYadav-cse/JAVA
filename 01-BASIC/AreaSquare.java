//To find the area of square.
import java.util.*;
class AreaSquare
{
public static void main(String[] args)
{
Scanner in=new Scanner(System.in);
double side,area;
System.out.print("Enter the side of the square: ");
side=in.nextDouble();
area=side*side;
System.out.println("The side of the square is " +side+ " cm.");
System.out.println("The area of the square is " +area+ " cm^2");
in.close();
}
}