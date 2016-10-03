/****************************************************************************
 *
 * Created by: Chris Karpinski
 * Created on: Sept 2016
 * This program pushes something into the stack and pops it out
 *
 ****************************************************************************/

import java.util.Scanner;
import java.io.IOException;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner read = new Scanner(System.in);
		MCoxallStack aStack = new MCoxallStack();
		
		String stackString;
		String option;
		
		for (;;) {
		System.out.println("Enter command for stack");
		
		option = read.next();
		while (option.equals("push")) {
			
			System.out.println("Enter the string to be pushed");
			stackString = read.next();
			aStack.push(stackString);
			aStack.push(12);
			break;
		}
		while (option.equals("pop")) {
			
			aStack.pop();
			break;
		}
		while (option.equals("peek")) {
			
			aStack.peek();
			
			break;
		}
		while (option.equals("clear")) {
			
			aStack.clear();
			break;
		}
		
		}
	}

}
