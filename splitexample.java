import java.util.*;
public class splitexample{
public static void main(String[] args){
Scanner in=new Scanner(System.in);
System.out.println(" Enter the string");
String s=in.nextLine();
System.out.println("returning words:");
for(String w:s.split(" ",0))
{
System.out.println(w);
}
System.out.println("returning words:");
for(String w:s.split(" ",2))
{
System.out.println(w);
}
}
}