import java.util.Scanner;
public class AñoBisiesto

/*Autor: Esteban Manrique de Lara
Programa que determina si un año introducido por el usuario es bisiesto o no*/
{ // clase inicia
	public static void main(String[] args)
	{ //método inicia
		int añoIntroducido= 0;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Introduce el año a evaluar");
		añoIntroducido= keyboard.nextInt();
		if((añoIntroducido%4==0)&&((añoIntroducido%100!=0)||(añoIntroducido%400==0)))
			System.out.println("Tu año es bisiesto");
		else
			System.out.println("Tu año no es bisiesto");
	}
}

