package Prog.gl.rpn;

import java.util.Stack;

public abstract class Interpreteur {
	

	public Stack<Double> rpn=new Stack<Double>();
	HistoryStack h = new HistoryStack();
	/*Undo*/
	abstract void undo();
	abstract void stop();
	/*Quit*/
}
