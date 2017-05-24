import java.util.Scanner;
public class PrecioArticulo {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int cantidad;
		double precio;
		System.out.println("Precio del articulo: ");
		precio = teclado.nextDouble();
		System.out.println("Cantidad de artículos: "); 
		cantidad = teclado.nextInt();
		teclado.close();
		System.out.println("La cantidad que se debe pagar es: " + precio*cantidad);
	}

}
