package jclaudiomaletq_Modulo3;
/*
 * Crea sis variables tipu string buides. 
 * Demana per consola que s’introdueixin els noms.  
 * Introdueix els següents noms de ciutats (Barcelona, Madrid, Valencia, Malaga, Cadis, Santander) per teclat. 
 *-----
 * Un cop tenim els noms de les ciutats guardats en variables haurem de pasar l’informacio a un array (arrayCiutats). 
 * Quan tinguem l’array ple, haurem de mostrar per consola el nom de les ciutats ordenadas per ordre alfabetic
 *----
 * Cambieu les vocals “a” dels noms de les ciutats per el numero 4 i guardeu els noms modificats en un nou array(ArrayCiutatsModificades). 
 *Mostreu per consola l’array modificat i ordenat per ordre alfabetic. 
 * */
import java.util.*;
public class Mod3_Niv_1_Fas_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	// Variables
		String var1, var2, var3, var4, var5, var6;
		String inter="";
		Scanner leer = new Scanner(System.in);
		ArrayList<String> arrayCiutats = new ArrayList();
		ArrayList<String> arrayCiutatsModificades = new ArrayList();
		var1=var2=var3=var4=var5=var6 = "";
	// cargo las variables	
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
   // cargo el array		
		for(int i=1; i<=6; i++) {
			switch (i) {
				case 1: arrayCiutats.add(var1);	break;	
			    case 2: arrayCiutats.add(var2);	break;	
				case 3: arrayCiutats.add(var3);	break;		
			    case 4: arrayCiutats.add(var4);	break;	
				case 5: arrayCiutats.add(var5);	break;		
			    case 6: arrayCiutats.add(var6);	break;	
			    default: System.out.println("error codigo");
			    }			
		  }
		Collections.sort(arrayCiutats);
	// cargo nuevo array modificado
		for(int i=0; i<=5; i++) {
			arrayCiutatsModificades.add(arrayCiutats.get(i).replace('a','4').replace('A', '4'));
			    }				
		// visualización
		System.out.println("Ciutats per ordre alfabètic");
		for(String j : arrayCiutatsModificades) {
			System.out.println(j);
		}
	}
}