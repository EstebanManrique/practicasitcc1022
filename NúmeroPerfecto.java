import java.util.Scanner;
public class N�meroPerfecto

/*Autor: Esteban Manrique de Lara
Programa que determina si un n�mero es Perfecto*/
{ // clase inicia
	public static void main(String[] args)
	{ //m�todo inicia
		int numeroAnalizado= 0;
		int sumaDeLosDivisores= 0;
		int divisorEnTurno= 0;
		Scanner keyboard= new Scanner(System.in);
		System.out.println("Introduce el n�mero a anlaizar");
		numeroAnalizado=keyboard.nextInt();

		divisorEnTurno++;

		while(divisorEnTurno<numeroAnalizado)
		{
			if((numeroAnalizado%divisorEnTurno)==0){
				sumaDeLosDivisores= (sumaDeLosDivisores+divisorEnTurno);
			}
			divisorEnTurno++;
		}
		if(sumaDeLosDivisores==numeroAnalizado)
			System.out.println("El n�mero es perfecto");
		else
			System.out.println("El n�mero NO es perfecto");
	}
}

