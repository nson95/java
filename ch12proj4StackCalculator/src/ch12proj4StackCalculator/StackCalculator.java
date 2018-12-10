package ch12proj4StackCalculator;

import java.util.LinkedList;

public class StackCalculator {
	LinkedList<Double> stack = new LinkedList<>();
	public void push(double x) {
	stack.add(0, x);
	}
	public void pop() {
		stack.remove(0);
	}
	public void add() {
		double a = stack.remove(stack.size());
		double b = stack.remove(stack.size()-1);
		double c = a+b;
		stack.add(c);
	}
	public void subtract() {
		double a = stack.remove(stack.size());
		double b = stack.remove(stack.size()-1);
		double c  = 0;
		if (a>b) {
			c = a-b;
		}
		else if (a<b) {
			c = b-a;
		}
		stack.add(c);
	}
	public void multiply() {
		double a = stack.remove(stack.size());
		double b = stack.remove(stack.size()-1);
		double c = a*b;
		stack.add(c);
	}
	public void divide() {
		double a = stack.remove(stack.size());
		double b = stack.remove(stack.size()-1);
		double c  = 0;
		if (a>b) {
			c = a/b;
		}
		else if (a<b) {
			c = b/a;
		}
		stack.add(c);
	}
	public void clear() {
		stack.clear();
	}
	public Object[] getValues() {
		return stack.toArray();
	}
	public int getSize() {
		return stack.size();
	}
}
