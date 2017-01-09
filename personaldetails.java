

public class personaldetails{
String name;
int age;
String qualification;
String coursename;
public void accept()
{
name="sowmya";
age=20;
qualification="BE";
coursename="bigdatahadoop";
}
public void display()
{
System.out.println(name);
System.out.println(age);
System.out.println(qualification);
System.out.println(coursename);
}
public static void main(String[] args)
{
personaldetails eobj=new personaldetails();
eobj.accept();
eobj.display();
}
}