package Prog.gl.rpn;

public class MulCommand extends CalculatorCommand{
	
	
	private Double op1;
	private Double op2;
	
	
	public MulCommand(Double op1, Double op2) {
		super();
		this.op1 = op1 ;
		this.op2 = op2 ;
	}
	public void exec() {
	
		this.res = op1 * op2 ;
		
	}

}
