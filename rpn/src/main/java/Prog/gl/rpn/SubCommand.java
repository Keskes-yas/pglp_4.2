package Prog.gl.rpn;
public class SubCommand extends CalculatorCommand{
	
	
	private Double op1;
	private Double op2; 
	
	public SubCommand(Double op1, Double op2) {
		
		this.op1 = op1 ;
		this.op2 = op2 ;
	}
	
	public void exec() {
		res = op1 - op2 ;


	}
	
}
