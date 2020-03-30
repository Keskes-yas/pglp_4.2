package Prog.gl.rpn;

import Prog.gl.rpnCalculator.exception.DivisionParzeroException;

public class DivCommand extends CalculatorCommand {

	private Double op1;
	private Double op2;
	
	
	/**
	 * initialise the command 
	 * @param 1st operand
	 * @param 2nd operand
	 */
	public DivCommand(Double op1,Double op2)   {
		this.op1 = op1 ;
		this.op2 = op2 ;
	}
	
	/*/
	 * implement the method exec() to execute the addition
	 * */
	public void exec() throws DivisionParzeroException {
		if (op2 != 0)
			res = op1 / op2; 
		else
			throw new DivisionParzeroException();
		
	}

}
