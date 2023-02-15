package ejercicio1;

import java.util.Arrays;
import java.util.Scanner;

public class Funciones {
	
	public static String[] crearMinas() {
		String campo[] = new String[20];
		int pMina, x=0,minas=6;
		
		Arrays.fill(campo, "0");
		
		while(x<minas) {
			pMina=(int) (Math.random()*20);
			if(campo[pMina]!="*") {
				campo[pMina] = "*";
				x++;
			}
		}
		
		if(campo[0]!="*") {
			if(campo[1]=="*") {
				campo[0]="1";
			}
		}
		if(campo[campo.length-1]!="*") {
			if(campo[campo.length-2]=="*") {
				campo[campo.length-1]="1";
			}
		}
		
		for(int i=1;i<campo.length-1;i++) {
			if(campo[i]!="*") {
				if(campo[i+1]=="*"&&campo[i-1]=="*") {
					campo[i]="2";
				}else if(campo[i+1]=="*"||campo[i-1]=="*") {
					campo[i]="1";
				}
			}
		}
		
		
		return campo;
	}
	
	public static void jugar(String campo[]) {
		Scanner sc = new Scanner(System.in);
		String vistaJugador[] = new String[campo.length];
		Arrays.fill(vistaJugador, "=");
		int x=1, posJugador;
		
		do {
			System.out.println(Arrays.toString(vistaJugador));
			System.out.println("Introduzca un numero");
			posJugador = sc.nextInt()-1;
			
			vistaJugador[posJugador]=campo[posJugador];
			if(x==campo.length-6) {
				System.out.println("ENHORABUENA, HAS GANADO!!!!!!!");
				System.out.println(Arrays.toString(campo));
				break;
			}else if(vistaJugador[posJugador]=="*") {
				System.out.println("HAS PERDIDO!!!");
				System.out.println(Arrays.toString(campo));
				break;
			}
			x++;
			
		}while(true);
		
	}
	
	
}