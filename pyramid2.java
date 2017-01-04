public class pyramid2{
public static void main(String[] args){
for(int i=1;i<=3;i++){
for(int space=1; space<=3-i;space++){
System.out.print(" ");
}
for(int j=0;j<i;j++){
System.out.print(j+i + " ");
}
System.out.println(" ");
}
}
}