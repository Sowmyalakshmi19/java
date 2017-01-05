import java.util.Scanner;
public class factorial2{
public static void main(String[] args){
int number;
Scanner in=new Scanner(System.in);
System.out.print(" enter the number ");
number=in.nextInt();
int result=factorial(number);
System.out.println("The factorial of " + number + " is " + result);
}
public static int factorial(int number){
int result=1;
for(int i=1;i<=number;i++){
result=result*i;
}
return result;
}
}
