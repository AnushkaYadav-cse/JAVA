//To convert Indian rupees into US Dollars.
import java.util.*;
class CurrencyConverter
{
public static void main(String[] args) 
{
Scanner in=new Scanner(System.in);
System.out.print("Enter the amount in INR: ");
double rupees=in.nextDouble();
//1USD=94.0 approx right now.
double dollars=rupees/94.0;
System.out.println("The amount in INR is " +rupees+ " INR");
System.out.println("The amount in US Dollars is " +dollars+ " $");
in.close();
}
}