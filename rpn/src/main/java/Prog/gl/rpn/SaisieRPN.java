package Prog.gl.rpn;
import java.util.Scanner;

import Prog.gl.rpnCalculator.exception.ValeursMinMaxException; 

@SuppressWarnings("unused")
public class SaisieRPN {
	
	MoteurRPN moteur=new MoteurRPN();

	
	/* La methode input est de type void
	 * elle est charger de lire tout ce que l'utilisateurs lis 
	 * et le filtrer par la suite 
	 * */
	public void input() throws Throwable {
		/** créer un objet de type scanner (la classe Scanner) pour lire ce que l'utilisateur passe en Entrée**/
		Scanner sc = new Scanner(System.in);
		String Entree="";
		
		/*Init command*/
		CalculatorCommand com = null;
		
		while(sc.hasNext()) {	
			
			Entree=sc.nextLine();
			boolean operate = true ;
			if(Entree.equals("exit")){;System.out.println("-----> Fin");  break;} // quittter le programme Fin du programme
			
			switch (Entree)
			{ 
			case "+":{ com = new AddCommand(moteur.getRpn().pop(),moteur.getRpn().pop());break;}
			case "-":{ com = new SubCommand(moteur.getRpn().pop(),moteur.getRpn().pop());break;}
			case "*":{ com = new MulCommand(moteur.getRpn().pop(),moteur.getRpn().pop());break;}
			case "/":{ com = new DivCommand(moteur.getRpn().pop(),moteur.getRpn().pop());break;}
			case "undo":{moteur.undo();break;}
			case "stop":{moteur.stop();}
			default :{	//dans le cas ou l'utilisateur entre un nombre 
				
						operate= false;
						if(Entree.matches("(\\+|-)?(\\d+(\\.)?\\d*)"))
						{
							double val = Double.valueOf(Entree); //verifier si min<val<max
							try {
							moteur.Enregistrer_Operande(val);
							}catch(Prog.gl.rpnCalculator.exception.ValeursMinMaxException e)
							{
								e.printStackTrace();
							}
							
							moteur.Afficher_pile_rpn();
							moteur.h.addStack(moteur.getRpn());
						}
					}//fin default
			}//fin switch case	
			
			
			/**
			 * l'execution de l'action (ou commande) selon le type de l'operation
			 */
			if (operate) {
				com.exec(); 
				moteur.getRpn().push(com.res); 
				moteur.Afficher_pile_rpn();
				moteur.h.addStack(moteur.getRpn()); 
			}

		}//fin while
		/* Fermer le buffer */
		sc.close();
		

		}//Fin methode input
		 
	}//Fin class
	

