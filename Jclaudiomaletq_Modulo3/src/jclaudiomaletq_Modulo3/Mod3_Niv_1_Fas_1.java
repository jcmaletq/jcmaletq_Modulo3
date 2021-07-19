package jclaudiomaletq_Modulo3;
/*
 * Crea sis variables tipu string buides. 
 * Demana per consola que s’introdueixin els noms.  
 * Introdueix els següents noms de ciutats (Barcelona, Madrid, Valencia, Malaga, Cadis, Santander) per teclat. 
 * Mostra per consola el nom de les 6 ciutats.
 */
import java.util.*;
public class Mod3_Niv_1_Fas_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Variables
		String var1, var2, var3, var4, var5, var6;
		String inter="";
		Scanner leer = new Scanner(System.in);
		var1=var2=var3=var4=var5=var6 = "";
		for(int i=1; i<=6; i++) {
			System.out.print(" Introduce el nombre de la ciudad :"+i+" ");
			inter = leer.nextLine();
			switch (i) {
			case 1: var1=inter;	break;	
		    case 2: var2=inter;	break;	
			case 3: var3=inter;	break;	
		    case 4: var4=inter;	break;	
			case 5: var5=inter;	break;		
		    case 6: var6=inter;	break;	
		    default: System.out.println("error codigo");
		    }
		  }
//  visualización		
		System.out.print(" ");
		System.out.print(var1+", ");
		System.out.print(var2+", ");
		System.out.print(var3+", ");
		System.out.print(var4+", ");
		System.out.print(var5+", ");
		System.out.println(var6);
		
	}
}