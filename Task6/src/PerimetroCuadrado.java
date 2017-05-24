import java.util.Scanner; 

public class PerimetroCuadrado {

	public static void main(String[] args) {
		 Scanner teclado = new Scanner(System.in);
		 int lado1,perimetro;
		 System.out.print("introduzca el valor de un lado");
		 lado1 = teclado.nextInt();
		 teclado.close();
		 perimetro = lado1*4;
		 System.out.print("el perímetro del cuadraro es:" + perimetro);
		 
	}

}
