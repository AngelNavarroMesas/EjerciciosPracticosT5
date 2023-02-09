package ejercicio1;

import java.util.Arrays;
import java.util.Scanner;

public class crearMinas {
	
	public static String[] crearMinas() {
		String campo[] = new String[20];
		int pMina;
		int x=0;
		
		Arrays.fill(campo, "0");
		
		while(x!=6) {
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
		if(campo[19]!="*") {
			if(campo[18]=="*") {
				campo[19]="1";
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
		Arrays.fill(vistaJugador, "0");
		int x=0, pJugador;
		
		do {
			
			System.out.println("Introduzca un numero");
			pJugador = sc.nextInt();
			
			vistaJugador[1]=campo[1];
			
			System.out.println(Arrays.toString(vistaJugador));
		}while(x<campo.length-6);
	}
	
	
}
