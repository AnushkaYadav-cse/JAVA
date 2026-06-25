import java.util.*;
class AverageFinder
{
public static void main(String[] args)
{
Scanner in=new Scanner(System.in);
double maths,physics,chemistry,english,computer;
System.out.print("Enter the marks of Mathematics: ");
maths=in.nextDouble();
System.out.print("Enter the marks of Physics: ");
physics=in.nextDouble();
System.out.print("Enter the marks of Chemistry: ");
chemistry=in.nextDouble();
System.out.print("Enter the marks of English: ");
english=in.nextDouble();
System.out.print("Enter the marks of Computer: ");
computer=in.nextDouble();
double sum=maths+physics+chemistry+english+computer;
double average=sum/5.0;
System.out.println("The sum of all subjects is " +sum);
System.out.println("The average of all subjects is " + average);
}
}