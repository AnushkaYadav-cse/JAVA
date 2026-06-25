// To calculate and display the Simple Interest.
import java.util.*;
class SimpleInterest
{
public static void main(String[] args)
{
Scanner in=new Scanner(System.in);
double principal,rate,time;
System.out.print("Enter the principal amount: ");
principal=in.nextDouble();
System.out.print("Enter the rate of interest: ");
rate=in.nextDouble();
System.out.print("Enter the time(in years): ");
time=in.nextInt();
double interest=(principal*rate*time)/100;
System.out.println("The interest is: " + interest + " INR");
in.close();  
}
}