package jclaudiomaletq_Modulo3;
/*
 * Escriviu un programa que donat un numero N retorni la seq��ncia de Fibonacci fins al numero N.
 * La seq��ncia de Fibonacci �s la s�rie de nombres: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, ... 
 * El n�mero seg�ent es troba sumant els dos n�meros anteriors.
 */
import java.util.*;
public class Mod3_Niv_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// variables
	ArrayList<Integer> serie_f = new ArrayList<>();
	Scanner leer = new Scanner(System.in);
	int nume=0;
	int fibo=0;
	
	System.out.print("Introduce el n�mero a calcular serie Fibonacci :");
	nume= leer.nextInt();
	for (int i=1;i<=nume;i++) {
		if (i<3) {serie_f.add(i-1);}
		else {serie_f.add(serie_f.get(i-2)+serie_f.get(i-3));}		
	  }
  // visullizaci�n
	System.out.println("Seq��ncia de Fibonnacci "+nume+" :");
	for(int j : serie_f) {
		System.out.print(j);
		System.out.print(" ");
	}
	}
}
