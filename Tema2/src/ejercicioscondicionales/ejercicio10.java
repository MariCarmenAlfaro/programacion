package ejercicioscondicionales;
import java.util.Scanner;
public class ejercicio10 {
//10.- Dise�a un programa que pida una nota entera entre 0 y 10 y la convierta a la calificaci�n
//	correspondiente (Insuficiente, Suficiente, Bien, Notable y Sobresaliente).
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Dime tu nota: ");
 int nota = entrada.nextInt();
  if (nota <5) {
	  System.out.println("tienes un insuficiente");
  } else if (nota ==5) {
	  System.out.println("tienes un suficiente");
  } else if (nota >6 && nota <7) {
	  System.out.println("tienes un bien");
  }else if(nota >=7 && nota <9) {
	  System.out.println("Tiene un notable");
  }else {
	  System.out.println("Sobresaliente");
  }
 
	}

}
