package ejercicio1;

import java.util.Arrays;
import java.util.Scanner;

public class Funciones {
	
	public static String[] crearMinas() {
		//Creamos la tabla en donde introduciremos las minas
		String campo[] = new String[20];
		//pMina indica la posicion de la mina
		//x es un contador
		//minas es la cantidad de minas que tendra la tabla
		int pMina, x=0, minas=6;
		
		//llenamos la tabla por defecto de 0
		Arrays.fill(campo, "0");
		
		//Este bucle se encarga de colocar las minas en la tabla
		while(x<minas) {
			//generamos aleatoriamente la posicion de la mina
			pMina=(int) (Math.random()*20);
			//si la posicion generada no coincide con otra mina se usara para esta mina
			if(campo[pMina]!="*") {
				campo[pMina] = "*";
				x++;
			}
		}
		
		//si la primera posicion no es una mina pero si esta al lado de una se indicara con un uno
		if(campo[0]!="*") {
			if(campo[1]=="*") {
				campo[0]="1";
			}
		}
		
		//si la ultima posicion no es una mina pero si esta al lado de una se indicara con un uno
		if(campo[campo.length-1]!="*") {
			if(campo[campo.length-2]=="*") {
				campo[campo.length-1]="1";
			}
		}
		
		//Este bucle revisara cada posicion
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
		Arrays.fill(vistaJugador, "-");
		int x=1, posJugador;
		
		while(true){
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
			
		}
		
	}
	
	
}