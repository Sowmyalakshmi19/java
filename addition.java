public class addition{
public static void main(String[] args){
int[][] a={{6,3,5}, {7,4,5}, {0,4,9}};
int[][] b={{3,2,5},{6,5,4},{5,2,2}};
int[][] sum= new int[3][3]; 
System.out.println("first matrix");
for(int i=0;i<3;i++){
for(int j=0;j<3;j++){
sum[i][j]=a[i][j]+b[i][j];

System.out.print(a[i][j] + " ");
}
System.out.println(" ");
}
System.out.println("second matrix");
for(int k=0;k<3;k++){
for(int n=0;n<3;n++){
System.out.print(b[k][n] + " ");
}
System.out.println(" ");
}

System.out.println("Sum of matrices");
for(int i=0;i<3;i++)
{
for(int j=0;j<3;j++)
{

System.out.print(sum[i][j] + " ");
}
System.out.println(" ");
}
}
}