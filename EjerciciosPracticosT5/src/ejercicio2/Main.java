package ejercicio2;

public class Main {

	public static void main(String[] args) {
		double pJugador1=0,pJugador2=0;
		
		System.out.println("Es el turno del jugador1");
		pJugador1= Funciones.turno();
		System.out.println("Es el turno del jugador2");
		pJugador2 = Funciones.turno();
		
		Funciones.comprobacion(pJugador1, pJugador2);
	}

}
