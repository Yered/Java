import java.util.Scanner;

public class SumaProductoNumeros {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int num1,num2,suma,producto;
		System.out.print("Primer valor");
		num1 = teclado.nextInt();
		System.out.print("Segundo valor");
		num2 =  teclado.nextInt();
		teclado.close();
		suma = num1+num2;
		producto = num1 * num2;
		System.out.print("la suma de los dos valores es:");
		System.out.print(suma);
		System.out.print("el producto de los dos valores es:");
		System.out.print(producto);
	}

}
