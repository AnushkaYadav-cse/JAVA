// To find and display the percentage of total amount.
import java.util.*;
class PercentageCalculator
{
public static void main(String[] args)
{
Scanner in=new Scanner(System.in);
double percentage;
double totalamt;
System.out.print("Enter the percentage: ");
percentage=in.nextDouble();
System.out.print("Enter the total amount: ");
totalamt=in.nextDouble();
double average=(percentage/100)*totalamt;
System.out.println("The percentage of the total amount is " + average + " % ");
in.close();    
}
}
