import java.util.*;
public class percentage
{
public static void main(String[] args)
{
String name;
float p,q,total,salary=10000;
float percent=0;
for(int i=0;i<2;i++)
{
Scanner in=new Scanner(System.in);
System.out.println("Enter the customer name");
name=in.next();
System.out.println("Enter the quantity of product");
q=in.nextInt();
System.out.println("Enter the price");
p=in.nextInt();
total= q*p;
percent= (total/salary)*100;
System.out.println(" the percentage is " + percent);
}
}
}



