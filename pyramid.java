import java.io.BufferedReader;
import java.io.InputStreamReader;
public class pyramid{
public static void main(String[] args)throws Exception{
InputStreamReader is=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(is);
System.out.println("Enter number");
int as= Integer.parseInt(br.readLine());
System.out.println("Enter x:");
int x=Integer.parseInt(br.readLine());
int y=1;
for(int i=0;i<=as;i++){
for(int j=1;j<=i;j++){
System.out.print(y + " ");
y=y+x;
}
System.out.println(" ");
}
}
}
