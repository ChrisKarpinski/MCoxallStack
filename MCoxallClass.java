/****************************************************************************
 *
 * Created by: Chris Karpinski
 * Created on: Sept 2016
 * This is the class where stack operations happen
 *
 ****************************************************************************/

import java.util.ArrayList;
import java.util.List;

public class MCoxallStack<Item> {

	private List<Item> _stackArray = new ArrayList<Item>();
	
	public void push (Item someString) {
		
		_stackArray.add(someString);
		
	}
	
	public void pop () {
		
		
		if (_stackArray.size() > 0) {
			peek();
		_stackArray.remove(_stackArray.size()-1);
		
		}
		else { 
			System.err.println("The stack is empty, cannot pop");
		}
		
	}
	
	public void peek () {
		if (_stackArray.size() > 0) {
		Item lastElement = _stackArray.get(_stackArray.size()-1);
		System.out.println(lastElement);
		}
		else {
			System.err.println("The stack is empty, cannot peek");
		}
		
	}
	
	public void clear () {
		
		_stackArray.clear();
		
	}
}
