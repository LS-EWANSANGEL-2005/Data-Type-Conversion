package datatypeconversion;
import java.util.Scanner;
public class IntTOStrPre {
     public static void main(String[] arggs) {
    	 Scanner sc=new Scanner(System.in);
    	 System.out.println("Enter a Number");
    	 int num=sc.nextInt();
    	 String str=Integer.toString(num);
    	 System.out.println("String Value:"+str);
    	 sc.close();
     }
}
