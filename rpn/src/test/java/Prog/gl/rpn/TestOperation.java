package Prog.gl.rpn;

import static org.junit.Assert.*;

import org.junit.Test;



public class TestOperation {
	/* testPLUS verifie le bon fonctionnement 
	 * du calcul des deux opérandes
	 */
	@Test
	public void testPLUS() throws Throwable  {
		double x;
		MoteurRPN m = new MoteurRPN();
		m .Enregistrer_Operande(5);
		m.Enregistrer_Operande(3);
		CalculatorCommand c =new AddCommand(m.getRpn().pop(), m.getRpn().pop());
		
		c.exec();
		m.getRpn().push(c.res);
		x = m.getRpn().pop();
		assertEquals(8==x,true);
	}
	
	/* testMOINS verifie le bon fonctionnement 
	 de l'operation '-'
	 */
	@Test
	public void testMOINS() throws Throwable  {
		double x;
		MoteurRPN m = new MoteurRPN();
		m.Enregistrer_Operande(3);
		m .Enregistrer_Operande(5);
		
		CalculatorCommand c =new SubCommand(m.getRpn().pop(), m.getRpn().pop());
		
		c.exec();
		m.getRpn().push(c.res);
		x = m.getRpn().pop();
		assertEquals(2==x,true);
	}
	
	/* testMOINS verifie le bon fonctionnement 
	 de l'operation '*'
	 */
	@Test
	public void testMUL() throws Throwable {
		double x;
		MoteurRPN m = new MoteurRPN();
		m .Enregistrer_Operande(5);
		m.Enregistrer_Operande(3);
		CalculatorCommand c =new MulCommand(m.getRpn().pop(), m.getRpn().pop());
		
		c.exec();
		m.getRpn().push(c.res);
		x = m.getRpn().pop();
		assertEquals(15==x,true);
	}
	
	/* testMOINS verifie le bon fonctionnement 
	 de l'operation '/'
	 */
	@Test
	public void testDIV() throws Throwable {
		double x;
		MoteurRPN m = new MoteurRPN();
		m.Enregistrer_Operande(2);
		m .Enregistrer_Operande(5);
		
		CalculatorCommand c =new DivCommand(m.getRpn().pop(), m.getRpn().pop());
		
		c.exec();
		m.getRpn().push(c.res);
		x = m.getRpn().pop();
		assertEquals(2.5==x,true);
	}
	
	
}
