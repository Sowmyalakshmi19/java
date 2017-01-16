public class transpose{
public static void main(String[] args){
int[][] a={{6,3,5}, {7,4,5}, {0,4,9}};
for(int i=0;i<3;i++){
for(int j=0;j<3;j++){
System.out.print(a[i][j] + " ");
}
System.out.println(" ");
}
for(int i=0;i<3;i++){
for(int j=i+1;j<3;j++){
int temp=a[i][j];
a[i][j]=a[j][i];
a[j][i]=temp;
}
System.out.println();
}
System.out.println("Transpose matrix is");
for(int i=0;i<3;i++){
for(int j=0;j<3;j++){
System.out.print(a[i][j] + " ");
}
System.out.println(" ");
}
}
}
