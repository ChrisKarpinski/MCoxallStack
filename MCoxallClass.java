/****************************************************************************
 *
 * Created by: Chris Karpinski
 * Created on: Sept 2016
 * This is the class where stack operations happen
 *
 ****************************************************************************/

import java.util.ArrayList;

public class MCoxallStack {

	private ArrayList<String> stackArray = new ArrayList<String>();
	
	public void push (String someString) {
		
		stackArray.add(someString);
		
	}
	
}
