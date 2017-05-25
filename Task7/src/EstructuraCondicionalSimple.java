import java.util.Scanner;
public class EstructuraCondicionalSimple {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		float sueldo;
		System.out.print("Ingrese el sueldo: ");
		sueldo = teclado.nextFloat();
		teclado.close();
		if(sueldo > 3000){
			System.out.print("Esta persona debe pagar impuestos");
		}
	}

}
