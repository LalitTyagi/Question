import java.util.Scanner;

public class Train {
	
	private static int pnr = 1;
	private static int[][] seat = new int[5][6];
	private static int[][] seatWaiting1 = new int[5][6];
	private static int[][] seatWaiting2 = new int[5][6];
	
	public static void doBook(){
		Scanner sc = new Scanner(System.in);
	    System.out.println("doBook");
	    int src = sc.nextInt();
		int dest = sc.nextInt();
		
		int numOfStation = dest-src;
		
		int count;
		
		for(int i=0;i<5;i++){
			if(seat[i][src]!=0 && seat[i][dest]==0) {
				count=0;
				for(int j=src+1;j<=dest;j++){
					if(seat[i][j]==0) {
						count++;
					}
					else {
						break;
					}
				}
//				System.out.println("src!=0"+count);
				if(numOfStation==count) {
					for(int j=src;j<=dest;j++){
						seat[i][j]=seat[i][j]+pnr;
						}
					pnr++;
					break;
				}
			}
			
			if(seat[i][src]==0 && seat[i][dest]!=0) {
				count=0;
				for(int j=src;j<=dest;j++){
					if(seat[i][j]==0) {
						count++;
					}
					else {
						break;
					}
				}
//				System.out.println("dest!=0"+count);
				if(numOfStation==count) {
					for(int j=src;j<=dest;j++){
						seat[i][j]=seat[i][j]+pnr;
						}
					pnr++;
					break;
				}
			}
			
			if(seat[i][src]!=0 && seat[i][dest]!=0 && seat[i][src]!=seat[i][dest]) {
				if(seat[i][src] - seat[i][src-1] == 0 && seat[i][dest+1] - seat[i][dest] == 0 ) {
					count=0;
					for(int j=src+1;j<dest;j++){
						if(seat[i][j]==0) {
							count++;
						}
						else {
							break;
						}
					}
	//				System.out.println("0!!!!0"+count);
					if(numOfStation==count+1) {
						for(int j=src;j<=dest;j++){
							seat[i][j]=seat[i][j]+pnr;
							}
						pnr++;
						break;
					}
				}
			}
			
			if(seat[i][src]==0 && seat[i][dest]==0) {
				count=0;
				for(int j=src;j<=dest;j++){
					if(seat[i][j]==0) {
						count++;
					}
					else {
						break;
					}
				}
//				System.out.println("0==0"+count);
				if(numOfStation==count-1) {
					for(int j=src;j<=dest;j++){
						seat[i][j]=seat[i][j]+pnr;
						}
					pnr++;
					break;
				}
			}
		}
		
		for(int i=0;i<5;i++){
			for(int j=0;j<6;j++){
				System.out.print(seat[i][j]);
			}
			System.out.print("\n");
		}
		System.out.println("Press 1 to book more");
	    int option = sc.nextInt();
	    switch(option) {
        case 1 :
        	doBook(); 
           break;
        default :
           System.exit(0);
	    }
	}
	public static void doCancel(){
	    System.out.println("doCancel");
	}
	public static void doWaiting(){
	    System.out.println("doWaiting");
	}
	public static void showStatus(){
	    System.out.println("showStatus");
	}
	public static void seatAvailability(){
	    System.out.println("seatAvailability");
	}
	
	public static void mainMenu(){
	    System.out.println("Press 1 to book");
	    Scanner sc = new Scanner(System.in);
	    int option = sc.nextInt();
	    switch(option) {
        case 1 :
        	doBook(); 
           break;
        default :
           System.exit(0);
     }
	}
	
	public static void main(String[] args) {
		mainMenu();
	}
}
