package Prog.gl.rpn;

import java.util.Stack;

public class HistoryStack {
	
	/*stack of rnp states -> History */
	private  Stack<Stack <Double> > history = new Stack<Stack <Double>>(); 
	
	/*methods*/
	
	/**
	 * it adds a rnp calculator state to the history stack
	 * @param <Stack<Double> elt
	 */
	public  void addStack(Stack<Double> elt) {
		this.history.push(elt);
	}
	
	/**
	 * delete a rnp state from the history
	 */
	public  void deleteStack() {
		history.pop();
	}
	
	/**
	 * displaye the last rnp state
	 */
	public void writeStack() {
		Stack<Double> temp = new Stack<Double>();
		temp = history.pop();
		System.out.println(temp.toString());
		history.push(temp);
	}
	
	/**
	 * display the history 
	 */
	public void writeHistory() {
		for(int i = 0; i < history.size(); i++) {
			System.out.println(i+"i"+history.get(i).toString());
		}
	}
	
	/*Affiche*/
}
