package Prog.gl.rpnCalculator.exception;

public class ValeursMinMaxException extends Exception{

	 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ValeursMinMaxException() {
	        super("Les nombres sont trop grands (overflow)");
	    }

}
