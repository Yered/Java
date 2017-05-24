import java.util.Scanner;

public class Calculo4Numeros {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int num1, num2, num3 , num4, suma1y2,producto3y4;
		System.out.print("Introduce número 1: ");
		num1 = teclado.nextInt();
		System.out.print("Intriduce número 2: ");
		num2 = teclado.nextInt();
		System.out.print("Introduce número 3: ");
		num3 = teclado.nextInt();
		System.out.print("Introduce número 4: ");
		num4 = teclado.nextInt();
		teclado.close();
		suma1y2 = num1 + num2; 
		producto3y4 = num3 * num4;
		System.out.print("La suma del 1 y 2 es : " + suma1y2 + " y el producto de 3 y 4 es: " + producto3y4);
	}

}
