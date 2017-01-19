import java.util.Scanner;
public class rating
{
public static void main(String[] args)
{
String name []=new String[3];
String p[]=new String[3];
float a[]=new float[3];
float sum=0,avg;
int count=0,i;
for(i=0;i<3;i++)
{
Scanner in=new Scanner(System.in);
System.out.println("Enter the customer name");
name[i]=in.next();
System.out.println("Enter the 3 products available 1.watch 2.fridge 3.android ");
p[i]=in.next();
System.out.println("enter the rating");
a[i]=in.nextInt();
if(p[i].equals("android"))
{
sum=sum+a[i];
count++;
}}
avg =sum/count;
System.out.println(" The average rating for the product is " + avg);
}
}

