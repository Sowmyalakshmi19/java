import java.util.Scanner;
public class details{
String name;
float price,quantity,salary;
float percentage;
public void accept()
{

Scanner in=new Scanner(System.in);
System.out.println("Enter the name");
name= in.next();
System.out.println("Enter the price");
price=in.nextInt();
System.out.println("Enter the quantity");
quantity=in.nextInt();
System.out.println("Enter the Salary");
salary=in.nextInt();
}


public void display()
{

float totalprice= quantity*price;
percentage=totalprice/salary*100;
System.out.println("name=" + " " + name);
System.out.println("price=" + " " + price);
System.out.println("tprice" +  " " + totalprice);
System.out.println("The percentage of salary customer spent of purchase is" + " " + percentage+"%");
}

public static void main(String[] args)
{
details eobj=new details();
eobj.accept();
eobj.display();
}
}