import java.util.Scanner;
public class armstrong{
public static void main(String[] args){
int number;
Scanner in=new Scanner(System.in);
System.out.println("\n Enter the number");
number=in.nextInt();
int temp=number;
int sum=0;
int mod=0;
while(temp !=0){
mod=temp%10;
sum=sum+(mod*mod*mod);
temp=temp/10;
}
if(sum==number)
System.out.println(number + " is an armstrong number");
else
System.out.println(number + "is not an armstrong number");
}
}