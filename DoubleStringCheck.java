# DoubleStringcheck
import java.util.Scanner;

public class DoubleStringCheck {
	public static void main(String[] args) {
		Scanner sr=new Scanner(System.in);
		System.out.println("Enter a string");
		String str =sr.nextLine();
		int length= str.length();
		int length1=length/2;
		if (str.substring(0,length1).equals(str.substring(length1,length))) {
			System.out.println("Double");
		}
		else{
			System.out.println("Not Double");
		}
	}
}
