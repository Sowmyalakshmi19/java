import java.util.Scanner;
public class stringmanipul2{
public static void main(String[] args){
String change;
for(int i=0;i<5;i++)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the string");
change=sc.next();
String result;
result=change.toUpperCase();
System.out.println(result);
}
}
}