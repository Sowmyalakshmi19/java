import java.util.*;
public class hashmap
{
public static void main(String[] args)
{
HashMap<String,Integer>studetails=new HashMap<String,Integer>();
studetails.put("Tim",12);
studetails.put("Rim",13);
studetails.put("shyam",20);
for(Map.Entry m:studetails.entrySet())
{
System.out.println("Key  "+m.getKey() +" & value  "+m.getValue());
}
Iterator itr=studetails.entrySet().iterator();
}
}