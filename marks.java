import java.util.Scanner;
public class marks{
public static void main(String[] args){
String a[]=new String[2];
float b[]=new float[5];
float percent=0;
for(int i=0;i<2;i++)
{
float sum=0;
Scanner in= new Scanner(System.in);
System.out.println("Enter the student name");
a[i]=in.next();
for(int j=0;j<5;j++)
{
System.out.println("enter the subject marks");
b[j]=in.nextInt();
sum=sum+b[j];
}
percent=(sum/500)*100;
System.out.println("The overall percentage is " + percent);
if(percent<50.0)
{
System.out.println("fail");
}
else if(percent>=85 && percent<=100)
{
System.out.println("A+ grade");
}
else if(percent>=75.0 && percent<84.0)
{
System.out.println("A grade");
}
else if(percent>=64.0 && percent<75.0)
{
System.out.println("B grade");
}
else if(percent>=50.0 && percent<65.0)
{
System.out.println("C grade");
}
else
{
System.out.println("Invalid");
}
}
}
}



