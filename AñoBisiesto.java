import java.util.Scanner;
public class A�oBisiesto

/*Autor: Esteban Manrique de Lara
Programa que determina si un a�o introducido por el usuario es bisiesto o no*/
{ // clase inicia
	public static void main(String[] args)
	{ //m�todo inicia
		int a�oIntroducido= 0;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Introduce el a�o a evaluar");
		a�oIntroducido= keyboard.nextInt();
		if((a�oIntroducido%4==0)&&((a�oIntroducido%100!=0)||(a�oIntroducido%400==0)))
			System.out.println("Tu a�o es bisiesto");
		else
			System.out.println("Tu a�o no es bisiesto");
	}
}

