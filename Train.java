import java.util.Arrays;
import java.util.Scanner;

public class Train {
	
	private static int pnr = 1;
	private static int[][] seat = new int[5][6];
	private static int[] pnrNum = new int[100];
	private static int[] source = new int[100];
	private static int[] destination = new int[100];
	private static String[] name = new String[100];
	private static int[] noOfSeats = new int[100];
	private static int[][] cnfrmBooked = new int[100][6];
//	private static int[][] waitingBooked = new int[100][6];
//	private static int[][] seatWaiting1 = new int[5][6];
//	private static int[][] seatWaiting2 = new int[5][6];
	
	public static void doBook(){
		Scanner sc = new Scanner(System.in);
	    System.out.println("doBook");
	    System.out.println("Pls enter 0-4 for source station");
	    int src = sc.nextInt();
	    System.out.println("Pls enter 1-5 for source station");
		int dest = sc.nextInt();
		if(src==dest) {
			System.out.println("Source and destination is same");
			System.out.println("Pls enter valid Source and destination.");
			doBook();
		}	
		System.out.println("Pls enter no of seats");
		int n = sc.nextInt();
		
		if(check(n,src,dest)>0) {
			System.out.println("Seats are not available");
		}
		else {
			System.out.println("Seats are available");
			
			System.out.println("Pls enter Ur name");
			String tempName = sc.next();
			
			int numOfStation = dest-src;
			int count;
			pnrNum[pnr]=pnr;
			source[pnr]= src;
			destination[pnr]=dest;
			name[pnr]=tempName;
			noOfSeats[pnr]=n;
			int temp = 0;
			for(int z=0;z<n;z++) {
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
						if(numOfStation==count) {
							for(int j=src;j<=dest;j++){
								seat[i][j]=seat[i][j]+pnr;
								}
							cnfrmBooked[pnr][temp]=i;
							temp++;
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
						if(numOfStation==count) {
							for(int j=src;j<=dest;j++){
								seat[i][j]=seat[i][j]+pnr;
								}
							cnfrmBooked[pnr][temp]=i;
							temp++;
							break;
						}
					}
					
					if(seat[i][src]!=0 && seat[i][dest]!=0 && seat[i][src]!=seat[i][dest]) {
						try {
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
								if(numOfStation==count+1) {
									for(int j=src;j<=dest;j++){
										seat[i][j]=seat[i][j]+pnr;
										}
									cnfrmBooked[pnr][temp]=i;
									temp++;
									break;
								}
							}
						}
						catch(Exception e){
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
						if(numOfStation==count-1) {
							for(int j=src;j<=dest;j++){
								seat[i][j]=seat[i][j]+pnr;
								}
							cnfrmBooked[pnr][temp]=i;
							temp++;
							break;
						}
					}
				}
			}
			pnr++;
		}
		for(int i=0;i<5;i++){
			for(int j=0;j<6;j++){
				System.out.print(seat[i][j]);
			}
			System.out.print("\n");
		}
		mainMenu();
	}
	
	public static int check(int n,int src,int dest) {
		int numOfStation = dest-src;
		int count;
		int m = n;
		for(int z=0;z<n;z++) {
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
					if(numOfStation==count) {
						m--;
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
					if(numOfStation==count) {
						m--;
						break;
					}
				}
				
				if(seat[i][src]!=0 && seat[i][dest]!=0 && seat[i][src]!=seat[i][dest]) {
					try {
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
							if(numOfStation==count+1) {
								m--;
								break;
							}
						}
					}
					catch(Exception e){
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
					if(numOfStation==count-1) {
						m--;
						break;
					}
				}
			}
		}
		return m;
	}
	
	public static void chart(){
	    System.out.println("chart");
	    System.out.println("PNR\tSRC\tDEST\tNAME\tNO OF SEATS\t SEAT NO.");
	    for(int i=1;i<pnr;i++) {
	    	if(pnrNum[i]>0) {
		    	String[] strCnfrmBooked = new String[noOfSeats[i]];
		    	
		    	for(int j =0;j<noOfSeats[i];j++)
		    		strCnfrmBooked[j] = String.valueOf(cnfrmBooked[i][j]);
		    	
		    	System.out.println(pnrNum[i]+"\t"+source[i]+"\t"+destination[i]+"\t"+name[i]+"\t"+noOfSeats[i]+"\t\t"+Arrays.toString(strCnfrmBooked));	
	    	}
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
	    Scanner sc = new Scanner(System.in);
	    System.out.println("seatAvailability");
	    System.out.println("Pls enter 0-4 for source station");
	    int src = sc.nextInt();
	    System.out.println("Pls enter 1-5 for source station");
		int dest = sc.nextInt();
		
		int numOfStation = dest-src;
		int count;
		int m = 0;
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
					if(numOfStation==count) {
						m++;
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
					if(numOfStation==count) {
						m++;
					}
				}
				
				if(seat[i][src]!=0 && seat[i][dest]!=0 && seat[i][src]!=seat[i][dest]) {
					try {
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
							if(numOfStation==count+1) {
								m++;
							}
						}
					}
					catch(Exception e){
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
					if(numOfStation==count-1) {
						m++;
					}
				}
			}
		System.out.println("No of seat available are.:"+m);
	}
	
	public static void mainMenu(){
	    System.out.println("Press 1 to book");
	    System.out.println("Press 2 to Prepare Chart");
	    System.out.println("Press 3 to cancel ur ticket");
	    System.out.println("Press 4 to check seat svailability");
	    
	    Scanner sc = new Scanner(System.in);
	    int option = sc.nextInt();
	    switch(option) {
        case 1 :
        	doBook(); 
           break;
        case 2 :
        	chart(); 
           break;
        case 3 :
        	doCancel(); 
           break;
        case 4 :
        	seatAvailability(); 
           break;
        default :
           System.exit(0);
     }
	}
	
	public static void main(String[] args) {
		mainMenu();
	}
}
