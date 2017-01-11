public class star2{
public static void main(String[] args){
int x=1;
int y=1;
for(int i=1;i<=3;i++){
for(int space=1;space<=3-i;space++){
System.out.print(" ");
}
for(int j=0;j<i;j++){
System.out.print(x + " ");
x=x+y;
}
System.out.println(" ");
}
}
}


