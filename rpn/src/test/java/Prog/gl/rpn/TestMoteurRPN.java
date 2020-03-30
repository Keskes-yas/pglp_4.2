package Prog.gl.rpn;

import static org.junit.Assert.*;

import java.util.Stack;

import org.junit.Before;
import org.junit.Test;

import Prog.gl.rpnCalculator.exception.PileVideException;
import Prog.gl.rpnCalculator.exception.ValeursMinMaxException;




public class TestMoteurRPN  {
	
private MoteurRPN m;
	/***** Initialisation ****/
	@Before
	public void init() {
		m=new MoteurRPN();
	}
	
	/** Test les accesseurs de la pile rpn */
		
	@Test
	public void TestgetRpn()
	{
		Stack<Double> pile= new Stack<Double>();
		m.setRpn(pile);
		assertEquals(true,m.getRpn().equals(pile));
		
	}
	

	

	
	/** Test de la methode Enregistrer operande 
	 * qui vérifie si un element de type double est bien sauvegardé dans la pile
	 * */
	
	@Test
	public void TestEnregistrer_Operande()
	{
		try {
			m.Enregistrer_Operande(5);
		} catch (ValeursMinMaxException e) {
			e.printStackTrace();
		}
		assertEquals(m.getRpn().pop() == 5,true);
		
	}
	
	/** Test de la methode Recuperer operande 
	 * 
	 * */
	
	@Test 
	public void TestRecuperer_operande()
	{	
		try {
			m.Enregistrer_Operande(8);

		} catch (ValeursMinMaxException e) {
			e.printStackTrace();
		}
		double x;
		try {
			x = m.Recuperer_operande();
			assertEquals(x == 8,true);
		} catch (PileVideException e) {
			e.printStackTrace();
		}
		
		
	}
	
	/** Test de la methodes Calculer 
	 * de type void ne prends aucun parametre
	 * cette methode test le resultat du calcule 
	 * @throws Throwable 
	 */
	@Test
	public void TestCommand() throws Throwable 
	{	double x;
		m.Enregistrer_Operande(5);
		m.Enregistrer_Operande(2);
		CalculatorCommand c =new AddCommand(m.getRpn().pop(), m.getRpn().pop());
		
		c.exec();
		m.getRpn().push(c.res);
		x = m.getRpn().pop();
		assertEquals(7==x,true);
	}
	
	/**
	 * TestAfficher_pile_rpn() de type void
	 * teste si  la methode d'affichage de la pile 
	 * affiche bien la pile rpn
	 * */
	@Test 
	public void TestAfficher_pile_rpn()
	{	String pilestr,pilestr2;
		Stack<Double> pile=new Stack<Double>();
		pile.push((double) 8);
		try {
			m.Enregistrer_Operande(8);
		} catch (ValeursMinMaxException e) {
			e.printStackTrace();
		}
		pilestr = m.Afficher_pile_rpn();
		pilestr2 = pile.toString();
		assertEquals(pilestr.equals(pilestr2),true);
	}
	

}