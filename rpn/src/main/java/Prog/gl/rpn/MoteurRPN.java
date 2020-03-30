package Prog.gl.rpn;

import java.util.Stack;
import Prog.gl.rpnCalculator.exception.ValeursMinMaxException;
import Prog.gl.rpnCalculator.exception.PileVideException;

public class MoteurRPN extends Interpreteur  {
	/**
	 * Attributs
	*/
	
	private final static double MAX_VALUE= 9999999;
	private final static double MIN_VALUE= 0;
	
	/**
	 * Methodes
	 * 
	 */
	
	/** Constructeur et Accesseurs */
	public MoteurRPN() {
		super();
		
	}
	public MoteurRPN(Stack<Double> rpn) {
		super();
		this.rpn = rpn;
	}
	public Stack<Double> getRpn() {
		return rpn;
	}
	public void setRpn(Stack<Double> rpn) {
		this.rpn = rpn;
	}
	
	/**
	 * 
	 * @param operande
	 * Enregistrer_Operande est une methode de type void
	 * chargé d'empiler les operandes 
	 * @throws ValeursMinMaxException 
	 * 
	 */
	public void Enregistrer_Operande(double operande) throws ValeursMinMaxException 
	{	if ( Math.abs(operande) > MAX_VALUE | Math.abs(operande) < MIN_VALUE)
		{
			throw new ValeursMinMaxException();
		}else {
			this.rpn.push(operande); 
			
		}
	}
	
	
	/**
	 * 
	 * 
	 * recupere_Operande est une methode de type double
	 * chargé de depiler les operandes 
	 * @return double
	 * @throws PileVideException 
	 */
	
	public double Recuperer_operande() throws PileVideException
	{
		if (this.rpn.isEmpty())
		{
			throw new PileVideException();
		}else {
			
			return this.rpn.pop();
		}
		
	}

	
	/**
	 * Cette methode affiche l'etat actuel de la pile rpn
	 * @return
	 */
	public String Afficher_pile_rpn()
	{
		System.out.println(this.rpn.toString());
		return this.rpn.toString();
	}
	
	
	/**
	 * delete the last command
	 */
	void undo() {
		h.deleteStack();
		h.writeStack();
		
	}
	/**
	 * it exit the program
	 */
	void stop() {
		System.exit(1);
	}
}
