package Prog.gl.rpn;

public class MulCommand extends CalculatorCommand{
	
	
	private Double op1;
	private Double op2;
	
	/**
	 * initialise the command 
	 * @param 1st operand
	 * @param 2nd operand
	 */
	public MulCommand(Double op1, Double op2) {
		super();
		this.op1 = op1 ;
		this.op2 = op2 ;
	}
	
	/*/
	 * implement the method exec() to execute the addition
	 * */
	public void exec() {
	
		this.res = op1 * op2 ;
		
	}

}
