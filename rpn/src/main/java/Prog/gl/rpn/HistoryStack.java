package Prog.gl.rpn;

import java.util.Stack;

public class HistoryStack {
	
	/*stack of rnp states -> History */
	private  Stack< Stack<Double> > history = new Stack<Stack<Double>>(); 
	
	/*methods*/
	
	/**
	 * it adds a rnp calculator state to the history stack
	 * @param <Stack<Double> elt
	 */
	public  void addStack(Stack<Double> elt) {
		
		history.push(elt);
	}
	
	
	/**
	 * delete a rnp state from the history
	 */
	public  void deleteStack() {
		history.pop();
	}
	
	
	/**
	 * display the last rnp state
	 */
	public void writeStack() {
		Stack<Double> temp = new Stack<Double>();
		temp = history.pop();
		System.out.println(temp.toString());
		history.add(temp);
	}
	
	/**
	 * display the history 
	 */
	public void writeHistory() {
			System.out.println(history.toString());
		
	}
	
	
}
