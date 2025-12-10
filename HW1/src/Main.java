import java.lang.reflect.Array;
import java.util.Scanner;
import java.util.HashMap;
import java.util.ArrayList;

public class Main {

	private static HashMap<Clubmember, Song> AllSongs = new HashMap<Clubmember, Song>();
	private static ArrayList<Request> requests = new ArrayList<Request>();
	private static ArrayList<Clubmember> Clubmembers = new ArrayList<Clubmember>();

	public static void main (String args[]) {
		loadSongs();
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

	public static void Order(){
		Scanner sc = new Scanner(System.in);

		System.out.println("Order a song for Valentine’s Day...\n" + //
						"Select the song from this list:");
		for(int i = 0; i < AllSongs.size(); i++){
			System.out.println((i + 1) + " - " + AllSongs.get(Clubmembers.get(i)).getTitle() + " - " + AllSongs.get(Clubmembers.get(i)).getArtist());
		}
		System.out.println("Your choice (1 – 7):");

		String choice = sc.nextLine();
		
		System.out.println("Enter your email address:");
		String email = sc.nextLine();
		System.out.println("Enter your credit card number:");
		String cc_num = sc.nextLine();
		System.out.println("Enter your sweetheart's name:");
		String sweetheart = sc.nextLine();
		
		Clubmember member = Clubmembers.get(Integer.parseInt(choice));
		Song song = AllSongs.get(member);

		requests.add(new Request(email, Integer.parseInt(cc_num), sweetheart, member, song));

		System.out.println("Done!");
		System.out.println(requests.size());
	}

	public static void songReport(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Get a report of requests for your song...");
		System.out.println("Enter your member ID:");

		int memberId = sc.nextInt();

		Clubmember member = null;
		for(Clubmember cm : Clubmembers){
			if(cm.getMemberId() == memberId){
				member = cm;
				break;
			}
		}
		if(member == null){
			System.out.println("Member ID not found.");
		}

		System.out.println("Found member: " + member.getName());
		
		//this stores all the requests that belong to the member
		ArrayList<Request> memberReq = new ArrayList<Request>();
		for(Request req: requests){
			if (req.getMember().getMemberId() == memberId){
				memberReq.add(req);
			}
		}
		System.out.println("Look for an email with a list of all the sweethearts to sing to!");
		
		System.out.println("Email Report");
		System.out.println("To: " + member.getName());
		System.out.println("Subject: Valentine Day Song Requests");
		System.out.println("You have " + memberReq.size() + " requests for your song:");
		System.out.println("Sing to the following sweethearts:");
		
		if(!memberReq.isEmpty()){
        for(int i = 0; i < memberReq.size(); i++){
            System.out.println(memberReq.get(i).getSweetheart());
        }
		} else {
			System.out.println("No requests at this time.");
		}
		
	}

	public static void mainMenu() {
		while(true) {
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Welcome to the Serenaders' Music Club Valentine's Song System!\nSelect the action to do:\n1 - Customers - Order a song for Valentine's Day\n2 - Club members - Get a report of the requests for your song\n3 - Club members - Report back that your songs are done\n4 - Admin - Show data for all club members\nEnter 1, 2, 3 or 4:");
			
			String option = sc.next();
			
			if(option.equals("exit")){
				break;
			} else if (option.equals("1")){
				Order();
			} else if (option.equals("2")){
				songReport();
			} else if (option.equals("3")){
				
			} else if (option.equals("4")){
				
			}
		}
	}
}