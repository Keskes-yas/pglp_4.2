package Prog.gl.rpn;

public class DivCommand extends CalculatorCommand {

	private Double op1;
	private Double op2;
	
	public DivCommand(Double op1,Double op2) {
		this.op1 = op1 ;
		this.op2 = op2 ;
	}
	public void exec() {
		try {
			res = op1 / op2;
		} catch (Exception e) {
			
			e.printStackTrace();
		} 
		
	}

}
