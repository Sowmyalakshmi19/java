import java.util.*;
public class splitex{
public static void main(String[] args){
Scanner in=new Scanner(System.in);
System.out.println(" Enter the string");
String s=in.nextLine();
String[] words=s.split(" ");
for(String a: words){
System.out.println(a);
}
}
}
