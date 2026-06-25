import java.util.*;
class Calculator
{
public static void main(String[] args) 
{
Scanner in=new Scanner(System.in);
int a,b;
System.out.print("Enter the 1st number: ");
a=in.nextInt();
System.out.print("Enter the 2nd number: ");
b=in.nextInt();
int sum=a+b;
System.out.println("The sum of the numbers is " +sum);  
int difference=a-b;
System.out.println("The difference of the numbers is " + difference);
int product=a*b;
System.out.println("The product of the numbers is " + product);
double percentage=((a+b)*2.0)/100;
System.out.println("The percentage of the numbers is " + percentage);
if(b!=0)
{
double quotient=(double)a/b;
System.out.println("The quotient of the numbers is " + quotient);
}
else
{
System.out.println("Number cannot be divided by zero!");
}
}
}