/*
  Given a string, reverse only the characters in it,any numbers present should hold the same position
	Input:qowocorp123 
	Output:procowoq123
	Input:qowo123corp 
	Output:proc123owoq 
	Input:qow123ocorp 
	Output:pro123cowoq
	Input:a1b2cd3 
	Output:d1c2ba3  
*/
import java.util.Scanner;
public class Q27 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s = sc.nextLine();
		String temp = "";
		String s1 = "";
		for(int j=s.length()-1;j>=0;){
			if(Character.isLetter(s.charAt(j))){
				temp = temp+s.charAt(j);
				j--;
			}
			else {
				j--;
			}
		}
		int count=0;
		for(int i=0;i<s.length();i++) {
			if(Character.isLetter(s.charAt(i))) {
				s1 = s1+temp.charAt(count);
				count++;
			}
			else {
				s1 = s1+s.charAt(i);
			}
		}
		System.out.println(s1);
	}
}
