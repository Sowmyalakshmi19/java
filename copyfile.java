import java.io.*;
public class copyfile {

   public static void main(String args[]) throws IOException {  
      FileInputStream in = null;
      FileOutputStream out = null;

      try {
         in = new FileInputStream("C:\\Users\\Sowmiya\\Desktop\\input.txt");
         out = new FileOutputStream("C:\\Users\\Sowmiya\\Desktop\\output.txt");
        System.out.println(out);
         int c;
         while ((c = in.read()) != -1) {
            out.write(c);
         }
      }finally {
         if (in != null) {
            in.close();
         }
         if (out != null) {
            out.close();
         }
      }
   }
}