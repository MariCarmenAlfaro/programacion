package ejercicioscondicionales;
//2.- Escribe un programa que pregunte el precio de un producto. Si vale más de 80 €, le hará un
//descuento del 10%. Se mostrará en pantalla el precio final.
import java.util.Scanner;
public class ejercicio02 {

	public static void main(String[] args) {
 Scanner entrada= new Scanner(System.in);
 
 System.out.println("Precio del producto: ");
		float precio = entrada.nextFloat();
		
		float precioRebajado = precio;
		
		if (precio >80) {	
			precioRebajado = precio- precio*10/100;
			
		} 
		System.out.println("�ste sera su precio con un 10% : " + precioRebajado);
		
		
	}

}
