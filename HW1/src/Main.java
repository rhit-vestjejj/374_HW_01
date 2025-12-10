import java.util.Scanner;
import java.util.HashMap;
import java.util.ArrayList;

public class Main {

	private static HashMap<Clubmember, Song> AllSongs = new HashMap<Clubmember, Song>();
	private ArrayList<Request> requests = new ArrayList<Request>();
	private static ArrayList<Clubmember> Clubmembers = new ArrayList<Clubmember>();

	public static void main (String args[]) {
		loadSongs();
		System.out.println(AllSongs.get(Clubmembers.get(1)).getTitle());
		mainMenu();
	}
	
	private static void loadSongs(){
		
		Clubmembers.add(new Clubmember(1, "Tate McDonalds"));
		Clubmembers.add(new Clubmember(2, "Bruno Jars"));
		Clubmembers.add(new Clubmember(3, "Taylor Smith"));
		Clubmembers.add(new Clubmember(4, "Kyleigh Jameson"));
		Clubmembers.add(new Clubmember(5, "Aubrey Blueham"));
		Clubmembers.add(new Clubmember(6, "Travis Scotch"));
		Clubmembers.add(new Clubmember(7, "Lana deli Rays"));

		
		AllSongs.put(Clubmembers.get(0), new Song(1, "Can't Help but Falling in Love", "Elvis Presley"));
		AllSongs.put(Clubmembers.get(1), new Song(2, "At Last", "Etta James"));
		AllSongs.put(Clubmembers.get(2), new Song(3, "Unchained Melody", "Righeous Brothers"));
		AllSongs.put(Clubmembers.get(3), new Song(4, "Perfect", "Ed Sheran"));
		AllSongs.put(Clubmembers.get(4), new Song(5, "All of Me", "John Legend"));
		AllSongs.put(Clubmembers.get(5), new Song(6, "A Thousand Years", "Christina Perri"));
		AllSongs.put(Clubmembers.get(6), new Song(7, "Make You Feel My Love", "Adele"));
}

	public static void mainMenu() {
		while(true) {
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Welcome to the Serenaders' Music Club Valentine's Song System!\nSelect the action to do:\n1 - Customers - Order a song for Valentine's Day\n2 - Club members - Get a report of the requests for your song\n3 - Club members - Report back tat your songs are done\n4 - Admin - Show data for all club members\nEnter 1, 2, 3 or 4:");
			
			String option = sc.next();
			
			if(option == "exit"){
				break;
			}
			
			System.out.println("You picked " + option);
		}
	}
}