// To print the square and cube of a single number.
import java.util.*;
class SquareCube
{
public static void main(String[] args)
{
Scanner in=new Scanner(System.in);
double number;
System.out.print("Enter the number: ");
number=in.nextDouble();
double square=number*number;
double cube=number*number*number;
System.out.println("The square of the number is " + square);
System.out.println("The cube of the number is " + cube);
in.close();
}
}