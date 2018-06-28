/*
Using Recursion reverse the string such as

Eg 1: Input: one two three
      Output: three two one
Eg 2: Input: I love india
      Output: india love I
*/
import java.util.Scanner;

public class Q36 {
	
	public static String reverse(String s) {
		int k = s.indexOf(" ");
		if(k==-1) {
			return s;
		}
		else {
			return reverse(s.substring(k+1))+" "+s.substring(0,k);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s = sc.nextLine();
//		String[] arr = s.split(" ");
//		String result = "";
//		
//		for(int i=arr.length-1;i>=0;i--) {
//			result +=(arr[i]+" ");
//		}
//		System.out.println(result);
		System.out.println(reverse(s));
	}
}
