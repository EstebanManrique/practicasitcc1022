import java.util.Scanner;
public class NúmeroPerfecto

/*Autor: Esteban Manrique de Lara
Programa que determina si un número es Perfecto*/
{ // clase inicia
	public static void main(String[] args)
	{ //método inicia
		int numeroAnalizado= 0;
		int sumaDeLosDivisores= 0;
		int divisorEnTurno= 0;
		Scanner keyboard= new Scanner(System.in);
		System.out.println("Introduce el número a anlaizar");
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
			System.out.println("El número es perfecto");
		else
			System.out.println("El número NO es perfecto");
	}
}

