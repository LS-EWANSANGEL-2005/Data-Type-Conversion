package datatypeconversion;
import java.util.Scanner;
public class StrTOIntPre {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number in String Form");
		String str=sc.nextLine();
		int result=0;
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			int digit=ch-'0';
			result=result*10+digit;		
		}
		System.out.println("Converted Integer:"+result);
		sc.close();
	}

}
