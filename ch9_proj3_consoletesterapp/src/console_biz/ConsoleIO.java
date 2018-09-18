package console_biz;

import java.util.Scanner;

import interfaces.UserIO;

public class ConsoleIO implements UserIO {
	Scanner sc = new Scanner(System.in);
	

	@Override
	public int getInt(String prompt) {
		// TODO Auto-generated method stub
		return sc.nextInt();
	}

	@Override
	public int getInt(String prompt, int min, int max) {
		// TODO Auto-generated method stub
		return sc.nextInt();
	}

	@Override
	public double getDouble(String prompt) {
		System.out.println(prompt);
		return sc.nextDouble();
	}

	@Override
	public double getDouble(String prompt, int min, int max) {
		// TODO Auto-generated method stub
		return sc.nextDouble();
	}

	@Override
	public String getString(String prompt) {
		// TODO Auto-generated method stub
		return sc.next();
	}

	@Override
	public String getString(String prompt, int min, int max) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void printString(String s) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void println() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void println(String s) {
		// TODO Auto-generated method stub
		
	}
	
	

}
