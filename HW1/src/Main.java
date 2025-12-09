import java.util.Scanner;
public class Main {
	public static void main (String args[]) {
		mainMenu();
	}
	
	public static void mainMenu() {
		while(true) {
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Welcome to the Serenaders' Music Club Valentine's Song System!\nSelect the action to do:\n1 - Customers - Order a song for Valentine's Day\n2 - Club members - Get a report of the requests for your song\n3 - Club members - Report back tat your songs are done\n4 - Admin - Show data for all club members\nEnter 1, 2, 3 or 4:");
			
			String option = sc.next();
			
			System.out.println("You picked " + option);
		}
	}
}