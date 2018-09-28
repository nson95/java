package com.prs;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.prs.business.User;
import com.prs.db.UserDB;
import com.prs.util.Console;

import ch.qos.logback.core.net.SyslogOutputStream;

@SpringBootApplication
public class PrsJpaDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(PrsJpaDemoApplication.class, args);
		System.out.println("Welcome to the JPA demo");
		String command = "";
		while (!command.equals("9")) {
			displayMenu();
			command = Console.getString("Enter a command: ");
			if (command.equals("1")) {
				// list users
				List<User> users = UserDB.list();
				System.out.println("List of users: ");
				for (User u : users) {
					System.out.println(u);
				}
			} else if (!command.equals("9")) {
				System.out.println("Invalid command.");
			}
		}
		
		System.out.println("Bye");
	}
	
	public static void displayMenu() {
		StringBuilder sb = new StringBuilder("Command Menu:\n");
		sb.append("1 - List Users:\n");
		sb.append("9 - Exit:\n");
		System.out.println(sb);
	}
}
