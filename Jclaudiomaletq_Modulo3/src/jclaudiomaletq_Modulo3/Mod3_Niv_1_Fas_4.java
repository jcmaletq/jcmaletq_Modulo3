package jclaudiomaletq_Modulo3;
/*
 * Crea sis variables tipu string buides. 
 * Demana per consola que s’introdueixin els noms.  
 * Introdueix els següents noms de ciutats (Barcelona, Madrid, Valencia, Malaga, Cadis, Santander) per teclat. 
 *-----
 * Un cop tenim els noms de les ciutats guardats en variables haurem de pasar l’informacio a un array (arrayCiutats). 
 * Quan tinguem l’array ple, haurem de mostrar per consola el nom de les ciutats ordenadas per ordre alfabetic
 *----
 * Creeu un nou array de caràcters (char array[])per cada una de les ciutats que tenim. La mida dels nous arrays sera la llargada de cada string ( string nomCiutat.Length).  
 * Ompliu els nous arrays lletra per lletra. 
 * Mostreu per consola els nous arrays amb els noms invertits (Ex: Barcelona - anolecraB). 
 * */
import java.util.*;
public class Mod3_Niv_1_Fas_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	// Variables
		String var1, var2, var3, var4, var5, var6;
		String inter="";
		Scanner leer = new Scanner(System.in);
		ArrayList<String> arrayCiutats = new ArrayList();
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
	//	Collections.sort(arrayCiutats);
	// nuevos arrays  de caracter e invertidos
		int lon_i = arrayCiutats.get(0).length();
		char[] CharArray1 = new char[lon_i];
		lon_i--;
		for (int j=lon_i;j>=0;j--) {
			CharArray1[(lon_i-j)]=arrayCiutats.get(0).charAt(j);	}	

		lon_i = arrayCiutats.get(1).length();
		char[] CharArray2 = new char[lon_i];
		lon_i--;
		for (int j=lon_i;j>=0;j--) {
			CharArray2[(lon_i-j)]=arrayCiutats.get(1).charAt(j);	}	
		
		lon_i = arrayCiutats.get(2).length();
		char[] CharArray3 = new char[lon_i];
		lon_i--;
		for (int j=lon_i;j>=0;j--) {
			CharArray3[(lon_i-j)]=arrayCiutats.get(2).charAt(j);	}
		
		lon_i = arrayCiutats.get(3).length();
		char[] CharArray4 = new char[lon_i];
		lon_i--;
		for (int j=lon_i;j>=0;j--) {
			CharArray4[(lon_i-j)]=arrayCiutats.get(3).charAt(j);	}			
		
		lon_i = arrayCiutats.get(4).length();
		char[] CharArray5 = new char[lon_i];
		lon_i--;
		for (int j=lon_i;j>=0;j--) {
			CharArray5[(lon_i-j)]=arrayCiutats.get(4).charAt(j);	}
		
		lon_i = arrayCiutats.get(5).length();
		char[] CharArray6 = new char[lon_i];
		lon_i--;
		for (int j=lon_i;j>=0;j--) {
			CharArray6[(lon_i-j)]=arrayCiutats.get(5).charAt(j);	}			
	
		// visualización
		System.out.println("Ciutats amb els nombs invertits");
		int z=0;
		for(String j : arrayCiutats) {
			System.out.print(j+" - ");
			z++;
			switch (z) {
		    	case 1: for(int i=0;i<CharArray1.length;i++){System.out.print(CharArray1[i]);}	break;	
		        case 2: for(int i=0;i<CharArray2.length;i++){System.out.print(CharArray2[i]);}	break;
		     	case 3: for(int i=0;i<CharArray3.length;i++){System.out.print(CharArray3[i]);}	break;		
	    	    case 4: for(int i=0;i<CharArray4.length;i++){System.out.print(CharArray4[i]);}	break;
	    		case 5: for(int i=0;i<CharArray5.length;i++){System.out.print(CharArray5[i]);}	break;		
		        case 6: for(int i=0;i<CharArray6.length;i++){System.out.print(CharArray6[i]);}	break;			
			}			
			System.out.println();
		}
	}
}