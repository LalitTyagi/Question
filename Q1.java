import java.util.Scanner;

//Print the word with odd letters as
//I/O : PROGRAM
//O/P
//P     M
// R   A
//  O R
//   G
//  O R
// R   A
//P     M
public class Q1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.nextLine();
		if(S.length()%2!=0) {
			int space = S.length()-2;
			for(int i=0,j=S.length()-1;i<(S.length()/2);i++,j--) {
				for (int x=0; x<i; x++)
                    System.out.print(" ");
				System.out.print(S.charAt(i));
				System.out.format("%1$"+space+"s", "");
				System.out.println(S.charAt(j));
				space = space-2;
			}
			
			space=1;
			for (int x=0; x<S.length()/2; x++)
				System.out.print(" ");
			System.out.println(S.charAt(S.length()/2));
			
			for(int i=S.length()/2-1,j=S.length()/2+1;i>=0;i--,j++) {
				for (int x=i; x>0; x--)
                    System.out.print(" ");
				System.out.print(S.charAt(i));
				System.out.format("%1$"+space+"s", "");
				System.out.println(S.charAt(j));
				space = space+2;
			}
		}
		else {
			System.out.println("Not of odd length");
		}	
	}
}
