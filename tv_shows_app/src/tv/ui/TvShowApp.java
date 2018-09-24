package tv.ui;

import java.util.ArrayList;
import java.util.List;

import tv.business.Show;
import tv.business.ShowDB;
import tv.util.Console;

public class TvShowApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the TV Show DB App");
		ShowDB showDB = new ShowDB();
		// TODO Auto-generated method stub
		
		String command = "";

		while (!command.equalsIgnoreCase("3")) {
			displayMenu();
		command = Console.getString("Enter command: ");
				if (command.equals("1")) {
					List<Show> shows = showDB.getAll();
					for (Show s : shows) {
						System.out.println(s);
					}
					
				}
				else if (command.equals("2")) {
					String criteria = Console.getString("Search by (g)enre or (l)ength ",
														"g" , "l");
					List<Show> shows = new ArrayList<>();
					if (criteria.equalsIgnoreCase("g")) {
						String genre = Console.getString("What type of genre? "
								+ "Comedy, Sci-fi, Action, Drama: ");
						shows = showDB.get(genre);
						
						
					}
					else if (criteria.equalsIgnoreCase("l")) {
						String length = Console.getString("Enter show length? 30, 60, 90");
						shows = showDB.get(length);
						
					}
					
					System.out.println("Result of search: ");
					for (Show s : shows) {
						System.out.println(s);
					}
					
					
					
				} else if (command.equals("4")) {
					String name = Console.getString("Please enter the name of the program: ");
					String rating = Console.getString("Please enter the rating of the show: ");
					int length = Console.getInt("Please enter the length of the Show: ");
					String genre = Console.getString("Please enter the Genre of the Show: ");
					String network = Console.getString("Please enter the Network: ");
					ShowDB.add(name, rating, length, genre, network);
				}
				else if (!command.equals("3")) {
					System.out.println("Invalid command, try again.");
				}
		}
		System.out.println("Bye!");
	}

	private static void displayMenu() {
		StringBuilder sb = new StringBuilder();
		sb.append("COMMAND MENU \n");
		sb.append("1 - List TV Shows \n");
		sb.append("2 - List TV Shows by Genre or Length \n");
		sb.append("3 - Exit program \n");
		sb.append("4 - Add a Show to the Menu \n");
		System.out.println(sb);
	}
}
