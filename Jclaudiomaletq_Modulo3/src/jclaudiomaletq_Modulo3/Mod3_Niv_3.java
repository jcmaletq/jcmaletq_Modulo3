package jclaudiomaletq_Modulo3;
/*
 * Escriviu un programa que donat un numero N retorni la seqüència de Fibonacci fins al numero N.
 * La seqüència de Fibonacci és la sèrie de nombres: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, ... 
 * El número següent es troba sumant els dos números anteriors.
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
	
	System.out.print("Introduce el número a calcular serie Fibonacci :");
	nume= leer.nextInt();
	for (int i=1;i<=nume;i++) {
		if (i<3) {serie_f.add(i-1);}
		else {serie_f.add(serie_f.get(i-2)+serie_f.get(i-3));}		
	  }
  // visullización
	System.out.println("Seqüència de Fibonnacci "+nume+" :");
	for(int j : serie_f) {
		System.out.print(j);
		System.out.print(" ");
	}
	}
}
