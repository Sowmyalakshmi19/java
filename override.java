class Person
{
public void showdetails()
{
System.out.println("In the person class");
}}
class employee extends Person
{
public void showdetails()
{
System.out.println("In the employee class");
}}
class student extends employee
{
public void showdetails()
{
System.out.println("In the student class");
}}
class override
{
public static void main(String[] args)
{
Person ref=new Person();
employee ref1=new employee();
student ref2=new student();
ref.showdetails();
ref1.showdetails();
ref2.showdetails();
}
}
