/*
Given two numbers a and b both < 200 we have to find the square numbers which lie between a and b(inclusive)

eg) i/p a = 20;b = 100;
      o/p 25,36,49,64,81,100 

*/
import java.util.Scanner;

public class Q15 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int tempA = (int)Math.sqrt(a);
		if(tempA*tempA != a) {
			tempA=tempA+1;
		}
		
		int tempB = (int)Math.sqrt(b);
		
		for(int i=tempA;i<=tempB;i++) {
			System.out.println(i*i);
		}
	}
}
