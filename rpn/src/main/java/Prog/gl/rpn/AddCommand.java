package Prog.gl.rpn;

public class AddCommand extends CalculatorCommand {
	
	 /*operands*/
	private Double op1;
	private Double op2;
	
	/**
	 * initialise the command 
	 * @param 1st operand
	 * @param 2nd operand
	 */
	public AddCommand(Double op1, Double op2) {
		
		this.op1 = op1 ;
		this.op2 = op2 ;
		
	}
	
	/*/
	 * implement the method exec() to execute the addition
	 * */
	public void exec() {
		try {
			res = op1 + op2;
		
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		 
		
	}

	
}
