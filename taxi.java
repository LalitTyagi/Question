import java.util.Scanner;

public class Taxi {
	
	static Scanner scan = new Scanner(System.in);
	private static int BookingID = 1;  
	private static int[] taxiID = new int[100];
	private static int[] taxi = new int[4];
	private static int[] taxiEarning = new int[4];
	private static int[] CustomerID = new int[100];
	private static char[] From = new char[100];
	private static char[] To = new char[100];
	private static int[] PickupTime = new int[100];
	private static String[] DropTime = new String[100];
	private static int[] Amount  = new int[100];

	public static void main(String[] args) {
		mainMenu();
	}

	private static void mainMenu() {
		System.out.println("Press 1 to book");
		System.out.println("Press 2 to Taxi details");
		System.out.println("Press 3 to Taxi details");
		int i = scan.nextInt();
		switch(i) {
		case 1:
			doBook();
			break;
		case 2:
			showDetails();
			break;
		case 3:
			System.out.println("-------------");
			System.exit(0);
		default:
			System.out.println("Invalid option");
			mainMenu();
		}
		
	}

	private static void showDetails() {
		System.out.println("showDetails");
		mainMenu();
	}

	private static void doBook() {
		System.out.println("doBook");
		mainMenu();
	}

}
