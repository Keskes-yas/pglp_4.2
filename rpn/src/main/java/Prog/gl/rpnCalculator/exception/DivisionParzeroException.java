package Prog.gl.rpnCalculator.exception;

public class DivisionParzeroException extends Exception {
	
	 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public DivisionParzeroException() {
	        super("Une division par zero!! impossible");
	    }

}
