import java.io. *;
public class filewriterex {
public static void main(String[] aa) {
try 
{
FileWriter in = new FileWriter("C:\\Users\\Sowmiya\\Desktop\\file.txt");
in.write(" Iam learning hdfs and mapreduce");
in.close();
}
catch(Exception e) 
{
System.out.println(e);
}
System.out.println("success");
}
}
