import java.util.Scanner;
public class simple{
public static void main(String[]args){
int number,x;
Scanner in=new Scanner(System.in);
System.out.println("\n Enter number");
number=in.nextInt();
System.out.println("Enter x");
x=in.nextInt();
int y=1;
for(int i=0;i<=number;i++){
for(int j=1;j<=i;j++){
System.out.print(y + " ");
y=y+x;
}
System.out.println(" ");
}
}
}
