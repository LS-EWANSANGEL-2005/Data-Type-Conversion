package datatypeconversion;
import java.util.Scanner;
public class StrTOInt {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String:");
		String str=sc.nextLine();
		   int num=0;
		   for(int i=0;i<str.length();i++)
		   {
			   char ch=str.charAt(i);
			   num=num*10+(ch-'0');
			  
		   }
		   System.out.println("Integer Value is:"+num);
		   sc.close();
		
		   
		

	}

}
