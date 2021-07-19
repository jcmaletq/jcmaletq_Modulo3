package jclaudiomaletq_Modulo3;
/*
 *En aquest exercici crearàs un array bidimensional on introduiràs 3 notes per a 5 alumnes. 
 *Es calcularà la nota mitjana de cada alumna i s'indicarà si han suspès o no. 
 *Crea un array bidimensional capaç de guardar 3 notes de 5 alumnes. 
 *Omple l’array amb un bucle demanant els valors per pantalla (nota entre 0 i 10), 
 *has d’identificar per pantalla quan és una agrupació d’un alumne nou .
 *Recorre l'array, fes la Mitjana aritmètica de les 3 notes i indica si l'alumne ha aprovat o suspès  
 */
import java.util.*;
public class Mod3_Niv_2 {	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
  //variables
		final int alumnos=5;
		final int exam=3;
		final double aprob=5.00;
		double [][] notas=new double[alumnos][exam]; 
		double [] resultados=new double[alumnos];
		double v_nota=0;
		int v_alum =0;
		Scanner leer = new Scanner(System.in);
		
		for(int i=0;i<notas.length;i++) {    // alumnos
			for(int j=0;j<notas[i].length;j++) {   // notas					
				System.out.print ("Introdueix la nota "+(j+1) +" per a l'alumne "+(i+1)+" = ");
				notas[i][j]= leer.nextDouble();
				// System.out.println();
			}
		}		
		for(double[]fila:notas) {    // resultado
			v_nota=0;
			for(double ele:fila) {v_nota=v_nota+ele;}
		    resultados[v_alum]=v_nota /exam;
		    v_alum++;
		}
		
  // visualización	
/*		
		for(double[]fila:notas) {
			System.out.println();
			for(double ele:fila) {
				System.out.printf("%1.2f",ele);
				System.out.print(" ");				
			}
		}
*/		
		for(int j=0;j<resultados.length;j++) {   					
			System.out.print ("L'alumne "+(j+1) + " ha ");
			if (resultados[j]<aprob) {System.out.print ("suspés am un ");}
			else  {System.out.print ("aprovat am un ");}
			System.out.printf("%1.2f",resultados[j]);
			System.out.println(" ");		
		}
	}

}
