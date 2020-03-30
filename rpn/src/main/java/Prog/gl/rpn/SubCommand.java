package Prog.gl.rpn;
public class SubCommand extends CalculatorCommand{
	
	
	private Double op1;
	private Double op2; 
	
	
	/**
	 * initialise the command 
	 * @param 1st operand
	 * @param 2nd operand
	 */
	public SubCommand(Double op1, Double op2) {
		
		this.op1 = op1 ;
		this.op2 = op2 ;
	}
	
	/*
	 * implement the method exec() to execute the addition
	 * */
	public void exec() {
		res = op1 - op2 ;


	}
	
}
