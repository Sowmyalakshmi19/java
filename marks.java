import java.util.Scanner;
public class marks{
int sum;
float percent;
public void accept()
{
Scanner in= new Scanner(System.in);
System.out.println("Enter the subject marks");
int a=in.nextInt();
System.out.println("Enter the subject marks");
int b=in.nextInt();
System.out.println("Enter the subject marks");
int c=in.nextInt();
System.out.println("Enter the subject marks");
int d=in.nextInt();
System.out.println("Enter the subject marks");
int e=in.nextInt();
sum=a+b+c+d+e;
percent=sum/5;
System.out.println("The overall percentage is " + percent);
}
public void display()
{ 
if(percent<50)
{
System.out.println("fail");
}
else if(percent>=100 && percent<85)
{
System.out.println("A+ grade");
}
else if(percent>=75 && percent<84)
{
System.out.println("A grade");
}
else if(percent>=64 && percent<75)
{
System.out.println("B grade");
}
else if(percent>=50 && percent<65)
{
System.out.println("C grade");
}
else
{
System.out.println("Invalid");
}
}
public static void main(String[] args)
{
marks eobj=new marks();
eobj.accept();
eobj.display();
}
}
