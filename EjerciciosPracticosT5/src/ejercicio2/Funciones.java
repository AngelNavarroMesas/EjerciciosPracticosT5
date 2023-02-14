package ejercicio2;

import java.util.Scanner;

public interface Funciones {
	
	public static double Turno(){
		Scanner sc = new Scanner(System.in);
		String[] cartas = {"1","2","3","4","5","6","7","sota","caballo","rey",};
		String[] palos = {"oros","copas","espadas","bastos"};
		double puntos = 0;
		int posCarta, posPalo;
		String otraCarta;
		
		System.out.println("Quiere sacar una carta?(s/n)");
		otraCarta = sc.next();
		do {
			if(otraCarta.equals("s")) {
				posCarta = (int) (Math.random()*(cartas.length-1));
				posPalo = (int) (Math.random()*(palos.length-1));
				switch(posCarta) {
				case 0:
					puntos+=1;
					break;
				case 1:
					puntos+=2;
					break;
				case 2:
					puntos+=3;
					break;
				case 3:
					puntos+=4;
					break;
				case 4:
					puntos+=5;
					break;
				case 5:
					puntos+=6;
					break;
				case 6:
					puntos+=7;
					break;
				case 7, 8, 9:
					puntos+=0.5;
					break;
				}
				System.out.println("Tu carta es: "+cartas[posCarta]+" de "+palos[posPalo]);
				System.out.println("Tienes "+puntos+" puntos");
				
				if(puntos<7.5) {
					System.out.println("Quiere sacar otra carta?(s/n)");
					otraCarta = sc.next();
				}else if(puntos>7.5) {
					System.out.println("Te has pasado!!!");
				}
			}
		}while(otraCarta.equals("s")&&puntos<7.5);
		System.out.println();
		return puntos;
		
	}
	
	public static void comprobacion(double pJugador1, double pJugador2) {
		
		System.out.println("El jugador1 tiene "+pJugador1+" puntos y el jugador2 tiene "+pJugador2+" puntos");
		if(pJugador1>pJugador2 && pJugador1<=7.5||pJugador2>7.5 && pJugador1<=7.5) {
			System.out.println("El jugador1 ha ganado la partida");
		}else if(pJugador2>pJugador1 && pJugador2<=7.5||pJugador1>7.5 && pJugador2<=7.5) {
			System.out.println("El jugador2 ha ganado la partida");
		}else if(pJugador1>7.5 && pJugador2>7.5){
			System.out.println("Nadie ha ganado la partida");
		}else if(pJugador1==pJugador2 && pJugador1<7.5) {
			System.out.println("Empate");
		}
	}
	
}
