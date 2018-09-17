import java.util.HashMap;
import java.util.Map;

public class WizardInventoryApp {
	
	private static HashMap<Integer, String> inventory = new HashMap<>();

	public static void main(String[] args) {
		System.out.println("The Wizard Inventory game");
		System.out.println();
		populateInitialInventory();
		
		String command = "";
		while (!command.equalsIgnoreCase("exit")) {
			displayMenuItems();
			command = Console.getString("Command: ");
			if (command.equalsIgnoreCase("show")) {
				showInventoryItems();
			} else if (command.equalsIgnoreCase("grab")) {
				String newItem = Console.getString("Item Name: ");
				System.out.println(addInventoryItem(newItem));
				//add item to inventory
			} else if (command.equalsIgnoreCase("edit")) {
				int itemNumber = Console.getInt("Item number: ");
				System.out.println(editInventoryItem(itemNumber));
			} else if (command.equalsIgnoreCase("drop")) {
				int itemNumber = Console.getInt("Item number: ");
				System.out.println(deleteInventoryItem(itemNumber));
			} else if (command.equalsIgnoreCase("menu")) {
				displayMenuItems();
			} else if (!command.equalsIgnoreCase("exit")) {
				System.out.println("You enetered an invalid command, please try again.");
				displayMenuItems();
			}
		
		}
		
		
		
		
		
		
		
		System.out.println("Bye");

	}
	
	public static void displayMenuItems() {
		System.out.println("COMMAND MENU");
		System.out.println("show - Show all items\n" + 
				"grab - Grab an item\n" + 
				"edit - Edit an item\n" + 
				"drop - Drop an item\n" + 
				"menu - Return to main menu\n" +
				"exit - Exit program\n" +
				"");
	}

	public static void populateInitialInventory() {
		inventory.put(1, "wooden staff");
		inventory.put(2,  "wizard hat");
		inventory.put(3, "cloth shoes");
	}
	public static void showInventoryItems() {
		for (Map.Entry item: inventory.entrySet()) {
			System.out.println(item.getKey() + ". " +item.getValue());
		}
	}
	public static String addInventoryItem(String item) {
		int itemNumber = inventory.size()+1;
		String msg = "";
		if (itemNumber>4) {
			msg = "You can't carry any more items. Drop something first.";
			} else {
		inventory.put(itemNumber, item);
		msg = item +" was added.";
			}
		return msg;
	}
	
	public static String editInventoryItem(int number) {
		String value = inventory.get(number);
		System.out.println("Item selected: " +value);
		String newValue = Console.getString("Updated Item Name? ");
		inventory.put(number, newValue);
		return "Item number " +number +" was updated.";
		
	}
	public static String deleteInventoryItem(int number) {
		String removedItemValue = inventory.remove(number);
	    
		return removedItemValue +" was removed.";
	}
}
